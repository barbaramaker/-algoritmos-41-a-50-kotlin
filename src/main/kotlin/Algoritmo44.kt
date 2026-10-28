// Código original
// Enunciado:
//Entrar com o número e a base em que se deseja calcular
//o logaritmo desse número e imprimi-lo.
//
//prog lea17
//real num, base, logaritmo;
//imprima "\nentre com o logaritmando: ";
//leia num;
//imprima "\nentre com a base: ";
//leia base;
//logaritmo <- log(num) / log(base);
//imprima "\no logaritmo deb", num, "bna baseb",base, "be:b", logaritmo;
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.ln

fun main() {
    print("\nEntre com o logaritmando: ")
    val num = readln().trim().toDouble()

    print("\nEntre com a base: ")
    val base = readln().trim().toDouble()

    val logaritmo = ln(num) / ln(base)

    println("\nO logaritmo de $num na base $base é: $logaritmo")
}