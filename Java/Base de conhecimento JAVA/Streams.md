# Streams - Java

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
