/*
	Questão:2.25 (Impar ou par) Escreva um aplicativo que leia um inteiro, 
	além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador  
	de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa 
	um resto 0 quando dividido por 2.] 
	Deitel, Paul; Deitel, Harvey. Java: como programar (p. 53). Edição do Kindle. 
	Autor: Pedro Filho 04/02/2021
*/

package parouimpar;

	// biblioteca
	import java.util.Scanner;

	public class ParOuImpar {
		
			// método principal
			public static void main(String[] args) {
				
				// cria objeto
				Scanner input = new Scanner( System.in );
				// variável
				int num = 0;

				// entrada de dados
				System.out.print( "Digite um inteiro: " );
				num = input.nextInt();

				// verificar se num é par ou ímpar
				if( num % 2 == 0 )
					// imprima
					System.out.printf( "O número %d é par.\n", num );

				// verificar se o número é ímpar
				if( num % 2 != 0 )
					// imprima
					System.out.printf( "O número %d é ímpar.\n", num );

			} // fim main
	} // fim classe
