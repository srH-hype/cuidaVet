package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalendarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendario)

        val btnRegresar: Button = findViewById(R.id.btn_flechaRegresarforo5)
        btnRegresar.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }
    }
}