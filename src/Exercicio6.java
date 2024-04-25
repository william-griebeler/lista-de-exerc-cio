public class Exercicio6 {
    
    // Utilizando FOR,Elaborar um programa que apresente os valores de conversão de graus Celsius em graus Fahrenheit
    // de dez em dez graus, iniciando a contagem em dez graus Celsius e finalizando em cem graus Celsius.
    // O programa deve apresentar os valores das duas temperaturas.
    // Para converter grau Celsius para Fahrenheit,
    // basta multiplicar a temperatura em graus Celsius por 1,8 e somar 32.


    public static void main(String[] args) {
        // Loop for que itera de 10 até 100 graus Celsius
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            // Calcula o equivalente em Fahrenheit
            double fahrenheit = celsius * 1.8 + 32;

            // Imprime os valores
            System.out.println(celsius + " graus Celsius = " + fahrenheit + " graus Fahrenheit");
        }
    }
}

