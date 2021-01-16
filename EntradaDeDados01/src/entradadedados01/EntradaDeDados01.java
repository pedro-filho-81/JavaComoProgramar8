/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados01;

import java.util.Scanner;

/**
 *
 * @author samsung
 */
public class EntradaDeDados01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // cria um Scanner para a entrade de dados pelo usuário
       Scanner input = new Scanner(System.in);
        
       // cria variáveis
       int num1; // primeiro número
       int num2; // recebe o segundo número
       int soma; // soma as duas variáveis
        
        // entrada de dados
        System.out.print( "Digite o primeiro número: " );
        //num1 = input.nextInt(); // Lê o primeiro inteiro
        
        System.out.print("Segundo inteiro: " ); // prompt
        //num2 = input.nextInt(); // lê o segundo inteiro
        
        // somar os dois inteiros
        //soma = num1 + num2;
        
        // imprime a soma
        System.out.printf("%d + %d = %d%n" );
        
    }
    
}
