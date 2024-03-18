package exercicios;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
//5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
		
		int soma = 0;
		//int i;
		int numero;
		Scanner ler = new Scanner (System.in);
		System.out.println ("Digite 10 números:");

		
		for (int i=1; i<=10; i++) {
			numero = ler.nextInt();
			soma += numero;
		}
		System.out.println ("A soma dos números digitados é: " + soma);
	}

}
