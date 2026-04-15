// Ex02: Leia as duas notas de um aluno. Utilize o do-while para
// garantir que cada nota esteja entre 0 e 10. Após validar as duas
// entradas, use um for (de 1 a 5) apenas para simular em tela uma barra
// de progresso "Processando...“. Após isso, calcule e apresente a média
// aritmética entre as notas digitadas.
import java.util.Scanner;

public class Ex02{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    double nota1;
    double nota2;
    double media;
    
    do{
        System.out.println("Digite o valor entre 0 a 10 da primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite o valor entre 0 a 10 da segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

    }while(!(nota1 <= 10) || !(nota2 <= 10)); //comparo negando se o valor 1 ou 2 é menor, se for menor que 10 ele para, se não, ele entra no laço de novo
    
    for (int i = 0; i <= 5; i++){
        
            System.out.println("Processando... " + i + "s");
            
            if (i == 5){
                System.out.println("a média é: " + media);
           } 
        }


    }

}