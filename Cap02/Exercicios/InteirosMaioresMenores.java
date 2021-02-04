package inteirosmaioresmenores;

// importar biblioteca
import java.util.Scanner;

public class InteirosMaioresMenores {

	public static void main(String[] args) {

		// cria objeto
		Scanner input = new Scanner( System.in );

		// variáveis para 5 inteiros
		int n1, n2, n3, n4, n5; 
		int maior = 0;
		int menor = 0;

		// entrada de dados
		System.out.print( "Digite 5 inteiros diferentes: " );
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		n4 = input.nextInt();
		n5 = input.nextInt();

		// atribuir valores a maior e menor
		maior = n1;
		menor = n1;

		// verificar o maior e o menor
		// se n2 maior que o maior
		if( n2 > maior )
			// maior recebe n2
			maior = n2;

		// se n3 maior que o maior
		if( n3 > maior )
			// maior recebe n3
			maior = n3;

		// se n4 maior que o maior
		if( n4 > maior )
			// maior recebe n4
			maior = n4;

		// se n4 maior que o maior
		if( n5 > maior )
			// maior recebe n4
			maior = n5;
		

		// ENCONTRA MENOR VALOR
		// se n2 menor que menor
		if( n2 < menor )
			// menor recebe n2
			menor = n2;

		// se n3 menor que menor
		if( n3 < menor )
			// menor recebe n3
			menor = n3;

		// se n4 menor que menor
		if( n4 < menor )
			// menor recebe n4
			menor = n4;

		// se n4 menor que menor
		if( n5 < menor )
			// menor recebe n4
			menor = n5;

		// mostrar o resultado
		System.out.printf( "Maior = %d\n", maior );
		System.out.printf( "Menor = %d\n", menor );





		
	}
}