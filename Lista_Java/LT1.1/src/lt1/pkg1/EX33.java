package lt1.pkg1;

import javax.swing.*;

/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/
public class EX33 {
    /* TESTE DE RECURSIVA MAS NÃO CONSEGUI EXIBIR A SERIE
    static int Fnewrec0(int n){
        int count = 0;
        if(count != n){
            return 1 + Fnewrec0(1+n);

        }
        else{
            return 1;
        }

    }
    */

    public static void main(String[]args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro diferente de zero"));
        while(num < 1){
            JOptionPane.showMessageDialog(null, "EU DISSE DIFERENTE DE ZERO!! >:(");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro diferente de zero"));
        }

            //int serie = Fnewrec0(num);

            int count = 0 ;
            System.out.print("1");
            while(count <= num){
                System.out.print(" + 1/" + count);
                count += 1;
            }

    }
}
