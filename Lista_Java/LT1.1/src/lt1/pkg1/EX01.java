/*
    Nome do programa: Ex01 
    Objetivo: 1.Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
    Nome do Programador: Gustavo Bongiovani
    Data: 11/08/2024

 */
package lt1.pkg1;

import java.util.Scanner;

public class EX01 {
    public EX01(){
    
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o lado do quadrado: ");
        
        int lado = sc.nextInt();
        int area = lado * lado;
        
        System.out.println("Area do quadrado: " + area);
        
                
        
    }
}
