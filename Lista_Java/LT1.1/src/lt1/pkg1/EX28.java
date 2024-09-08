/*
Nome do programador: Gustavo Bongiovani
Data: 29/08/2024
Objetivo:Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: Venda Mensal Preço Atual Preço Novo < 500 < 30 + 10% >= 500 e < 1000 >= 30 e < 80 +15% >= 1000 >= 80 - 5% Obs.: para outras condições, preço novo será igual ao preço atual.
 */
package lt1.pkg1;
import javax.swing.JOptionPane;
public class EX28 {
    static Double PrecoAtual, MediaMensal, PrecoNovo, porcent;
    public static void main(String[] args){
        MediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a media mensal de vendas do produto"));
        PrecoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto"));

        ProcedureCalc();
        JOptionPane.showMessageDialog(null, "\n Novo preço do produto: " + PrecoNovo);
    }

    static void ProcedureCalc() {
            if((MediaMensal < 500) & (PrecoAtual < 30) ){
                porcent =  (PrecoAtual / 100) * 10;
                PrecoNovo =  porcent + PrecoAtual;
            }else if((MediaMensal >= 500 || MediaMensal < 1000) & (PrecoAtual >= 30 || PrecoAtual < 80)){
                porcent = (PrecoAtual / 100) * 15;
                PrecoNovo  = PrecoAtual + porcent;
            }else if((MediaMensal >=1000) & (PrecoAtual >= 80)){
                porcent =  (PrecoAtual /100) - 5;
                PrecoNovo = porcent - PrecoAtual;
            }
    }
}


