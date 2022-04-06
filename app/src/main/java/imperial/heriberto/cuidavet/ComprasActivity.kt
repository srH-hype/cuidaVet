package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ComprasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compras)

        val botonRegresar: Button = findViewById(R.id.btn_flechaRegresarforo6)
        botonRegresar.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }
        val btnShampoo: Button = findViewById(R.id.btn_shampoo)
        btnShampoo.setOnClickListener{
            var intent: Intent = Intent (this, Compras2::class.java)
            startActivity(intent)
        }
        val btnCepillo: Button = findViewById(R.id.btn_cepillo)
        btnCepillo.setOnClickListener{
            var intent: Intent = Intent (this, Compras2::class.java)
            startActivity(intent)
        }
        val btnPelota: Button = findViewById(R.id.btn_pelotaTenis)
        btnPelota.setOnClickListener{
            var intent: Intent = Intent (this, Compras2::class.java)
            startActivity(intent)
        }
        val btnperrito: Button = findViewById(R.id.btn_perrito)
        btnperrito.setOnClickListener{
            var intent: Intent = Intent (this, Compras2::class.java)
            startActivity(intent)
        }
        val btnCollar: Button = findViewById(R.id.btn_collar)
        btnCollar.setOnClickListener{
            var intent: Intent = Intent (this, Compras2::class.java)
            startActivity(intent)
        }
        val btnCorrea: Button = findViewById(R.id.btn_correa)
        btnCorrea.setOnClickListener{
            var intent: Intent = Intent (this, Compras2::class.java)
            startActivity(intent)
        }

    }
}