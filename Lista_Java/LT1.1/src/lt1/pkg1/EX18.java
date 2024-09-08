/* 
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Obejtivo: 18. Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
Data: 15/08/2024
 */
import java.util.Scanner;
public class EX18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um primeiro numero inteiro qualquer");
        int NUM1 = sc.nextInt();
        
        System.out.println("Insira um segundo numero inteiro qualquer");
        int NUM2 = sc.nextInt();
        int aux = 0;
        if(NUM1 > NUM2){
            aux = NUM1 - NUM2;
            System.out.println("Diferença entre o numero maior e menor: " + aux);
            System.out.println("Maior numero: " + NUM1 + " Menor numero: " + NUM2 );
        }else{
            aux = NUM2 - NUM1;
            System.out.println("Diferença entre o numero maior e menor: " + aux);
            System.out.println("Maior numero: " + NUM2 + " Menor numero: " + NUM1 );
        }
        
    }
}
