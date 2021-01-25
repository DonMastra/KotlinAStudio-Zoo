package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Iguana : Reptil() {
    var consumoKcal : Int = 145
        get() = field
        set(value) {
            field = value
        }

    override fun comer(bolsaCarne: BolsaCarne) {
        if(bolsaCarne.kcal > consumoKcal){
            bolsaCarne.kcal -= consumoKcal
        } else {
            hacerRuido()
        }
    }

    override fun hacerRuido() : String = "¡FFFTTTTTTT!"

    override fun comer(bolsaTrigo: BolsaTrigo) {
        TODO("Not yet implemented")
    }

}