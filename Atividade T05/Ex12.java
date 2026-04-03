// exercício 12: Receba três números inteiros quaisquer e exiba-os em ordem decrescente de valor.

import java.util.Scanner;

public class Ex12{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número");
        double a = scanner.nextDouble();
        
        System.out.println("Digite um segundo número");
        double b = scanner.nextDouble();
        
        System.out.println("Digite um terceiro número");
        double c = scanner.nextDouble();
        
        if(a > b && a > c && b > c)
            System.out.println(a + " " + b + " " + c);
        
        else if(a > b && a > c && b < c)
        {
            System.out.println(a + " " + c + " " + b);
        }   
        
        else if(b > a && b > c && a > c)
        {
            System.out.println(b + " " + a + " " + c);
        }   
        
        else if(b > a && b > c && a < c)
        {
            System.out.println(b + " " + c + " " + a);
        }
        
        else if(c > a && c > b && a > b)
         {
            System.out.println(b + " " + a + " " + c);
         }   
        
        else if(c > a && c > b && a < b)
        {
            System.out.println(c + " " + b + " " + a);
        }
    }
}