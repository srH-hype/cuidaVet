package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BaniosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banios)


        val botonRegresar: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_regresarHorarios)
        botonRegresar.setOnClickListener{
            var intent: Intent = Intent (this, HorariosActivity::class.java)
            startActivity(intent)
        }


        val botonSiguienteBanios: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_siguienteVeterinario)
        botonSiguienteBanios.setOnClickListener{
            var intent: Intent = Intent (this, CitasVeterinarioActivity::class.java)
            startActivity(intent)
        }
    }
}