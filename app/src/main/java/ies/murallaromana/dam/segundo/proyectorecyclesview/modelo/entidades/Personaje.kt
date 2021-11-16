package ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades

import java.io.Serializable

class Personaje(
    var id: Long,
    var nombre: String,
    var apellido: String,
    var titulo: String,
    var famila: String,
    var url: String,
    var descripcion: String = ""
) :Serializable {

    fun devolveNombre(): String {
        return "Nombre : " + {this.nombre } + " \nApellidos: " + {this.apellido }
    }

    fun devolveNombre2(): String {
        return "Nombre :  ${this.nombre}  \nApellidos:   ${this.apellido}"
    }

    fun devolveNombre3(): String = "Nombre :  ${this.nombre}  Apellidos:   ${this.apellido}"

}


