// Código original
// Sabendo que 100 quilowatts de energia custam um sétimo do
//salário mínimo, fazer um algoritmo que receba o valor do
//salário mínimo e a quantidade de quilowatts consumida
//por uma residência.
//
//Imprimir:
//- O valor em reais de cada quilowatt.
//- O valor em reais a ser pago.
//- O valor com desconto de 10%.
//
//prog lea21
//real sm, qtdade, preco, vp, vd;
//imprima "\nentre com o salário minimo : ";
//leia sm;
//imprima "\nentre com a quantidade em quilowatt: ";
//leia qtdade;
//# divide por 7 para achar o preço de 100 Kw e por 100 para achar de 1 Kw
//preco <- sm /700;
//vp <- preco * qtdade;
//vd <- vp * 0.9;
//imprima "\npreço do quilowatt: " preco, "\n valor a ser pago: ", vp,
//"\n valor com desconto: " vd;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o salário mínimo: ")
    val sm = readln().trim().toDouble()

    print("\nEntre com a quantidade em quilowatts: ")
    val qtdade = readln().trim().toDouble()

    val preco = sm / 700
    val vp = preco * qtdade
    val vd = vp * 0.9

    println("\nPreço do quilowatt: R$ $preco")
    println("Valor a ser pago: R$ $vp")
    println("Valor com desconto: R$ $vd")
}