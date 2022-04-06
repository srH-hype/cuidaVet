package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Foro2_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foro2)

        val buttonflecha: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_flechaRegresarForo)
        buttonflecha.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }
//
//        val botonmas: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_mas)
//        botonmas.setOnClickListener{
//            var intent: Intent = Intent (this, Foro3_Activity::class.java)
//            startActivity(intent)
//        }
    }
}