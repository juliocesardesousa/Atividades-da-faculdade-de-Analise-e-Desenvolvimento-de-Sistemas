/*Exercício 10:Leia as coordenadas (x, y) de um ponto e informe em qual
quadrante (I, II, III ou IV) ele se encontra (ou se está sobre o eixo x ou
sobre o eixo y).
*/

import java.util.Scanner;
public class Ex10{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um valor para o eixo X");
        int eixoX = scanner.nextInt();
        
        System.out.println("Digite um valor para o eixo Y");
        int eixoY = scanner.nextInt();
        
        if(eixoX > 0 && eixoY > 0)
        {
            System.out.println("Primeiro quadrante");
        }
        else if (eixoX < 0 && eixoY > 0)
        {
            System.out.println("Segundo quadrante");
        }
        else if (eixoX < 0 && eixoY < 0 )
        {
            System.out.println("Terceiro quadrante");
        }
        else 
            System.out.println("Quarto quadrante");
    }
}