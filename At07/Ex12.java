// Ex12: Leia um número inteiro. Enquanto o número for maior
// que 1 (use do-while), encontre seu menor divisor primo usando um for
// e divida-o sucessivamente.

import java.util.Scanner;

public class Ex12{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int divisao = 0;
        do{
            System.out.println("Digite um número inteiro");
            num = sc.nextInt();

            for(int i = 2; i <= num; i++){
                if (num % i == 0) { 
                    System.out.printf("Divisor de %d encontrado é: %d \n", num, i);
                    num = num / i; 
                }
                
            }


        }while(num != 1);
        

    }
}