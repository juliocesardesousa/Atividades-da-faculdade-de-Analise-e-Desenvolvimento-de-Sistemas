//Exercício 07:Receba o peso e a altura, calcule o IMC e exiba a classificação completa da OMS (6 categorias).

import java.util.Scanner;
public class Ex07{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Qual o seu peso? ");
        double peso = scanner.nextDouble();
        
        System.out.println("Qual a sua altura? ");
        double altura = scanner.nextDouble();
        
        double imc = peso / Math.pow(altura,2);
        
        if(imc <= 18.5)
        {
            System.out.println("Magreza");
        }
        else if (imc <= 24.9)
        {
            System.out.println("Normal");
        }
        else if (imc <= 29.9)
        {
            System.out.println("Sobrepeso");
        }
        else if (imc <= 34.9)
        {
            System.out.println("Obesidade grau I");
        }
        else if (imc <= 39.9)
        {
            System.out.println("Obesidade grau II");
        }
        else 
            System.out.println("Obesidade grau III");
    }
}