package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CambiarContrasenaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_contrasena)

        val button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_regresarDeCambiarContrasena)
        button.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }
        val button2: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_guardarContraNueva)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }

    }




}