/* Programa: Aula Operadores Relacionais 
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula de operadores relacionais visa explicar como usar operadores de comparação entre variáveis numéricas. O programa permite a entrada de valores pelo usuário e exibe os resultados das comparações.
*/

import java.util.Scanner;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Interação com o usuário para inserir dois números e realizar a comparação com operador relacionais
		
		System.out.print("Digite o primeiro número a ser comparado: ");
		int primeiroNumero = input.nextInt();
		
		System.out.print("Digite o segundo número a ser comparado: ");
		int segundoNumero = input.nextInt();
		
		// Nosso primeiro operador relacional será o de igualdade. Vamos comparar os números e armazenar o resultado na variável chamada igual do tipo booleano.
		boolean igual = (primeiroNumero == segundoNumero);
		
		// Usamos %b para poder dizer que é um tipo booleado. A resposta será verdadeira quando for True e será falsa quando for False.
		// Não tratamos o True e o False para vir resposta em português, mas em algum projeto trataremos. 
		System.out.printf("%nO Primeiro Número: %d é igual ao Segundo Número: %d? %b", primeiroNumero, segundoNumero, igual);
		
		
		// Nosso segundo operador relacional será o de diferente. Vamos comparar os números e armazenar o resultado na variável chamada diferente também do tipo booleano.	
		boolean diferente = (primeiroNumero != segundoNumero);
		
		// Usamos %b para poder dizer que é um tipo booleado. A resposta será verdadeira quando for True e será falsa quando for False.
		// Não tratamos o True e o False para vir resposta em português, mas em algum projeto trataremos. 
		System.out.printf("%nO Primeiro Número: %d é diferente do Segundo Número: %d? %b", primeiroNumero, segundoNumero, diferente);
		
		
		// Nosso Terceiro operador relacional será o de maior que. Vamos comparar os números e armazenar o resultado na variável chamada diferente também do tipo booleano.	
		boolean primeiroNumeroMaiorQueSegundoNumero = (primeiroNumero > segundoNumero);
		
		// Usamos %b para poder dizer que é um tipo booleado. A resposta será verdadeira quando for True e será falsa quando for False.
		// Não tratamos o True e o False para vir resposta em português, mas em algum projeto trataremos. 
		System.out.printf("%nO Primeiro Número: %d é maior que o Segundo Número: %d? %b", primeiroNumero, segundoNumero, primeiroNumeroMaiorQueSegundoNumero);
		
		
		// Nosso Quarto operador relacional será o de menor que. Vamos comparar os números e armazenar o resultado na variável chamada diferente também do tipo booleano.	
		boolean primeiroNumeroMenorQueSegundoNumero = (primeiroNumero < segundoNumero);
		
		// Usamos %b para poder dizer que é um tipo booleado. A resposta será verdadeira quando for True e será falsa quando for False.
		// Não tratamos o True e o False para vir resposta em português, mas em algum projeto trataremos. 
		System.out.printf("%nO Primeiro Número: %d é menor que o Segundo Número: %d? %b", primeiroNumero, segundoNumero, primeiroNumeroMenorQueSegundoNumero);
		
		
		// Nosso Quinto operador relacional será o de maior ou igual. Vamos comparar os números e armazenar o resultado na variável chamada diferente também do tipo booleano.	
		boolean primeiroNumeroMaiorIgualSegundoNumero = (primeiroNumero >= segundoNumero);
		
		// Usamos %b para poder dizer que é um tipo booleado. A resposta será verdadeira quando for True e será falsa quando for False.
		// Não tratamos o True e o False para vir resposta em português, mas em algum projeto trataremos. 
		System.out.printf("%nO Primeiro Número: %d é maior ou igual que o Segundo Número: %d? %b", primeiroNumero, segundoNumero, primeiroNumeroMaiorIgualSegundoNumero);
		
		
		// Nosso Sexto operador relacional será o de menor ou igual. Vamos comparar os números e armazenar o resultado na variável chamada diferente também do tipo booleano.	
		boolean primeiroNumeroMenorIgualSegundoNumero = (primeiroNumero <= segundoNumero);
		
		// Usamos %b para poder dizer que é um tipo booleado. A resposta será verdadeira quando for True e será falsa quando for False.
		// Não tratamos o True e o False para vir resposta em português, mas em algum projeto trataremos. 
		System.out.printf("%nO Primeiro Número: %d é menor ou igual que o Segundo Número: %d? %b", primeiroNumero, segundoNumero, primeiroNumeroMenorIgualSegundoNumero);
		
		input.close();
	}

}
