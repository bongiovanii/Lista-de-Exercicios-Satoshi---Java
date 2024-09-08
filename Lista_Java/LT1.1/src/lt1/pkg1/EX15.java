/*
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Objetivo: 15. Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Data: 15/08/2024
*/
import java.util.Scanner;
public class EX15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o angulo do primeiro cateto.");
        
        double cat1 = sc.nextDouble();
        
        System.out.println("Digite o angulo do segundo cateto.");
        
        double cat2 = sc.nextDouble();
    
        double soma = (Math.pow(cat1,2)) + (Math.pow(cat2,2));
        double hip = (double)Math.sqrt(soma);
        
        System.out.println("Hipotenusa: " + hip);
        
       
    }
}
