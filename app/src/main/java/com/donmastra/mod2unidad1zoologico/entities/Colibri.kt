package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaMaiz
import com.donmastra.mod2unidad1zoologico.res.BolsaPescado
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Colibri : Ave() {
    var consumoKcal : Int = 25
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

    override fun hacerRuido() : String = "¡PSSST PSSST PSSST!"

    override fun comer(bolsaPescado: BolsaPescado) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaCarne: BolsaCarne) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaMaiz: BolsaMaiz) {
        TODO("Not yet implemented")
    }
}