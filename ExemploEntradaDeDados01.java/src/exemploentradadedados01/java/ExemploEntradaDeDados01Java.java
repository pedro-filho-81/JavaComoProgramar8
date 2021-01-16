/*
    1// Figura 2.7: Addition.java  2// Programa de adição que insere dois 
    números, então exibe a soma deles. 
    Deitel, Paul; Deitel, Harvey. Java: como programar (p. 36). Edição do Kindle. 
    Pedro 15/01/2021
*/
import java.util.Scanner; // programa utiliza a classe Scanner

public class ExemploEntradaDeDados01Java 
{
   public static void main(String[] args) {

       // cria um Scanner para a entrade de dados pelo usuário
       Scanner input = new Scanner( System.in );
        
       // cria variáveis
       int numero1 = 0; // primeiro número
       int numero2 = 0; // recebe o segundo número
       int soma = 0; // soma as duas variáveis
        
        // entrada de dados
        System.out.print( "Digite o primeiro número: " );
        numero1 = input.nextInt(); // Lê o primeiro inteiro
        
        System.out.print("Segundo inteiro: " ); // prompt
        numero2 = input.nextInt(); // lê o segundo inteiro
        
        // somar os dois inteiros
        soma = numero1 + numero2;
        
        // imprime a soma
        System.out.printf("%d + %d = %d%n", numero1, numero2, soma );
        
    } // fim main
    
} // fim classe
