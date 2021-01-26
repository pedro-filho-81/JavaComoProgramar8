/**
 * Questão: 2.15 (Aritmética) Escreva um aplicativo que solicite ao usuário 
 * inserir dois inteiros, obtenha dele esses números e imprima sua soma, produto,  
 * diferença e quociente (divisão). Utilize as técnicas mostradas na Figura 2.7. 
   Deitel, Paul; Deitel, Harvey. Java: como programar (p. 52). Edição do Kindle. 
 *  @PedroFilho, 26/20/21.
*/
package aritimetica2_15;
// importar biblioteca Scanner
import java.util.Scanner;

public class Aritimetica2_15 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner( System.in );
        
        // variáveis
        int num1 = 0; // para o primeiro número
        int num2 = 0; // para o segundo número
        int somar = 0;
        int diminuir = 0;
        int multiplicar = 0;
        int dividir = 0;
        int resto = 0;
        
        // entrada de dados
        System.out.print("Digite dois inteiros: " ); // prompt
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        // calcular
        somar = num1 + num2;
        diminuir = num1 - num2;
        multiplicar = num1 * num2;
        dividir = num1 / num2;
        resto = num1 % num2;
        
        // mostrar resultado
        System.out.printf( "Somar: %d + %d = %d\n", num1, num2, somar );
        System.out.printf( "Diminuir: %d - %d = %d\n", num1, num2, diminuir );
        System.out.printf( "Multiplicar %d * %d = %d\n", num1, num2, multiplicar );
        System.out.printf( "Dividir: %d / %d = %d\n", num1, num2, dividir );
        //System.out.printf( "Resto: %d % %d = %d\n\n", num1, num2, resto );
        
    } // fim main    
} // fim classe
