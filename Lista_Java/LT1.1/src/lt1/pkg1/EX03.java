/*
    Nome do programa: Ex03
    Objetivo: 3.Receba a base e a altura de um triângulo. Calcule e mostre a sua área
    Nome do Programador: Gustavo Bongiovani
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;

public class EX03 {
    public EX03(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da BASE:");
        int base = sc.nextInt();
        
        System.out.println("Insira o valor da ALTURA:");
        int altura = sc.nextInt();
        
        int area = (base * altura)/2;
        System.out.println("Valor da area:" + area);
        
    }
}
