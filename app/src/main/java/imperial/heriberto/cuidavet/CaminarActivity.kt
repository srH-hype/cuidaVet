package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CaminarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caminar)

        val buttonflecha: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_flechaRegresarforo3)
        buttonflecha.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }

        val botonSiguiente: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_siguiente)
        botonSiguiente.setOnClickListener{
            var intent: Intent = Intent (this, HorariosActivity::class.java)
            startActivity(intent)
        }
    }
}