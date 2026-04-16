// Ex09: Cálculo de Potência: Leia uma base A e um expoente B
// (inteiro positivo). Calcule A elevado a b utilizando o laço for (sem usar Math.pow).
import java.util.Scanner;

public class Ex09{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digit valor da base: ");
        int base = sc.nextInt();

        System.out.print("Digite valor expoente: ");
        int expoente = sc.nextInt();
        
        int multiplicacao = 1;
        
        for(int i = 1; i <= expoente; i++){
            multiplicacao = multiplicacao * base;
        }
        System.out.print(multiplicacao);

    }
}