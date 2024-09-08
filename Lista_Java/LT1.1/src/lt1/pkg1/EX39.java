/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: Casa: 1 2 3 4 ... 64 Qdte: 1 2 4 8 ... N
*/
package lt1.pkg1;

public class EX39 {
    public static void main(String[] args) {
        int i;
        int [] vet = new int[64];
        vet[0] = 1;
        for(i = 0; i < 63; i++) {
            vet[i + 1] = vet[i] + vet[i];
        }
        for(i = 0; i < 63; i++) {
            System.out.println("CASA: " + i + " Qnt.Grão: " + vet[i]);
        }
        //A saída está dando estouro de memória, para de contar em vet[31] = -2147483648
    }
}
