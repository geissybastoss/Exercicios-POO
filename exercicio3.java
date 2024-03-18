package exercicios;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		//3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

		int i = 1;
		String nome;
		Scanner ler = new Scanner (System.in);
		System.out.println ("Digite seu nome: ");
		nome = ler.next();
		
		
		while (i <= 10 ) {
			System.out.println (nome);
			i++;
		}

	}

}
