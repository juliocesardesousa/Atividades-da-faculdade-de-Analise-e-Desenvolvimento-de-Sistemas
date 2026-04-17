// Ex11: O usuário tem 3 tentativas para acertar uma senha. Use um
// for para controlar as 3 tentativas. Dentro do for, use um do-while para
// garantir que a senha digitada tenha exatamente 4 dígitos (validação).

import java.util.Scanner;

public class Ex11{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int senha = 2026;
        int senhaUser = 0;

        for(int i = 1; i <= 3; i++){
            do{
                
                System.out.println("Digite a senha com 4 dígitos ");
                senhaUser = sc.nextInt();
                    
            }while(senhaUser <= 999 || senhaUser > 9999);
            
            if (senhaUser == senha ){
                System.out.println("Acesso permitido!!!");
                break;
            }
            System.out.printf("Tentativa %d de 3 \n", i);
        }
        

    }
}