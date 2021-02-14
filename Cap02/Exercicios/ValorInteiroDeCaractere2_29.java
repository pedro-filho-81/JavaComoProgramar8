/*
	Questão: 2.29 (O valor inteiro de um caractere) Eis outra prévia do que virá adiante. 
	Neste capítulo, você aprendeu sobre inteiros e o tipo int. O  Java também pode 
	representar letras maiúsculas, minúsculas e uma variedade considerável de símbolos especiais. 
	Cada caractere tem  uma representação correspondente de inteiro. O conjunto de caracteres 
	que um computador utiliza com as respectivas representações na  forma de inteiro desses 
	caracteres é chamado de conjunto de caracteres desse computador. Você pode indicar um valor 
	de caractere em um  programa simplesmente incluindo esse caractere entre aspas simples, como em ‘A'.  
	Você pode determinar o equivalente em inteiro de um caractere precedendo-o com (int), como em  
	(int) 'A'  Um operador dessa forma é chamado operador de coerção. (Você aprenderá sobre os operadores 
	de coerção no Capítulo 4.) A instrução  a seguir gera saída de um caractere e seu equivalente de inteiro:  
	System.out.printf("The character %c has the value %d%n", 'A', ((int) 'A'));  Quando a instrução 
	precedente executa, ela exibe o caractere A e o valor 65 (do conjunto de caracteres Unicode®) como parte 
	da  string. O especificador de formato %c é um espaço reservado para um caractere (nesse caso, ‘A').  
	Utilizando instruções semelhantes àquela mostrada anteriormente neste exercício, escreva um aplicativo 
	que exiba os equivalentes  inteiros de algumas letras maiúsculas, minúsculas, dígitos e símbolos especiais. 
	Mostre os equivalentes inteiros do seguinte: A B C a b c  0 1 2 $* +/ e o caractere em branco. 
	Deitel, Paul; Deitel, Harvey. Java: como programar (p. 53). Edição do Kindle. 
	Autor @Pedro Filho 14/02/2021
*/

// cria uma classe
public class ValorInteiroDeCaractere2_29 {

	// cria método principal
	public static void main(String[] args) {

		// cabeçalho
		System.out.print( "VALOR INTEIRO DE UM CARACTERE\n" );

		// mostrar resultado
		System.out.printf( "O caractere %c tem o valor %3d\n", 'A', ( (int) 'A') );
		System.out.printf( "O caractere %c tem o valor %3d\n", 'B', ( (int) 'B') );
		System.out.printf( "O caractere %c tem o valor %3d\n\n", 'C', ( (int) 'C') );

		System.out.printf( "O caractere %c tem o valor %3d\n", 'a', ( (int) 'a') );
		System.out.printf( "O caractere %c tem o valor %3d\n", 'b', ( (int) 'b') );
		System.out.printf( "O caractere %c tem o valor %3d\n\n", 'c', ( (int) 'c') );

		System.out.printf( "O caractere %c tem o valor %3d\n", '0', ( (int) '0') );
		System.out.printf( "O caractere %c tem o valor %3d\n", '1', ( (int) '1') );
		System.out.printf( "O caractere %c tem o valor %3d\n\n", '2', ( (int) '2') );

		System.out.printf( "O caractere %c tem o valor %3d\n", '@', ( (int) '@') );
		System.out.printf( "O caractere %c tem o valor %3d\n", '#', ( (int) '#') );
		System.out.printf( "O caractere %c tem o valor %3d\n", '$', ( (int) '$') );
		System.out.printf( "O caractere %c tem o valor %3d\n", '*', ( (int) '*') );
		System.out.printf( "O caractere %c tem o valor %3d\n", '/', ( (int) '/') );
		System.out.printf( "O caractere %c tem o valor %3d\n", '+', ( (int) '+') );
		System.out.printf( "O caractere %c tem o valor %3d\n", ' ', ( (int) ' ') );

	} // fim método
} // fim classe
