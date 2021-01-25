package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.*

abstract class Ave {

    abstract fun comer(bolsaCarne: BolsaCarne)
    abstract fun comer(bolsaTrigo: BolsaTrigo)
    abstract fun comer(bolsaMaiz: BolsaMaiz)
    abstract fun comer(bolsaPescado: BolsaPescado)

    abstract fun hacerRuido() : String
}