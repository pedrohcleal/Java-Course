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
