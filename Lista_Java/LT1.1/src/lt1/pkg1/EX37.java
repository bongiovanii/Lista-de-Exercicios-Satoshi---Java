/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 37. Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/
package lt1.pkg1;

import java.util.Scanner;

public class EX37 {
    static float ffibo(int n){
        if(n < 2){
            return n;
        }
        else{
            return ffibo(n - 1) + ffibo(n - 2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");

        int num = sc.nextInt();
        float fibo = ffibo(num);

        for(int i = 0; i <= num; i++){
            System.out.println("(" + i + ")=" + ffibo(i));
        }

    }
}
