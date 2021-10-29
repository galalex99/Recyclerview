package ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.dao

import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje

class PersonajesDaoMockImpl : PersonajesDao {
    override fun getAll() =
        listOf(
            Personaje(0, "Draenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "proba"),

            Personaje(0, "Draenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "proba"),

            Personaje(0, "Draenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "proba"),

            Personaje(0, "Draenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "proba")
        )
}
