package exercicios;
import java.util.Scanner;
public class exercicio12 {

	public static void main(String[] args) {
//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares.
		
		int numero;
		int quantPar = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Digite 20 números: ");
		
		for (int i = 1 ; i <= 20 ; i++) {
			numero = ler.nextInt ();
			
			if (numero % 2 == 0) {
				quantPar = quantPar +1;
			}
		}
		System.out.println (quantPar);

	}

}
