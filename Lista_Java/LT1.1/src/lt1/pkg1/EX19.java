/*
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Obejtivo: 19. Receba 2 valores reais. Calcule e mostre o maior deles.
Data: 15/08/2024
 */
import java.util.Scanner;
public class EX19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero real");
        float NUM1 =  sc.nextFloat();

        System.out.println("Digite um outro numero real");
        float NUM2 =  sc.nextFloat();
        
        if(NUM1 > NUM2){
            System.out.println("Maior: " + NUM1 + " Menor: " + NUM2);
        }else{
            System.out.println("Maior: " + NUM2 + " Menor: " + NUM1);
        }
    }
}



