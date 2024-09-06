/* Programa: Aula Operadores Lógicos 
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula de operadores lógicos visa explicar como usar operadores lógicos para combinar expressões booleanas. O programa permite a entrada de valores booleanos pelo usuário e exibe os resultados das operações lógicas.
*/

import java.util.Scanner;

public class OperadoresLogicos {
		
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Interação com o usuário para informar os dois valores a serem analisados
		System.out.print("Digite o primeiro valor booleano (true/false) para ser analisado: ");
		boolean primeiroValor = input.nextBoolean();
		
		System.out.print("Digite o segundo valor booleano (true/false) para ser analisado: ");
		boolean segundoValor = input.nextBoolean();
		
		
		// Análise utilizando o operador lógico E (&&)
		boolean eLogico = (primeiroValor && segundoValor);
        System.out.printf("%nO resultado de %b E (&&) %b é: %b", primeiroValor, segundoValor, eLogico);
        /* Nota: O operador E lógico (&&) retorna verdadeiro apenas se ambos os valores forem verdadeiros. Caso contrário, retorna falso. */
        
		// Análise utilizando o operador lógico OU (||)
		boolean ouLogico = (primeiroValor || segundoValor);
        System.out.printf("%nO resultado de %b OU (||) %b é: %b", primeiroValor, segundoValor, ouLogico);
        /* Nota: O operador OU lógico (||) retorna verdadeiro se pelo menos um dos valores for verdadeiro. Retorna falso apenas se ambos forem falsos. */
        
		// Análise utilizando o operador lógico de negação ! (a exclamação é o identificador da negação na linguagem Java)
		boolean negacaoLogicaPrimeiroValor = !primeiroValor;
		boolean negacaoLogicaSegundoValor = !segundoValor;
		
        System.out.printf("%nO resultado da negação lógica de %b (!%b) é: %b", primeiroValor, primeiroValor, negacaoLogicaPrimeiroValor);
        System.out.printf("%nO resultado da negação lógica de %b (!%b) é: %b", segundoValor, segundoValor, negacaoLogicaSegundoValor);
        /* Nota: A negação lógica (!) inverte o valor booleano. Se o valor for verdadeiro, a negação será falsa e vice-versa. */
        
        // Análise utilizando o operador lógico OU Exclusivo ^ (o circunflexo é o identificador em Java)
        boolean operadorOuExclusivoLogico = (primeiroValor ^ segundoValor);
        System.out.printf("%nO resultado do OU Exclusivo (^) entre %b e %b é: %b", primeiroValor, segundoValor, operadorOuExclusivoLogico);
        /* Nota: O operador OU Exclusivo (^) retorna verdadeiro se exatamente um dos valores for verdadeiro. Se ambos forem iguais, o resultado é falso. */
        
        input.close();
	}
}
