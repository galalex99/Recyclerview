package ies.murallaromana.dam.segundo.proyectorecyclesview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ies.murallaromana.dam.segundo.proyectorecyclesview.R
import ies.murallaromana.dam.segundo.proyectorecyclesview.databinding.ActivityMainBinding
import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // InputManager layoutManager = new LinearLayoutManager(this)
        val layoutManager = LinearLayoutManager(this)


        // Prueba Personaje
        val p = Personaje(0,"Draenerys","Targaryen","Mother of Dragons","House Targaryen","proba")
        println(p.devolveNombre())
    }
}