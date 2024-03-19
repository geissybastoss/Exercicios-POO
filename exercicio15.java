package exercicios;
import java.util.*;
public class exercicio15 {

	public static void main(String[] args) {
//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
//soma desses números. Encerre a execução quando um número negativo for digitado

		Scanner ler = new Scanner (System.in);
		int numero, cont, acm; //acm acumulador
		cont=0;
		acm=0;
		System.out.println("Digite um número (menor que 0 para sair):");
		numero = ler.nextInt ();
		while (numero >= 0) {
			if (numero >= 0)
			acm = acm + numero;
			
			System.out.println ("Digite um numero (0 para sair):");
			numero = ler.nextInt ();

		}
		System.out.println ("Fim do programa!");
		System.out.println ("Valor acumulado:" + acm);
		
	}

}
