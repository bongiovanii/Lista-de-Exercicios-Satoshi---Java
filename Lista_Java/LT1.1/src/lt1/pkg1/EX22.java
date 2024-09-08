
import java.util.Scanner;

/*
Nome: Gustavo Bongiovani
Data: 19/08/2024
Objetivo: 22.Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/

public class EX22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor qualquer inteiro");
        int num1 = sc.nextInt();
         while(num1 < 0 ){
            System.out.println("ERRO, insira um numero maior que zero. ");
            num1 = sc.nextInt();
        }


        System.out.println("Digite um outro valor qualquer inteiro");
        int num2 = sc.nextInt();
        
       
        
        if(num1 > num2){
            System.out.println("MAIOR: " + num1 + " MENOR: " + num2);
            System.out.println("CRESCENTE: " + num2 + " " + num1);
            
        }else if(num2 > num1){
            System.out.println("MAIOR: " + num2 + " MENOR: " + num1);
            System.out.println("CRESCENTE: " + num1 + " " + num2);
        }
        
        
    }
}
