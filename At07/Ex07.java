// Ex07: Um engenheiro quer calcular a média de 5 peças por lote. O
// programa deve processar 5 peças (usando for) e, após o lote, perguntar
// se deseja processar um novo lote (usando do-while).
import java.util.Scanner;
public class Ex07{
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);

    String continuar = "";
    int media = 0;
    int somador = 0; 
    do{
        
        for(int i = 1; i <= 5; i++){
            System.out.printf("Digite o calor da peça %d \n", i);
            int peca = sc.nextInt();
            somador += peca;
            media = somador / i;
        }

        System.out.printf("A média dos valores é: %d \n", media);
        System.out.printf("Continuar ? S - sim, N - não \n");
        continuar = sc.next();

    }while(continuar.toLowerCase().equals("s"));
        
    }

}