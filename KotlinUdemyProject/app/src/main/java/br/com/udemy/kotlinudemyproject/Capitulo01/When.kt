package br.com.udemy.kotlinudemyproject.Capitulo01

fun main() {
    var opcao: Int = 1

    when(opcao){
        1 -> println("conta corrente")
        2 -> println("cartao de credito")
        3 -> println("Banking Web")

        else -> {
            println("Nenhuma opção selecionada")
            println("Fale com um dos nossos atendentes")
        }
    }

    var opcaoselecionada = when(opcao) {
        1 -> ("conta corrente")
        2 -> ("cartao de credito")
        3 -> ("Banking Web")

        else -> {
            println("Nenhuma opção selecionada")
            println("Fale com um dos nossos atendentes")
            "NENHUMA OPÇÃO SELECIONADA"
        }
    }

    println("Opção Selecionada $opcao - $opcaoselecionada")
}