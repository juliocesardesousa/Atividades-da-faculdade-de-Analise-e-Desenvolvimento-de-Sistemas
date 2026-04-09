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
    int i = 2;
    int somaDivisor = 0;

    while (i < num)
    {
        if (num % i == 0)
        {
            somaDivisor++; 
        } 
        i++;
    }

    if (somaDivisor == 0 && num > 1){
        System.out.println("É primo");
    } 
    else
        System.out.println("Não é primo");
 }
}
