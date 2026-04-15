// Ex04: Utilizando o laço for, some todos os números pares entre
// 1 e um número inteiro digitado pelo usuário, por exemplo, 100. Ao
// final, pergunte ao usuário se ele deseja repetir o cálculo para outro
// intervalo de 1 a N, usando do-while.

import java.util.Scanner;

public class Ex04{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
         
            String continuar; // variavel fora, uso para o while, o que nasce dentro das {} morre dentro delas  

        do{

            System.out.println("Digite número inteiro para somar os pares entre ele: ");
            int num = sc.nextInt();
            int somador = 0;

            for (int i = 2; i <= num; i += 2 ){
                somador += i; //consigo usar por que está fora da chave do for 
            }
            System.out.printf("A soma dos números pares é : %d\n", somador);

            System.out.printf("Quer continuar? S - sim, N - não \n");
            continuar = sc.next();


        }while(continuar.toUpperCase().equals("S"));    // consigo usar pq está fora do DO- While
 }
}