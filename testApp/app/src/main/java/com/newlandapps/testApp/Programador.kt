package com.newlandapps.testApp

class Programador(val name:String, val age:Int, val lenguages:Array<String>,val AutosFavoritos:Array<Carros>?=null,val friends:Array<Programador>? = null) {
    enum class Carros{
        MERCEDEZ,
        MAZDA,
        LOTUS
    }
    fun code(){
        for (lenguage: String in lenguages){
            println("Se programar en $lenguage")
        }
    }
}