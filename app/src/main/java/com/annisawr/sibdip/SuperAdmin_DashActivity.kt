package com.annisawr.sibdip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.annisawr.sibdip.R
import com.google.android.material.navigation.NavigationView

class SuperAdmin_DashActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle  /* membuat menu bar */
    lateinit var drawerLayout: DrawerLayout     /* membuat menu bar */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_super_admin_dash)

        /* membuat menu bar */
        drawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

            it.isChecked = true

            when(it.itemId) {
                R.id.nav_biodata -> Toast.makeText(applicationContext, "Cliked Biodata Anda", Toast.LENGTH_SHORT).show()
                R.id.nav_logout -> Toast.makeText(applicationContext, "Cliked Logout", Toast.LENGTH_SHORT).show()
            }
            true

    }
}
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {

            return true
        }
        return super.onOptionsItemSelected(item)
    }

} /*batas class*/