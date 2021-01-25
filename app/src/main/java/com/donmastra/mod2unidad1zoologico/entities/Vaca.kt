package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaAlfalfa
import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Vaca : Mamifero() {
    var consumoKcal : Int = 800
        get() = field
        set(value) {
            field = value
        }

    override fun comer(bolsaCarne: BolsaCarne) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaTrigo: BolsaTrigo) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaAlfalfa: BolsaAlfalfa) {
        if(bolsaAlfalfa.kcal > consumoKcal){
            bolsaAlfalfa.kcal -= consumoKcal
        } else {
            hacerRuido()
        }
    }

    override fun hacerRuido() : String = "¡MUUUUUU!"
}