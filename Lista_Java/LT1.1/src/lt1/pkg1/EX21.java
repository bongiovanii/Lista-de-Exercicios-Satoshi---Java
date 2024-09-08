/*
Nome: Gustavo Bongiovani
Data: 19/08/2024
Objetivo: ex21 da lista do Satoshi
*/
import java.util.Scanner;
public class EX21 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno");
        double nota2 = sc.nextDouble();
        
        
        System.out.println("Digite a terceira nota do aluno");
        double nota3 = sc.nextDouble();
        
        System.out.println("Digite a quarta nota do aluno");
        double nota4 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("MEDIA: " + media);
        if(media >= 6 ){
            System.out.println("APROVADO");
            
        }else if((media>= 3) || (media < 6)){
            System.out.println("RETIDO");
            
        }else if (media < 3){
            System.out.println("REPROVADO");
        }
        
        
    }
}

