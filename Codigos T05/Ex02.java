// Exercício 02: Receba um número e informe se ele é "Positivo", "Negativo" ou "Zero" usando if-else if-else.
import java.util.Scanner;

public class Ex02 {
     public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número");
        double numero = scanner.nextDouble();

        if(numero > 0)
        {
            System.out.println("Numero positivo");
        }
        else if (numero < 0)
        {
            System.out.println("Numero negativo");
        }
        else
            System.out.println("Numero nulo");
    }
}
