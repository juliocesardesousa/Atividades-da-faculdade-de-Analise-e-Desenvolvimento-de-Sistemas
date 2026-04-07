//Exercício 06:Receba a idade de um nadador e classifique-o como: Infantil (5-10), Juvenil (11-17) ou Sênior (18+).

import java.util.Scanner;
public class Ex06{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        if (idade >= 5 && idade <= 10) {
            System.out.println("Classificação infantil");
        } 
        else if (idade >= 11 && idade <= 17) {
            System.out.println("Classificação juvenil");
        } 
        else if (idade >= 18) {
            System.out.println("Classificação sênior");
        } 
        else {
            System.out.println("Idade fora da faixa de classificação (muito jovem).");
        }
        
    }
}
