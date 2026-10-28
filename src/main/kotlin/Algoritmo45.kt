// Código inicial
// Enunciado:
//Entrar com um número e imprimir a seguinte saída:
//numero:
//quadrado:
//raiz quadrada:
//
//prog lea18
//real num, quad, raizquad;
//imprima "\ndigite numero: ";
//leia num;
//quad <-num ** 2;
//raizquad <- raiz(num);
//imprima "\nnumero: ", num;
//imprima "\nquadrado: ", quad;
//imprima "\nraiz quadrada: ", raizquad;
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\nDigite um número: ")
    val num = readln().trim().toDouble()

    val quad = num.pow(2)
    val raizquad = sqrt(num)

    println("\nNúmero: $num")
    println("Quadrado: $quad")
    println("Raiz quadrada: $raizquad")
}