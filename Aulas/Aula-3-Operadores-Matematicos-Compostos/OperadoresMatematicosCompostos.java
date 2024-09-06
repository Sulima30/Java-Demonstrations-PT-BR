/* Programa: Aula Operadores Aritméticos Compostos 
 * Autor: Sullivan Lima
 * Versão da Aula: 1.0
 * Ano: 2024
 * Linguagem Java. Versão 22
 * Descrição: Esta aula de operadores aritméticos compostos visa iniciar os conceitos da linguagem JAVA referentes a saídas e entradas de dados na tela do usuário envolvendo operações matemáticas. Aqui não colocamos funções de loop, condicionais, entre outros tratamentos. Apenas algo conceitual para entender quais operadores matemáticos compostos podemos utilizar.
*/
import java.util.Scanner;

public class OperadoresMatematicosCompostos {
	
	// No código atual, colocamos um tratamento para eventuais erros. Como o uso da estrutura condicional Se...Então (If...Else)
	// Optamos para que o usuário possa inserir o modificador e o modificado, para que possa entender o comportamento. Embora tenha uma explicação resumida, acredito que seja bom ter esse tipo de autocompreensão.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Usuário informará o número a ser modificado
        System.out.print("Digite o valor do número que será modificado: ");
        int numeroModificado = input.nextInt();

        // Usuário informará o valor que modificará o número anterior
        System.out.print("Digite o valor do número modificador: ");
        int numeroModificador = input.nextInt();

        // Operador de Adição Composta (+=) que somará o modificador ao número a ser modificado
        numeroModificado += numeroModificador;
        System.out.printf("%nNúmero Modificado com a adição composta (+=): %d", numeroModificado);

        // Operador de Subtração Composta (-=) que subtrairá o modificador ao número a ser modificado
        numeroModificado -= numeroModificador;
        System.out.printf("%nNúmero Modificado com a subtração composta (-=): %d", numeroModificado);

        // Operador de Multiplicação Composta (*=) que multiplicará o modificador ao número a ser modificado
        numeroModificado *= numeroModificador;
        System.out.printf("%nNúmero Modificado com a multiplicação composta (*=): %d", numeroModificado);

        // Operador de Divisão Composta (/=) que dividirá o modificador ao número a ser modificado
        if (numeroModificador != 0) {
            numeroModificado /= numeroModificador;
            System.out.printf("%nNúmero Modificado com a divisão composta (/=): %d", numeroModificado);
        } else {
            System.out.println("\nDivisão por zero não é permitida.");
        }

        // Operador de Divisão Composta Modular (%=) que aplicará a divisão modular
        if (numeroModificador != 0) {
            numeroModificado %= numeroModificador;
            System.out.printf("%nNúmero Modificado com a divisão composta modular: %d", numeroModificado);
        } else {
            System.out.println("\nDivisão modular por zero não é permitida.");
        }
        
        /*
          É interessante aqui nós termos a ideia que os operadores a seguir são bastante utilizados, até mesmo mais utilizados, para operações envolvendo baixo nível.
          Para fins didáticos e de que podemos fazer esse tipo de operação foi colocado para dar ciência da possibilidade */

        // Operador de Deslocamento Composto à Esquerda (<<=)
        numeroModificado <<= numeroModificador;
        System.out.printf("%nNúmero Modificado com o deslocamento composto à esquerda (<<=): %d", numeroModificado);
        
     // Operador de Deslocamento Composto à Direita (>>=)
        numeroModificado >>= numeroModificador;
        System.out.printf("%nNúmero Modificado com o deslocamento composto à direita (>>=): %d", numeroModificado);
        
     // Operador de Deslocamento Composto à Direita (>>>=) com preenchimento zero 
        numeroModificado >>>= numeroModificador;
        System.out.printf("%nNúmero Modificado com o deslocamento composto à direita com preenchimento zero (> >>=): %d", numeroModificado);
    
     // Operador E (AND) bit a bit composto &=
        numeroModificado &= numeroModificador;
        System.out.printf("%nNúmero Modificado com o operador E (AND) (&=): %d", numeroModificado);

     // Operador OU (OR) bit a bit composto |=
        numeroModificado |= numeroModificador;
        System.out.printf("%nNúmero Modificado com o operador OU (OR) (|=): %d", numeroModificado);
    
     // Operador OU OU, também comumente chamado de ou exclusivo (XOR) bit a bit composto ^=
        numeroModificado ^= numeroModificador;
        System.out.printf("%nNúmero Modificado com o operador OU..OU (XOR) (^=): %d", numeroModificado);
        
        input.close();
    }
}
