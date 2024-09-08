
/*
Nome: Gustavo Bongiovani
Data: 22/08/2024
Objetivo: 24. Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */

import java.util.Scanner;
public class EX24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro.");
        int num = sc.nextInt();
        if((num % 2 == 0) & (num % 3 == 0)){
            System.out.println("Numero divisivel por 2 e por 3");
        }else{
            System.out.println("Numero não divisivel por 2 e 3");
        }
    }    
 
}
