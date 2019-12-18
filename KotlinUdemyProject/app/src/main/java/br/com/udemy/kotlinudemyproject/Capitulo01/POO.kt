package br.com.udemy.kotlinudemyproject.Capitulo01

class Carro {

    var cor: String = "Preto"
    var ano: Int = 2019
    var modelo: String = "fox"
}

fun main() {
    val uno = Carro()
    uno.ano = 2018
    uno.modelo = "uno"


//    println(uno.ano)
//    println(uno.cor)
//    println(uno.modelo)
}