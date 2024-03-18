package exercicios;
import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		// 7) Leia a idade de 20 pessoas e exiba a média das idades.
		
		int soma = 0;
		int idade;
		Scanner ler = new Scanner (System.in);
		
		for (int i=1; i<=20; i++) {
			System.out.println ("Informe sua idade:");
			idade = ler.nextInt();
			soma += idade;
		}
		
		double media = soma/20;
		System.out.println ("A media das idades é: " + media);


	}

}
