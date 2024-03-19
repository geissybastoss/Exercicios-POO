package exercicios;
import java.util.*;
public class exercicio9 {

    public static void main(String[] args) {
        // 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
        
        String nome; 
        int idade;
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE; // Inicialize com o maior valor possível para a idade
        Scanner ler = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) { 
            
            System.out.println("Informe seu nome: ");
            nome = ler.next();
            System.out.println("Informe sua idade: ");
            idade = ler.nextInt();
            
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
            
        }
        
        System.out.println("A pessoa mais nova é: " + nomeMaisNova);
    }

}
