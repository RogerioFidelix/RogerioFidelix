package rogeriofidelix.com.br.pokeappd.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by logonrm on 15/06/2018.
 */
class Pokemons (val pokeId: Int,
                val imagemId: Int,
                val tipo: String,
                val nome: String,
                val descricao: String,
                val hp: String,
                val speed: String,
                val atack: String,
                val defense: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(pokeId)
        parcel.writeInt(imagemId)
        parcel.writeString(tipo)
        parcel.writeString(nome)
        parcel.writeString(descricao)
        parcel.writeString(hp)
        parcel.writeString(speed)
        parcel.writeString(atack)
        parcel.writeString(defense)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pokemons> {
        override fun createFromParcel(parcel: Parcel): Pokemons {
            return Pokemons(parcel)
        }

        override fun newArray(size: Int): Array<Pokemons?> {
            return arrayOfNulls(size)
        }
    }
}