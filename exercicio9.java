package exercicios;
import java.util.*;
public class exercicio9 {

	public static void main(String[] args) {
		// 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
		
		String nome; 
		int idade;
		String nomeMaisNova;
		int idadeMaisNova;
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Informe seu nome: ");
		nomeMaisNova = ler.next();
		System.out.println ("Informe sua idade: ");
		idadeMaisNova = ler.nextInt();		
		
		for (int i = 2 ; i <= 10 ; i++  ); {
		System.out.println ("Informe seu nome: ");
		nome = ler.next();
		System.out.println ("Informe sua idade: ");
		idade = ler.nextInt();
		
		if (idade < idadeMaisNova  ) {
			
			idadeMaisNova = idade;
			
		}
			
		}
	}

}
