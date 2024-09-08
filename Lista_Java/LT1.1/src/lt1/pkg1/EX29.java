/*
Nome do programador: Gustavo Bongiovani
Data: 29/08/2024
Objetivo: 29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.
*/

package lt1;
import javax.swing.JOptionPane;
public class EX29 {
    static Float ValorInvestimento;
    
    public static void main(String[] args) {
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA SEU TIPO DE INVESTIMENTO \n 1-Poupança\n 2-Investimento\n 9-SAIR"));
        switch (opc) {
            case 1: ProcedurePoupa();
                    break;
            case 2: ProcedureInves();
                    break;
            case 9: JOptionPane.showMessageDialog(null,"FIM DA OPERAÇÃO");

        } 
    }

    static void ProcedurePoupa(){
            ValorInvestimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser investido"));
            Float porcent;
            porcent =  ((ValorInvestimento /100) * 3) * 30;
            ValorInvestimento += porcent;
            JOptionPane.showMessageDialog(null, "Valor total corrigido em 30 dias R$" + ValorInvestimento);
            
            
    }

    static void ProcedureInves(){
            ValorInvestimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser investido"));
            Float porcent;
            porcent =  ((ValorInvestimento /100) * 5) * 30;
            ValorInvestimento += porcent;
            
    }
}
