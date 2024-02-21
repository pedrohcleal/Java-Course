# Part 8 Java

## `Stack`

A classe `Stack` em Java faz parte do pacote `java.util` e representa uma pilha, que é uma estrutura de dados do tipo LIFO (Last In, First Out). Isso significa que o último elemento adicionado à pilha é o primeiro a ser removido. A classe `Stack` estende a classe `Vector` e fornece métodos específicos para operações de pilha.

Aqui estão algumas características e métodos importantes da classe `Stack`:

1. **Construtores:**
   - `Stack()`: Cria uma pilha vazia.

2. **Métodos principais:**
   - `push(Object item)`: Adiciona um elemento ao topo da pilha.
   - `pop()`: Remove e retorna o elemento no topo da pilha. Gera uma exceção `EmptyStackException` se a pilha estiver vazia.
   - `peek()`: Retorna o elemento no topo da pilha sem removê-lo. Gera uma exceção `EmptyStackException` se a pilha estiver vazia.
   - `empty()`: Retorna `true` se a pilha estiver vazia; `false` caso contrário.
   - `search(Object o)`: Retorna a posição baseada em 1 do objeto na pilha. Retorna -1 se o objeto não estiver na pilha.

3. **Exemplo de uso:**
   ```java
   import java.util.Stack;

   public class ExemploStack {
       public static void main(String[] args) {
           Stack<Integer> pilha = new Stack<>();

           // Adicionando elementos à pilha
           pilha.push(10);
           pilha.push(20);
           pilha.push(30);

           // Imprimindo o topo da pilha sem removê-lo
           System.out.println("Topo da pilha: " + pilha.peek());

           // Removendo o topo da pilha
           System.out.println("Elemento removido: " + pilha.pop());

           // Verificando se a pilha está vazia
           System.out.println("A pilha está vazia? " + pilha.empty());
       }
   }
   ```

A classe `Stack` em Java é útil quando você precisa implementar uma estrutura de dados baseada em pilha. No entanto, é importante observar que, a partir do Java 1.6, é recomendado usar a interface `Deque` ou a classe `ArrayDeque` em vez da classe `Stack`, devido a questões de desempenho. A classe `Stack` herda da classe `Vector`, que é sincronizada, o que pode resultar em penalidades de desempenho desnecessárias em muitos casos.

##  Interface `Deque` e a classe `ArrayDeque`

A interface `Deque` em Java representa uma fila dupla, ou seja, uma fila em que você pode adicionar e remover elementos tanto no início quanto no final. O nome "Deque" é uma abreviação de "Double Ended Queue". Essa interface estende a interface `Queue` e adiciona métodos para operações de inserção e remoção no início e no final da fila.

Alguns dos métodos principais da interface `Deque` incluem:

- `addFirst(E e)`: Adiciona um elemento no início da fila.
- `addLast(E e)`: Adiciona um elemento no final da fila.
- `offerFirst(E e)`: Tenta adicionar um elemento no início da fila, retornando `true` se bem-sucedido, ou `false` caso contrário.
- `offerLast(E e)`: Tenta adicionar um elemento no final da fila, retornando `true` se bem-sucedido, ou `false` caso contrário.
- `removeFirst()`: Remove e retorna o primeiro elemento da fila, lançando uma exceção se a fila estiver vazia.
- `removeLast()`: Remove e retorna o último elemento da fila, lançando uma exceção se a fila estiver vazia.
- `pollFirst()`: Remove e retorna o primeiro elemento da fila, ou retorna `null` se a fila estiver vazia.
- `pollLast()`: Remove e retorna o último elemento da fila, ou retorna `null` se a fila estiver vazia.
- `getFirst()`: Retorna o primeiro elemento da fila sem removê-lo, lançando uma exceção se a fila estiver vazia.
- `getLast()`: Retorna o último elemento da fila sem removê-lo, lançando uma exceção se a fila estiver vazia.
- `peekFirst()`: Retorna o primeiro elemento da fila sem removê-lo, ou retorna `null` se a fila estiver vazia.
- `peekLast()`: Retorna o último elemento da fila sem removê-lo, ou retorna `null` se a fila estiver vazia.

A classe `ArrayDeque` é uma implementação da interface `Deque` em Java. Ela utiliza um array dinâmico para armazenar os elementos da fila dupla. A `ArrayDeque` não é sincronizada, o que significa que não é seguro para operações concorrentes em ambientes multithread. Caso seja necessário suportar acesso concorrente, pode-se utilizar `Deque` implementadas de forma sincronizada, como `Collections.synchronizedDeque`.

Exemplo de uso da `ArrayDeque`:

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Primeiro");
        deque.addLast("Último");
        deque.offerFirst("Início");
        deque.offerLast("Fim");

        System.out.println("Deque: " + deque);

        System.out.println("Removendo o primeiro elemento: " + deque.removeFirst());

        System.out.println("Deque após remoção: " + deque);
    }
}
```

Este código cria uma `ArrayDeque`, adiciona elementos no início e no final, imprime o deque e remove o primeiro elemento.

## Classe `Predicate<T>` 

Em Java, a classe `Predicate<T>` faz parte do pacote `java.util.function` e é uma interface funcional introduzida no Java 8 como parte do suporte para programação funcional. Uma interface funcional é aquela que possui apenas um método abstrato, e no caso da interface `Predicate<T>`, esse método é `test`.

A interface `Predicate<T>` representa uma função booleana que recebe um argumento do tipo `T` e retorna um valor booleano. A assinatura do método `test` é a seguinte:

```java
boolean test(T t);
```

Isso significa que você pode fornecer uma implementação para este método, que determinará se o predicado é verdadeiro ou falso para o argumento fornecido.

A classe `Predicate<T>` é frequentemente utilizada em operações de filtragem, onde você deseja verificar se os elementos de uma coleção atendem a uma determinada condição. Por exemplo, ao usar a API de Stream, você pode fazer algo como:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExemploPredicate {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("apple", "orange", "banana", "kiwi", "grape");

        // Criando um Predicate para verificar se a string tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = s -> s.length() > 5;

        // Filtrando a lista usando o Predicate
        List<String> resultado = lista.stream()
                                     .filter(maisDeCincoCaracteres)
                                     .collect(Collectors.toList());

        // Exibindo o resultado
        System.out.println(resultado); // Saída: [orange, banana]
    }
}
```

Neste exemplo, o predicado `maisDeCincoCaracteres` é utilizado para filtrar strings na lista com mais de 5 caracteres. O método `filter` da Stream API aceita um `Predicate` como argumento, permitindo uma expressividade e flexibilidade significativas em operações de filtragem e avaliação de condições em coleções.
