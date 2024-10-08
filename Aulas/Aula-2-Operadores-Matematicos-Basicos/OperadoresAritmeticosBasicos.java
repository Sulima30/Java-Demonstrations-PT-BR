/* Programa: Aula Operadores Aritméticos
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula de operadores visa iniciar os conceitos da linguagem JAVA referentes a saídas e entradas de dados na tela do usuário envolvendo operações matemáticas. Aqui não colocamos funções de loop, condicionais, entre outros tratamentos. Apenas algo conceitual para entender quais operadores matemáticos podemos utilizar.
*/
import java.util.Scanner; //Classe Scanner que servirá para ler as entrada do usuário

public class OperadoresAritmeticosBasicos {
	
	public static void main (String [] args) {
		
		//Título de boas-vindas para o programa que apresentará os operadores aritméticos em java
		
		System.out.println("Olá, vamos a segunda aula sobre Java!");
		
		Scanner input = new Scanner (System.in);
		
		// Declaração das variáveis para utilização durante a execução do programa
		
		int numero1;
		int numero2;
		int soma;
		int multiplicacao;
		int subtracao;
		int divisao;
		int modulo;
		
		// Frase de explicação de quais números serão admitidos
		
		System.out.print("Você deverá digitar apenas números inteiros!\n\n");
		
		// Frases que indicam para digitar cada número
		
		System.out.print("Digite o primeiro número: ");
		
		// Primeira opção para fazer a leitura do número digitado
		numero1  = input.nextInt();
		System.out.print("Digite o segundo número: ");
		
		// Segunda opção para fazer a leitura do número digitado
		numero2 = input.nextInt();
		
		// Os números serão armazenados para dar o resultado da soma entre os números
		soma = (numero1 + numero2);
		// Resultado sendo uma adição (soma dos números digitados)
		System.out.printf("%nA soma entre os números digitados é: %d%n", soma);
		
		// Os números serão armazenados para dar o resultado da subtração entre os números
		subtracao = (numero1 - numero2);
		// Resultado sendo uma subtração (dedução entre os números)
		System.out.printf("%nA subtração entre os números digitados é: %d%n", subtracao);
		
		// Os números serão armazenados para dar o resultado da multiplicação entre os números
		multiplicacao = (numero1 * numero2);
		// Resultado sendo uma multiplicação (o produto de um com o outro)
		System.out.printf("%nA multiplicação entre os números digitados é: %d%n", multiplicacao);
		
		// Os números serão armazenados para dar o resultado da divisão entre os números.
		// Aqui não fizemos nenhum tratamento para trabalhar com essa divisão, pois dependeria de outros fatores ainda não estudados e para não confundir você não colocamos aqui!
		// Dessa forma, se colocarmos um valor, por exemplo: 5 / 2 o resultado será um número inteiro 2. Evite colocar o segundo número um 0, caso contrário dará ERRO!!!!
		
		divisao = (numero1 / numero2);
		
		// Resultado sendo uma divisão dos números informados. 
		// Aqui não tratamos as informações, colocamos apenas o operador aritmético. Assim, descarta a parte decimal.
		// Depois, em algum projeto faremos o tratamento correto.Para fins didáticos e não embaralhar sua cabeça, foque apenas no operador em si.
		System.out.printf("%nA divisão entre os números digitados é: %d%n", divisao);
		
		
		// Os números serão armazenados para dar o resultado da divisão modular (módulo) entre os números.
		// Aqui não fizemos nenhum tratamento para trabalhar com esse módulo, pois dependeria de outros fatores ainda não estudados e para não confundir você não colocamos aqui!
		// Dessa forma, evite colocar o segundo número um 0, caso contrário dará ERRO!!!!
		modulo = (numero1 % numero2);
		
		// Resultado sendo uma divisão modular dos números informados. 
		// Aqui não tratamos as informações, colocamos apenas o operador aritmético. 
		// Depois, em algum projeto faremos o tratamento correto.Para fins didáticos e não embaralhar sua cabeça, foque apenas no operador em si.
		System.out.printf("%nA divisão modular entre os números digitados é: %d%n", modulo);
	}
}
