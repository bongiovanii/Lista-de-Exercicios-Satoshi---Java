/*
    Nome do programa: Ex06
    Objetivo: 6.Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
    Nome do Programador: Gustavo Bongiovani
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;


public class EX06 {
    public EX06(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input X: ");
        
        int x = sc.nextInt();
        
        System.out.println("Input Y: ");
        
        int y =  sc.nextInt();
        
        int aux = x;
        x = y;
        y = aux;
                
        System.out.println("Valores trocados: x = " + x + "" +  " y =" + y);
             
        
    }
}
