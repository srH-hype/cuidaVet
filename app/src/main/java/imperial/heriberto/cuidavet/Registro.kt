package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val button : androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_flcheaRegresar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
        val button2 : androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_siguiente)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, Registro2_Activity::class.java)
            startActivity(intent)
        }
        val botonAvisoPrivacidad : androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_avisoPrivacidad)
        botonAvisoPrivacidad.setOnClickListener{
            var intent: Intent = Intent (this, AvisoPrivacidadActivity::class.java)
            startActivity(intent)
        }


    }
}