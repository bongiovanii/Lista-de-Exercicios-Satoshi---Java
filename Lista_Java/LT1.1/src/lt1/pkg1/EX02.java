/*
    Nome do programa: Ex02
    Objetivo: 2.Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
    Nome do Programador: Gustavo Bongiovani
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;


public class EX02 {
    public EX02(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario bruto do funcionario:");
        
        float sal_bruto = sc.nextFloat();
        float reajuste = (sal_bruto / 100) * 15;
        float sal_liquido = reajuste + sal_bruto;
        
        System.out.println("Salario com reajuste: R$" + sal_liquido);
    }
}
