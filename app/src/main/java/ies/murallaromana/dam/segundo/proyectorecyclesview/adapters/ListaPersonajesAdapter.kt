package ies.murallaromana.dam.segundo.proyectorecyclesview.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import ies.murallaromana.dam.segundo.proyectorecyclesview.DetallePersonajeActivity
import ies.murallaromana.dam.segundo.proyectorecyclesview.R
import ies.murallaromana.dam.segundo.proyectorecyclesview.databinding.ItemPersonajeBinding
import ies.murallaromana.dam.segundo.proyectorecyclesview.modelo.entidades.Personaje


class ListaPersonajesAdapter(val list_personajes: List<Personaje>) :
    RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {
    class PersonajesViewHolder(val itemBinding: ItemPersonajeBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun binder(personaje: Personaje) {
            itemBinding.tvId.setText(personaje.id.toString())
            itemBinding.tvTitulo.setText(personaje.titulo)
            itemBinding.tvNombre.setText(personaje.nombre)
            itemBinding.tvApellido.setText(personaje.apellido)
            itemBinding.tvDescricion.setText(personaje.descripcion)
            itemBinding.tvFamilia.setText(personaje.famila)

            Picasso.get().load(personaje.url).into(itemBinding.ivImagen)

            itemBinding.idItem.setOnClickListener {
                val intent = Intent(itemBinding.root.context,DetallePersonajeActivity::class.java)
                intent.putExtra("personaje",personaje)
                itemBinding.root.context.startActivity(intent)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonajesViewHolder(ItemPersonajeBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = list_personajes.get(position)
        holder.binder(personaje)
    }

    override fun getItemCount(): Int = list_personajes.size


}