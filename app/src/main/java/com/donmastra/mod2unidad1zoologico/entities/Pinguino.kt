package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaMaiz
import com.donmastra.mod2unidad1zoologico.res.BolsaPescado
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Pinguino : Ave() {
    var consumoKcal : Int = 100
        get() = field
        set(value) {
            field = value
        }

    override fun comer(bolsaPescado: BolsaPescado) {
        if(bolsaPescado.kcal > consumoKcal){
            bolsaPescado.kcal -= consumoKcal
        } else {
            hacerRuido()
        }
    }

    override fun hacerRuido() : String = "¡KAAAAAAAAAKKKKK!"

    override fun comer(bolsaCarne: BolsaCarne) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaTrigo: BolsaTrigo) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaMaiz: BolsaMaiz) {
        TODO("Not yet implemented")
    }
}