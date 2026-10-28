// Código original
// Enunciado:
//Fazer um algoritmo que possa entrar com o saldo de uma aplicação
//e imprima o novo saldo, considerando o reajuste de 1%.
//
//prog lea19
//real saldo, nsaldo;
//imprima "\ndigite saldo: ";
//leia saldo;
//nsaldo <-saldo * 1.01;
//imprima "\nnovo saldo: 11 ,nsaldo;
//imprima " \n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nDigite o saldo: ")
    val saldo = readln().trim().toDouble()

    val nsaldo = saldo * 1.01

    println("\nNovo saldo: $nsaldo")
}