/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 38. Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
*/
package lt1.pkg1;
public class EX38 {
    public static void main(String[] args){
        int [] vet = new int[100];
        int i;
        int min = 99999;
        int max = 0;
        for(i = 0 ; i < 100 ; i++) {
            vet[i] = (int) (Math.random() * 100) + 1; //gera um número aleatório entre 1 e 100
            System.out.println("Vetor[" + i + "] = " + vet[i]);
        }
        for(i = 0 ; i < 100 ; i++) {
            if (vet[i] < min) {
                min = vet[i];
            } else if (vet[i] > max) {
                max = vet[i];
            }
        }
        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);
    }
}
