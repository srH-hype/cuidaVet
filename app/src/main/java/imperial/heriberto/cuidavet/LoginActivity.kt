package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: Button = findViewById(R.id.btn_iniciar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.btn_usuarioNuevo)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, Registro::class.java)
            startActivity(intent)
        }

    }
}