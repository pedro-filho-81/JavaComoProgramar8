
package aritimeticamenormaior;
/**
 * 2.17 (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros 
* digitados pelo usuário e exiba a soma, média, produto e os  números menores e maiores. 
* Utilize as técnicas mostradas na Figura 2.15. [Observação: o cálculo da média 
* neste exercício deve resultar  em uma representação de inteiro. Assim, se a soma 
* dos valores for 7, a média deverá ser 2, não 2,3333...]
* Deitel, Paul; Deitel, Harvey. Java: como programar (p. 52). Edição do Kindle. 
@Pedro Filho 27/01/2021
*/

// biblioteca
import java.util.Scanner;


public class AritimeticaMenorMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        // variáveis
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int somar = 0;
        int media = 0;
        int produto = 0;
        int maior = 0;
        int menor = 0;
        
        // entrada de dados
        System.out.print( "Digite 3 inteiros: " );
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        
        // calcular
        somar = num1 + num2 + num3;
        media = somar / 3;
        produto = num1 * num2 * num3;
        
        //verificar se num1 é o maior
        if( num1 > num2 )
            if( num1 > num3)
                maior = num1;
        
        // verificar se num2 é o maior
        if( num2 > num1 )
            if( num2 > num1 )
                maior = num2;
        
        // verificar se num3 é o maior
        if( num3 > num1 )
            if( num3 > num1 )
                maior = num3;
        
        
        //verificar se num1 é o menor
        if( num1 < num2 )
            if( num1 < num3)
                menor = num1;
        
        // verificar se num2 é o menor
        if( num2 < num1 )
            if( num2 < num1 )
                menor = num2;
        
        // verificar se num3 é o menor
        if( num3 < num1 )
            if( num3 < num1 )
                menor = num3;
        
        // mostrar o resultado
        System.out.printf("Soma = %d\n", somar );
        System.out.printf("Média = %d\n", media );
        System.out.printf("Produto = %d\n", produto );
        System.out.printf("Maior número = %d\n", maior );
        System.out.printf("Menor número = %d\n", menor );
    } // fim main
    
} // fim classe

