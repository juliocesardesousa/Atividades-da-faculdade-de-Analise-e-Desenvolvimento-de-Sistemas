import java.util.Scanner;

public class Ex11 {

    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("valor");
        int valor = scanner.nextInt();

        int divisao;
        if (valor / 100 > 0 && valor % 100 == 0)
        {
            divisao = valor / 100;
            System.out.println(divisao + " é número de cédulas de R$ 100 ");
        }
        else if (valor / 50 > 0 && valor % 50 == 0)
        {
            divisao = valor / 50;
            System.out.println(divisao + " é número de cédulas de R$ 50 ");
        }


    }
}