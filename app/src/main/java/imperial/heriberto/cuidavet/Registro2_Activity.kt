package imperial.heriberto.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro2_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro2)

        val buttonFlechaRegistro: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_flcheaRegresar_registro2)
        buttonFlechaRegistro.setOnClickListener{
            var intent: Intent = Intent (this, Registro::class.java)
            startActivity(intent)
        }
        val buttonEmpezar: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_empezar)
        buttonEmpezar.setOnClickListener{
            var intent: Intent = Intent (this, menuActivity::class.java)
            startActivity(intent)
        }
    }
}