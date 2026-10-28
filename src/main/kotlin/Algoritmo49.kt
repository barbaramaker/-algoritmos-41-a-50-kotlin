// Código original
// Enunciado:
//Entrar com um nome e imprimir:
//todo nome:
//primeiro caractere:
//ultimo caractere:
//do primeiro ate o terceiro:
//quarto caractere:
//todos menos o primeiro:
//os dois ultimos:

// prog lea22
//string nome;
//int n;
//imprima "\nentre com nome: ";
//leia nome;
//imprima "\ntodo nome: " , nome;
//imprima "\nprimeiro caractere: ", strprim(nome);
//imprima "\nultimo caractere: ", strult(nome);
//imprima "\nprimeiro ao terceiro caractere: ", strnprim(nome,3);
//imprima "\nquarto caractere: ", strelem(nome,3);
//imprima "\ntodos menos o primeiro: ", strresto (nome);
//n <-strtam(nome) -2;
//imprima "\nos dois ultimes: " , strnresto(nome,n);
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com um nome: ")
    val nome = readln()

    if (nome.length >= 4) {
        println("\nTodo nome: $nome")
        println("Primeiro caractere: ${nome.first()}")
        println("Último caractere: ${nome.last()}")
        println("Primeiro ao terceiro caractere: ${nome.take(3)}")
        println("Quarto caractere: ${nome[3]}")
        println("Todos menos o primeiro: ${nome.drop(1)}")
        println("Os dois últimos: ${nome.takeLast(2)}")
    } else {
        println("\nDigite um nome com pelo menos 4 caracteres.")
    }
}