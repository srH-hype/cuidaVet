package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Compras2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compras2)

        val botonRegresar: Button = findViewById(R.id.btn_flechaRegresarArticulos)
        botonRegresar.setOnClickListener{
            var intent: Intent = Intent (this, ComprasActivity::class.java)
            startActivity(intent)
        }
    }
}