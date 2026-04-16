// Ex08: Leia um número N e imprima um triângulo onde cada linha
// i e N contenha os números de 1 até i).

import java.util.Scanner;

public class Ex08{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf("%d" , j);
            }
            System.out.println();
        }

    }
}