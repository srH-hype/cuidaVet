package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button: Button = findViewById(R.id.btn_emergencias)
        button.setOnClickListener{
            var intent: Intent = Intent (this, EmergenciaActivity::class.java)
            startActivity(intent)
        }
    }
}