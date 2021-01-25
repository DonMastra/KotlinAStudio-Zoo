package com.donmastra.mod2unidad1zoologico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.donmastra.mod2unidad1zoologico.entities.*
import com.donmastra.mod2unidad1zoologico.res.*

class MainActivity : AppCompatActivity() {
    var bolsaAlf = BolsaAlfalfa()
    var bolsaCarne = BolsaCarne()
    var bolsaTrigo = BolsaTrigo()
    var bolsaMaiz = BolsaMaiz()
    var bolsaPescado = BolsaPescado()
    val vaca = Vaca()
    val leon = Leon()
    val cerdo = Cerdo()
    val lobo = Lobo()
    val pinguino = Pinguino()
    val colibri = Colibri()
    val loro = Loro()
    val condor = Condor()
    val cocodrilo = Cocodrilo()
    val iguana = Iguana()
    val serpiente = Serpiente()
    val tortugaGigante = TortugaGigante()

    private var contadorAnimales = 0

    private lateinit var txtView: TextView
    private lateinit var txtViewSound: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView = findViewById(R.id.textView)
        txtViewSound = findViewById(R.id.textViewSound)

    }

    fun limpiarContador(view: View){
        contadorAnimales = 0
        txtView.text = contadorAnimales.toString()
    }

    fun alimentarVaca(view: View){
        if (bolsaAlf.kcal > vaca.consumoKcal){
            vaca.comer(bolsaAlf)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = vaca.hacerRuido()
        }
    }

    fun alimentarLeon(view: View){
        if (bolsaCarne.kcal > leon.consumoKcal){
            leon.comer(bolsaCarne)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = leon.hacerRuido()
        }
    }

    fun alimentarCerdo(view: View){
        if (bolsaTrigo.kcal > cerdo.consumoKcal){
            cerdo.comer(bolsaTrigo)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = cerdo.hacerRuido()
        }
    }

    fun alimentarLobo(view: View){
        if (bolsaCarne.kcal > lobo.consumoKcal){
            lobo.comer(bolsaCarne)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = lobo.hacerRuido()
        }
    }

    fun alimentarPinguino(view: View){
        if (bolsaPescado.kcal > pinguino.consumoKcal){
            pinguino.comer(bolsaPescado)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = pinguino.hacerRuido()
        }
    }

    fun alimentarColibri(view: View){
        if (bolsaTrigo.kcal > colibri.consumoKcal){
            colibri.comer(bolsaTrigo)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = colibri.hacerRuido()
        }
    }

    fun alimentarLoro(view: View){
        if (bolsaMaiz.kcal > loro.consumoKcal){
            loro.comer(bolsaMaiz)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = loro.hacerRuido()
        }
    }

    fun alimentarCondor(view: View){
        if (bolsaCarne.kcal > condor.consumoKcal){
            condor.comer(bolsaCarne)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = condor.hacerRuido()
        }
    }

    fun alimentarCocodrilo(view: View){
        if (bolsaCarne.kcal > cocodrilo.consumoKcal){
            cocodrilo.comer(bolsaCarne)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = cocodrilo.hacerRuido()
        }
    }

    fun alimentarIguana(view: View){
        if (bolsaCarne.kcal > iguana.consumoKcal){
            iguana.comer(bolsaCarne)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = iguana.hacerRuido()
        }
    }

    fun alimentarSerpiente(view: View){
        if (bolsaCarne.kcal > serpiente.consumoKcal){
            serpiente.comer(bolsaCarne)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = serpiente.hacerRuido()
        }
    }

    fun alimentarTortugaGigante(view: View){
        if (bolsaTrigo.kcal > tortugaGigante.consumoKcal){
            tortugaGigante.comer(bolsaTrigo)
            contadorAnimales++
            txtView.text = contadorAnimales.toString()
        } else {
            txtViewSound.text = tortugaGigante.hacerRuido()
        }
    }

}