package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.appbar.AppBarLayout

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button: Button = findViewById(R.id.btn_emergencias)
        button.setOnClickListener{
            var intent: Intent = Intent (this, EmergenciaActivity::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.btn_emergencias)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, MascotasActivity::class.java)
            startActivity(intent)
        }

        val button4: Button = findViewById(R.id.btn_calendario)
        button4.setOnClickListener{
            var intent: Intent = Intent (this, CalendarioActivity::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.btn_entrenaminto)
        button3.setOnClickListener{
            var intent: Intent = Intent (this, entrenamientoActivity::class.java)
            startActivity(intent)
        }

        val button5: Button = findViewById(R.id.btn_compras)
        button5.setOnClickListener{
            var intent: Intent = Intent (this, ComprasActivity::class.java)
            startActivity(intent)
        }

        val button6: Button = findViewById(R.id.btn_foro)
        button6.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }
    }



}