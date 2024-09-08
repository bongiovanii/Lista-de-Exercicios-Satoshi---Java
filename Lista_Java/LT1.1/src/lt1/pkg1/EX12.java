/*
    Nome do programa: Ex12
    Objetivo: 12.Receba o ano de nascimento e o ano atual. Calcule e mostre a idade e quantos anos terá daqui 17 anos.
    Data: 11/08/2024
 */
package lt1.pkg1;
import java.util.Scanner;

public class EX12 {
    public EX12(){
        
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o ano de nascimento");
        
        int nascimento = sc.nextInt();
        
        System.out.println("Digite o ano atual");
        int atual = sc.nextInt();
        
        int idade = atual - nascimento;
        int anos = idade + 17;
        
        System.out.println("Idade: " + idade);
        System.out.println("Daqui 17 anos tera: " + anos);
    }
}
