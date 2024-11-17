package com.cmc.mobileproject

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val titles = listOf("Short news title will be here","Short news title will be here","Short news title will be here")

        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerview.adapter = RecyclerViewAdapter(titles)

        val nav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val intent = Intent(this,SecondActivity::class.java)

        nav.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.nav_profile -> {
                    startActivity(intent)
                    true
                }
                else->{false}
            }
        }



    } // End oncreate

}