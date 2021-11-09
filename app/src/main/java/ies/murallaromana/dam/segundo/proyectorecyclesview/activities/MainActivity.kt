package ies.murallaromana.dam.segundo.proyectorecyclesview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import ies.murallaromana.dam.segundo.proyectorecyclesview.R
import ies.murallaromana.dam.segundo.proyectorecyclesview.adapters.ListaPersonajesAdapter
import ies.murallaromana.dam.segundo.proyectorecyclesview.databinding.ActivityMainBinding
import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.dao.PersonajesDaoMockImpl
import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Componentes para implementacion
        val layoutManager = LinearLayoutManager(this)
        val Personajes = PersonajesDaoMockImpl();
        val adapter = ListaPersonajesAdapter(Personajes.getAll())
        binding.rvListaPersonajes.adapter = adapter
        binding.rvListaPersonajes.layoutManager = layoutManager
        binding.rvListaPersonajes.setHasFixedSize(true)
    }

}