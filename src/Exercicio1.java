
public class Exercicio1{
  
public static void main(String[] args) throws Exception {
    
    // Utilizando FOR, construir um programa que apresente a soma dos cem primeiros números naturais
    // (1 + 2 + 3 +...+ 98 + 99 + 100).

    int soma = 0;
    
    for (int i = 1; i <= 100; i++) {
        soma += i; 
    }
    
    System.out.println("A soma dos cem primeiros números naturais é: " + soma);
}

}