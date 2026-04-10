/*Exercício 08: Gerar uma tabela comparativa de graus Kelvin para Celsius.
O usuário informa o valor inicial (em °K), o valor final e o passo
(incremento). O programa deve exibir a tabela formatada enquanto o
valor atual não ultrapassar o limite final. */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial (Kelvin): ");
        double kelvin = scanner.nextDouble();

        System.out.println("Digite o valor final (Kelvin): ");
        double valorFinal = scanner.nextDouble();

        System.out.println("Digite o passo (incremento): ");
        double passo = scanner.nextDouble();

        System.out.println("\n--- TABELA DE CONVERSÃO ---");
        System.out.println("Kelvin \t | \t Celsius");
        System.out.println("---------------------------");

        // Enquanto o valor atual não ultrapassar o limite final
        while (kelvin <= valorFinal) {
            double celsius = kelvin - 273.15;
            
            // Exibe os valores formatados (\t é um TAB para alinhar)
            System.out.println(kelvin + "°K \t | \t " + celsius + "°C");
            
            // Incrementa o valor atual com o passo informado
            kelvin += passo;
        }

        scanner.close();
    }
}
