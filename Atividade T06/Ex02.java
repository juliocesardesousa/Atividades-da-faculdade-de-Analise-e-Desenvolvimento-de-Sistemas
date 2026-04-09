import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();
        
        // Garantir que 'a' seja o menor sempre
        if (a > b) {
            int temp = a; //armazeno o valor de A, para trocar o "lugar" de A com B
            a = b;
            b = temp;
        }

        int atual = a ; // começa do próximo número

        while (atual <= b) {
            System.out.println(atual);
            atual++;
            
        }
        
        scanner.close();
    }
}
