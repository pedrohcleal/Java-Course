# Streams - Java

## Pipeline Streams

Em Java, pipelines em streams são uma maneira poderosa e expressiva de processar dados de forma sequencial e paralela. Um pipeline em stream consiste em uma sequência de operações que são aplicadas a um fluxo de elementos. Essas operações podem incluir filtragem, mapeamento, classificação, agrupamento e redução, entre outras.

Aqui está uma visão geral de como os pipelines em stream funcionam em Java:

1. **Fonte**: O pipeline começa com uma fonte de dados, que pode ser uma coleção, um array, um arquivo ou até mesmo um gerador infinito.

2. **Operações intermediárias**: São operações que transformam ou filtram os elementos do stream. Essas operações são encadeadas em uma sequência e retornam um novo stream como resultado. Exemplos de operações intermediárias incluem `filter()`, `map()`, `sorted()` e `distinct()`. Essas operações são geralmente lazy, o que significa que elas não são executadas até que um terminal seja chamado.

3. **Operações terminais**: São operações que produzem um resultado ou efeito colateral. Quando uma operação terminal é chamada, as operações intermediárias são executadas e o stream é consumido. Exemplos de operações terminais incluem `forEach()`, `collect()`, `reduce()` e `count()`.

4. **Execução**: As operações em um pipeline podem ser executadas em série ou paralelamente, dependendo das características do stream e das operações envolvidas. A execução paralela pode ser habilitada usando o método `parallel()` no stream.

Um exemplo simples de um pipeline em stream em Java pode ser:

```java
List<String> palavras = Arrays.asList("casa", "carro", "bicicleta", "avião", "trem");

// Filtrando palavras que começam com 'c' e as transformando para maiúsculas
palavras.stream()
       .filter(palavra -> palavra.startsWith("c"))
       .map(String::toUpperCase)
       .forEach(System.out::println);
```

Neste exemplo, `filter()` é uma operação intermediária que filtra as palavras que começam com a letra 'c', `map()` é outra operação intermediária que transforma as palavras filtradas em maiúsculas, e `forEach()` é uma operação terminal que imprime cada palavra resultante.

### Operações intermediárias:

As operações intermediárias em Java Stream são aquelas que modificam ou transformam os elementos de um stream, produzindo um novo stream como resultado. Essas operações são encadeadas em uma sequência para formar um pipeline de processamento de dados. Aqui estão algumas das operações intermediárias mais comuns em streams:

1. **`filter(Predicate<T> predicate)`**: Esta operação filtra os elementos do stream com base em um predicado fornecido. Apenas os elementos que satisfazem o predicado são incluídos no novo stream.

2. **`map(Function<? super T, ? extends R> mapper)`**: Esta operação aplica uma função a cada elemento do stream e retorna um novo stream contendo os resultados das aplicações da função.

3. **`flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`**: Similar a `map()`, porém é usado quando a função de mapeamento retorna um stream para cada elemento, e desejamos "aplanar" esses streams resultantes em um único stream.

4. **`distinct()`**: Esta operação retorna um novo stream contendo apenas elementos distintos (não repetidos) com base na implementação do método `equals()` dos objetos.

5. **`sorted()`** e **`sorted(Comparator<? super T> comparator)`**: A primeira forma ordena os elementos do stream com base na ordem natural (usando o método `compareTo()`), enquanto a segunda forma permite especificar um comparador personalizado para a ordenação.

6. **`limit(long maxSize)`** e **`skip(long n)`**: `limit()` retorna um stream truncado para conter no máximo o número especificado de elementos, enquanto `skip()` descarta os primeiros `n` elementos do stream.

7. **`peek(Consumer<? super T> action)`**: Esta operação permite executar uma ação para cada elemento do stream, sem modificar o conteúdo do stream. É útil para fins de depuração ou para observar o conteúdo do stream durante o processamento.

8. **`parallel()`**: Esta operação converte o stream em um stream paralelo, permitindo a execução paralela de operações intermediárias e terminais subsequentes, se apropriado.

Estas são apenas algumas das operações intermediárias disponíveis em streams Java. Elas fornecem uma maneira flexível e poderosa de transformar e filtrar dados de forma concisa e legível.

### Exemplos

Exemplos para cada uma das operações intermediárias em Java Stream:

1. **`filter(Predicate<T> predicate)`**:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filtrando apenas os números pares
List<Integer> pares = numeros.stream()
                            .filter(num -> num % 2 == 0)
                            .collect(Collectors.toList());

System.out.println(pares); // Saída: [2, 4, 6, 8, 10]
```

2. **`map(Function<? super T, ? extends R> mapper)`**:
```java
List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João");

// Mapeando cada nome para o seu comprimento
List<Integer> comprimentos = nomes.stream()
                                  .map(String::length)
                                  .collect(Collectors.toList());

System.out.println(comprimentos); // Saída: [3, 5, 5, 4]
```

3. **`flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)`**:
```java
List<List<Integer>> numeros = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5, 6),
    Arrays.asList(7, 8, 9)
);

// Aplanando a lista de listas em um único stream de números
List<Integer> numerosAplanados = numeros.stream()
                                       .flatMap(List::stream)
                                       .collect(Collectors.toList());

System.out.println(numerosAplanados); // Saída: [1, 2, 3, 4, 5, 6, 7, 8, 9]
```

4. **`distinct()`**:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 3);

// Obtendo os números distintos
List<Integer> numerosDistintos = numeros.stream()
                                        .distinct()
                                        .collect(Collectors.toList());

System.out.println(numerosDistintos); // Saída: [1, 2, 3, 4, 5, 6]
```

5. **`sorted()`** e **`sorted(Comparator<? super T> comparator)`**:
```java
List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João");

// Ordenando os nomes em ordem alfabética
List<String> nomesOrdenados = nomes.stream()
                                   .sorted()
                                   .collect(Collectors.toList());

System.out.println(nomesOrdenados); // Saída: [Ana, João, Maria, Pedro]
```

6. **`limit(long maxSize)`** e **`skip(long n)`**:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Pulando os primeiros 5 números e limitando a 3 elementos depois disso
List<Integer> numerosLimitados = numeros.stream()
                                        .skip(5)
                                        .limit(3)
                                        .collect(Collectors.toList());

System.out.println(numerosLimitados); // Saída: [6, 7, 8]
```

7. **`peek(Consumer<? super T> action)`**:
```java
List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João");

// Imprimindo cada nome antes de mapeá-lo para o seu comprimento
List<Integer> comprimentos = nomes.stream()
                                  .peek(System.out::println)
                                  .map(String::length)
                                  .collect(Collectors.toList());

// Saída:
// Ana
// Pedro
// Maria
// João

System.out.println(comprimentos); // Saída: [3, 5, 5, 4]
```

8. **`parallel()`**:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filtrando apenas os números pares em paralelo
List<Integer> paresParalelos = numeros.parallelStream()
                                      .filter(num -> num % 2 == 0)
                                      .collect(Collectors.toList());

System.out.println(paresParalelos); // Pode variar em diferentes execuções
```

Estes exemplos demonstram como cada operação intermediária pode ser aplicada em um pipeline de stream Java para transformar, filtrar ou manipular os elementos do stream.

### Operações terminais

As operações terminais em Java Stream são aquelas que produzem um resultado final ou causam um efeito colateral. Quando uma operação terminal é chamada em um stream, ela desencadeia a execução das operações intermediárias encadeadas e consome o stream, não permitindo que outras operações sejam realizadas no mesmo stream posteriormente. Aqui estão algumas das operações terminais mais comuns em streams Java:

1. **`forEach(Consumer<? super T> action)`**: Esta operação aplica uma função a cada elemento do stream. É útil para executar uma ação em cada elemento do stream, como imprimir os elementos.

2. **`count()`**: Esta operação retorna o número de elementos no stream como um long.

3. **`collect(Collector<? super T, A, R> collector)`**: Esta operação acumula os elementos do stream em uma coleção ou outro tipo de objeto usando um `Collector` especificado. Ela é muito flexível e pode ser usada para realizar uma ampla variedade de operações de coleta, como coletar os elementos em uma lista, conjunto ou mapa, ou calcular estatísticas sobre os elementos.

4. **`reduce(T identity, BinaryOperator<T> accumulator)`** e **`reduce(BinaryOperator<T> accumulator)`**: A primeira forma de `reduce()` combina os elementos do stream em um único valor usando um acumulador e um valor de identidade inicial, enquanto a segunda forma usa apenas um acumulador e não requer um valor de identidade inicial.

5. **`min(Comparator<? super T> comparator)`** e **`max(Comparator<? super T> comparator)`**: Essas operações retornam o menor ou o maior elemento do stream, respectivamente, com base em um comparador especificado.

6. **`anyMatch(Predicate<? super T> predicate)`**, **`allMatch(Predicate<? super T> predicate)`** e **`noneMatch(Predicate<? super T> predicate)`**: Estas operações verificam se algum, todos ou nenhum dos elementos do stream satisfazem um predicado especificado, respectivamente, e retornam um valor booleano indicando o resultado.

7. **`findFirst()`** e **`findAny()`**: Estas operações retornam um `Optional` contendo o primeiro elemento encontrado no stream (ou qualquer elemento no caso de `findAny()`), ou um `Optional` vazio se o stream estiver vazio.

8. **`toArray()`**: Esta operação retorna um array contendo os elementos do stream.

9. **`iterator()`**: Esta operação retorna um iterador sobre os elementos do stream, permitindo iterar manualmente sobre eles.

10. **`spliterator()`**: Esta operação retorna um `Spliterator` sobre os elementos do stream, que pode ser usado para dividir o stream em partes menores para processamento paralelo.

Essas são algumas das operações terminais disponíveis em streams Java. Elas permitem extrair informações dos elementos do stream, realizar operações finais nos elementos ou coletar os resultados para uso posterior.

### Exemplos:

Exemplos para cada uma das operações terminais em Java Stream:

1. **`forEach(Consumer<? super T> action)`**:
```java
List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João");

// Imprimindo cada nome
nomes.stream()
     .forEach(System.out::println);
```

2. **`count()`**:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Contando o número de elementos
long quantidade = numeros.stream()
                        .count();

System.out.println("Quantidade de números: " + quantidade); // Saída: Quantidade de números: 5
```

3. **`collect(Collector<? super T, A, R> collector)`**:
```java
List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João");

// Coletando os nomes em uma lista
List<String> listaDeNomes = nomes.stream()
                                 .collect(Collectors.toList());

System.out.println(listaDeNomes); // Saída: [Ana, Pedro, Maria, João]
```

4. **`reduce(T identity, BinaryOperator<T> accumulator)`**:
```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

// Somando todos os números
int soma = numeros.stream()
                 .reduce(0, Integer::sum);

System.out.println("Soma dos números: " + soma); // Saída: Soma dos números: 15
```

5. **`min(Comparator<? super T> comparator)`** e **`max(Comparator<? super T> comparator)`**:
```java
List<Integer> numeros = Arrays.asList(3, 6, 2, 8, 4);

// Encontrando o menor e o maior número
Optional<Integer> menor = numeros.stream()
                                .min(Integer::compareTo);

Optional<Integer> maior = numeros.stream()
                                .max(Integer::compareTo);

System.out.println("Menor número: " + menor.orElse(null)); // Saída: Menor número: 2
System.out.println("Maior número: " + maior.orElse(null)); // Saída: Maior número: 8
```

6. **`anyMatch(Predicate<? super T> predicate)`**, **`allMatch(Predicate<? super T> predicate)`** e **`noneMatch(Predicate<? super T> predicate)`**:
```java
List<Integer> numeros = Arrays.asList(3, 6, 2, 8, 4);

// Verificando se há algum número par, se todos os números são pares
// e se nenhum número é negativo
boolean temPar = numeros.stream().anyMatch(num -> num % 2 == 0);
boolean todosPares = numeros.stream().allMatch(num -> num % 2 == 0);
boolean nenhumNegativo = numeros.stream().noneMatch(num -> num < 0);

System.out.println("Tem número par: " + temPar); // Saída: Tem número par: true
System.out.println("Todos são pares: " + todosPares); // Saída: Todos são pares: false
System.out.println("Nenhum é negativo: " + nenhumNegativo); // Saída: Nenhum é negativo: true
```

7. **`findFirst()`** e **`findAny()`**:
```java
List<Integer> numeros = Arrays.asList(3, 6, 2, 8, 4);

// Encontrando o primeiro número par
Optional<Integer> primeiroPar = numeros.stream()
                                       .filter(num -> num % 2 == 0)
                                       .findFirst();

System.out.println("Primeiro número par: " + primeiroPar.orElse(null)); // Saída: Primeiro número par: 6

// Encontrando qualquer número par
Optional<Integer> qualquerPar = numeros.stream()
                                      .filter(num -> num % 2 == 0)
                                      .findAny();

System.out.println("Qualquer número par: " + qualquerPar.orElse(null)); // Saída: Qualquer número par: 6
```

8. **`toArray()`**:
```java
List<String> nomes = Arrays.asList("Ana", "Pedro", "Maria", "João");

// Convertendo os nomes para um array
String[] arrayDeNomes = nomes.stream()
                             .toArray(String[]::new);

System.out.println(Arrays.toString(arrayDeNomes)); // Saída: [Ana, Pedro, Maria, João]
```

Esses exemplos demonstram como cada operação terminal pode ser utilizada para realizar ações finais ou extrair informações do stream em Java.


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

## Método `filter()`

Em Java, o método `filter()` faz parte da API de Streams, introduzida no Java 8. Esse método é utilizado para filtrar elementos com base em uma condição fornecida por um predicado. A ideia central é aplicar o predicado a cada elemento da Stream e incluir apenas os elementos que atendem à condição especificada.

A assinatura básica do método `filter()` é a seguinte:

```java
Stream<T> filter(Predicate<? super T> predicate)
```

Aqui está uma breve explicação dos parâmetros:

- `predicate`: É uma interface funcional que representa a condição a ser avaliada para cada elemento da Stream. Se um elemento satisfizer o predicado, ele será incluído na nova Stream resultante.

Aqui está um exemplo simples de como usar o método `filter()` para filtrar números pares de uma lista:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Utilizando o método filter para obter apenas os números pares
        List<Integer> evenNumbers = numbers.stream()
                                          .filter(n -> n % 2 == 0)
                                          .collect(Collectors.toList());

        System.out.println("Números pares: " + evenNumbers);
    }
}
```

Neste exemplo, a Stream de números é filtrada para incluir apenas os números pares usando o método `filter()` em conjunto com um predicado que verifica se o número é divisível por 2. O resultado é uma nova lista contendo apenas os números pares.

O método `filter()` é uma ferramenta poderosa que contribui para a expressividade e funcionalidade das Streams em Java, permitindo operações de filtragem de maneira concisa e legível.

## Método `map()`

O método `.map()` em Java faz parte da API de Streams, introduzida no Java 8. Ele é utilizado para transformar cada elemento de uma Stream com base em uma função fornecida. A ideia central é aplicar a função a cada elemento da Stream e gerar uma nova Stream contendo os resultados das transformações.

A assinatura básica do método `.map()` é a seguinte:

```java
<R> Stream<R> map(Function<? super T, ? extends R> mapper)
```

Aqui está uma breve explicação dos parâmetros:

- `mapper`: É uma interface funcional que representa a função a ser aplicada a cada elemento da Stream. A função recebe um elemento do tipo `T` como entrada e retorna um resultado do tipo `R`. A nova Stream resultante conterá elementos do tipo `R`.

Aqui está um exemplo simples de como usar o método `.map()` para transformar uma lista de strings em uma lista de seus comprimentos:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        // Utilizando o método map para obter o comprimento de cada palavra
        List<Integer> wordLengths = words.stream()
                                        .map(String::length)
                                        .collect(Collectors.toList());

        System.out.println("Comprimentos das palavras: " + wordLengths);
    }
}
```

Neste exemplo, a Stream de strings é transformada usando o método `.map()` em conjunto com a função `String::length`. A função `String::length` retorna o comprimento de uma string, e, assim, cada elemento da Stream original é mapeado para seu comprimento correspondente. O resultado é uma nova lista contendo os comprimentos das palavras.

O método `.map()` é uma ferramenta valiosa para realizar transformações em elementos de uma Stream de maneira concisa e expressiva. Ele é frequentemente utilizado para converter uma Stream de um tipo para outro, aplicando uma lógica de transformação definida pela função fornecida.

## Método `.distinct()` e `.count()`

Os métodos `.distinct()` e `.count()` são operações disponíveis na API de Streams do Java, introduzida no Java 8, e são utilizados para operações distintas em uma stream.

### Método `.distinct()`:
O método `.distinct()` é utilizado para remover elementos duplicados de uma stream. Ele retorna uma nova stream contendo apenas os elementos distintos da stream original. A comparação de elementos é feita com base no método `equals()`. Aqui está um exemplo:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "banana");

        // Utilizando o método distinct para obter elementos distintos
        List<String> uniqueFruits = fruits.stream()
                                          .distinct()
                                          .collect(Collectors.toList());

        System.out.println("Elementos distintos: " + uniqueFruits);
    }
}
```

Neste exemplo, a Stream de frutas contém elementos duplicados ("apple" e "banana"). O método `.distinct()` é utilizado para remover os elementos duplicados, resultando em uma nova lista contendo apenas os elementos distintos.

### Método `.count()`:
O método `.count()` é utilizado para contar o número de elementos em uma stream. Ele retorna um valor do tipo `long`, representando a contagem dos elementos. Aqui está um exemplo:

```java
import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

        // Utilizando o método count para contar o número de elementos
        long count = fruits.stream()
                          .count();

        System.out.println("Número de elementos: " + count);
    }
}
```

Neste exemplo, o método `.count()` é utilizado para contar o número de elementos na Stream de frutas. O resultado é impresso, mostrando o número total de elementos na lista.

Em resumo, o método `.distinct()` é utilizado para obter elementos únicos em uma stream, enquanto o método `.count()` é utilizado para contar o número total de elementos em uma stream. Ambos são úteis em diferentes cenários, dependendo dos requisitos específicos da manipulação de dados.

## IntStream

Em Java, `IntStream` faz parte do pacote `java.util.stream` e é uma parte da API de Streams introduzida no Java 8. `IntStream` é uma especialização de `Stream` que lida especificamente com dados primitivos do tipo `int`. Ele fornece uma maneira conveniente e eficiente de lidar com operações em sequências de valores inteiros.

A principal ideia por trás de `IntStream` é permitir a execução de operações de forma mais concisa e funcional, como map, filter, e reduce, em conjuntos de dados inteiros sem a necessidade de loops explícitos. Isso ajuda a melhorar a legibilidade do código e a facilitar a paralelização de operações.

Aqui estão algumas das principais operações que podem ser realizadas com `IntStream`:

1. **Criar um IntStream:**
   ```java
   IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
   ```

2. **Operações de Transformação (`map`, `filter`):**
   ```java
   IntStream doubledValues = intStream.map(x -> x * 2);
   IntStream evenValues = intStream.filter(x -> x % 2 == 0);
   ```

3. **Operações de Redução (`sum`, `average`, `min`, `max`):**
   ```java
   int sum = intStream.sum();
   OptionalDouble average = intStream.average();
   OptionalInt min = intStream.min();
   OptionalInt max = intStream.max();
   ```

4. **Operações de Agregação (`reduce`):**
   ```java
   int sum = intStream.reduce(0, (x, y) -> x + y);
   ```

5. **Operações de Iteração (`forEach`, `forEachOrdered`):**
   ```java
   intStream.forEach(System.out::println);
   ```

6. **Operações de Criação (`range`, `rangeClosed`):**
   ```java
   IntStream range = IntStream.range(1, 5); // 1, 2, 3, 4
   IntStream rangeClosed = IntStream.rangeClosed(1, 5); // 1, 2, 3, 4, 5
   ```

7. **Operações de Paralelismo (`parallel`, `sequential`):**
   ```java
   IntStream parallelStream = intStream.parallel();
   IntStream sequentialStream = parallelStream.sequential();
   ```

Essas são apenas algumas das operações que podem ser realizadas com `IntStream`. Essa abstração é poderosa e flexível, permitindo a manipulação eficiente de grandes conjuntos de dados inteiros. O uso adequado de operações de stream pode levar a um código mais conciso e legível.

## boxed()

O método `.boxed()` em Java é usado em conjunto com streams de tipos primitivos, como `IntStream`, `LongStream`, ou `DoubleStream`, para converter os elementos primitivos em seus equivalentes de classes embrulhadoras (wrapper classes) correspondentes. Isso é útil quando você precisa trabalhar com streams de tipos primitivos em situações que exigem objetos, como ao utilizar métodos que esperam instâncias de classes em vez de tipos primitivos.

A razão para essa conversão é que as streams de tipos primitivos, como `IntStream`, foram introduzidas no Java para fornecer uma representação mais eficiente em termos de consumo de memória e desempenho ao lidar com grandes volumes de dados. No entanto, em alguns casos, é necessário trabalhar com tipos de objeto, como ao utilizar coleções que aceitam apenas objetos.

Aqui está um exemplo de como o método `.boxed()` pode ser usado:

```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedExample {
    public static void main(String[] args) {
        // Criando um IntStream de valores inteiros
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        // Usando o método .boxed() para converter inteiros em Integer
        List<Integer> integerList = intStream.boxed().collect(Collectors.toList());

        // Imprimindo a lista resultante
        System.out.println(integerList);
    }
}
```

Neste exemplo, `intStream.boxed()` converte os valores inteiros do `IntStream` em objetos `Integer`, e em seguida, o método `collect(Collectors.toList())` é utilizado para coletar esses valores em uma lista de `Integer`. Isso pode ser útil, por exemplo, quando você precisa armazenar os valores em uma estrutura de dados que aceita apenas objetos.

Lembre-se de que, embora o método `.boxed()` seja útil em certas situações, ele pode introduzir algum overhead devido à criação de objetos adicionais, e em alguns casos, pode ser mais eficiente usar streams de tipos primitivos diretamente.

