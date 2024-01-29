# Java part4

## Boxing e unboxing

Em Java, os termos "boxing" e "unboxing" referem-se à conversão entre tipos primitivos e seus equivalentes de classes (tipos wrapper). Os tipos primitivos em Java são aqueles que representam valores simples, como int, float, double, etc. Os tipos wrapper são classes que fornecem uma forma de representar esses tipos primitivos como objetos. Os tipos wrapper correspondentes para alguns dos tipos primitivos incluem Integer, Float, Double, etc.

1. **Boxing:**
   - Boxing refere-se ao processo de converter um tipo primitivo em seu equivalente de classe (wrapper).
   - Isso é feito automaticamente pelo Java quando é necessário tratar um tipo primitivo como um objeto. Por exemplo, ao adicionar um valor int a uma coleção como uma ArrayList, o Java automaticamente "empacota" o valor int em um objeto Integer.

   Exemplo de boxing:
   ```java
   int primitiveInt = 42;
   Integer boxedInt = primitiveInt; // Boxing automático
   ```

2. **Unboxing:**
   - Unboxing é o processo inverso de boxing, onde um objeto wrapper é convertido de volta para seu tipo primitivo correspondente.
   - Isso também é feito automaticamente pelo Java quando um valor de wrapper é usado em um contexto que requer um tipo primitivo.

   Exemplo de unboxing:
   ```java
   Integer boxedInt = 42;
   int primitiveInt = boxedInt; // Unboxing automático
   ```

3. **Wrapper Classes:**
   - As classes wrapper são classes que encapsulam tipos primitivos em objetos. Elas fornecem métodos úteis para trabalhar com esses tipos primitivos como objetos.
   - Algumas das classes wrapper em Java incluem Integer, Float, Double, Boolean, etc.

   Exemplo de uso de wrapper class:
   ```java
   Integer num = 10; // Boxing automático
   int value = num.intValue(); // Unboxing manual
   ```

Em resumo, boxing e unboxing em Java referem-se à conversão automática entre tipos primitivos e suas classes wrapper correspondentes. Isso ajuda a simplificar o código quando você precisa trabalhar com tipos primitivos em contextos que requerem objetos, como coleções e APIs que aceitam apenas objetos.

## Expressão Lambda

Em Java, expressões lambda introduzidas no Java 8 são uma adição importante para facilitar a programação funcional. As expressões lambda permitem tratar as funções como entidades de primeira classe, possibilitando a criação de funções inline de forma concisa. Essa funcionalidade é especialmente útil ao lidar com interfaces funcionais, que são interfaces que têm apenas um método abstrato e são usadas frequentemente em programação funcional.

A sintaxe básica de uma expressão lambda é a seguinte:

```java
(parametros) -> expressao
```

Aqui estão alguns pontos chave sobre expressões lambda em Java:

1. **Sintaxe Básica:**
   - Uma expressão lambda é composta por uma lista de parâmetros, uma seta (`->`), e uma expressão ou um bloco de código.
   - Se a expressão lambda não tiver parâmetros, você ainda precisa incluir os parênteses vazios `()`. Exemplo: `() -> System.out.println("Hello, Lambda!");`

2. **Utilização com Interfaces Funcionais:**
   - Expressões lambda são frequentemente usadas em conjunto com interfaces funcionais.
   - Uma interface funcional é aquela que contém apenas um método abstrato. Exemplos incluem `Runnable`, `Callable`, `Comparator`, etc.

3. **Exemplos:**
   - Exemplo usando `Runnable`:

     ```java
     Runnable runnable = () -> System.out.println("Executando a tarefa!");
     ```

   - Exemplo usando `Comparator`:

     ```java
     List<String> lista = Arrays.asList("Maçã", "Banana", "Pera");
     Collections.sort(lista, (s1, s2) -> s1.compareTo(s2));
     ```

   - Exemplo usando `Predicate`:

     ```java
     Predicate<Integer> isPar = (numero) -> numero % 2 == 0;
     ```

4. **Variáveis Locais e Captura de Variáveis Externas:**
   - Expressões lambda podem acessar variáveis locais e parâmetros do método no qual estão definidas.
   - No entanto, essas variáveis devem ser efetivamente finais ou, em outras palavras, não podem ser modificadas após a captura pela expressão lambda.

     ```java
     int valor = 10;
     Consumer<Integer> consumer = (x) -> System.out.println(x + valor);
     ```

5. **Métodos de Referência:**
   - Além de expressões lambda, o Java 8 introduziu métodos de referência, que são abreviações para a invocação de métodos existentes ou construtores.

     ```java
     // Método de referência para um método estático
     Function<String, Integer> parseInt = Integer::parseInt;

     // Método de referência para um método de instância de um objeto específico
     String s = "Hello";
     Predicate<String> startsWith = s::startsWith;
     ```

Expressões lambda tornam o código mais conciso e legível, especialmente ao lidar com tarefas simples e funções de ordem superior. Elas são amplamente utilizadas em APIs do Java 8 e posterior, como as Streams API, que permite operações funcionais em coleções de dados.

## Streams

O método `.stream()` em Java faz parte do conjunto de recursos introduzidos no Java 8, conhecido como Java Streams. Ele é utilizado principalmente para criar uma sequência de elementos que pode ser processada de forma funcional, aproveitando a programação funcional e facilitando a realização de operações em coleções de dados.

A principal ideia por trás do uso de streams é facilitar o processamento de grandes conjuntos de dados de maneira concisa e eficiente. As streams permitem que você realize operações em elementos de dados de forma sequencial ou paralela.

Aqui estão alguns conceitos e características importantes relacionados ao método `.stream()`:

1. **Obtendo uma Stream:**
   - O método `.stream()` está disponível em várias classes, incluindo coleções como List, Set e Map, bem como em arrays.

     Exemplo com uma lista:
     ```java
     List<String> lista = Arrays.asList("Maçã", "Banana", "Pera");
     Stream<String> stream = lista.stream();
     ```

2. **Operações Intermediárias e Terminais:**
   - As operações em uma stream podem ser classificadas como intermediárias ou terminais.
   - Operações intermediárias (como `filter`, `map`, `sorted`, etc.) retornam uma nova stream e podem ser encadeadas.
   - Operações terminais (como `forEach`, `collect`, `reduce`, etc.) realizam uma ação final na stream e encerram a sequência de operações.

     Exemplo de operações intermediárias e terminais:
     ```java
     List<String> lista = Arrays.asList("Maçã", "Banana", "Pera");

     lista.stream()
           .filter(fruta -> fruta.startsWith("M"))
           .map(String::toUpperCase)
           .forEach(System.out::println);
     ```

3. **Operações Paralelas:**
   - Streams oferecem suporte a processamento paralelo facilmente.
   - O método `.parallelStream()` cria uma stream que pode ser processada em paralelo, o que pode melhorar o desempenho em máquinas com vários núcleos de processamento.

     Exemplo de stream paralela:
     ```java
     List<String> lista = Arrays.asList("Maçã", "Banana", "Pera");

     lista.parallelStream()
           .filter(fruta -> fruta.startsWith("M"))
           .map(String::toUpperCase)
           .forEach(System.out::println);
     ```

4. **Coleta (Collectors):**
   - A operação terminal `.collect()` é frequentemente usada para converter uma stream de volta para uma coleção ou outro tipo de estrutura de dados.
   - A interface `Collectors` fornece métodos de utilidade para criar coletores comuns.

     Exemplo de coleta em uma lista:
     ```java
     List<String> lista = Arrays.asList("Maçã", "Banana", "Pera");
     List<String> resultado = lista.stream()
                                   .filter(fruta -> fruta.startsWith("M"))
                                   .collect(Collectors.toList());
     ```

O uso de streams em Java oferece uma maneira mais expressiva e eficiente de realizar operações em conjuntos de dados, tornando o código mais conciso e legível. Ao combinar o método `.stream()` com outras operações de stream, é possível criar pipelines de processamento de dados de forma eficaz.

## Matrizes em Java

Em Java, uma matriz é uma estrutura de dados bidimensional que armazena elementos em linhas e colunas. Cada elemento da matriz pode ser acessado através de dois índices: um para a linha e outro para a coluna. A matriz em Java é na verdade um array de arrays, onde cada array interno representa uma linha da matriz.

Aqui estão alguns conceitos e operações comuns relacionados a matrizes em Java:

1. **Declaração e Inicialização:**
   - Você pode declarar e inicializar uma matriz em uma única linha.

     ```java
     // Declaração e inicialização de uma matriz de inteiros 3x3
     int[][] matriz = new int[3][3];
     ```

   - Também é possível inicializar a matriz com valores específicos.

     ```java
     int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
     ```

2. **Acesso aos Elementos:**
   - Os elementos de uma matriz são acessados usando índices. Lembre-se de que os índices em Java começam em 0.

     ```java
     int valor = matriz[1][2]; // Obtém o valor na segunda linha, terceira coluna
     ```

3. **Iteração sobre Matriz:**
   - Você pode usar loops (por exemplo, `for` ou `foreach`) para percorrer todos os elementos de uma matriz.

     ```java
     for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
             System.out.print(matriz[i][j] + " ");
         }
         System.out.println();
     }
     ```

4. **Tamanho da Matriz:**
   - Você pode obter o número de linhas e colunas de uma matriz usando as propriedades `length`.

     ```java
     int linhas = matriz.length;          // Número de linhas
     int colunas = matriz[0].length;      // Número de colunas (assumindo que todas as linhas têm o mesmo comprimento)
     ```

5. **Matrizes Irregulares:**
   - Em Java, é possível criar matrizes em que cada linha tem um comprimento diferente.

     ```java
     int[][] matrizIrregular = { {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };
     ```

6. **Matrizes Multidimensionais:**
   - Você pode ter matrizes com mais de duas dimensões em Java, embora o uso prático de matrizes multidimensionais seja mais limitado.

     ```java
     int[][][] matrizTridimensional = new int[3][3][3];
     ```

7. **Clone de Matriz:**
   - Para criar uma cópia independente de uma matriz, você pode usar o método `clone()`.

     ```java
     int[][] copiaMatriz = matriz.clone();
     ```

Lembre-se de que matrizes em Java são objetos e, portanto, são passadas por referência. Isso significa que, ao passar uma matriz para um método ou atribuí-la a outra variável, você estará manipulando a mesma matriz na memória. Se precisar de uma cópia independente, considere o uso de métodos como `clone()` ou crie uma nova matriz e copie os elementos manualmente.

## Data e Hora
A `java.time` é uma API de manipulação de data e hora introduzida no Java 8 para substituir as antigas classes do pacote `java.util.date` que eram conhecidas por suas limitações e complexidades. A API `java.time` oferece uma abordagem mais moderna e flexível para lidar com operações relacionadas a datas e horas.

A principal classe dessa API é `LocalDateTime`, que representa uma data e hora sem referência a um fuso horário específico. Aqui estão alguns conceitos e exemplos básicos de como usar a `java.time` para trabalhar com data e hora em Java:

1. **Obtendo a data e hora atual:**
   
   ```java
   LocalDateTime agora = LocalDateTime.now();
   System.out.println("Data e Hora Atuais: " + agora);
   ```

2. **Criando objetos `LocalDateTime` manualmente:**

   ```java
   LocalDateTime dataHoraManual = LocalDateTime.of(2022, 1, 28, 12, 30);
   System.out.println("Data e Hora Manual: " + dataHoraManual);
   ```

3. **Formatando e convertendo para String:**

   ```java
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
   String dataFormatada = agora.format(formatter);
   System.out.println("Data Formatada: " + dataFormatada);
   ```

4. **Parsando uma String para `LocalDateTime`:**

   ```java
   String dataString = "28/01/2022 15:45:30";
   LocalDateTime dataParsada = LocalDateTime.parse(dataString, formatter);
   System.out.println("Data Parsada: " + dataParsada);
   ```

5. **Operações com datas e horas:**

   ```java
   LocalDateTime futuro = agora.plusDays(7).minusHours(3);
   System.out.println("Data e Hora no Futuro: " + futuro);
   ```

6. **Comparando datas:**

   ```java
   if (agora.isAfter(futuro)) {
       System.out.println("A data atual é posterior à data no futuro.");
   } else {
       System.out.println("A data atual é anterior à data no futuro.");
   }
   ```

Esses são apenas alguns exemplos básicos do que você pode fazer com a API `java.time`. A API também inclui outras classes, como `LocalDate` para representar apenas a data, `LocalTime` para representar apenas a hora, e classes mais avançadas para lidar com fusos horários, durações, períodos, entre outros.

Lembre-se de que a `java.time` foi projetada para ser imutável e thread-safe, o que facilita a manipulação de datas e horas em ambientes concorrentes.
