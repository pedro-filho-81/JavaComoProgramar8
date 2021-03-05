// Figura 3.2: AccountTest.Java  
// Cria e manipula um objeto Account. 
// Deitel, Paul; Deitel, Harvey. Java: como programar (p. 59). Edição do Kindle. 
// @Pedro Filho, 05/03/2021

import java.util.Scanner;

public class AccountTest 
{
	public static void main(String[] args) 
	{
		// cria o objeto Scanner input para obter entrada de dados
		// a partir da janela de comando
		Scanner input = new Scanner( System.in );

		// cria um objeto Account e o atribui a myAccount
		Account myAccount = new Account();

		// exibe o inicial do nome (null)
		System.out.printf( "O nome é %s%n%n", myAccount.getName );

		// entrada de dados pelo usuário
		System.out.println( "Entre com o nome: " );
		String theName = nextLine(); // lê uma lista de texto
		myAccount.setName( theName ); // insere theName em myAccount
		System.out.println(); // pula uma linha

		// exibe o nome armazenado no objeto myAccount
		System.out.printf( "O nome no objeto myAcount é %n%s%n", 
			myAcount.getName );

	} // fim main
} // fim da classe AccountTest
