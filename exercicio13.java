package exercicios;
import java.util.Scanner;
public class exercicio13 {

	public static void main(String[] args) {
//13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

		int numero;
		int quant = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Digite 20 números: ");
		
		for (int i = 1 ; i <= 20 ; i++) {
			numero = ler.nextInt ();
			
			if (numero >= 0 & numero <= 100) {
				quant = quant +1;
			}
		}
		System.out.println (quant);
	}

}
