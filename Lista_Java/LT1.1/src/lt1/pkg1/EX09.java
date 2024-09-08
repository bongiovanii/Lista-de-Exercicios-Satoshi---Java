/*
    Nome do programa: Ex09
    Objetivo: 9.Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;

public class EX09 {
    public EX09(){
        
    }
    public static void main(String[]args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Digite o primeiro numero inteiro");
        int num1 = sc.nextInt();
        int som1 = num1 * num1;
        
        System.out.println("Digite o segundo numero inteiro");
        int num2 =  sc.nextInt();
        int som2 =  num2 *num2;
                
        int soma =  som1 + som2;
        
        System.out.println("Soma dos quadrados = " + soma);
    }
    
}
