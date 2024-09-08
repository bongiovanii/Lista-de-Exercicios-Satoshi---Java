/*
    Nome do programa: Ex05
    Objetivo: 5.Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
    Nome do Programador: Gustavo Bongiovani
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;

public class EX05 {
    public EX05(){
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("De entrada com o coeficiente A: ");
        int A = sc.nextInt();
        
        System.out.println ("De entrada com o coeficiente B: ");
        int B = sc.nextInt();
        
        if(B == 0 ){
            System.out.println("ERRO, nao é possivel calcular raizes.");
        }else{
             System.out.println ("De entrada com o coeficiente C: ");
             int C = sc.nextInt();
             if(C == 0){
                System.out.println("ERRO, nao é possivel calcular raizes.");
             }else{
                  float delta = (B * B) - (4 * A * C);
                  float aux1 = (-B + delta) / (2 * A);
                  float aux2 = (-B - delta) / (2 * A);
                 
                  System.out.println("X1  = " + aux1);
                  System.out.println("X2  = " + aux2);

             }
            
        }
    }
}
