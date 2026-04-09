/*Exercício 04: Crie um programa que receba um número inteiro positivo e
realize uma contagem regressiva até zero. A cada iteração, o programa
deve exibir a mensagem: */
import java.util.Scanner;

public class Ex04 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um valor inteiro positivo");
        int num = scanner.nextInt();
        int i = 0;
        int subtrator = num;
        while(i <= num)
        {
            System.out.println("Sistema operando. T-menos "+ subtrator + " segundos");
            subtrator--; 
            i++;
        }

        scanner.close();
    }    
}
