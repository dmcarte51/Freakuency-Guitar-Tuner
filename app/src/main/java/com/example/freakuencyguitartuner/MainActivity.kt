package com.example.freakuencyguitartuner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            findViewById<FragmentContainerView>(R.id.fragment_container)?.let { frameLayout ->
                val questionsFragment = TunerFragment()
                supportFragmentManager.beginTransaction()
                    .add(frameLayout.id, questionsFragment).commit()
            }
        }
    }
}