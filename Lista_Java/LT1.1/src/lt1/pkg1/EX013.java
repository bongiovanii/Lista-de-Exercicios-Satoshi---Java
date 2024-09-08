/*
    Nome do programa: Ex12
    Objetivo: 13. Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
    Nome do Programador: Gustavo Bongiovani
    Data: 14/08/2024
 */
package lt1.pkg1;

import java.util.Scanner;

public class EX013 {
    public EX013(){

    }
    public static void main(String[] args){
        System.out.println("Digite a quantidade de alimentos em kg:" );
        Scanner sc = new Scanner(System.in);

        double ali = sc.nextDouble();
        double aux = (ali * 1000) / 50;

        System.out.println("Vai durar " + aux + " dias.");
    }
}
