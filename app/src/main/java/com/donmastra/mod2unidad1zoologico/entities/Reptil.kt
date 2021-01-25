package com.donmastra.mod2unidad1zoologico.entities

import com.donmastra.mod2unidad1zoologico.res.*

abstract class Reptil {

    abstract fun comer(bolsaCarne: BolsaCarne)
    abstract fun comer(bolsaTrigo: BolsaTrigo)

    abstract fun hacerRuido() : String
}