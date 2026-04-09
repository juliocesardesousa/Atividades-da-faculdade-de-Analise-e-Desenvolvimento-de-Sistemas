/*Exercício 09: Sem usar Math.log(), crie um programa que receba uma
base b e um número n. Utilize um laço while para descobrir quantas
vezes n pode ser dividido por b até chegar a um valor menor ou igual
a 1 (simulando a ideia de logaritmo na base b). */

import java.util.Scanner;

public class Ex09{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int log = 0;
        int base;
        int num;
        int i = 0;

        System.out.println("Digite o valor do número");
        num = scanner.nextInt();

        System.out.println("Digite o valor da base");
        base = scanner.nextInt();
        
        while (num > 1) 
        {
            num = num / base; // O número é atualizado pela divisão
            i++;              // Contador de quantas divisões foram feitas
        }
        System.out.println("O log do número é : " + base + " elevado a " + i );

    }


}