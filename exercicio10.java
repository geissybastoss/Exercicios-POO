package exercicios;
import java.util.*;
public class exercicio10 {

	public static void main(String[] args) {
	// 10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.
		
		int numero;
		Scanner ler = new Scanner (System.in);
		
		System.out.println ("Escolha um número: ");
		numero = ler.nextInt ();
		
		for (int i = 1 ; i <=10 ; i++ ) {
		System.out.println (numero + " x " + i + " = " + (numero * i));
	
		}

	}

}
