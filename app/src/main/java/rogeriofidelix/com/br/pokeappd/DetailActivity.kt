package rogeriofidelix.com.br.pokeappd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_detail.*
import rogeriofidelix.com.br.pokeappd.model.Pokemons

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var pokemon = intent.getParcelableExtra<Pokemons>("pokemon")
        pokenumber.text = pokemon.pokeId.toString()
        pokename.text = pokemon.nome
        pokeDescription.text = pokemon.descricao
        tvHP.text = pokemon.hp
        tvSpeed.text = pokemon.speed
        tvAtack.text = pokemon.atack
        tvDefense.text = pokemon.defense
        pokeImage.setImageDrawable(ContextCompat.getDrawable(this, pokemon.imagemId))
    }
}
