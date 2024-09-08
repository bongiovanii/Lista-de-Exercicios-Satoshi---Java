/*
    Nome do programa: Ex07
    Objetivo: 7.Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;

public class EX07 {
    public EX07(){
        
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Insira o comprimento: ");
        int comprimento = sc.nextInt();
        
        System.out.println("Insira a largura: ");
        int largura = sc.nextInt();
        
        System.out.println("Insira a altura: ");
        int altura = sc.nextInt();
        
        int aux = comprimento * largura * altura;
        
        System.out.println("Volume do paralelepido:" + aux);
        
    }
}
