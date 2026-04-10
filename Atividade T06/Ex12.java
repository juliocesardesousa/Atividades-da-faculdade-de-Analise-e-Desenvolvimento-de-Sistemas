/*Exercício 12: Calcular o valor por aproximação de π pela Série de
Gregory-Leibniz:

π = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 ...)

• Peça ao usuário o número de termos de precisão (1, 2, 3, 4 ... ) e utilize
o while para calcular o valor aproximado de π. Na tela, compare o
resultado encontrado com o valor dado por Math.PI do Java. Rode o
programa várias vezes, incrementando manualmente o número de
termos de precisão digitado (1, 2, 3, 4 ...).*/
import java.util.Scanner;

public class Ex11{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);

    System.out.println("Digite um número inteiro");
    int numeroTermos = sc.nextInt(); // Adicionado ()
    double piAproximado = 0;
    double denominador = 1.0;
    double sinal = 1.0;
    int i = 0;

    while (i < numeroTermos) {
        piAproximado += sinal * (1.0 / denominador);
        denominador += 2;
        sinal *= -1; // Inverte o sinal para o próximo termo (1, -1, 1, -1...)
        i++;
    }

    double resultadoFinal = 4 * piAproximado;
    System.out.println("Pi calculado: " + resultadoFinal);
    System.out.println("Pi do Java: " + Math.PI);

    }
}
