package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class entrenamientoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrenamiento)

        val button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_regresar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }

        val button2: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_dar)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, darpatitaActivity::class.java)
            startActivity(intent)
        }

        val button3: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_sentarse)
        button3.setOnClickListener{
            var intent: Intent = Intent (this, sentarseActivity::class.java)
            startActivity(intent)
        }

        val button4: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_ir)
        button4.setOnClickListener{
            var intent: Intent = Intent (this, irActivity::class.java)
            startActivity(intent)
        }
    }
}