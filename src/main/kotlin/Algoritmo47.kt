// Código original
// Enunciado:
//Entrar com um número no formato CDU e imprimir invertido: UDC.
//Exemplo: 123, sairá 321.
//O número deverá ser armazenado em outra variável antes de ser impresso.
//
//prog lea20
//int num, c, d, u, num1;
//imprima "\nentre com um nümero de 3 digitos: ";
//leia num;
//c <- num div 100;
//d <- num % 100 div 10;
//u <- num % 10;
//numl <- u*100 + d*10 + c;
//imprima "\nnúmero: ", num;
//imprima "\ninvertido: ", num1;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com um número de 3 dígitos: ")
    val num = readln().trim().toInt()

    val c = num / 100
    val d = (num % 100) / 10
    val u = num % 10

    val num1 = u * 100 + d * 10 + c

    println("\nNúmero: $num")
    println("Invertido: $num1")
}