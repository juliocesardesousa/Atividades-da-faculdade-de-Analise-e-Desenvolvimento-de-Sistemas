//Exercício 05:Crie uma calculadora de operações básicas (+, -, *, /) que recebe dois números e o símbolo da operação e entrega o resultado correspondente.

import java.util.Scanner;
public class Ex05{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número");
        double numUm = scanner.nextDouble();
        
        System.out.println("Digite o segundo número");
        double numDois = scanner.nextDouble();
        
        System.out.println("Ecolha um operador matemático, (+ ; - ; * ; /)");
        String operador = scanner.next();
        
        if (operador.equals("+"))
        {
            double resultado = numUm + numDois;
            System.out.println("Você escolheu soma, a soma de " + numUm + " + " + numDois + " = " + resultado);
        }
        else if (operador.equals("-"))
        {
            double resultado = numUm - numDois;
            System.out.println("Você escolheu subtração, a diferença de " + numUm + " - " + numDois + " = " + resultado);
        }
        else if (operador.equals("*"))
        {
            double resultado = numUm * numDois;
            System.out.println("Você escolheu multiplicação, o produto de " + numUm + " * " + numDois + " = " + resultado);
        }
        else if (operador.equals("/"))
        {
            double resultado = numUm / numDois;
            System.out.println("Você escolheu divisão, a divisão de " + numUm + " / " + numDois + " = " + resultado);
        } 
        else 
            System.out.println("Digite um operador valido");
    }
}