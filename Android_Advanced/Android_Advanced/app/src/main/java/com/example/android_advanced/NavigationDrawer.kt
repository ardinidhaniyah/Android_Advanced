package com.example.android_advanced

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
//import kotlinx.android.synthetic.main.activity_navigationdrawer.*

class NavigationDrawer : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigationdrawer)

        setSupportActionBar(findViewById(R.id.toolbar))

//        navigation_view.setNavigationItemSelectedListener{
//            when (it.itemId) {
//                R.id.nav_home -> {
//                    true
//                }
//            }
//            true
//        }
//
//        val drawerToggle = ActionBarDrawerToggle(this, drawer, R.string.open, R.string.close)
//        drawer.addDrawerListener(drawerToggle)
//        drawerToggle.syncState()
//
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//    }
//
//    override fun onBackPressed() {
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START)
//        } else {
//            super.onBackPressed()
//        }
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        super.onOptionsItemSelected(item)
//        return when (item.itemId) {
//            android.R.id.home -> {
//                drawer.openDrawer(GravityCompat.START)
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
    }
}