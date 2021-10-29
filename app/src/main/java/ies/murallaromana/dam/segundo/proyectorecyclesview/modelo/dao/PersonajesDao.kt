package ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.dao

import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje

interface PersonajesDao {
    fun getAll(): List<Personaje>
}
