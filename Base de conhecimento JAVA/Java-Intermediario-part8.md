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

## Interface comparada a Herança

Em Java, interfaces e heranças são dois conceitos fundamentais da programação orientada a objetos que permitem a criação e organização de classes de maneiras diferentes. Vamos explorar as semelhanças e diferenças entre interfaces e heranças:

### Semelhanças:

1. **Ambos são mecanismos de reutilização de código:**
   - Tanto interfaces quanto heranças são utilizados para promover a reutilização de código, permitindo que uma classe obtenha funcionalidades de outra classe ou interface.

2. **Promovem o polimorfismo:**
   - Ambos suportam o polimorfismo, que permite que objetos de classes diferentes sejam tratados de maneira uniforme. Isso facilita a substituição de implementações e a flexibilidade do código.

### Diferenças:

1. **Definição de Métodos:**
   - Em uma interface, todos os métodos são implicitamente públicos e abstratos. As interfaces não podem conter implementações de métodos. Já em heranças, os métodos podem ser públicos, protegidos ou com escopo de pacote, e podem ter implementações concretas.

2. **Múltipla Herança:**
   - Java suporta herança única de classes, o que significa que uma classe pode herdar de apenas uma classe. No entanto, uma classe pode implementar várias interfaces, proporcionando assim uma forma limitada de múltipla herança.

3. **Hierarquia de Classes:**
   - A herança cria uma hierarquia de classes, onde uma classe filha herda características de uma classe pai. Já as interfaces não fornecem uma hierarquia de classes, pois uma classe pode implementar várias interfaces sem ser forçada a seguir uma ordem específica.

4. **Construção de Objetos:**
   - Na herança, um objeto é construído a partir da classe pai e herda suas características. Em interfaces, um objeto é construído a partir da própria classe que implementa a interface, e a implementação dos métodos da interface é fornecida pela classe.

5. **Campos (Variáveis de Instância):**
   - Uma interface pode conter apenas constantes (variáveis finais) e não pode ter campos (variáveis de instância). Em contrapartida, uma classe que utiliza herança pode ter campos.

6. **Finalidade:**
   - Interfaces são frequentemente usadas para definir contratos que as classes devem seguir, enquanto a herança é mais voltada para a criação de uma hierarquia de classes para compartilhamento de comportamento e atributos.

Em resumo, enquanto herança é uma forma de estabelecer uma relação de "é um" entre classes, interfaces proporcionam uma maneira de definir contratos ou comportamentos específicos sem a necessidade de uma hierarquia de classes. Ambos são essenciais em programação orientada a objetos e são usados em conjunto para alcançar a modularidade e a reutilização de código.

### Exemplos:

Vamos criar exemplos simples para ilustrar a aplicação de interfaces e heranças em Java.

### Exemplo de Herança:

```java
// Classe base (superclasse)
class Animal {
    void emitirSom() {
        System.out.println("Som genérico de um animal");
    }
}

// Classe derivada (subclasse) que herda de Animal
class Cachorro extends Animal {
    // Pode herdar o método emitirSom ou sobrescrevê-lo
    void latir() {
        System.out.println("Latindo...");
    }
}

public class ExemploHeranca {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom(); // Herdado da classe Animal
        meuCachorro.latir();     // Próprio da classe Cachorro
    }
}
```

Neste exemplo, `Cachorro` herda da classe `Animal`. A classe `Cachorro` possui um método próprio (`latir`), além de herdar o método `emitirSom` da classe `Animal`.

### Exemplo de Interface:

```java
// Interface que define um contrato para animais que emitem som
interface EmissorSom {
    void emitirSom();
}

// Classe que implementa a interface EmissorSom
class Gato implements EmissorSom {
    // Implementação do método da interface
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

// Outra classe que implementa a mesma interface
class Pato implements EmissorSom {
    // Implementação do método da interface
    public void emitirSom() {
        System.out.println("Quack!");
    }
}

public class ExemploInterface {
    public static void main(String[] args) {
        Gato meuGato = new Gato();
        Pato meuPato = new Pato();

        meuGato.emitirSom(); // Implementação específica de Gato
        meuPato.emitirSom(); // Implementação específica de Pato
    }
}
```

Neste exemplo, as classes `Gato` e `Pato` implementam a interface `EmissorSom`, garantindo que ambas tenham uma implementação do método `emitirSom`. Cada classe fornece sua própria implementação específica.

Estes são exemplos básicos para ilustrar os conceitos. Em projetos reais, a herança e as interfaces são usadas para criar hierarquias de classes e definir contratos que garantem uma estrutura mais modular e extensível para o código.

## Herança múltipla e o problema do diamante

A herança múltipla é um conceito em programação orientada a objetos que permite que uma classe herde atributos e comportamentos de mais de uma classe pai. No entanto, a herança múltipla pode levar a um problema conhecido como "o problema do diamante" (diamond problem), que ocorre quando uma classe herda de duas classes que têm uma classe em comum como ancestral.

Vamos considerar um exemplo para entender melhor:

1. **Definição das Classes:**
   - Classe A
   - Classe B herda de A
   - Classe C herda de A
   - Classe D herda de B e C

```
     A
    / \
   B   C
    \ /
     D
```

2. **Problema do Diamante:**
   - Quando uma classe como D herda de duas classes que têm uma classe em comum (A), e se há métodos ou atributos na classe A, o compilador pode ficar confuso sobre qual implementação usar.

3. **Ambiguidade e Conflitos:**
   - Suponha que as classes B e C tenham um método chamado `foo()`, e D herde de ambas. Se um objeto da classe D chamar `foo()`, qual implementação deve ser usada? A de B ou a de C? Isso cria ambiguidade e pode resultar em conflitos.

4. **Soluções para o Problema do Diamante:**
   - **Renomear Métodos/Atributos:**
     - Uma abordagem é renomear métodos ou atributos nas classes derivadas para evitar conflitos. Por exemplo, renomear `foo()` para `fooB()` em B e `fooC()` em C.
   - **Utilizar Interfaces:**
     - Em linguagens que suportam herança múltipla por meio de interfaces, pode-se usar interfaces para fornecer uma implementação mais flexível e evitar conflitos diretos.
   - **Utilizar Delegação:**
     - Em vez de herdar diretamente de duas classes, uma classe pode ter instâncias dessas classes como membros e delegar chamadas de métodos apropriadas. Isso é conhecido como composição, uma alternativa à herança múltipla.

5. **Java e Herança Múltipla:**
   - Java não suporta herança múltipla direta de classes. No entanto, uma classe pode implementar várias interfaces, proporcionando uma forma limitada de herança múltipla.

O problema do diamante destaca os desafios associados à herança múltipla, e é por isso que algumas linguagens de programação, como Java, optaram por não suportá-la diretamente. A preferência por composição sobre herança é uma prática recomendada para evitar problemas relacionados à complexidade da herança múltipla.

## Interface Comparable

Em Java, a interface `Comparable` é parte do pacote `java.lang` e é usada para fornecer uma ordem natural aos objetos de uma classe. Essa interface contém um único método chamado `compareTo`, que é implementado pela classe cujas instâncias podem ser comparadas entre si. A implementação desse método determina como os objetos da classe são ordenados em relação uns aos outros.

A assinatura do método `compareTo` é a seguinte:

```java
int compareTo(T o);
```

- `o`: O objeto a ser comparado.

O método retorna um valor inteiro que indica a relação de ordem entre o objeto atual (aquele em que o método é chamado) e o objeto passado como argumento. Os possíveis valores de retorno são:

- Um valor negativo se o objeto atual for menor que o objeto comparado (`o`).
- Zero se o objeto atual for igual ao objeto comparado (`o`).
- Um valor positivo se o objeto atual for maior que o objeto comparado (`o`).

A implementação do método `compareTo` deve ser consistente com o método `equals`. Ou seja, se dois objetos são considerados iguais pelo método `equals`, então seu resultado de `compareTo` deve ser zero.

Exemplo de uma classe que implementa a interface `Comparable`:

```java
import java.util.Arrays;

class Exemplo implements Comparable<Exemplo> {
    private int valor;

    public Exemplo(int valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Exemplo outro) {
        // Comparação com base no valor
        return this.valor - outro.valor;
    }

    public static void main(String[] args) {
        Exemplo[] exemplos = {
            new Exemplo(3),
            new Exemplo(1),
            new Exemplo(2)
        };

        Arrays.sort(exemplos);

        for (Exemplo exemplo : exemplos) {
            System.out.println(exemplo.valor);
        }
    }
}
```

Neste exemplo, a classe `Exemplo` implementa `Comparable` e fornece uma ordenação com base no campo `valor`. Ao chamar `Arrays.sort(exemplos)`, os objetos do array `exemplos` são ordenados automaticamente com base na implementação do método `compareTo`.

##  Inversão de controle e Injeção de dependencia

A Inversão de Controle (IoC) e a Injeção de Dependência (DI) são conceitos fundamentais em design de software e são frequentemente utilizados em Java para promover um design mais flexível e modular. Vamos entender cada um deles:

1. **Inversão de Controle (IoC):**
   
   A IoC é um princípio de design onde o controle da execução de uma aplicação é invertido. Em vez de o desenvolvedor controlar explicitamente o fluxo do programa, o controle é transferido para um framework ou container. Em outras palavras, em vez de criar e chamar diretamente objetos e métodos, o framework é responsável por gerenciar essas interações.

   Em Java, isso muitas vezes é alcançado através do uso de frameworks de IoC, como o Spring Framework. O Spring, por exemplo, gerencia a criação, configuração e destruição de objetos (beans) em uma aplicação. Isso simplifica o código do desenvolvedor e promove a modularidade.

2. **Injeção de Dependência (DI):**
   
   A Injeção de Dependência é uma técnica relacionada à IoC. Ela lida com a forma como os componentes de uma aplicação obtêm suas dependências. Em vez de criar suas próprias dependências, um componente recebe suas dependências de uma fonte externa. Isso promove a reutilização de código, facilita a substituição de componentes e torna o sistema mais testável.

   Existem três formas principais de realizar a Injeção de Dependência:

   - **Injeção de Dependência via Construtor (Constructor Injection):** As dependências são fornecidas através do construtor da classe.
   
   - **Injeção de Dependência via Método (Method Injection):** As dependências são passadas através de métodos.
   
   - **Injeção de Dependência via Propriedade (Property Injection):** As dependências são atribuídas a propriedades do objeto.

   Exemplo de Injeção de Dependência via Construtor:

   ```java
   public class ExemploService {
       private final Dependencia dependencia;

       public ExemploService(Dependencia dependencia) {
           this.dependencia = dependencia;
       }

       // Métodos da classe que utilizam a dependência
   }
   ```

   No exemplo acima, a dependência é passada no construtor, permitindo uma fácil substituição ou alteração da implementação da dependência.

Ao utilizar a IoC e a DI em conjunto, desenvolvedores podem criar sistemas mais flexíveis, testáveis e de fácil manutenção. Esses conceitos são especialmente prevalentes em frameworks como o Spring, que fazem uso extensivo dessas práticas para facilitar o desenvolvimento de aplicações Java empresariais.
