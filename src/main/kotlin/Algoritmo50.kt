// Código original
// Enunciado:
//Entrar com a base e a altura de um retângulo e imprimir:
//perimetro:
//area:
//diagonal:

// prog lea23
//real perimetro, area, diagonal, base, altura;
//imprima "\ndigite base: ";
//leia base;
//imprima "\ndigite al tura: ";
//leia altura;
//perimetro <- 2*(base +altura);
//area <-base * altura;
//diagonal <- raiz(base**2 + altura**2);
//imprima "\nperimetro = " ,perimetro;
//imprima "\narea = ", area ;
//imprima "\ndiagonal = ", diagonal ;
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("\nDigite a base: ")
    val base = readln().trim().toDouble()

    print("\nDigite a altura: ")
    val altura = readln().trim().toDouble()

    val perimetro = 2 * (base + altura)
    val area = base * altura
    val diagonal = sqrt(base.pow(2) + altura.pow(2))

    println("\nPerímetro = $perimetro")
    println("Área = $area")
    println("Diagonal = $diagonal")
}