package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MascotasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotas)

        val button: Button = findViewById(R.id.btn_regresar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }

        val button1: Button = findViewById(R.id.btn_mascota1)
        button.setOnClickListener{
            var intent: Intent = Intent (this, mascotanuevaActivity::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.btn_mascota2)
        button.setOnClickListener{
            var intent: Intent = Intent (this, mascotanuevaActivity::class.java)
            startActivity(intent)
        }
        val button3: Button = findViewById(R.id.btn_mascota3)
        button.setOnClickListener{
            var intent: Intent = Intent (this, mascotanuevaActivity::class.java)
            startActivity(intent)
        }
        val button4: Button = findViewById(R.id.btn_mascota4)
        button.setOnClickListener{
            var intent: Intent = Intent (this, mascotanuevaActivity::class.java)
            startActivity(intent)
        }
    }
}