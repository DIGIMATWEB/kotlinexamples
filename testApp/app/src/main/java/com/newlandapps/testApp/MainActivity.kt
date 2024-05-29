package com.newlandapps.testApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //LECCION 1
       //variablesYConstantes()
        //LECCION 2
       //tiposDeDatos()
        //LECCION 3
        //sentenciasIf()
        //LECCION 4
        //sentenciaWhen()
        //leccion 5
         //marrays()
        //leccion 6
       // mapas()
        //leccion 7
        //mloops()
        //leccion 8
        //nullSafety()
        //leccion 9
        //funciones()
        //leccion10
        clases()

    }
    /**
    *ejemplo de comentarios
     */
    private fun variablesYConstantes() {
        // Variables
        var myFirstVariable = "Hola hackermen!"
        var myFirstNumber = 1
        println(myFirstVariable)
        myFirstVariable = "Bienvenidos a newlandapps"
        println(myFirstVariable)
        var mySecondVariable = "Aprendiendo kotlin"
        println(mySecondVariable)

        // Constantes
        val myFirstConstant = "Primera constante"
        println(myFirstConstant)
        val mySecondConstant = "Segunda constante"
        println(mySecondConstant)
    }

    private fun tiposDeDatos() {
        // String
        val myString1: String = "bienvenido a mouredev" // inferencia de tipos
        val myString = "hola hackermen" // inferencia de tipos
        val myString3: String = myString + " " + myString1
        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)
        val myFirstDouble: Double = 1.5
        val myFirstFloat: Float = 1.6f
        val mySecondDouble = 1
        println(myFirstDouble + mySecondDouble)

        // Boolean
        val myBoolean1 = true
        val myBoolean2: Boolean = false
        println(myBoolean1 == myBoolean2)
        println(myBoolean1 && myBoolean2)
    }

    // Sentencias if
    private fun sentenciasIf() {
        val myNumber = 10
        if (myNumber <= 10) {
            println("$myNumber es menor o igual que 10")
        }
    }

    private fun sentenciaWhen() {
        val country = "Mexico"
        when (country) {
            "España", "Cataluña" -> {
                println("El idioma es onda vital")
            }
            "Mexico" -> {
                println("El idioma es por eso")
            }
            "USA" -> {
                println("El idioma es gringou")
            }
            else -> {
                println("sepa dios que idioma")
            }
        }

        // When con Int
        val age = 10
        when (age) {
            0, 1, 2, 3 -> {
                println("Eres un bebe")
            }
            in 3..10 -> {
                println("Eres un niño")
            }
            in 11..17 -> {
                println("Eres un adolescente")
            }
            else -> {
                println("Eres un adulto")
            }
        }
    }

    private fun marrays() {
        val name = "Brais"
        val surname = "Moure"
        val company = "Mouredev"
        val age = "32"

        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        println(myArray)
        //añadir un conjunto de datos
        myArray.addAll(listOf("primer ejemplo","dato extra agregado"))
        println(myArray)
        //acceso a datos
        val myCompany = myArray[2]
        println(myCompany)
        myArray[5] = "dato remplazado"
        myArray.removeAt(4)
        println(myArray)
        //recorrer datos
        myArray.forEach {
            println(it)
        }
        //otras operaccion
        println(myArray.count())
        myArray.first()
        myArray.last()
//        myArray.clear()
//        println(myArray)
//        println(myArray.count())
    }

    public fun mapas(){
        var myMap: Map<String,Int> = mapOf()// este mapa es inicializado pero es estatico
        println(myMap)
        myMap= mutableMapOf("brais" to 1,"frank" to 5)//a este mapa se le pueden añadir nuevos valores
        println(myMap)
        myMap["Anna"]= 7
        println(myMap)
        myMap.put("Maria" , 2)
        println(myMap)
        myMap.put("frank",8)
        println(myMap)
        myMap.put("Marcos",3)
        println(myMap)
        //acceso a datos en mapas

        println(myMap["frank"])
        myMap.remove("Maria")
        println(myMap)
    }
    private fun mloops(){
        //bucles
        val myArray :List<String> = listOf("Hola ","este es mi tutorial de ","kotlin")
        val myMap :MutableMap<String,Int> = mutableMapOf("brais" to 4,"frank" to 8,"ana" to 1)
        //for
        for(myString in myArray){
            print(myString)
        }
        println("\n")
        for(myElement in myMap){
            println(myElement)
        }
        println("\n")
        for(x:Int in 0 ..5){ //puedes usar until pero no sera usado el ultimo valor
            println(x)
        }
        println("\n")
        for(x:Int in 0 until 5){ //puedes usar until pero no sera usado el ultimo valor
            println(x)
        }
        println("\n")
        for(x:Int in 0 ..10 step 2){ //puedes usar until pero no sera usado el ultimo valor
            println(x)
        }
        println("\n")
        for(x:Int in 10 downTo 0 step 2){ //puedes usar until pero no sera usado el ultimo valor
            println(x)
        }
        println("\n")
        val myNumericArray = (0 .. 15)
        for(myVal in myNumericArray step 2){
            println(myVal)
        }
        println("\n")
        //while
        println("while")
        var x=0
        while(x<10){
            println(x)
            x++//x+=1
        }
    }
    private fun nullSafety(){
        var myString = "Mouredev"
        //myString =null
        println(myString)
        var mySafetyString :String? = "safety var" //se agrega opcional
        println(mySafetyString)
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "suscribete"
        println(mySafetyString)
        //mySafetyString = null

        println(mySafetyString?.length)
        mySafetyString?.let {
            println(it)
        }?: run {
            println(mySafetyString)
        }

    }
    fun funciones(){
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Francisco")
        sumafuncReturn(1,2)
        val sumaf =   sumafuncReturn(1,2)
        println(sumaf)
    }
    fun sayHello(){
        println("Hellou")
    }
    fun sayMyName(name :String){
        println("$name")
    }
    fun sumafuncReturn(a:Int, b:Int):Int{
       // println(a+b)
        val suma= a+b
        return suma
    }
    fun clases(){
        val frank=Programador("fancisco",32, arrayOf("java","c++","C#","c","Swift","kotlin"))
        println(frank)
        println(frank.name)
        println(frank.lenguages)
        println(frank.code())//esto esta mal
        println("\n")
        println("\n")
        frank.code()
    }
}