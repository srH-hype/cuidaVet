package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import imperial.heriberto.cuidavet.databinding.ActivityRegistroBinding

import java.util.regex.Pattern

class RegistroActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegistroBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_registro)

        binding=ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth= Firebase.auth


        binding.btnSiguiente.setOnClickListener{
            val mEmail = binding.edCorreo.text.toString()
            val mPassword = binding.edContraRegistro.text.toString()

          //  val passwordRegex = Pattern.compile("^" + "(?=.*[-@#$%^&+=])"+".{6,}" + "$")

            if(mEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
                Toast.makeText(this, "Ingrese un email valido.", Toast.LENGTH_SHORT).show()
//                        || !passwordRegex.matcher(mPassword).matches()
            } else if(mPassword.isEmpty() || mPassword.length <6 ){
                Toast.makeText(this, "La contraseña no es valdia.", Toast.LENGTH_SHORT).show()
            }  else{
                createAccount(mEmail, mPassword)
                Toast.makeText(this, "Cuenta creada con Exito!! ", Toast.LENGTH_SHORT).show()

            }

        }

        val button : AppCompatButton = findViewById(R.id.btn_flcheaRegresar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
//        prueba
//        val button2 : AppCompatButton = findViewById(R.id.btn_siguiente)
//        button2.setOnClickListener{
//            var intent: Intent = Intent (this, Registro2_Activity::class.java)
//            startActivity(intent)
//        }


        val botonAvisoPrivacidad : AppCompatButton = findViewById(R.id.btn_avisoPrivacidad)
        botonAvisoPrivacidad.setOnClickListener{
            var intent: Intent = Intent (this, AvisoPrivacidadActivity::class.java)
            startActivity(intent)
        }


    }

    private fun createAccount(email: String, password: String){
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                regresa()
            } else {
                // If sign in fails, display a message to the user.
                Log.w("TAG", "createUserWithEmail:failure", task.exception)
                Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun regresa(){
        var intent: Intent = Intent (this, LoginActivity::class.java)
        startActivity(intent)
    }
}