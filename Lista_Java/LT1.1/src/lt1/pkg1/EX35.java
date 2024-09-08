/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 35. Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/

package lt1.pkg1;
import javax.swing.*;

public class EX35 {

    static int  num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    static int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número inteiro"));
    public static void main(String[]args){
        if(num1 > num2){
            JOptionPane.showMessageDialog(null,"O número " + num1 + " é o maior");
            ProcedureSomatoria1();
        }
        else if(num2 > num1){
            JOptionPane.showMessageDialog(null, "O número " + num2 + " é o maior");
            ProcedureSomatoria2();
        }
    }
    static void ProcedureSomatoria1(){
        int i, soma = 0;
        for(i = num2; i <= num1; i++){
            if(i % 2 == 0 ){

            }
            else{
                soma += i;
            }
        }
        JOptionPane.showMessageDialog(null,"Somatória dos numeros impares: " + soma);
    }

    static void ProcedureSomatoria2(){
        int i, soma = 0;
        for(i = num1; i <= num2; i++){
            if(i % 2 == 0 ){

            }
            else{
                soma += i;
            }
        }
        JOptionPane.showMessageDialog(null,"Somatória dos numeros impares: " + soma);
    }
}
