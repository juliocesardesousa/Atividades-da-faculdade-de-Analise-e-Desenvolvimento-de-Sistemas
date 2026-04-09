/*Exercício 06: Em uma frente de pavimentação, deseja-se saber a altura
média de 10 blocos de concreto. O programa deve ler as 10 alturas,
uma de cada vez, e, ao final, mostrar a média das alturas e a maior e a
menor altura digitada. */
import java.util.Scanner;   

public class Ex06{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        int i = 0;
        double somador = 0;
        double tijolo = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        while(i < 10)
        {
            i++;
            System.out.println("Qual a altura do tijolo " + i);
            tijolo = scanner.nextDouble();
            
            somador += tijolo;

            if (tijolo < menor){
                menor = tijolo;
            } 
            else if (tijolo > menor){
                maior = tijolo;
            }
        }
        System.out.println("A media das alturas é de: " + (somador / 10));
        System.out.println("Maior tijolo " + maior);
        System.out.println("Menor tijolo " + menor);
        
        scanner.close();
        
        
        
    }
}