// Ex05: Leia 10 números do usuário e informe quantos deles estão
// no intervalo [10, 20] e quantos estão fora.

import java.util.Scanner;

public class Ex05{
    public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int contadorDentro = 0;
    int contadorFora = 0;
    double num = 0;

    for(int i = 1; i <= 10; i++){
        
        System.out.printf("Digite o valor  numero %d: \n ", i);
        num = sc.nextDouble(); 
    
        if(num >= 10 && num <= 20){
            contadorDentro++;
            System.out.printf("Valor %.2f está entre 10 a 20 \n", num);
        }else if (num < 10 || num > 20){
            contadorFora++;
            System.out.printf("Valor %.2f está fora de 10 a 20 \n", num);
        }
    } System.out.printf("Existe %d valores dentro e %d valores fora" , contadorDentro, contadorFora);

 }
}
