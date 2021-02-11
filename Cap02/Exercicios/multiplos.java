package multiplos;

// biblioteca
import java.util.Scanner;

	public class multiplos {

		public static void main(String[] args) {

			Scanner input = new Scanner( System.in );

			// variáveis
			int num1, num2;

			// entrada de dados
			System.out.print( "Primeiro número: " );
			num1 = input.nextInt();

			System.out.print( "Segundo número: " );
			num2 = input.nextInt();

			// se num1 é multiplo do segundo
			if( num1 % num2 == 0 ) {

				// imprima
				System.out.printf( "%d  multiplo de %d\n", num1, num2 );
			} // fim if

			// se não
			else {
				// imprima
				System.out.printf( "%d NÃO é multiplo de %d\n", num1, num2 );
			}// fim else



		} // fim main

	} // fim classe
