package com.newlandapps.testApp

class Programador(val name:String, val age:Int, val lenguages:Array<String>) {

    fun code(){
        for (lenguage: String in lenguages){
            println("Se programar en $lenguage")
        }
    }
}