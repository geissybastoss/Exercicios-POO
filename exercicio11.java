package exercicios;
import java.util.*;
public class exercicio11 {

	public static void main(String[] args) {
//11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são 
//maiores do que 8.
		
		int numero;
		int quant = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Digite 20 números: ");
		
		for (int i = 1 ; i <= 20 ; i++) {
			numero = ler.nextInt ();
			
			if (numero > 8) {
				quant = quant +1;
			}
		}
		System.out.println (quant);

	}

}
