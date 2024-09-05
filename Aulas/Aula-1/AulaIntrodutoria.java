/* Programa: Aula Introdutória
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula introdutória visa iniciar os conceitos da linguagem JAVA referentes a saídas e entradas de dados na tela do usuário.
*/ 
import java.util.Scanner;

// Aqui temos a classe chamada AulaIntrodutoria.
// O nome da classe é o próprio nome do arquivo. 
// Quando pulamos uma linha, ou seja, deixamos ela em branco,temos como intuito tornar o código mais agradável de ver.

public class AulaIntrodutoria {

	/* Método main que inicia a execução do aplicativo. É o método principal que executará o aplicativo. Inicia com chave { e encerra com chaves }*/
	
	public static void main(String[] args) {
		
		// O Método que está abaixo é para exibir algo, um texto ou um número, na tela do usuário. Temos várias formas de usar esse método e a primeira é com println.
		// Usar o println faz com que apareça algo na tela do usuário. Faz uma quebra de linha como se fosse um enter.
		// Caso seja escrito algo após esse método, será iniciado em outra linha.
		System.out.println("Primeiro Programa em JAVA");
		
		// O método print sem o ln no final, faz com o que o cursor fique na mesma linha que em que texto aparece. 
		System.out.print("O famoso: Hello World! ");
		
		// Aqui utilizamos o mesmo comando print (sem o ln no final) para utilizar barra invertida e usar caracteres como aspas e o \n para mostrar como pular uma linha. 
		System.out.print("Continuando com essa frase para demonstrar o comportamento do print sem o \"ln\".\n");
		
		// O comando printf serve para formatar a cadeia de caracteres exibidos na tela
		// O primeiro argumento utiliza uma string de formato que pode ser um texto fixo e especificadores de formato.
		// Cada especificador de formato %s ocupa um lugar para um valor e tipo de saída dos dados. O %n faz a função de pular uma linha assim como o \n.
		System.out.printf("%s%n%s%s%s","Quando utilizamos o printf podemos passar múltiplos argumentos: ", "Argumento 1, ", "Argumento 2, ", "Outros Argumentos...");
		
		// Exemplo de um trecho de código que exibe informações na tela e pede dados ao usuário.
		System.out.println("Agora, dando continuidade, iremos trabalhar com a inserção de dados pelo usuário. Trabalharemos com outro método.");
		
		// Método de uso do Scanner para pedir dados ao usuário, armazenar em memória e devolver a saída do que foi digitado.
		
		@SuppressWarnings("resource")
		Scanner input  = new Scanner(System.in);
		
		// Definimos uma variável que utilizaremos para armazenar a palavra digitada.
		String entradaDePalavra; 
		
		// Comando de saída de dados na tela já mostrado acima, mas reforçando: print sem o ln para pular linha. Diz onde o usuário digitará a palavra
		System.out.print("Digite uma palavra qualquer: ");
		
		// Chamada da variável que será digitada pelo usuário.
		entradaDePalavra = input.next();
		
		// Frase que indica a palavra digitada pelo usuário.
		System.out.printf("Sua palavra digitada foi: %s%n", entradaDePalavra);
				
	} // chave que fecha o método main

} // chave que encerra a classe AulaIntrodutoria
