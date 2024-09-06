/* Programa: Aula Estrutura de Controle Condicional: Se / Se...Então / Casos Certos (Switch)
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula visa iniciar os conceitos da linguagem JAVA referentes a estrutura de controle condicionais envolvendo os casos do Se / Se Então / Casos Certos (Switch) 
*/ 
import java.util.Scanner;

// Como sempre mencionamos, aqui temos a classe nome da aplicação;

/* Deixarei aqui uma nota breve sobre as estruturas de controle. 
 * As estruturas de controle são essenciais para desenvolver softwares e controlar suas execuções. 
 * Permitem tomar decisões, realizar outras operações e fazer inúmeras coisas legais 
 * Iniciaremos aqui as estruturas condicionais de controle que não envolvem repetição. Uma coisa por vez...*/

public class EstruturasDeControleCondicionais {
	
	// Classe principal que iniciará a execução e terão os métodos, funções etc.
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Nossa primeira estrutura condicional é o SE ou em inglês da linguagem IF
		// Note que apenas a estrutura IF é bem simples, porém, muito útil e veremos nos projetos posteriores!
		// dentro dos parenteses da estrutura IF colocamos a condicional (que podemos utilizar as operações relacionais ou lógicas
		
		
		int nota1; // Variável para testar a condição. Primeira nota do aluno.
		
		// Enunciado para o usuário digitar a primeira nota do aluno.
		
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = input.nextInt();
		
		// Início da estrutura condicional SE. Nossa primeira estrutura condiconal, básica e simples. 
		
		if (nota1 >= 7 ) {
			
			// caso a condição presente no parenteses seja verdadeira, o programa executará a linha que está logo abaixo deste comentário
			System.out.printf("%nA nota do aluno é: %d", nota1);
			// Note que se você digitar, e pode digitar por curiosidade, um valor abaixo de 7, o comando não executará.
			// Se você digitar algo diferente de um número inteiro, a aplicação dará erro.
			
		} // Fim da estrutura condicional do SE
		
		/* A estrutura acima, condicional com apenas o SE, é muito simples para algumas aplicações mais complexas. Então ela é usada com menos frequência.
		 * Vamos colocar abaixo uma estrutura mais elaborada. */
		
		
		// Essa estrutura condicional trabalha com duas opções de lógica. Uma para dizer que foi aprovado e outra para dizer que foi reprovado.
		// A primeira parte é igual ao IF que está acima, porém, por ela ter o else, faz com que exista pelo menos alguma mensagem caso a regra de aprovação não seja atendida. 
		
		
		
		// Início do bloco do IF...ELSE (Se...Então) 
		if (nota1 >= 7 ) {
			
			// Condição presente no parentese informará a mensagem abaixo, caso seja verdadeira. 
			
			System.out.printf("%n%nVocê digitou %d que é uma nota maior ou igual a 7. O aluno está aprovado.%n", nota1);
			
			// o ELSE tem um significado como: Então. Se não tirou uma nota maior ou igual a 7, então foi reprovado. 
		} else {
			
			// Caso não tenha sido atendida a condição verdadeira, teremos então uma condição falsa. 
			System.out.printf("%nVocê digitou %d que é uma nota menor que 7. O aluno está reprovado.%n", nota1);
			// Como nessa parte trabalha com a condição falsa, a frase é diferente, ou seja, não fica vazia igual ao primeiro uso do SE (IF)

		} // Fim do bloco do IF...ELSE (Se...Então)
		
		/*Observação para o bloco do IF...ELSE é que ele tem o parentese da condição analisada, e quatro chaves, sendo:
		 * Um par de chave é referente ao trecho do IF.
		 * O segundo par de chave é referente ao trecho do else. 
		 * O IF...ELSE pode ser utilizado de forma aninhada (um por dentro do outro) veremos isso em algum projeto depois...
		 */
		
		
		// Nossa terceira estrutura condicional é o IF...ELSE IF...ELSE (Se...Então Se...Então 
		// Essa estrutura já é aninhada... Por exemplo, checaremos duas condicionais e teremos três retornos de resposta
		// O primeiro retorno é se for verdadeira a análise condicional. 
		// O segundo retorno é análise de uma segunda condição se for verdadeira.
		// O terceiro retorno é análise de uma condição falsa. No caso, das duas anteriores sendo falsa.
		
		// Você verá que nesse trecho do código apareceça a palavra em recuperação caso a nota seja: 5 ou 6, por exemplo.
		
		if (nota1 >= 4 && nota1 < 7) {
			
			// Primeira condicional verdadeira. Se a nota for maior ou igual a 4 e menor que 7 o aluno está em recuperação
		    System.out.printf("%n%nVocê digitou %d, que é uma nota entre 4 e 7. O aluno está em recuperação.%n", nota1);
		    
		} else if (nota1 >= 7) {
			
			// Segunda condicional verdadeira. Se não está na primeira, porém a nota é maior ou igual a 7. Aluno aprovado. 
		    System.out.printf("%nVocê digitou %d, que é uma nota maior ou igual a 7. O aluno está aprovado.%n", nota1);
		    
		} else {
			// Terceira e última condicional. Se não está em nenhuma condicional verdadeira, é falso. Aluno Reprovado.
		    System.out.printf("%nVocê digitou %d, que é menor que 4. O aluno está reprovado.%n", nota1);
		}
		
		
		
		// Uma alternativa ao IF...ELSE IF...ELSE é utilizar o Switch. 
		// Abaixo colocaremos o SWITCH que é uma espécie de condicional feita por casos de uso. 
		// Switch deixa o código mais limpo e legível.
		// Farei apenas uma informação do valor que foi digitado em cada caso, para ter noção de como é que ele funciona.
		
		// Usando switch para determinar o valor da nota digitada. 
		// Ilustramos esse trecho de código apenas para fins didáticos e entender como funcionaria o switch. 
		// Cada caso especificado fará uma resposta para o usuário. Nesse caso, optamos para responder o próprio valor da nota digitada. 
		
		// Início do Switch. Temos 10 casos com respostas para cada um e um outro valor default de saída padrão.
        switch (nota1) {
            case 0:
                System.out.printf("%n%nVocê digitou %d.%n", nota1);
                break;
            case 1:
                System.out.printf("%nVocê digitou %d.", nota1);
                break;
            case 2:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;
            case 3:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;            
            case 4:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;                
            case 5:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;                
            case 6:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;               
            case 7:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;                
            case 8:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;                
            case 9:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;  
            case 10:
            	System.out.printf("%nVocê digitou %d.", nota1);
                break;
            
                // Valor padrão, caso não tenha sido digitado nenhum valor entre 0 e 10. 
            default:
                System.out.println("Digitou nenhum dos valores entre 0 até 10.%n%n");
        
        } // Fim da estrutura do Switch 
        
        // Nesse caso do Switch, apenas ilustramos como ele funciona. Em projetos vamos abordar ele de forma mais estruturada. 
        
		
	}

}
