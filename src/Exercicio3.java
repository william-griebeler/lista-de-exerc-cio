public class Exercicio3 {
    

    //Utilizando FOR, construir um programa
    // que apresente todos os valores numéricos divisíveis por 4 e menores que 200.Sugestão:
    // a variável que controla o contador do laço deve ser iniciada com valor 1.

    public static void main(String[] args) {
       
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i); 
            }
        }
    }
}

