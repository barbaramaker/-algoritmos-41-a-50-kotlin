// Código original
// Enunciado:
//Entrar com quatro números e imprimir a média ponderada,
//sabendo-se que os pesos são respectivamente: 1, 2, 3 e 4.
//
//prog lea14
//real a, b, c,d, mp;
//imprima "\nentre com 1 numero: ";
//leia a;
//imprima "\nentre com 2 numero: ";
//leia b;
//imprima "\nentre com 3 numero: ";
//leia c;
//imprima "\nentre com 4 numero: ";
//leia d;
//mp <- (a*1 + b*2 + c*3 + d*4)/10;
//imprima " \nmedia ponderada: ", mp;
//imprima " \n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o 1º número: ")
    val a = readln().trim().toDouble()

    print("\nEntre com o 2º número: ")
    val b = readln().trim().toDouble()

    print("\nEntre com o 3º número: ")
    val c = readln().trim().toDouble()

    print("\nEntre com o 4º número: ")
    val d = readln().trim().toDouble()

    val mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10

    println("\nMédia ponderada: $mp")
}