//Exercício 04:Receba o preço de um produto e exiba "Barato" (até 50), "Médio" (até 100) ou "Caro" (acima de 100).

import java.util.Scanner;
public class Ex04{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Qual o calor do produto ?");
        double preco = scanner.nextInt();
        
        if (preco <= 50)
        {
            System.out.println("Barato");
        }
        else if (preco <= 100)
        {
            System.out.println("Médio");
        }
        else
            System.out.println("Caro");
    }
}