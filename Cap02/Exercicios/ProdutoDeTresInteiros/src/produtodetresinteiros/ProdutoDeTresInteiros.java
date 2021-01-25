/* 
2.6 Usando as instruções que você escreveu no Exercício 2.5, elabore um 
programa completo que calcule e imprima o produto de três inteiros. 
Deitel, Paul; Deitel, Harvey. Java: como programar (p. 49). Edição do Kindle. 
@Pedro Filho, 21/01/2021
*/
package produtodetresinteiros;

import java.util.Scanner; // biblioteca
        
public class ProdutoDeTresInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto input
        Scanner input = new Scanner(System.in);
        
        // cria variáveis
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int produto = 0;
        
        // entrada de dados
        System.out.print( "Digite 3 inteiros diferentes:" ); // prompt
        num1 = input.nextInt();
        num2 = input.nextInt();
//        num3 = input.nextInt();
//        
//        // calcular o produto
//        produto = num1 * num2 * num3;
//        
//        // imprime resultado
//        System.out.printf( "O produto entre %d * %d * %d = %d\n\n", 
//                num1, num2, num3, produto );
    } // fim main
    
} // fim classe
