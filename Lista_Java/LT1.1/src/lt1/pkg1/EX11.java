/*
    Nome do programa: Ex11
    Objetivo: 11.Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência. C = 2 * π * r
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;


public class EX11 {
    public EX11(){
         
     }
    public static void main(String[] args){
        System.out.println("Digite o raio da circunferencia: ");
        Scanner sc = new Scanner(System.in);
        
        double raio = sc.nextFloat();
        double comprimento = 2 * 3.14 * raio;
        
        System.out.println("Comprimento da circunferencia: " + comprimento);
    }
}
