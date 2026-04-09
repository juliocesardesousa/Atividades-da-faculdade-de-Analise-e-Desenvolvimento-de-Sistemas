/*Exercício 07: A Sequência de Fibonacci inicia com 0 e 1, e cada termo
subsequente é a soma dos dois anteriores:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...

• Peça ao usuário um número n e imprima os primeiros n termos da
sequência usando um laço while. */

import java.util.Scanner;   

public class Ex07{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um valor para a sequencia de fibonacci");
        int num = scanner.nextInt();

        int i = 0;
        int a = 0; // primeiro termo
        int b = 1; // segundo termo

        while (i < num) {
            System.out.print(a + " "); // imprime o termo atual

            int proximo = a + b; // calcula próximo termo
            a = b;               // atualiza valores, utilizei mesmo conceito no Ex02
            b = proximo;

            i++;
        }
        
        scanner.close();
        
        
        
    }
}