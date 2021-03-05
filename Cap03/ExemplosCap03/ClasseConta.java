// Figura 3.1: Account.java  
// Classe Account que contém uma variável de instância name  
// e métodos para configurar e obter seu valor. 
//Deitel, Paul; Deitel, Harvey. Java: como programar (p. 57). Edição do Kindle. 
// @Pedro Filho, 05/03/2021

// cria a classe Account
public class Account
{
	private String name; // variável de instância

	// método para definie o nome num objeto
	public void setName( String nome ) 
	{
		this.name = name; // armazena o nome
	} // fim método setName

	//método para recuperar o nome do objeto
	public String getName()
	{
		return name; // retorna o valor do nome para o chamador
	} // fim do método getName
} // fim da classe Account
