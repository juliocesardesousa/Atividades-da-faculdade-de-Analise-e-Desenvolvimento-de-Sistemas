/*Exercício 11: Leia um número inteiro positivo e determine se ele é um
número primo. O laço while deve testar os divisores possíveis e
interromper a execução assim que encontrar um divisor ou atingir a raiz
quadrada do número (otimização). */
import java.util.Scanner;

public class Ex11{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Digite um número inteiro");
    int num = sc.nextInt();
    int i = 1;

    while (i < num)
    {
        if (num % i == 0)
        {
            System.out.println("É primo");
            i = num; 
        } 
        i++;
    }
 }
}