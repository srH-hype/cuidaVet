package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class irActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ir)

        val button: Button = findViewById(R.id.btn_Regresar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }
    }
}