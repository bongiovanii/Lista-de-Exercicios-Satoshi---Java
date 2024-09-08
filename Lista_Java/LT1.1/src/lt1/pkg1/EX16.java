/*
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Objetivo: 16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Data: 15/08/2024
*/
import java.util.Scanner;
public class EX16 {
    public static void main(String[] args){
        //receber: a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
        System.out.println("Digite a quantidade de horas trabalhadas (no mes)");
        Scanner sc = new Scanner(System.in);
        int horas_trab = sc.nextInt();
        
        System.out.println("Digite o valor por hora trabalhada em reais");
        int valor_hora = sc.nextInt();
    
        System.out.println("Digite o percentual de desconto em reais");
        int desc =  sc.nextInt();
        
        System.out.println("Digite o numero de descendentes");
        int descendentes =  sc.nextInt();
        descendentes = descendentes * 100;
        int sal_bruto = horas_trab * valor_hora;
        int sal_liq = (sal_bruto - desc) + descendentes;
        
        System.out.println("Salario a receber: R$" + sal_liq);
    }
}
