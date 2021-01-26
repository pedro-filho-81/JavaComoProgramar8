
package comparandointeiros;

/**
 *2.16 (Comparando inteiros) Escreva um aplicativo que solicite ao usuário inserir 
 * dois inteiros, obtenha dele esses números e exiba o número  maior seguido 
 * pelas palavras “is larger". Se os números forem iguais, imprima a mensagem 
 * “These numbers are equal". Utilize  as técnicas mostradas na Figura 2.15. 
   Deitel, Paul; Deitel, Harvey. Java: como programar (p. 52). Edição do Kindle. 
 * @author Pedro Filho
 */
// cria biblioteca
import java.util.Scanner;
        

public class ComparandoInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
        
        // cria variáveis
        int num1 = 0;
        int num2 = 0;
        
        // entrada de dados
        System.out.print( "Digite dois inteiros: " ); // prompt
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        // se num1 igual a num2 imprima 
        if( num1 == num2 )
            System.out.println( "Números iguais." );
        
        // se num1 maior que num2 imprima
        if( num1 > num2 )
            System.out.println( "O primeiro número é o meior" );
        
        // se num2 maior que o número 1 imprima
        if( num1 < num2 )
            System.out.println( "O segundo número é o maior." );
        
    } // fim main    
} // fim classe

