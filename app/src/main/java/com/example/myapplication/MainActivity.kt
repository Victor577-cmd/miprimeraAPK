package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //saludo()
        //println("hola estudientes de programacion IV")

        //variableyConstantes()
        //ejercicioVarVal()
        tiposDeDatos()
    }

    fun saludo(){
        println("Hola estudientes desde la funcion saludo")
    }
    private fun variableyConstantes(){
        //variables
        var myPrimeraVariable = "hola estudiantes de Ingenieria"
        println(myPrimeraVariable)

        myPrimeraVariable = "Aqui cambiamos el valor de la variable"
        println(myPrimeraVariable)

        //Constantes
        val myPrimeraConstante = "Esto es una constante"
        println(myPrimeraConstante)
        //una constante no puede ser modificada
        //val myPrimeraConstante = "Otro valor"

        val miSegundoConstante:String = myPrimeraVariable
        println(miSegundoConstante)


        var miNumero = 1
        var miDouble = 2.2


    }


    fun ejercicioVarVal(){
        println("hola Alumnos")
        val nombre:String = "Pedro"

        var apellido:String = "Lopes"
        apellido = "Lopez"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        var nombreCompleto = nombre + " " + apellido
        println(nombreCompleto)

        val añoNacimiento = 2000
        var añoActual = Calendar.getInstance().get(Calendar.YEAR)
        var Edad = añoActual-añoNacimiento
        println("tu Edad es: " + Edad)
        println("tu Edad es:  $Edad")


    }

    private fun tiposDeDatos(){
        //Enteros(Byte,Short,Int,Long)
        val myInt = 1
        val myInt2:Int = 3
        val myInt3:Int = myInt+myInt2
        println(myInt3)

        //Decimales(Floot, Double)
        val myFloat = 1.7f
        val myFloat2 = 1.7f
        val myDouble = 1.3
        val myDouble2:Double = 1.4
        val myDouble3:Double = 1.4
        var mySumaDouble = myDouble+myDouble2+myDouble3
        println(mySumaDouble)

        //boolean (boll)
        val myBoolean:Boolean = true
        val myBoolean2 = true
        val myBoolean3:Boolean = true
        println(myBoolean==myBoolean2)
        println(myBoolean&&myBoolean3)

    }


    private fun tiposDeDatosDeducidoExplicitos(){
        var enteroExplicito:Int = 45
        println(enteroExplicito.javaClass)
        var enteroDeducido:Int = 35
        println(enteroDeducido.javaClass)

        var dobleExplicito:Double = 45.45
        println(dobleExplicito.javaClass)
        var dobleDeducido:Double = 35.35
        println(dobleDeducido.javaClass)

        var flotanteExplicito:Float = 45.45f
        println(flotanteExplicito.javaClass)
        var flotanteDeducido:Float = 35.35f
        println(flotanteDeducido.javaClass)

        var largoExplicito:Long = 454545
        println(largoExplicito.javaClass)
        var largoDeducido:Long = 353535
        println(largoDeducido.javaClass)

        var textoExplicito:String = "45"
        println(textoExplicito.javaClass)
        var textoDeducido:String = "35"
        println(textoDeducido.javaClass)

        enteroExplicito=textoExplicito.toInt()
        println(enteroExplicito.javaClass)

        enteroDeducido=textoDeducido.toInt()
        println(enteroDeducido.javaClass)


    }

    /**
     * A native method that is implemented by the 'myapplication' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'myapplication' library on application startup.
        init {
            System.loadLibrary("myapplication")
        }
    }
}