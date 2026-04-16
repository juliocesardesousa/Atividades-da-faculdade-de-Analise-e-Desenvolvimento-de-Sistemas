// Ex10: Em uma placa metálica de 5 x 5 metros, o estresse em cada
// ponto (x, y) é dado por S = (x² + y²)
// Gere uma tabela de estresse para pontos inteiros de 1 a 5.

import java.util.Scanner;

public class Ex10{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print((Math.pow(i, 2) + Math.pow(j, 2)));
            }
            System.out.println();
        }

    }
}