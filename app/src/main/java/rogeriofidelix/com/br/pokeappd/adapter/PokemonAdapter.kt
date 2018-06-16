package rogeriofidelix.com.br.pokeappd.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.meus_pokemons.view.*
import rogeriofidelix.com.br.pokeappd.R
import rogeriofidelix.com.br.pokeappd.model.Pokemons

/**
 * Created by logonrm on 15/06/2018.
 */
class PokemonAdapter(private val pokemons: List<Pokemons>,
                     private val context: Context,
                     val listener: (Pokemons) -> Unit) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val note = pokemons[position]
        holder?.let{
            it.bindView(note, listener)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(context).inflate(R.layout.meus_pokemons, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int{
        return pokemons.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(pokemons: Pokemons,
                     listener: (Pokemons) -> Unit) = with(itemView) {
            val tvID = tvID
            val ivID = ivID
            val tvTipo = tvTipo
            val tvNome = tvNome
            val tvDescricao = tvDescricao

            tvID.text = pokemons.pokeId.toString()
            ivID.setImageDrawable(ContextCompat.getDrawable(context, pokemons.imagemId))
            tvTipo.text = pokemons.tipo
            tvNome.text = pokemons.nome
            tvDescricao.text = pokemons.descricao

            setOnClickListener { listener(pokemons) }
        }
    }

}

