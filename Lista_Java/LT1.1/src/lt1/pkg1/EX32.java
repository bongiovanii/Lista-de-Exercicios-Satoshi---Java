package lt1.pkg1;
/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
*/
import javax.swing.JOptionPane;
public class EX32 {
    static int fatorial(int n){
        if(n != 0){
            return n * fatorial(n-1);
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro e receba seu fatorial"));
        if(num < 1){
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
        else{
            int fat = fatorial(num);
            JOptionPane.showMessageDialog(null, "Fatorial de " + num + " = " + fat);

        }
    }
}
