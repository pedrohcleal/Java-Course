# Java Iniciante

## Tipos de dados Java

O Java é uma linguagem de programação fortemente tipada e possui diversos tipos de dados primitivos (primitive data types) que representam os valores mais básicos e fundamentais em um programa. Aqui estão os oito tipos de dados primitivos no Java:

1. **byte**: O tipo `byte` é um tipo de dados de 8 bits e é usado para armazenar valores inteiros pequenos. O intervalo de valores possíveis para um `byte` vai de -128 a 127.

2. **short**: O tipo `short` é um tipo de dados de 16 bits e é usado para armazenar valores inteiros um pouco maiores que o `byte`. O intervalo de valores possíveis para um `short` vai de -32,768 a 32,767.

3. **int**: O tipo `int` é um tipo de dados de 32 bits e é amplamente utilizado para armazenar valores inteiros. O intervalo de valores possíveis para um `int` vai de aproximadamente -2 bilhões a 2 bilhões.

4. **long**: O tipo `long` é um tipo de dados de 64 bits e é usado para armazenar valores inteiros muito grandes. O intervalo de valores possíveis para um `long` vai de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

5. **float**: O tipo `float` é um tipo de dados de ponto flutuante de precisão simples, usado para armazenar números decimais. Ele é usado quando a precisão não é tão crítica. O `float` tem 32 bits de tamanho.

6. **double**: O tipo `double` é um tipo de dados de ponto flutuante de precisão dupla, usado para armazenar números decimais com alta precisão. É mais comumente usado para operações envolvendo números decimais. O `double` tem 64 bits de tamanho.

7. **char**: O tipo `char` é usado para representar caracteres individuais. Ele é armazenado como um valor numérico que corresponde ao código Unicode do caractere. Um `char` tem 16 bits de tamanho.

8. **boolean**: O tipo `boolean` é usado para representar valores booleanos, ou seja, verdadeiro (`true`) ou falso (`false`). Ele é frequentemente usado para controle de fluxo e tomada de decisões em programas.

É importante notar que esses tipos de dados primitivos são diferentes dos objetos em Java. Eles são eficientes em termos de espaço de memória e operações de baixo nível, o que os torna úteis em situações onde a eficiência é importante. Além disso, Java também suporta tipos de dados não primitivos, conhecidos como tipos de referência, que são criados a partir de classes e oferecem funcionalidades mais avançadas.

## Tipos de Dados de Referência (Reference Data Types)

Em Java, os "Tipos de Dados de Referência" (Reference Data Types) são um dos dois principais tipos de dados, sendo o outro tipo os "Tipos de Dados Primitivos" (Primitive Data Types). Os Tipos de Dados de Referência representam objetos e referências a objetos em vez de valores primitivos simples. Aqui estão alguns exemplos de Tipos de Dados de Referência em Java:

1. **Classe**: Classes são tipos de dados de referência definidos pelo usuário. Quando você cria uma classe personalizada, você está criando um novo tipo de dado de referência. Por exemplo, se você criar uma classe chamada `Pessoa`, você pode criar instâncias dessa classe usando o operador `new`, como `Pessoa pessoa = new Pessoa();`.

2. **Array**: Os arrays são Tipos de Dados de Referência que permitem armazenar múltiplos valores do mesmo tipo em uma estrutura unidimensional ou multidimensional. Por exemplo, `int[] numeros = new int[5];` cria um array de inteiros com 5 elementos.

3. **Interface**: Interfaces são tipos de dados de referência que definem contratos para classes que as implementam. Você pode criar uma referência a uma interface e atribuir a ela uma instância de qualquer classe que implemente essa interface. Por exemplo, `List<String> lista = new ArrayList<>();` cria uma lista que é uma referência a uma interface `List` e é implementada pela classe `ArrayList`.

4. **Enumeração (Enum)**: Enums são tipos de dados de referência que representam conjuntos fixos de valores. Eles são frequentemente usados para representar constantes em um domínio específico. Por exemplo, você pode ter um enum para representar os dias da semana.

5. **String**: A classe `String` é um tipo de dado de referência que representa sequências de caracteres. Strings são amplamente utilizadas em Java para armazenar texto.

6. **Classe Wrapper**: As classes wrapper são usadas para encapsular tipos primitivos em objetos. Por exemplo, `Integer`, `Double`, `Boolean`, etc. Elas são usadas quando você precisa de um objeto em vez de um valor primitivo.

7. **Classe de Coleção**: Java fornece uma série de classes de coleção, como `ArrayList`, `HashSet`, `HashMap`, etc., que são Tipos de Dados de Referência usados para armazenar coleções de objetos.

8. **Outras Classes de Biblioteca**: Java possui muitas outras classes de biblioteca que são tipos de dados de referência, como classes para manipulação de data e hora (`java.util.Date`, `java.time.LocalDate`, etc.), classes para entrada e saída (`java.io.File`, `java.io.InputStream`, `java.io.OutputStream`, etc.), e muito mais.

Os Tipos de Dados de Referência são armazenados na memória como referências a objetos, e não como valores reais. Isso significa que, quando você trabalha com esses tipos de dados, está manipulando referências aos objetos, e não os objetos em si. Portanto, você precisa ter cuidado com questões relacionadas à alocação de memória, gerenciamento de recursos e comparações de referências ao lidar com Tipos de Dados de Referência em Java.

## Converter tipos de dados

Em Java, você pode converter tipos de dados de várias maneiras, dependendo do que deseja realizar. As conversões de tipo podem ser divididas em dois tipos principais: conversão implícita e conversão explícita (casting). Aqui estão algumas maneiras de realizar conversões de tipo em Java:

1. Conversão Implícita:
   A conversão implícita ocorre automaticamente quando você está atribuindo um valor de um tipo de dado menor para um tipo de dado maior. Por exemplo, converter um `int` em um `double`:

   ```java
   int intValue = 10;
   double doubleValue = intValue; // Conversão implícita de int para double
   ```

2. Conversão Explícita (Casting):
   A conversão explícita, também conhecida como casting, é usada quando você deseja converter um tipo de dado maior em um tipo de dado menor. Você precisa fazer isso manualmente e, em alguns casos, pode resultar na perda de dados. Para fazer um casting, você coloca o tipo desejado entre parênteses antes da variável que você deseja converter. Aqui estão alguns exemplos:

   a. De double para int:
   ```java
   double doubleValue = 10.5;
   int intValue = (int) doubleValue; // Casting de double para int
   ```

   b. De int para byte:
   ```java
   int intValue = 128;
   byte byteValue = (byte) intValue; // Casting de int para byte (pode haver perda de dados)
   ```

   c. De long para int:
   ```java
   long longValue = 1000L;
   int intValue = (int) longValue; // Casting de long para int (pode haver perda de dados)
   ```

3. Conversão de String para Outros Tipos:
   Você também pode converter strings em outros tipos de dados usando métodos de parsing, como `Integer.parseInt()` ou `Double.parseDouble()`:

   ```java
   String strValue = "42";
   int intValue = Integer.parseInt(strValue); // Convertendo uma string em um int
   ```

Lembre-se de que é importante considerar a possibilidade de exceções ao realizar conversões de strings em outros tipos, pois a string pode não ser um valor válido para o tipo de dado desejado.

Além disso, é importante ter cuidado ao usar casting, pois pode levar a erros se não for feita de forma adequada e segura. Certifique-se de que a conversão seja segura para evitar exceções e resultados inesperados.

## Manipulação de strings

Manipulação de strings em Java é uma parte essencial da programação, já que as strings são amplamente usadas para armazenar e manipular texto. Java fornece uma variedade de métodos e funcionalidades para lidar com strings. Aqui estão alguns conceitos-chave e operações relacionadas à manipulação de strings em Java:

1. **Criação de Strings:**
   Você pode criar strings de várias maneiras em Java:
   ```java
   String str1 = "Hello, world!"; // Usando literais de string
   String str2 = new String("Hello");
   ```

2. **Concatenação de Strings:**
   A concatenação de strings é a operação de combinar duas ou mais strings:
   ```java
   String firstName = "John";
   String lastName = "Doe";
   String fullName = firstName + " " + lastName; // Concatenação usando o operador '+'
   ```

3. **Métodos de Manipulação de Strings:**
   Java fornece muitos métodos úteis para manipulação de strings, como:
   ```java
   String text = "Hello, world!";
   int length = text.length(); // Retorna o comprimento da string
   char firstChar = text.charAt(0); // Retorna o primeiro caractere
   boolean startsWithHello = text.startsWith("Hello");
   boolean endsWithWorld = text.endsWith("world!");
   int indexOfComma = text.indexOf(","); // Retorna a posição do caractere ','
   String uppercase = text.toUpperCase(); // Converte para maiúsculas
   String lowercase = text.toLowerCase(); // Converte para minúsculas
   String replaced = text.replace("world", "Java"); // Substitui 'world' por 'Java'
   ```

4. **Divisão e Junção de Strings:**
   É possível dividir uma string em substrings com base em um caractere delimitador e também juntar várias strings em uma única string:
   ```java
   String sentence = "Java is fun to learn";
   String[] words = sentence.split(" "); // Divide a string em palavras
   String joined = String.join(", ", words); // Junta as palavras com vírgula e espaço
   ```

5. **StringBuilder e StringBuffer:**
   Quando você precisa construir uma string de maneira eficiente (por exemplo, em loops), é recomendável usar `StringBuilder` (ou `StringBuffer` em situações concorrentes), pois eles são mutáveis e evitam a criação excessiva de objetos:
   ```java
   StringBuilder sb = new StringBuilder();
   sb.append("Hello");
   sb.append(" ");
   sb.append("Java");
   String result = sb.toString(); // Converte StringBuilder para String
   ```

6. **Comparação de Strings:**
   A comparação de strings pode ser feita usando os métodos `equals()`, `equalsIgnoreCase()`, `compareTo()`, etc.:
   ```java
   String str1 = "hello";
   String str2 = "HELLO";
   boolean isEqual = str1.equals(str2); // Compara conteúdo (case-sensitive)
   boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Compara ignorando maiúsculas/minúsculas
   int comparison = str1.compareTo(str2); // Compara lexicograficamente
   ```

7. **Remoção de Espaços em Branco:**
   É possível remover espaços em branco no início e no final de uma string usando `trim()`:
   ```java
   String padded = "   padded   ";
   String trimmed = padded.trim(); // Remove espaços em branco
   ```

A manipulação de strings em Java é uma habilidade fundamental para o desenvolvimento de aplicativos, pois as strings são amplamente usadas na entrada/saída, formatação, processamento de texto e muito mais. Certifique-se de consultar a documentação oficial da linguagem para obter mais detalhes sobre os métodos e funcionalidades relacionados a strings.

## Operadores em Java

Parece que você está pedindo uma descrição de todas as operações possíveis em Java, o que é um escopo muito amplo e não é possível abordar todas elas em um único texto. No entanto, posso fornecer uma visão geral das principais categorias de operações em Java:

1. **Operações Aritméticas:**
   Java suporta operações aritméticas padrão, como adição, subtração, multiplicação, divisão e módulo (%). Exemplo:
   ```java
   int sum = 5 + 3;
   int difference = 10 - 3;
   int product = 4 * 6;
   double quotient = 12.0 / 2;
   int remainder = 15 % 7;
   ```

2. **Operações de Atribuição:**
   Essas operações atribuem valores a variáveis:
   ```java
   int x = 10;
   x += 5; // Equivalente a x = x + 5
   x -= 3; // Equivalente a x = x - 3
   x *= 2; // Equivalente a x = x * 2
   x /= 4; // Equivalente a x = x / 4
   x %= 3; // Equivalente a x = x % 3
   ```

3. **Operações de Comparação:**
   São usadas para comparar valores e retornar valores booleanos (true/false):
   ```java
   int a = 5, b = 7;
   boolean isEqual = a == b;
   boolean isNotEqual = a != b;
   boolean isGreater = a > b;
   boolean isLessOrEqual = a <= b;
   ```

4. **Operações Lógicas:**
   São usadas para combinar valores booleanos:
   ```java
   boolean condition1 = true;
   boolean condition2 = false;
   boolean andResult = condition1 && condition2; // AND lógico
   boolean orResult = condition1 || condition2; // OR lógico
   boolean notResult = !condition1; // NOT lógico
   ```

5. **Operações de Bit a Bit:**
   São usadas para operações em nível de bits:
   ```java
   int num1 = 5, num2 = 3;
   int bitAnd = num1 & num2; // AND bit a bit
   int bitOr = num1 | num2; // OR bit a bit
   int bitXor = num1 ^ num2; // XOR bit a bit
   int bitComplement = ~num1; // Complemento bit a bit
   int leftShift = num1 << 2; // Deslocamento à esquerda
   int rightShift = num1 >> 1; // Deslocamento à direita (com preenchimento de sinal)
   int zeroFillRightShift = num1 >>> 1; // Deslocamento à direita (preenchimento de zero)
   ```

6. **Operações de String:**
   Como mencionado anteriormente, as operações de manipulação de strings incluem concatenação, busca, substituição, divisão, etc.

7. **Operações de Conversão de Tipo:**
   São usadas para converter valores entre diferentes tipos de dados:
   ```java
   int intValue = 42;
   double doubleValue = (double) intValue; // Conversão explícita para double
   String strValue = String.valueOf(intValue); // Conversão para string
   ```

8. **Operações de Controle de Fluxo:**
   Isso inclui operações condicionais e de repetição, como `if`, `switch`, `for`, `while`, `do-while`, que controlam a execução do código com base em certas condições.

9. **Operações de Array e Coleções:**
   São usadas para acessar e manipular elementos em arrays e coleções (listas, conjuntos, mapas, etc.).

Essas são apenas algumas das muitas operações disponíveis em Java. Cada categoria possui várias nuances e variações. Certifique-se de consultar a documentação oficial do Java ou outros recursos de aprendizado para obter informações detalhadas sobre cada tipo de operação.

## Estruturas de controle

Em Java, as estruturas de controle são elementos fundamentais para a criação de programas que tomam decisões, repetem ações e controlam o fluxo de execução do código. Existem três principais tipos de estruturas de controle em Java: estruturas condicionais, estruturas de repetição e estruturas de controle de fluxo.

1. Estruturas Condicionais:
   As estruturas condicionais permitem que você execute blocos de código com base em uma condição ou expressão booleana. Em Java, as principais estruturas condicionais são:
   
   - **if**: A estrutura `if` permite executar um bloco de código apenas se a condição especificada for verdadeira.
   
     ```java
     if (condicao) {
         // Código a ser executado se a condição for verdadeira
     }
     ```
   
   - **if-else**: A estrutura `if-else` permite executar um bloco de código se a condição for verdadeira e outro bloco de código se a condição for falsa.
   
     ```java
     if (condicao) {
         // Código a ser executado se a condição for verdadeira
     } else {
         // Código a ser executado se a condição for falsa
     }
     ```
   
   - **if-else if-else**: Esta estrutura é usada quando você tem várias condições a serem testadas em sequência.
   
     ```java
     if (condicao1) {
         // Código a ser executado se a primeira condição for verdadeira
     } else if (condicao2) {
         // Código a ser executado se a segunda condição for verdadeira
     } else {
         // Código a ser executado se nenhuma das condições anteriores for verdadeira
     }
     ```

No Java, as estruturas de repetição, também conhecidas como loops, são usadas para executar um bloco de código várias vezes. Existem três principais tipos de loops no Java: o `for`, o `while` e o `do-while`. Abaixo, vou descrever cada um deles:

1. **Loop `for`**:
   
   O loop `for` é amplamente utilizado quando o número de iterações é conhecido antecipadamente. Ele consiste em três partes principais: inicialização, condição e iteração. A sintaxe básica é a seguinte:

   ```java
   for (inicialização; condição; iteração) {
       // Código a ser executado repetidamente
   }
   ```

   - Inicialização: Esta parte é executada apenas uma vez no início e geralmente é usada para inicializar uma variável de controle.
   - Condição: É uma expressão booleana que determina se o loop deve continuar a ser executado. Se a condição for `true`, o loop continuará; caso contrário, ele sairá.
   - Iteração: É uma ação que é executada após cada iteração do loop, geralmente usada para atualizar a variável de controle.

2. **Loop `while`**:

   O loop `while` é usado quando o número de iterações não é conhecido antecipadamente, mas a condição para continuar o loop é avaliada antes da execução do bloco de código. A sintaxe é a seguinte:

   ```java
   while (condição) {
       // Código a ser executado repetidamente
   }
   ```

   O código dentro do loop será executado enquanto a condição especificada for `true`. Se a condição for `false` desde o início, o bloco de código não será executado.

3. **Loop `do-while`**:

   O loop `do-while` é semelhante ao `while`, mas a diferença crucial é que o bloco de código é executado pelo menos uma vez, mesmo que a condição seja `false` desde o início. A sintaxe é a seguinte:

   ```java
   do {
       // Código a ser executado repetidamente
   } while (condição);
   ```

   Nesse caso, o código dentro do loop é executado primeiro e, em seguida, a condição é verificada. Se a condição for `true`, o loop continuará; caso contrário, ele sairá.

Além desses loops básicos, é importante mencionar que você pode usar estruturas de controle como `break` e `continue` para controlar o fluxo dentro dos loops. O `break` é usado para sair imediatamente de um loop, enquanto o `continue` é usado para pular a iteração atual e continuar com a próxima iteração. Estas estruturas de repetição são fundamentais para criar lógica de repetição em programas Java.

3. Estruturas de Controle de Fluxo:
   As estruturas de controle de fluxo permitem que você altere o fluxo de execução do programa. Em Java, uma das principais estruturas é o `switch`, que é usado para tomar decisões com base em valores constantes.

   - **switch**: O `switch` permite que você avalie uma expressão e execute diferentes blocos de código com base nos valores possíveis da expressão.
   
     ```java
     switch (expressao) {
         case valor1:
             // Código a ser executado se expressao for igual a valor1
             break;
         case valor2:
             // Código a ser executado se expressao for igual a valor2
             break;
         // ...
         default:
             // Código a ser executado se nenhum dos casos anteriores for correspondido
     }
     ```

Essas estruturas de controle são essenciais para a programação em Java, pois permitem que você crie programas mais complexos, tome decisões com base em condições e execute ações repetitivas. Elas desempenham um papel crucial na lógica e na estruturação de seus programas.
