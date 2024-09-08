

/*
Nome do programador: Gustavo Santos Bongiovani de Oliveira
Obejtivo: 17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Data: 15/08/2024
 */

// delta.s = delta.t / delta.v
import java.util.Scanner;
public class EX17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tempo da viagem (horas)");
        int delta_t = sc.nextInt();
        
        System.out.println("Insira a velocidade média do percurso em km");
        int vm = sc.nextInt();
        int delta_s  = vm / delta_t;
        int litros = delta_s * 12;
        System.out.println("Litros gastos: " + litros + "L");
        
    }
    
}
