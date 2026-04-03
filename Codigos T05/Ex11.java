/*Receba um valor em dinheiro e informe a menor
quantidade de notas ($100, $50, $20, $10, $5, $2) ou moeda ($1)
necessárias para compô-lo (ignore a existência de centavos). */

import java.util.Scanner;

public class Ex11 {

    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("valor");
        int valor = scanner.nextInt();

        int divisao;
        if (valor / 100 > 0 && valor % 100 == 0)
        {
            divisao = valor / 100;
            System.out.println(divisao + " é o número de cédulas de R$ 100 ");
        }
        else if (valor / 50 > 0 && valor % 50 == 0)
        {
            divisao = valor / 50;
            System.out.println(divisao + " é o número de cédulas de R$ 50 ");
        }
        else if (valor / 20 > 0 && valor % 20 == 0)
        {
            divisao = valor / 20;
            System.out.println(divisao + " é o número de cédulas de R$ 20 ");
        }
        else if (valor / 10 > 0 && valor % 10 == 0)
        {
            divisao = valor / 10;
            System.out.println(divisao + " é o número de cédulas de R$ 10 ");
        }
        else if (valor / 5 > 0 && valor % 5 == 0)
        {
            divisao = valor / 5;
            System.out.println(divisao + " é o número de cédulas de R$ 5 ");
        }
        else if (valor / 2 > 0 && valor % 2 == 0)
        {
            divisao = valor / 2;
            System.out.println(divisao + " é o número de cédulas de R$ 2 ");
        }
        else 
            divisao = valor / 1;
            System.out.println(divisao + " é o número de moedas de R$ 1 ");

    }
}