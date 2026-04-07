//Exercício 03: Receba uma letra e informe se é uma Vogal ou Consoante (Dica: use switch com múltiplos cases).

import java.util.Scanner;
public class Ex03{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite uma letra");
        String letra = scanner.next();
        
        switch(letra){
            case "a": //sem break (lógica)
            case "e":
            case "i":
            case "o":
            case "u": System.out.println(letra + " é uma vogal");
                    break;
            
            default: System.out.println(letra + " é uma consoante");
        }
    }
}
