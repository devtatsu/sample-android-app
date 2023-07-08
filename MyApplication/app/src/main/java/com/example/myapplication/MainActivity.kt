package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val button = findViewById<Button>(R.id.button) // ②クリックしたいviewを取得
        button.setOnClickListener{ // ② setOnClickListenerを設置し、処理を追加
            Log.i("MainActivity","Test")
        }

    }


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

//    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
////        super.onCreate(savedInstanceState, persistentState)
////        Log.d("MainActivity","Test")
////        setContentView(R.layout.activity_main)
//
////        binding..setOnClickListener {
////            textView.setText("TEST")
////        }
//        val button : Button = findViewById(R.id.button)
//        button.setOnClickListener {
//            Log.i("MainActivity","Test")
//            print("test")
//        }
//
//
//    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//
////        super.onCreate(savedInstanceState, persistentState)
////        Log.d("MainActivity","Test")
////        setContentView(R.layout.activity_main)
//
////        binding..setOnClickListener {
////            textView.setText("TEST")
////        }
//
//        super.onCreate(savedInstanceState)
//
//        val button : Button = findViewById(R.id.button)
//        button.setOnClickListener {
//            Log.i("MainActivity","Test")
//            print("test")
//        }
//
//    }

//    fun buttonOnClick() {
//        Log.i("MainActivity","Test")
//    }

}

