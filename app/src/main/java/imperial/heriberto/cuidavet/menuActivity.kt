package imperial.heriberto.cuidavet

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.navigation.NavigationView

class menuActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_emergencias)
        button.setOnClickListener{
            var intent: Intent = Intent (this, EmergenciaActivity::class.java)
            startActivity(intent)
        }

        val button2: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_masconta)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, MascotasActivity::class.java)
            startActivity(intent)
        }

        val button4: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_calendario)
        button4.setOnClickListener{
            var intent: Intent = Intent (this, CalendarioActivity::class.java)
            startActivity(intent)
        }

        val button3: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_entrenaminto)
        button3.setOnClickListener{
            var intent: Intent = Intent (this, entrenamientoActivity::class.java)
            startActivity(intent)
        }

        val button5: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_compras)
        button5.setOnClickListener{
            var intent: Intent = Intent (this, ComprasActivity::class.java)
            startActivity(intent)
        }

        val button6: androidx.appcompat.widget.AppCompatButton = findViewById(R.id.btn_foro)
        button6.setOnClickListener{
            var intent: Intent = Intent (this, ForoActivity::class.java)
            startActivity(intent)
        }

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.menulateral)

        val colorDrawable = ColorDrawable(resources.getColor(R.color.white))
        supportActionBar?.setBackgroundDrawable(colorDrawable)
        supportActionBar?.elevation = 0.0F

        navView.setNavigationItemSelectedListener {
            lateinit var intent: Intent
            when(it.itemId) {

                R.id.menuMisMascotas -> {
                    intent = Intent(this, MascotasActivity::class.java)
                    startActivity (intent)
                }
                R.id.menuNotas -> {
                    intent = Intent(this, NotasActivity::class.java)
                    startActivity (intent)
                }
                R.id.menuCambiarUsuario -> {
                    intent = Intent(this, CambiarUsuarioActivity::class.java)
                    startActivity (intent)
                }
                R.id.menuCambiarContra -> {
                    intent = Intent(this, CambiarContrasenaActivity::class.java)
                    startActivity (intent)
                }
                R.id.menuAvisoPrivacidad -> {
                    intent = Intent(this, AvisoPrivacidadActivity::class.java)
                    startActivity (intent)
                }
                R.id.menuCerrarSesion -> {
                    intent = Intent(this, CerrarSesionActivity::class.java)
                    startActivity (intent)
                }

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}