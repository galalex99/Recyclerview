package ies.murallaromana.dam.segundo.proyectorecyclesview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje

class DetallePersonajeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_personaje)

        // Esto tambien se puede cambiar en el manifest
        setTitle("Detalle Personaje")
        val personaje = intent.extras?.get("personaje") as Personaje?

        // TODO: Aquí enlazría los datos con la interfaz de usuario

        // establecer o titulo segun hay datos ou no
        if(personaje !=null) setTitle(personaje.nombre)else setTitle("Nuevo Personaje")


    }
}