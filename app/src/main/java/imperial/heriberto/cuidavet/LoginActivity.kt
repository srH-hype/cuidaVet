package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: Button = findViewById(R.id.btn_iniciar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, MenuActivity2::class.java)
            startActivity(intent)
        }

    }
}