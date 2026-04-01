//Exercício 08:Receba o ano de nascimento de uma pessoa e informe se ela nasceu no século XX, XXI ou outro)..

import java.util.Scanner;
public class Ex08{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Em que ano você nasceu?");
        int anoNascimento = scanner.nextInt();
        
        double seculo = anoNascimento / 1000;
        
        if (seculo <= 1 && seculo > 0)
        {
            System.out.println("Século XX");
        }
        else if (seculo <= 2 && seculo > 0)
        {
            System.out.println("Século XXI");
        }
        else    
            System.out.println("Nasceu antes do século XX e XXI");
    }
}