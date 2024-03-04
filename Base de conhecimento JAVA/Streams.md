# Streams - Java

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
