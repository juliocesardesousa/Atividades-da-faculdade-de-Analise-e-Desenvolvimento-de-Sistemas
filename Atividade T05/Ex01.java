// Exercício 01: Receba um número de 1 a 12 e exiba o mês correspondente usando switch.

import java.util.Scanner;

public class Ex01{
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o número que corresponde ao mês");
        int mes = scanner.nextInt();

        switch(mes)
        {
            case 1: System.out.println("Janeiro");
                    break;
            case 2: System.out.println("Fevereiro");
                    break;
            case 3: System.out.println("Março");
                    break; 
            case 4: System.out.println("Abril");
                    break;
            case 5: System.out.println("Maio");
                    break;
            case 6: System.out.println("Junho");
                    break;
            case 7: System.out.println("julho");
                    break;
            case 8: System.out.println("Agosto");
                    break;
            case 9: System.out.println("Setembro");
                    break;
            case 10: System.out.println("Outubro");
                    break;
            case 11: System.out.println("Novembro");
                    break;
            case 12: System.out.println("Dezembro");
                    break;
            default: System.out.println("Não existe mês que corresponde a esse número");

        }




    }

}
