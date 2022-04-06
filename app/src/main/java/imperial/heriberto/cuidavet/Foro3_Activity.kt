package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Foro3_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foro3)

        val botonRegresar: Button = findViewById(R.id.btn_flechaRegresarForo2)
        botonRegresar.setOnClickListener{
            var intent: Intent = Intent (this, Foro2_Activity::class.java)
            startActivity(intent)
        }

        val botonPalomita: Button = findViewById(R.id.btn_palomita)
        botonPalomita.setOnClickListener{
            var intent: Intent = Intent (this, Foro2_Activity::class.java)
            startActivity(intent)
        }
    }
}