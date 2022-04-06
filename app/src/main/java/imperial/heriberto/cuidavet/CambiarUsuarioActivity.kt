package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CambiarUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiar_usuario)

        val button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_regresarDeCambiarUsuarios)
        button.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }
        val button2: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_guardarCambioUsuario)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }


    }
}