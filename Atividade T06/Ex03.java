/*Exercício 03: Um laboratório de solos precisa ler diversas medições de
temperatura. O programa deve ler temperaturas até que o usuário
digite o valor sentinela 999. Ao final, exiba a média aritmética das
temperaturas válidas lidas. */

import java.util.Scanner;

public class Ex03 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        int i = 1;
        double somador = 0; // somador para armazenar as temperaturas somadas.
        double temperatura = 0;

        while(temperatura != 999) // quando colocar 999, o while para.
        {
            System.out.println("Digite o valor da temperatura");
            temperatura = scanner.nextDouble();
            
            if (temperatura != 999){
                somador += temperatura; // soma as temperaturas, somando sempre um valor novo no já existente.
                i++;
            }
        }
        double media = somador / i;
        System.out.println("A média de todas as temperaturas é de : " + media);
        
        scanner.close();
    }
}
