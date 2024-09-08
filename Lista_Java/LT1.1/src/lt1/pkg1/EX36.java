/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 36. Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/

package lt1.pkg1;

import javax.swing.*;
public class EX36 {
    static int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro qualquer"));
    public static void main(String[]args){
        int i, serie;
        for(i = 1; i <= num; i++){
            System.out.print(" 1 + 1/" + i + "!");
        }
    }
}
