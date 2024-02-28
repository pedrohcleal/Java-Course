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

## Interface

Uma interface em Java é uma coleção de métodos abstratos (sem implementação) e constantes (variáveis estáticas finais) que podem ser implementados por classes que desejam fornecer uma implementação específica para esses métodos. As interfaces proporcionam um meio de definir um contrato ou um conjunto de regras que as classes devem seguir. Em Java, as interfaces são uma parte fundamental da programação orientada a objetos e são frequentemente usadas para atingir a abstração e a implementação de múltiplas interfaces.

Aqui estão alguns pontos importantes sobre interfaces em Java:

1. **Declaração de Interface:**
   - Para declarar uma interface, use a palavra-chave `interface` seguida pelo nome da interface. Por exemplo:

     ```java
     public interface Imprimivel {
         void imprimir();
     }
     ```

2. **Métodos Abstratos:**
   - Todos os métodos em uma interface são implicitamente públicos e abstratos. Não há necessidade de usar as palavras-chave `public` e `abstract` ao declarar esses métodos.

3. **Constantes:**
   - Interfaces podem conter constantes, que são implicitamente públicas, estáticas e finais.
   - Por exemplo:

     ```java
     public interface Cores {
         String VERMELHO = "Vermelho";
         String AZUL = "Azul";
         String VERDE = "Verde";
     }
     ```

4. **Implementação em Classes:**
   - Uma classe pode implementar uma ou mais interfaces usando a palavra-chave `implements`.
   - Quando uma classe implementa uma interface, ela deve fornecer implementações para todos os métodos abstratos definidos pela interface.

     ```java
     public class Impressora implements Imprimivel {
         @Override
         public void imprimir() {
             System.out.println("Imprimindo...");
         }
     }
     ```

5. **Herança de Interface:**
   - Interfaces podem estender outras interfaces usando a palavra-chave `extends`. Isso permite criar hierarquias de interfaces.

     ```java
     public interface ImprimivelColorido extends Imprimivel, Cores {
         void imprimirColorido();
     }
     ```

6. **Default Methods e Métodos Estáticos (Java 8 em diante):**
   - A partir do Java 8, interfaces podem ter métodos com implementação utilizando a palavra-chave `default`.
   - Também é possível ter métodos estáticos em interfaces.

     ```java
     public interface Calculadora {
         default int somar(int a, int b) {
             return a + b;
         }

         static int multiplicar(int a, int b) {
             return a * b;
         }
     }
     ```

7. **Uso de Interfaces:**
   - Interfaces são amplamente utilizadas em Java para definir contratos comuns, possibilitando o desenvolvimento de classes que compartilham funcionalidades comuns, mas podem ter implementações específicas.

     ```java
     public class Exemplo implements Imprimivel, Cores {
         @Override
         public void imprimir() {
             System.out.println("Implementação do método imprimir");
         }
     }
     ```

Interfaces em Java fornecem um mecanismo flexível para definir contratos e promovem a criação de código mais modular e reutilizável. Elas são uma parte crucial da programação orientada a objetos, facilitando a implementação de polimorfismo e permitindo a construção de sistemas mais flexíveis e extensíveis.
