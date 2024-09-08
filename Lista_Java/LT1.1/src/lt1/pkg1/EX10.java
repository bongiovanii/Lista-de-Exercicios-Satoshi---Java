/*
    Nome do programa: Ex10
    Objetivo: 10.Receba 2 números reais. Calcule e mostre a diferença desses valores.
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;
public class EX10 {
    public EX10(){
    
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero real");
        double num1 = sc.nextDouble();
        
        System.out.println("Digite um outro numero real");
        double num2 = sc.nextDouble();
        
        double dif = num1 - num2;
        
        System.out.println("A diferenca dos numeros digitados: " + dif);
    }
}
