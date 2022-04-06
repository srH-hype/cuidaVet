package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mascotanuevaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotanueva)


        val button: Button = findViewById(R.id.btn_regresarMascota)
        button.setOnClickListener{
            var intent: Intent = Intent (this, MascotasActivity::class.java)
            startActivity(intent)
        }
    }
}