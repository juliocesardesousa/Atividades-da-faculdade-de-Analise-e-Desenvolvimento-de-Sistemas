
import java.util.Scanner;   

public class Ex01{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro");
        int num = scanner.nextInt();
        int i = 1;
        
        while (i <= 10)
        {
            if (num * i % 3 == 0)
            {
                System.out.println(num + " X " + i + " = " +  (num * i));
            }
            i++; // contador 
        }
        scanner.close();
        
        
        
    }
}
