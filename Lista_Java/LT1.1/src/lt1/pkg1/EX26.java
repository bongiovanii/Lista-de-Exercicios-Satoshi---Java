/*
Nome: Gustavo Bongiovani
Data: 22/08/2024
Objetivo: 26. Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor
*/
import java.util.Scanner;
public class EX26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int vet[] = new int[n];
        System.out.println("Digite um numero");
        vet[0] = sc.nextInt();
        
        System.out.println("Digite um outro numero");
        vet[1] = sc.nextInt();

        if(vet[0] > vet[1]){
            System.out.println("Maior: " + vet[0] + " Menor: " + vet[1]);
            if(vet[0] % vet[1] == 0){
                System.out.println("O maior numero é multiplo do menor!");
                
            }else{
                System.out.println("O maior numero NÂO é multiplo do menor");
            }
        }else if(vet[1] > vet[0]){
                System.out.println("Maior: " + vet[1] + " Menor: " + vet[0]);
                if(vet[1] % vet[0] == 0){
                    System.out.println("O maior numero é multiplo do menor!");
                }else{
                    System.out.println("O maior numero NÂO é multiplo do menor");
                }
        }









    }
}