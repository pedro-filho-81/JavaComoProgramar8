
package javaapplication8;

import java.util.Scanner;
/**
 *
 * @author samsung
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Primeiro inteiro: " ); // prompt
        num1 = input.nextInt();
        System.out.print("Segundo inteiro: " ); // prompt
        int num2 = input.nextInt();
        
        // somar
        int soma = num1 + num2;      
        
        System.out.printf("Somar: %d + %d = %d%n", num1, num2, soma );
        
    }
    
}
