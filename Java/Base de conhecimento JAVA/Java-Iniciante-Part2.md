# Java iniciante - part2

## Funções matemáticas

Em Java, as funções matemáticas são realizadas por meio das classes e métodos da biblioteca padrão da linguagem. Essas classes fornecem uma variedade de funções matemáticas para realizar operações comuns, como cálculos aritméticos, exponenciação, raiz quadrada e outras operações matemáticas avançadas. Vou descrever algumas das principais classes e métodos relacionados a funções matemáticas em Java:

1. **Classe `Math`**: A classe `java.lang.Math` fornece uma ampla gama de funções matemáticas estáticas que podem ser usadas para executar cálculos matemáticos. Alguns dos métodos mais comuns incluem:

   - `Math.abs(x)`: Retorna o valor absoluto de `x`.
   - `Math.sqrt(x)`: Retorna a raiz quadrada de `x`.
   - `Math.pow(x, y)`: Retorna `x` elevado à potência `y`.
   - `Math.exp(x)`: Retorna o valor exponencial de `x`.
   - `Math.log(x)`: Retorna o logaritmo natural de `x`.
   - `Math.sin(x)`, `Math.cos(x)`, `Math.tan(x)`: Funções trigonométricas.
   - `Math.max(x, y)`, `Math.min(x, y)`: Retorna o máximo e o mínimo entre `x` e `y`, respectivamente.

2. **Classe `Random`**: A classe `java.util.Random` é usada para gerar números aleatórios. Ela pode ser usada para realizar operações matemáticas que envolvem valores aleatórios, como gerar números inteiros ou de ponto flutuante aleatórios.

   - `nextInt(n)`: Gera um número inteiro aleatório entre 0 (inclusive) e n (exclusivo).
   - `nextDouble()`: Gera um número de ponto flutuante aleatório entre 0 (inclusive) e 1 (exclusivo).

3. **Classe `BigDecimal`**: Para operações matemáticas precisas com números de ponto flutuante, você pode usar a classe `java.math.BigDecimal`. Ela permite realizar cálculos com precisão arbitrária e é especialmente útil quando a precisão é crítica, como em aplicações financeiras.

Além das classes mencionadas acima, Java também suporta operadores matemáticos padrão, como `+`, `-`, `*` e `/`, que podem ser usados em expressões matemáticas em código.

Aqui está um exemplo simples de como usar algumas dessas funções matemáticas em Java:

```java
public class ExemploMatematica {
    public static void main(String[] args) {
        int x = 5;
        int y = -10;

        System.out.println("Valor absoluto de x: " + Math.abs(x));
        System.out.println("Raiz quadrada de x: " + Math.sqrt(x));
        System.out.println("x elevado a y: " + Math.pow(x, y));

        // Gerando um número aleatório entre 0 e 1
        double numeroAleatorio = Math.random();
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}
```

Lembre-se de que, ao usar funções matemáticas em Java, você deve estar ciente dos tipos de dados que está manipulando para evitar erros de arredondamento e precisão, especialmente ao lidar com números de ponto flutuante.

## Formatação de texto e variáveis em Java

Em Java, a formação de texto e o uso de variáveis em conjunto com a impressão (exibição) de informações podem ser realizados principalmente através das classes `System.out` e `System.err`, que são usadas para saída padrão e saída de erros, respectivamente. O método mais comum para imprimir texto e variáveis em Java é o `System.out.println()`. Aqui está como você pode formar texto e usar variáveis com esse método:

1. **Concatenação de Strings:**

   Você pode usar o operador de concatenação de strings (`+`) para combinar texto com variáveis. Por exemplo:

   ```java
   String nome = "João";
   int idade = 30;
   
   System.out.println("Nome: " + nome + ", Idade: " + idade);
   ```

   Neste exemplo, estamos concatenando as strings "Nome: ", "João", ", Idade: " e o valor da variável `idade` para formar uma única string que é impressa no console.

2. **Formatação de Strings:**

   Você também pode usar formatação de strings usando a classe `String.format()` ou o método `System.out.printf()`. Isso permite que você controle a aparência dos valores impressos. Por exemplo:

   ```java
   String nome = "João";
   int idade = 30;
   
   System.out.printf("Nome: %s, Idade: %d%n", nome, idade);
   ```

   Neste exemplo, usamos `%s` e `%d` como marcadores de posição para a variável `nome` (string) e `idade` (inteiro), respectivamente. O `%n` é usado para uma nova linha.

3. **Uso de Variáveis Diretamente:**

   Em alguns casos simples, você pode imprimir variáveis diretamente sem concatená-las com texto. Por exemplo:

   ```java
   int numero = 42;
   System.out.println("O número é: " + numero);
   ```

   Você pode simplesmente imprimir a variável `numero` sem adicionar texto adicional se isso for suficiente para a saída.

4. **Escape Sequences:**

   Você pode usar sequências de escape, como `\n` para nova linha ou `\t` para tabulação, para formatar sua saída. Por exemplo:

   ```java
   System.out.println("Linha 1\nLinha 2");
   ```

   Isso imprimirá duas linhas no console, uma após a outra.

Lembre-se de que, ao usar variáveis em texto impresso, é importante garantir que os tipos e os formatos estejam corretos para evitar erros em tempo de execução. Além disso, o uso adequado de espaços e caracteres especiais pode melhorar a legibilidade da saída.

## Classe Scanner;

A Classe `Scanner` no Java, faz parte do pacote `java.util` e é usada para ler dados de entrada do usuário ou de fontes de dados, como arquivos ou streams, de forma simples e eficiente. Ela foi introduzida no Java 5 para facilitar a leitura de dados em diversos formatos.

A classe `Scanner` oferece métodos para analisar e ler diferentes tipos de dados, como números inteiros, números de ponto flutuante, strings e outros tipos primitivos. Ela é uma alternativa flexível e poderosa para a leitura de entrada, especialmente quando se lida com entradas do usuário.

Aqui estão alguns conceitos e funcionalidades importantes da classe `Scanner`:

1. **Criação de Instância**: Para usar a classe `Scanner`, você precisa criar uma instância dela, geralmente associando-a a uma fonte de dados, como um objeto `InputStream` (para entrada de console ou de arquivo) ou um objeto `String` (para análise de strings). Por exemplo:

```java
Scanner scanner = new Scanner(System.in); // Para entrada do console
```

2. **Métodos de Leitura**: A classe `Scanner` fornece vários métodos para ler diferentes tipos de dados, como `nextInt()`, `nextDouble()`, `nextLine()`, entre outros. Você pode escolher o método apropriado com base no tipo de dado que deseja ler.

```java
int numero = scanner.nextInt();
String texto = scanner.nextLine();
double decimal = scanner.nextDouble();
```

3. **Delimitadores**: Você pode configurar delimitadores personalizados para dividir os dados de entrada em tokens. O delimitador padrão é o espaço em branco.

```java
scanner.useDelimiter(",");
```

4. **Verificação de Disponibilidade**: A classe `Scanner` também oferece métodos para verificar se há mais dados disponíveis na entrada, como `hasNextInt()`, `hasNextDouble()`, etc., o que ajuda a evitar erros de leitura.

```java
if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
} else {
    System.out.println("Entrada inválida.");
}
```

5. **Fechamento**: É importante fechar um objeto `Scanner` quando você terminar de usá-lo para liberar recursos e evitar vazamentos de memória.

```java
scanner.close();
```

A classe `Scanner` é uma ferramenta versátil para lidar com entrada de dados em Java, tornando mais fácil a interação com o usuário ou a leitura de informações de arquivos. No entanto, é importante lidar com exceções, como `InputMismatchException` ou `NoSuchElementException`, que podem ser lançadas se os dados de entrada não corresponderem ao tipo esperado ou se não houver mais dados disponíveis.

### O método next().charAt(0) 

O método `next().charAt(0)` é uma combinação de métodos da classe `Scanner` e da classe `String` em Java, frequentemente utilizada para obter o primeiro caractere de uma entrada de texto fornecida pelo usuário.

Aqui está como funciona:

1. `next()`: O método `next()` da classe `Scanner` lê a próxima sequência de caracteres até encontrar um delimitador (por padrão, um espaço em branco) e retorna essa sequência como uma string. Isso significa que ele captura a primeira palavra ou token da entrada.

2. `charAt(0)`: Após obter a string usando `next()`, você pode usar o método `charAt(0)` da classe `String` para acessar o primeiro caractere dessa string. O índice `0` indica o primeiro caractere na string.

Juntando esses dois métodos, você pode ler o primeiro caractere da primeira palavra da entrada do usuário. Aqui está um exemplo:

```java
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next(); // Lê a primeira palavra

        if (!palavra.isEmpty()) {
            char primeiroCaractere = palavra.charAt(0); // Obtém o primeiro caractere
            System.out.println("O primeiro caractere da palavra é: " + primeiroCaractere);
        } else {
            System.out.println("Nenhuma palavra foi digitada.");
        }

        scanner.close();
    }
}
```

Neste exemplo, o programa solicita ao usuário que digite uma palavra. Ele usa `next()` para ler a primeira palavra digitada e, em seguida, usa `charAt(0)` para obter o primeiro caractere dessa palavra. O programa verifica se a entrada não está vazia para evitar exceções.

## Operações bit a bit

As operações bit a bit em Java envolvem manipular os valores individuais de bits em números inteiros (ou outros tipos de dados que podem ser representados como sequências de bits). Essas operações são realizadas usando operadores bit a bit, que atuam em cada bit individual de dois operandos. Existem vários operadores bit a bit em Java, incluindo AND, OR, XOR, deslocamento à esquerda e deslocamento à direita. Vamos dar uma olhada em cada um deles e em suas aplicações:

1. Operador Bitwise AND (&):
   - Símbolo: &
   - Descrição: Realiza uma operação AND bit a bit entre os bits de dois números. O resultado é 1 apenas se ambos os bits correspondentes forem 1.
   - Aplicações: 
     - Mascaramento de bits: Usado para extrair ou definir valores específicos em um número. Por exemplo, pode ser usado para verificar se um bit está definido em uma representação de configuração de flags.
   
2. Operador Bitwise OR (|):
   - Símbolo: |
   - Descrição: Realiza uma operação OR bit a bit entre os bits de dois números. O resultado é 1 se pelo menos um dos bits correspondentes for 1.
   - Aplicações:
     - Combinação de flags: Pode ser usado para combinar várias configurações de flags em uma única representação de bits.

3. Operador Bitwise XOR (^):
   - Símbolo: ^
   - Descrição: Realiza uma operação XOR bit a bit entre os bits de dois números. O resultado é 1 se exatamente um dos bits correspondentes for 1.
   - Aplicações:
     - Troca de valores: Pode ser usado para trocar os valores de duas variáveis sem usar uma variável temporária.
     - Criptografia: Algoritmos de criptografia usam operações XOR para ofuscar dados.

4. Operadores de Deslocamento à Esquerda (<<) e à Direita (>>):
   - Símbolos: << e >>
   - Descrição: Deslocam os bits de um número para a esquerda ou para a direita, respectivamente, preenchendo os bits vazios com zeros.
   - Aplicações:
     - Multiplicação e divisão por potências de 2: Deslocar à esquerda é equivalente a multiplicar por 2, e deslocar à direita é equivalente a dividir por 2.
     - Manipulação de valores de ponto fixo: Em cálculos financeiros e de precisão fixa, os deslocamentos podem ser usados para representar frações.

Exemplo de operações bit a bit em Java:

```java
int a = 5;    // Representação binária: 0101
int b = 3;    // Representação binária: 0011

int resultadoAnd = a & b;  // Resultado: 0001 (1 em decimal)
int resultadoOr = a | b;   // Resultado: 0111 (7 em decimal)
int resultadoXor = a ^ b;  // Resultado: 0110 (6 em decimal)

int deslocamentoEsquerda = a << 2;  // Resultado: 010100 (20 em decimal)
int deslocamentoDireita = a >> 1;   // Resultado: 0010 (2 em decimal)
```

As operações bit a bit são úteis em situações onde você precisa realizar manipulações de baixo nível nos dados, como programação de hardware, otimização de código e criptografia, entre outras aplicações específicas. Elas permitem um controle preciso sobre os bits individuais dos números e são uma parte importante da caixa de ferramentas de um desenvolvedor Java quando se trata de manipulação de dados binários.

## Comentários

Em Java, comentários são partes do código que são ignoradas pelo compilador e não têm nenhum impacto no funcionamento do programa. 

1. Comentários de Linha Única:
   Você pode usar comentários de linha única para adicionar explicações curtas em uma única linha. Eles começam com duas barras "//" e continuam até o final da linha. Veja um exemplo:

   ```java
   // Este é um comentário de linha única
   int idade = 25; // Você pode colocar comentários no final de uma linha de código
   ```

2. Comentários de Múltiplas Linhas:
   Os comentários de várias linhas são úteis quando você precisa adicionar explicações mais longas ou quando deseja desativar temporariamente um bloco de código. Eles começam com "/*" e terminam com "*/". Veja um exemplo:

   ```java
   /*
   Este é um comentário de várias linhas
   Pode ter várias linhas de texto
   Útil para documentar blocos de código
   */
   int numero = 42;
   ```

3. Comentários de Documentação (Javadoc):
   Os comentários de documentação são usados para criar documentação automaticamente a partir do código-fonte. Eles começam com "/**" e terminam com "*/". Eles são usados principalmente para documentar classes, métodos e campos, permitindo que ferramentas como o Javadoc gerem documentação legível para humanos a partir desses comentários. Veja um exemplo:

   ```java
   /**
    * Esta é uma classe de exemplo que demonstra o uso de comentários de documentação.
    * Ela não faz nada de significativo.
    */
   public class MinhaClasse {
       /**
        * Este é um método de exemplo que não faz nada.
        * @param parametro Um parâmetro de exemplo.
        * @return Sempre retorna zero.
        */
       public int meuMetodo(int parametro) {
           return 0;
       }
   }
   ```

É uma boa prática de programação usar comentários para tornar seu código mais legível e compreensível para outros desenvolvedores.
