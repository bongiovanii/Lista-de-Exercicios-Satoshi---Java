



/*
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Objetivo: 14. Receba 2Ã¢ngulos de um triÃ¢ngulo. Calcule e mostre o valor do 3Âº Ã¢ngulo.
Data: 15/08/2024
*/

import java.util.Scanner;

public class EX14 {
    public EX14(){
        
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o valor do primeiro angulo");
        
        int angulo1 = sc.nextInt();
        
        System.out.println("Digite o valor do segundo angulo");
        
        int angulo2 = sc.nextInt();
        
        int soma =  180 - (angulo1 + angulo2);
        
        System.out.println("Valor do terceiro angulo do triangulo: " + soma);
    }
}
