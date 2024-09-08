/*
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Obejtivo: 20. Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Data: 15/08/2024
 */
import java.util.Scanner;
public class EX20 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o valor do coeficiente A");
        double coef_A = sc.nextDouble();
        
        System.out.println("Digite o valor do coeficiente B");
        double coef_B = sc.nextDouble();
        
        System.out.println("Digite o valor do coeficiente C");
        double coef_C = sc.nextDouble();
        
        //Δ=b*2−4ac
        coef_B = Math.pow(coef_B,2);
        
        double delta = (4 * (coef_A * coef_C)) - coef_B;
        System.out.println(delta);
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
