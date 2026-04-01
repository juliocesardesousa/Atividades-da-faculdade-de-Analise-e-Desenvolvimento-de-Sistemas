/*Exercício 09:Implemente um sistema de menu onde o usuário escolhe converter o valor digitado de graus Celsius para Fahrenheit ou
o valor digitado de graus Fahrenheit para Celsius, apresentando o valor digitado e
o valor calculado acompanhados de suas respectivasunidades (°C ou °F).
*/

import java.util.Scanner;
public class Ex09{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite o valor");
        double temperatura = scanner.nextDouble();
        
        System.out.println("Escolha como converter o valor digitado de Celsius para Fahrenheit (a) ou Fahrenheit para Celsius (b)");
        String converter = scanner.next();
        
        switch (converter)
        {
            case "a": double fahrenheit = (temperatura * 9/5) + 32;
                          System.out.println("Valor inicial: " + temperatura + " valor transformado em Fahrenheit " + fahrenheit);
                          break;
                          
            case "b": double celsius = (temperatura - 32) * 5/9;
                          System.out.println("Valor inicial: " + temperatura + " valor transformado em Celsius " + celsius);
                          break;
            
            default: System.out.println("Digite a letra correta");
        }
    }
}