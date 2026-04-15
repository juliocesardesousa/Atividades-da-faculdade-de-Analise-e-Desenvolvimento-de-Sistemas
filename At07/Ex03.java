// Ex03:Leia um número inteiro N. Utilize laços for aninhados para
// imprimir um quadrado de asteriscos (*) de lado N.

import java.util.Scanner;

public class Ex03{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int num; 
    
    System.out.println("Digite um valor para o lado do Quadrado");
    num = sc.nextInt();

    for (int i = 0; i < num; i++){
         
        for (int j = 0; j < num; j++){
            
            System.out.print("* ");
         }
         System.out.println();
    }

 }
}