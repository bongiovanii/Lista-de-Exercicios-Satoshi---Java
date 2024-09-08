package lt1.pkg1;
import javax.swing.*;

/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
*/
public class EX34 {
    static int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro e receba sua tabuada"));
    public static void main(String[] args){

        ProcedureTab();

    }
    static void ProcedureTab(){
        int count;
        int aux;
        for(count = 0; count <= 10; count++){
            aux = count * num;
            System.out.println(count + " x " + num + " = " + aux );
        }
    }
}
