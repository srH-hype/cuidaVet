package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HorariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horarios)

        val buttonregresar: Button = findViewById(R.id.btn_regresarCaminar)
        buttonregresar.setOnClickListener{
            var intent: Intent = Intent (this, CaminarActivity::class.java)
            startActivity(intent)
        }


        val botonSiguienteBanios: Button = findViewById(R.id.btn_siguienteHorarios)
        botonSiguienteBanios.setOnClickListener{
            var intent: Intent = Intent (this, BaniosActivity::class.java)
            startActivity(intent)
        }
    }
}