package ies.murallaromana.dam.segundo.proyectorecyclesview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ies.murallaromana.dam.segundo.proyectorecyclesview.R
import ies.murallaromana.dam.segundo.proyectorecyclesview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}