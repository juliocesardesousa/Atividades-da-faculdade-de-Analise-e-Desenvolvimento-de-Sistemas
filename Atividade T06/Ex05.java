/*Exercício 05: Escreva um programa que simule a validação de uma senha
numérica (ex.: 2026). O programa deve permitir até 3 tentativas. Se o
usuário acertar, exiba:

"Acesso Permitido!"

• Se esgotar as tentativas, exiba:

"Terminal Bloqueado!" */

import java.util.Scanner;

public class Ex05 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int senha = 2026;
        int senhaUser = 0;
        int i = 0;

        while(i < 3 && senhaUser != senha)
        {
            
            System.out.println("Coloque a senha: ");
            senhaUser = scanner.nextInt();
            i++;

            if(senha == senhaUser){
                System.out.println("Acesso permitido!");
            }
            else 
                System.out.println("Tentativa " + i + " de 3");


        }
        if (senha != senhaUser)
            System.out.println("Terminal bloqueado");

        scanner.close();
    }    
}
