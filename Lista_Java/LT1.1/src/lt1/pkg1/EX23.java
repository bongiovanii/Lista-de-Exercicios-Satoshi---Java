
/*
Nome: Gustavo Bongiovani
Data: 22/08/2024
Objetivo: 23. Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente
 */
import java.util.Scanner;
public class EX23 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4; 
        int vet[] = new int[n];
        int i;
        int aux;
        for(i = 0; i < 3 ; i++){
            System.out.println("Digite um numero qualquer (obrigatoriamente em ordem crescente)");
            vet[i] = sc.nextInt();
        }
        
        System.out.println("Digite um outro numero (não precisa estar em ordem crescente)");
        vet[3] = sc.nextInt();
        
        System.out.println("Numeros não ordenados");
        for(i = 0; i < 4; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println("\n----------------------------------------------");
        
        for(i =0; i < (n - 1) ; i++){
            for(int j = 0; j < (n - i - 1); j++){
                if(vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        System.out.println("Numeros em ordem crescente");
        for(i=0; i < 4; i++){
            System.out.print(vet[i] + " ");
        }
    }
}



   

