package exercicios;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
//4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.

		//int i;
		
		String nome;
		int numeroN;
		Scanner ler = new Scanner (System.in);
		System.out.println ("Digite seu nome: ");
		nome = ler.next();
		
		System.out.println ("Digite um número até 5: ");
		numeroN = ler.nextInt();
		
		
		for (int i=1; i<=numeroN ; i++) {
			System.out.println (nome);
		}
		

	}

}


// o numero digitado pelo usuario será a quantidade de vezes que ele irá digitar o seu nome 