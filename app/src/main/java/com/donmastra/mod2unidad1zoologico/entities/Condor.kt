package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.BolsaCarne
import com.donmastra.mod2unidad1zoologico.res.BolsaMaiz
import com.donmastra.mod2unidad1zoologico.res.BolsaPescado
import com.donmastra.mod2unidad1zoologico.res.BolsaTrigo

class Condor : Ave() {
    var consumoKcal : Int = 350
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

    override fun hacerRuido() : String = "¡KKIIIIIIIUUUUUUUUU!"

    override fun comer(bolsaTrigo: BolsaTrigo) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaMaiz: BolsaMaiz) {
        TODO("Not yet implemented")
    }

    override fun comer(bolsaPescado: BolsaPescado) {
        TODO("Not yet implemented")
    }

}