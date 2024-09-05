# Aula Introdutória – Linguagem JAVA

Em nossa primeira aula sobre a linguagem de programação tão famosa e mundialmente conhecida, abordaremos os conceitos iniciais da sintaxe, ou seja, da forma que a linguagem é escrita. Assim como qualquer outra linguagem de programação, podemos utilizar IDEs (Integrated Development Environment).

## O que é uma IDE?

IDE é um Ambiente de Desenvolvimento Integrado que facilita a construção e desenvolvimento de softwares. As IDEs simplificam o processo de escrita dos códigos de qualquer linguagem de programação, possibilitando que possamos escrever, testar e depurar o código.

### Principais Componentes de uma IDE:

- **Editor de Código**: Serve para que os desenvolvedores escrevam seus códigos.
- **Compilador/Interpretador**: Traduza o código escrito ou interpreta o código de execução direta.
- **Depurador**: Ferramenta que permite executar o código, inspecionar variáveis e estados do programa, identificar e corrigir erros (bugs).
- **Ferramentas de Build (Construção)**: Automatizam o processo de compilação do código, incluindo a compilação de diferentes módulos, a ligação de bibliotecas, criação de executáveis, etc.
- **Gerenciamento de Projeto**: Organiza os arquivos com os códigos, dependências de recursos e facilita a navegação e o gerenciamento do software.
- **Controle de Versão**: Integração com sistemas de controle de versão como o GIT, funcionando como um rastreador de mudanças realizadas no código.
- **Outros Recursos**: Algumas IDEs contam com ferramentas de refatoramento de código, formatação automática, integração com bancos de dados, perfis de desempenho, etc.

**Exemplos de IDEs**: Visual Studio, Eclipse, IntelliJ IDEA, Xcode, Visual Studio Code.

## Escrevendo Nosso Primeiro Programa

Vamos escrever nosso primeiro programa! Cada trecho de código terá comentários para explicar o programa, de maneira a deixar intuitivo como chegamos ao código e qual o objetivo ou função dele.

### Comentários em Java

- **Utilizando `//`**: Comentário de linha única. Tudo que estiver após o `//` é ignorado pelo compilador. Pode ser usado para explicar algo antes ou após um método/função.

  ```java
  // Comentário em linha

- **Utilizando `/* */`**: Utilizar `/* */ ` faz com que o comentário vire um bloco de código. Ou seja, ocupará múltiplas linhas. Exemplo de um bloco de comentário:

  ```java
  /* 
  * Comentário em bloco de código
  * Ocupando múltiplas linhas 
  */
  
- **Utilizando `/** */ (Javadoc)`**: Utilizar `/** e */  ` faz com que o comentário proporcione o desenvolvedor gerar documentação HTML. Geralmente é usado para documentar classes, métodos e campos. As tags Javadoc como @param, @return, e @see são usadas para fornecer informações adicionais:

  ```java
  /**
   * Comentário Javadoc
   * @param parâmetro descrição
   * @return descrição
   */

Comentário são ótimos para explicar o código e torná-lo mais compreensível, legível para que um próximo desenvolvedor saiba o que foi feito ou até mesmo você que fez o código possa se lembrar do que fez, qual foi a intenção etc.

## Dicas e Observações

- **Legibilidade do Código**: Utilize linhas em branco, espaços e tabs para melhorar a legibilidade do código. Isso ajuda a tornar o código mais limpo e mais fácil de entender.

- **Nomenclatura de Classes**: Em Java, `class` é uma palavra reservada utilizada para definir classes. Os nomes das classes devem começar com uma letra maiúscula e seguir a convenção de CamelCase (exemplo: `AulaIntrodutoria`). Evite usar letras minúsculas para nomes de classes.

- **Nomes de Classes**: Nomes de classes podem incluir letras, dígitos, sublinhados e o caractere `$`. No entanto, não podem iniciar com dígitos e não devem conter espaços. Exemplos válidos incluem `Aula1`, `Aula_Um`, `$Aula1`, e `AulaUm`. Escolha nomes que sejam claros e descritivos.

- **Tipo de Dados e Distinção de Maiúsculas e Minúsculas**: Java é uma linguagem fortemente tipada e faz distinção entre maiúsculas e minúsculas. Certifique-se de usar a capitalização correta para evitar erros.

- **Estrutura de Classe**: O corpo de uma classe começa com `{` e termina com `}`. Todos os métodos e variáveis pertencentes à classe devem estar dentro desses colchetes.

- **Finalização de Instruções**: Em Java, cada instrução deve terminar com um ponto e vírgula (`;`). A omissão do ponto e vírgula resultará em erros de compilação.

- **Caracteres de Escape**: Use caracteres de escape para incluir caracteres especiais em strings ou para formatar a saída. Exemplos de caracteres de escape:
  - `\n` para pular uma linha
  - `\t` para realizar uma tabulação horizontal
  - `\\` para incluir uma barra invertida
  - `\"` para incluir aspas

- **Compilação e Execução**: Para compilar um programa Java, abra o terminal na pasta onde o arquivo `.java` está localizado e digite `javac NomeDoArquivo.java`. Isso gerará um arquivo `.class`. Para executar o programa, use o comando `java NomeDoArquivo` (não inclua a extensão `.java`).

Essas dicas ajudarão a manter seu código Java organizado e a evitar erros comuns durante a programação.

