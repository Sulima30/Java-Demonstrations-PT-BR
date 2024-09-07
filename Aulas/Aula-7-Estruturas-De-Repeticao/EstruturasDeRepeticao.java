/* Programa: Aula Estrutura de Repetição usando FOR, WHILE e DO...WHILE
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula visa iniciar os conceitos da linguagem JAVA referentes a estrutura de repetição usando FOR, WHILE, DO...WHILE 
*/ 

// Apenas para relembrar. A classe abaixo é a classe do programa
public class EstruturasDeRepeticao {
	
	// Classe principal do programa
	public static void main(String[] args) {
		
		//As estruturas de repetição servem para que possamos repetir trechos do nosso programa. 
		// Temos algumas estruturas específicas e cada uma possui um uso bem definido
		
		// Estrutura de Repetição FOR (Para)
		// Nessa estrutura, nós sabemos de antemão quantas vezes precisaremos repetir um bloco de código
		// A Estrutura FOR é comumente utilizada sobre intervalos numéricos ou elementos de uma coleção
		
		// É normal nós visualizarmos a definição da condição como i 
		// Coloquei aqui numeroInteiro para que possa entender que na condição temos um ponto de início e um ponto de fim
		// Inicia em 0 e vai até a posição menor do que 5. 
		// Na prática, o código irá repetir: 0, 1, 2, 3 e 4 vezes 
		// 0 é o ponto de partida, início e 4 é o ponto final, pois na regra colocamos menor que 5.
		
		System.out.printf("%n%nTítulo do Bloco FOR%n%n");
		for(int numeroInteiro = 0; numeroInteiro < 5; numeroInteiro++) {
			// No código na linha acima, tem três pontos importantes para sabermos: Inicialização (quando inicializa a repetição) ; condição (O que fará com que se interrompa o código) ; Atualização que é a interação até chegar o ponto final de cada interação 
			System.out.println("Número Inteiro: " + numeroInteiro); 
			// Código que fará escrever na tela. Aparecerá 5 vezes na tela a frase, juntamente com o número a que se relaciona. 
		}
		
		
		// BLOCO WHILE 
		// O bloco de repetição WHILE (Enquanto) é usado para que seja executado o código até que uma determinada condição seja verdadeira
		// A condição é verificada antes de cada iteração
		// No WHILE nós não sabemos o ponto final. Ficará repetindo até que o ponto final definido seja atendido
		// Exemplo: imprimir na tela a frase até que a condição número 5 seja atendida. Mesmo exemplo do FOR, mas com uma ideia diferente.
		// Outro exemplo: Vamos supor que tenha um campo com uma palavra chave, tipo: Parar. Enquanto o usuário não digitar a palavra certa o código ficará executando pedidos... 
		
		
		int numeroInteiroWhile = 0; // Variável é número inteiro que será iterado. 
		
		System.out.printf("%n%nTítulo do Bloco WHILE%n%n");
		while (numeroInteiroWhile < 5) {
			
			System.out.println("Número impresso na tela: " + numeroInteiroWhile); // Frase será impressa até chegar em 5. Chegou e finaliza. 
			
			numeroInteiroWhile++; //A variável numeroInteiroWhile será incrementada até chegar a 5. Quando chegar no 5 para de executar. 
		}
		
		// O código acima faz a mesma coisa que o código FOR. Imprimirá na tela até chegar a posição 5, porém, no for sabemos exatamente o ponto de parada, e no WHILE não sabemos e o sistema vai iterando a variável até chegar ao ponto 5
		
		
		// DO...WHILE (Faça...Enquanto) 
		// O DO...WHILE é bastante semelhante ao WHILE.
		// No DO...WHILE (FAÇA...ENQUANTO) o bloco será executado pelo menos uma vez...
		
		
		int numeroInteiroDoWhile = 0; // Variável usando o DO...While e que marca o ponto de início da execução 
		
		System.out.printf("%n%nTítulo do Bloco DO...WHILE%n%n");
		do {
			System.out.println("Número impresso na tela usando o DO...While: " + numeroInteiroDoWhile); // Frase que imprimirá na tela durante a execução do bloco DO...WHILE
			
			numeroInteiroDoWhile++; // iteração 
			
		} while (numeroInteiroDoWhile < 5); // ponto de interrupção para executar pelo menos uma vez. 
		
	
	
	// É possível utilizarmos dentro dos laços, o comando chamado BREAK para sair do laço. Mas depende do intuito do projeto
	// Também podemos utilizar o comando CONTINUE para pular para próxima iteração. 
	// Também podemos fazer aninhamentos no código, assim como fazemos nas estruturas de controle condicionais
	
		
		System.out.printf("%n%nTítulo do Bloco FOR COM INTERRUPÇÃO %n%n");
		
		// Comando for de iteração para ser executado até o valor menor que 10 
		for (int inteiroForComandosBreakEContinue = 0; inteiroForComandosBreakEContinue < 10; inteiroForComandosBreakEContinue++) {
		
			if (inteiroForComandosBreakEContinue == 5) {
			break;
		} // O comando aqui é de parada, quando o laço de repetição atingir o número 5 o comando será executado interrompendo esse laço 
			
		if(inteiroForComandosBreakEContinue %2 == 0) {
			continue; // Aqui, se o comando for verdade o comando continue é executado e pulará para o restante do código. Passando assim para o próximo laço de iteração.
		}
		
		System.out.println("Número ímpar: "+inteiroForComandosBreakEContinue); // Aqui imprimirá na tela os valores que não são par e que também foi encerrado ao chegar no número 5. Ele será impresso 
	}
		
		// FOR aninhado para estruturas bidimensionais, indicado para matrizes.
		//Aqui existe uma relação de dependência onde cada laço de iteração interna 
		// Cada laço interno de iteração é executado também para cada laço externo da iteração. 
		// Na prática, executará os dois blocos sendo que um ponto controla o outro para que seja exibido na tela 
		
		System.out.printf("%n%nTítulo do Bloco FOR Aninhado %n%n");
		for (int inteiroAninhado1 = 0; inteiroAninhado1 < 3; inteiroAninhado1++) {
		    for (int inteiroAninhado2 = 0; inteiroAninhado2 < 3; inteiroAninhado2++) {
		        System.out.println("Inteiro Aninhado 1: " + inteiroAninhado1 + ", Inteiro Aninhado 2: " + inteiroAninhado2);
		    }
		}
	}
}
