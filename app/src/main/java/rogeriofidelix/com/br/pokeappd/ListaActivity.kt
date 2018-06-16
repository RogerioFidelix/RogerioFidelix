package rogeriofidelix.com.br.pokeappd

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import kotlinx.android.synthetic.main.activity_lista.*
import rogeriofidelix.com.br.pokeappd.adapter.PokemonAdapter
import rogeriofidelix.com.br.pokeappd.model.Pokemons

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        rvMeusPokemons.adapter = PokemonAdapter(Pokemons(), this, {
            val intent = Intent(this, DetailActivity::class.java)

            intent.putExtra("pokemon", it)

            startActivity(intent)

        })

        val layoutmanager = LinearLayoutManager(this)

        rvMeusPokemons.layoutManager = layoutmanager
    }

    private fun Pokemons(): List<Pokemons> {
        return listOf(Pokemons(
            1,
            R.drawable.char3,
                "Dragão/Fogo",
            "Charizard",
            "Showzasso",
            "1",
            "1",
            "1",
            "1"
    ))
    Pokemons(
            2,
            R.drawable.char2,
            "Dragão/Fogo",
            "Charmilion",
            "Showzasso",
            "1",
            "1",
            "1",
            "1"
    )
    Pokemons(
            3,
            R.drawable.char11,
            "Dragão/Fogo",
            "Charmander",
            "Showzasso",
            "1",
            "1",
            "1",
            "1"
    )}

}
