package br.com.udemy.kotlinudemyproject.Capitulo01

fun main() {

    var idade = 16

    if (idade < 18) {
        println("Não pode beber e nem entrar na festa")
    } else if (idade < 21) {
        println("Não pode entrar na festa")
    } else if (idade < 25) {
        println("pode só beber")
    } else {
        println("pode beber e entrar na festa")
    }


    var str: String = if (idade < 18) "menor de idade" else "maior de idade"

    println(str)

}