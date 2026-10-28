// Código original
// Enunciado:
//Entrar com um ângulo em graus e imprimir: seno, co-seno,
//tangente, secante, co-secante e co-tangente deste ângulo.
//
//prog lea15
//real angulo. rang;
//imprima "\ndigite um angulo em graus: ";
//leia angulo;
//rang <- angulo*pi /180;
//imprima "\nseno: ", sen(rang);
//imprima " \nco-seno: ", cos(rang);
//imprima " \ntangente: ", tan(rang);
//imprima "\nco-secante: ",1/ sen(rang);
//imprima "\nsecante: ", 1/cos(rang);
//imprima " \ncotangente: ", 1/ tan(rang);
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.*

fun main() {
    print("\nDigite um ângulo em graus: ")
    val angulo = readln().trim().toDouble()

    val rang = angulo * PI / 180

    println("\nSeno: ${sin(rang)}")
    println("Cosseno: ${cos(rang)}")
    println("Tangente: ${tan(rang)}")
    println("Cossecante: ${1 / sin(rang)}")
    println("Secante: ${1 / cos(rang)}")
    println("Cotangente: ${1 / tan(rang)}")
}