package exercicios;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		//8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

		int idade;
		int quantMaior = 0	;
		Scanner ler = new Scanner (System.in);
		
		for (int i=1; i<=20; i++) {
			System.out.println ("Informe sua idade:");
			idade = ler.nextInt();
				
			if ( idade>=18 ) {
				quantMaior ++;
			}
			
		}
		System.out.println (quantMaior);
	}

}
