package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CitasVeterinarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citas_veterinario)


        val btnRegresarBanios: Button = findViewById(R.id.btn_regresarBanios)
        btnRegresarBanios.setOnClickListener{
            var intent: Intent = Intent (this, BaniosActivity::class.java)
            startActivity(intent)
        }


        val btnRegrresarForo: Button = findViewById(R.id.btn_flechaRegresarForo4)
        btnRegrresarForo.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }
    }
}