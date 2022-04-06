package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Foro2_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foro2)

        val buttonflecha: Button = findViewById(R.id.btn_flechaRegresarForo)
        buttonflecha.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }
    }
}