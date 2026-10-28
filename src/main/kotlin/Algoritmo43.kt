// Código original
// Enunciado:
//Entrar com um número e imprimir o logaritmo desse número na base 10.
//
//prog lea16
//real num, logaritmo;
//imprima "\nentre com o logaritmando: ";
//leia num;
//logaritmo<- log(num) / log(10);
//imprima "\nlogaritmo: ", logaritmo;
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.ln

fun main() {
    print("\nEntre com o logaritmando: ")
    val num = readln().trim().toDouble()

    val logaritmo = ln(num) / ln(10.0)
    println("\nLogaritmo: $logaritmo")

}