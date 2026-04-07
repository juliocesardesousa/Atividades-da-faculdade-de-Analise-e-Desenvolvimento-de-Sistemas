//Exercício 08:Receba o ano de nascimento de uma pessoa e informe se ela nasceu no século XX, XXI ou outro)..

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Em que ano você nasceu?");
        int ano = scanner.nextInt();
        
        // Lógica baseada nos intervalos reais de anos
        if (ano >= 1901 && ano <= 2000) {
            System.out.println("Você nasceu no Século XX");
        } 
        else if (ano >= 2001 && ano <= 2100) {
            System.out.println("Você nasceu no Século XXI");
        } 
        else {
            System.out.println("Você nasceu em outro século (antes de 1901 ou depois de 2100)");
        }
        
        scanner.close();
    }
}
