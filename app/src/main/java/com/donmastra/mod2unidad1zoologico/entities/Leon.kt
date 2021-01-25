package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaAlfalfa
import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Leon : Mamifero() {
    var consumoKcal : Int = 600
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

    override fun hacerRuido() : String = "¡ROOOOAARRR!"

    override fun comer(bolsaTrigo: BolsaTrigo) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaAlfalfa: BolsaAlfalfa) {
        TODO("Not yet implemented")
    }

}