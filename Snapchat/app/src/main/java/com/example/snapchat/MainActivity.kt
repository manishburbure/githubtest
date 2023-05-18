











package com.example.snapchat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.location_icon -> {
                    val locationFragment = location()
                    setCurrentFragment(locationFragment)
                    true
                }
                R.id.message_icon -> {
                    val messageFragment = message()
                    setCurrentFragment(messageFragment)
                    true
                }
                R.id.camera_icon -> {
                    val cameraFragment = camera()
                    setCurrentFragment(cameraFragment)
                    true
                }
                R.id.Story_icon -> {
                    val storyFragment = story()
                    setCurrentFragment(storyFragment)
                    true
                }
                R.id.feed_icon -> {
                    val feedFragment = feed()
                    setCurrentFragment(feedFragment)
                    true
                }
                else -> false
            }
        }

        // Set the initial fragment
        val locationFragment = location()
        setCurrentFragment(locationFragment)
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayout, fragment)
            commit()
        }
    }
}




























/*
package com.example.snapchat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val locationFragment = location()
        val messageFragment = message()
        val cameraFragment = camera()
        val storyFragment = story()
         val feedFragment = feed()


        setCurrentFragment(locationFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener{

             when(it.itemId){
              R.id.location_icon -> setCurrentFragment(locationFragment)
                 R.id.message_icon -> setCurrentFragment(messageFragment)
                 R.id.camera_icon -> setCurrentFragment(cameraFragment)
                 R.id.Story_icon -> setCurrentFragment(storyFragment)
                 R.id.feed_icon -> setCurrentFragment(feedFragment)
             }
            true
         }
    }



    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.framelayout,fragment)
            commit()
        }


}

*/





















