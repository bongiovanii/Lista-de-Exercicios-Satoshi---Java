/*
    Nome do programa: Ex08
    Objetivo: 8.Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;

public class EX08 {
    public EX08(){
        
    }
    public static void main(String[] args){
        System.out.println("Insira o valor a ser depositado: R$");
        Scanner sc = new Scanner(System.in);
        
        double poupa = sc.nextInt();
        double calc = (poupa / 100) * 1.3;
        
        double rendeu = poupa + calc;
        System.out.println("Rendimento apos um mes: R$" + rendeu);
        
        
    }
}
