/*
    Nome do programa: Ex04
    Objetivo: 4.Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
    Nome do Programador: Gustavo Bongiovani
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;
public class EX04 {
    public EX04(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a temperatura em CELSIUS:");
        
        int celsius = sc.nextInt();
        int farent = (9 * celsius + 160) / 5;
        
        System.out.println("Temperatura em fahrenheit: " + farent);
        
    }
}
