/*Exercício 10: Uma escavadeira custa R$ 500.000,00. A cada ano de uso,
seu valor de mercado cai 12% em relação ao ano anterior. Além disso, a
manutenção anual custa R$ 15.000,00 no primeiro ano e aumenta
R$ 5.000,00 a cada ano subsequente. Calcule em quantos anos o custo
acumulado de manutenção ultrapassará o valor de mercado da
máquina. */
public class Ex10{
    public static void main (String [] args){
        
        double maquina = 500000.00;
        double manutencao = 15000.00;
        int ano = 0; 
        double manutencaoAcumulada = 0;

        while (manutencaoAcumulada <= maquina)
        {
            ano++;
            manutencaoAcumulada += manutencao;
            maquina *= 0.88 ;
            manutencao += 5000.00;
        }
        System.out.println("Vai levar " + ano + " anos para que o custo acumulado de manutenção ultrapasse o valor de mercado da máquina ");
    }
}