package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foro)

        val botonRegresar: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_flechaRegresarForo)
        botonRegresar.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }
        val botonForo: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_foro2)
        botonForo.setOnClickListener{
            var intent: Intent = Intent (this, Foro2_Activity::class.java)
            startActivity(intent)
        }
        val botonTips: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_tips)
        botonTips.setOnClickListener{
            var intent: Intent = Intent (this, TipsActivity::class.java)
            startActivity(intent)
        }
        val botonHabitos: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_habitosSaludables)
        botonHabitos.setOnClickListener{
            var intent: Intent = Intent (this, CaminarActivity::class.java)
            startActivity(intent)
        }
//        falta este de agregar, es el calendario
        val botonGestacion: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_gestacion)
        botonGestacion.setOnClickListener{
            var intent: Intent = Intent (this, CalendarioActivity::class.java)
            startActivity(intent)
        }
    }
}