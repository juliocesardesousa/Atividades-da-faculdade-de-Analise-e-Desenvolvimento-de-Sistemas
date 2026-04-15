// Ex06: Simule um cronômetro de um processo industrial que conta
// minutos e segundos. Use um for para os minutos (0 a 2) e um for
// aninhado para os segundos (0 a 59).

public class Ex06{
    public static void main (String [] args){

        for (int i = 0; i < 2; i++){
            for (int j = 0; j <= 59; j++){
                System.out.printf("%d minutos %d segundos \n", i , j);
            }
        }
    }

}