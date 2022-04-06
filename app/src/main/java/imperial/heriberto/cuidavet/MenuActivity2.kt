package imperial.heriberto.cuidavet

import android.app.ActionBar
import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MenuActivity2 : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val button: Button = findViewById(R.id.btn_emergencias)
        button.setOnClickListener{
            var intent: Intent = Intent (this, EmergenciaActivity::class.java)
            startActivity(intent)
        }

        val button2: Button = findViewById(R.id.btn_masconta)
        button2.setOnClickListener{
            var intent: Intent = Intent (this, MascotasActivity::class.java)
            startActivity(intent)
        }

        //Control menu
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


        //



        //
        navView.setNavigationItemSelectedListener {
            lateinit var intent: Intent
            when(it.itemId) {

                R.id.menuMisMascotas -> {
                    intent = Intent(this, MascotasActivity::class.java)
                    startActivity (intent)
                }
                R.id.menuNotas -> {
                    true
                }
                R.id.menuCambiarUsuario -> {
                    true
                }
                R.id.menuCambiarContra -> {
                    true
                }
                R.id.menuAvisoPrivacidad -> {
                    true
                }
                R.id.menuCerrarSesion -> {
                    true
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