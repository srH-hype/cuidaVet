package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AvisoPrivacidadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aviso_privacidad)

        val button: Button = findViewById(R.id.btn_hecho)
        button.setOnClickListener{
            var intent: Intent = Intent (this, Registro::class.java)
            startActivity(intent)
        }
        val buttonflecha: Button = findViewById(R.id.btn_flechaRegresar_registro)
        button.setOnClickListener{
            var intent: Intent = Intent (this, Registro::class.java)
            startActivity(intent)
        }
    }

}