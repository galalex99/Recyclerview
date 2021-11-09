package ies.murallaromana.dam.segundo.proyectorecyclesview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ies.murallaromana.dam.segundo.proyectorecyclesview.R
import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje


class ListaPersonajesAdapter(val list_personajes: List<Personaje>) :
    RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {
    class PersonajesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivImagen = itemView.findViewById<ImageView>(R.id.ivImagen)
        val tvId = itemView.findViewById<TextView>(R.id.tvId)
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val tvApellidos = itemView.findViewById<TextView>(R.id.tvApellido)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val tvFamilia = itemView.findViewById<TextView>(R.id.tvFamilia)
        val tvURL = itemView.findViewById<TextView>(R.id.tvUrl)
        val tvDescricion = itemView.findViewById<TextView>(R.id.tvDescricion)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_personaje, parent, false)
        return PersonajesViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = list_personajes.get(position)

        holder.tvId.setText(personaje.id.toString())
        holder.tvNombre.setText(personaje.nombre)
        holder.tvApellidos.setText(personaje.apellido)
        holder.tvTitulo.setText(personaje.titulo)
        holder.tvFamilia.setText(personaje.famila)
        holder.tvURL.setText(personaje.url)
        holder.tvDescricion.setText(personaje.descripcion)
        Picasso.get().load("https://thronesapi.com/assets/images/daenerys.jpg"
        ).into(holder.ivImagen)
    }

    override fun getItemCount(): Int = list_personajes.size


}