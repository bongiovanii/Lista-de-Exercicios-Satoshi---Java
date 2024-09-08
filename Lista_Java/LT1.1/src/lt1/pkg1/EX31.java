
/*
Nome do programador: Gustavo Bongiovani
Data: 05/09/2024
Objetivo: 31.	Calcule e mostre o quadrado dos números entre 10 e 150.
*/

package lt1.pkg1;
import java.util.Scanner; 
public class EX31 {
    static int count;
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("QUADRADO DOS NUMEROS ENTRE 10 e 150");
        ProcedureCalc();
     
    }
    static void ProcedureCalc(){
        int aux;
        for(count = 10; count <= 150; count++){
            aux =  count * count;
            System.out.println(count + "^" + count + "= " + aux);
        }
    }
}
