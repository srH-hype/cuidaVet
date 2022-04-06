package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        val botonRegresar: Button = findViewById(R.id.btn_flechaRegresarTips)

        botonRegresar.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }

    }
}