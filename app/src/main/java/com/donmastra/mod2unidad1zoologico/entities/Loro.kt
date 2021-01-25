package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaMaiz
import com.donmastra.mod2unidad1zoologico.res.BolsaPescado
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Loro : Ave() {
    var consumoKcal : Int = 80
        get() = field
        set(value) {
            field = value
        }

    override fun comer(bolsaMaiz: BolsaMaiz) {
        if(bolsaMaiz.kcal > consumoKcal){
            bolsaMaiz.kcal -= consumoKcal
        } else {
            hacerRuido()
        }
    }

    override fun hacerRuido() : String = "¡HAGO RRRRRRRUIDO!"

    override fun comer(bolsaPescado: BolsaPescado) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaCarne: BolsaCarne) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaTrigo: BolsaTrigo) {
        TODO("Not yet implemented")
    }

}