package exercicios;
import java.util.Scanner;
public class exercicio14 {

	public static void main(String[] args) {
//14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
//100, quantos estão entre 101 e 200 e quantos são maiores de 200.
		
		int numero;
		int quantAte100 = 0;
		int quantAte200 = 0;
		int quantMaior = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Digite 20 números: ");
		
		for (int i = 1 ; i <= 20 ; i++) {
			numero = ler.nextInt ();
			
			if (numero >= 0 & numero <= 100) {
				quantAte100 = quantAte100 +1;
			} if (numero >=101 & numero <=200) {
				quantAte200 = quantAte200 +1;
			} if (numero > 200) {
				quantMaior = quantMaior +1;
			}
		}
		System.out.println ("Números de 0 até 100 são: " + quantAte100);
		System.out.println ("Números de 101 até 200 são: " + quantAte200);
		System.out.println ("Números maior que 200 são: " + quantMaior);

	}

}
