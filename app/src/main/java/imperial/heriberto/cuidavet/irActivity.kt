package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class irActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ir)

        val button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_Regresar)
        button.setOnClickListener{
            var intent: Intent = Intent (this, entrenamientoActivity::class.java)
            startActivity(intent)
        }
    }
}