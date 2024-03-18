package exercicios;
import java.util.Scanner;
public class exercicio6 {

	public static void main(String[] args) {
		// 6) Leia a idade de 20 pessoas e exiba a soma das idades.
		
		int soma = 0;
		String nome;
		int idade;
		Scanner ler = new Scanner (System.in);
		
		for (int i=1; i<=20; i++) {
			System.out.println ("Informe seu nome:");
			nome = ler.next();
			
			System.out.println ("Informe sua idade:");
			idade = ler.nextInt();
			soma += idade;
		}
		System.out.println ("A soma das idades é: " + soma);

	}

}
