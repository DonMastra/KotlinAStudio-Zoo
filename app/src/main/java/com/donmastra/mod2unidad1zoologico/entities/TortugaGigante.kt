package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class TortugaGigante : Reptil(){
    var consumoKcal : Int = 400
        get() = field
        set(value) {
            field = value
        }

    override fun comer(bolsaTrigo: BolsaTrigo) {
        if(bolsaTrigo.kcal > consumoKcal){
            bolsaTrigo.kcal -= consumoKcal
        } else {
            hacerRuido()
        }
    }

    override fun hacerRuido() : String = "¡OOOOGGGHHHHHH!"

    override fun comer(bolsaCarne: BolsaCarne) {
        TODO("Not yet implemented")
    }
}