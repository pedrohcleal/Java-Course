# Java Intermediário part 3

## Arrays

Em Java, um array é uma estrutura de dados que permite armazenar um conjunto de valores do mesmo tipo sob um único nome. Os arrays são usados para armazenar coleções de elementos, como números inteiros, números de ponto flutuante, objetos personalizados e assim por diante. Cada elemento em um array é acessado através de um índice numérico, que começa em 0 para o primeiro elemento.

Aqui estão alguns conceitos-chave sobre arrays em Java:

1. Declaração de um array:
   Para declarar um array em Java, você precisa especificar o tipo de dados dos elementos que o array conterá, seguido pelo nome do array e os colchetes `[]`. Por exemplo:
   
   ```java
   int[] numeros; // Declaração de um array de inteiros
   String[] nomes; // Declaração de um array de strings
   ```

2. Inicialização de um array:
   Um array pode ser inicializado de várias maneiras, incluindo:
   
   a. Alocando espaço para um array com um tamanho específico:
   
      ```java
      numeros = new int[5]; // Cria um array de inteiros com 5 elementos
      ```
   
   b. Inicializando um array com valores iniciais:
   
      ```java
      int[] numeros = {1, 2, 3, 4, 5}; // Inicializa um array de inteiros com valores
      ```

3. Acesso aos elementos do array:
   Os elementos em um array são acessados por meio de seus índices. O índice do primeiro elemento é 0, o segundo é 1, e assim por diante. Por exemplo:
   
   ```java
   int primeiroNumero = numeros[0]; // Acessa o primeiro elemento do array
   int segundoNumero = numeros[1]; // Acessa o segundo elemento do array
   ```

4. Tamanho do array:
   Você pode obter o tamanho de um array usando a propriedade `length`. Por exemplo:
   
   ```java
   int tamanho = numeros.length; // Retorna o tamanho do array 'numeros'
   ```

5. Arrays multidimensionais:
   Java suporta arrays multidimensionais, que são arrays de arrays. Por exemplo, um array bidimensional pode ser declarado e inicializado da seguinte forma:
   
   ```java
   int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
   ```

Arrays são uma estrutura de dados fundamental em Java e são amplamente usados em programação para armazenar e manipular coleções de dados. Eles oferecem uma maneira eficiente de gerenciar conjuntos de elementos do mesmo tipo.

### Operações com arrays

As operações em arrays em Java incluem uma variedade de ações que você pode realizar para manipular os elementos em um array. Vou descrever algumas das operações mais comuns que você pode realizar em arrays:

1. **Acesso a elementos**: Você pode acessar os elementos de um array usando o índice. O índice começa em 0 para o primeiro elemento. Por exemplo:
   
   ```java
   int[] numeros = {1, 2, 3, 4, 5};
   int primeiroNumero = numeros[0]; // Acessa o primeiro elemento (1)
   int segundoNumero = numeros[1]; // Acessa o segundo elemento (2)
   ```

2. **Modificação de elementos**: Você pode modificar os elementos de um array atribuindo um novo valor a eles usando o índice. Por exemplo:
   
   ```java
   numeros[2] = 10; // Modifica o terceiro elemento para 10
   ```

3. **Iteração**: Você pode percorrer todos os elementos de um array usando loops como `for` ou `foreach`. Isso é útil para realizar operações em todos os elementos do array.
   
   ```java
   for (int i = 0; i < numeros.length; i++) {
       System.out.println(numeros[i]);
   }
   
   // Usando foreach (disponível a partir do Java 5)
   for (int numero : numeros) {
       System.out.println(numero);
   }
   ```

4. **Encontrar o valor máximo e mínimo**: Você pode percorrer um array para encontrar o valor máximo e mínimo, comparando os elementos em um loop.

5. **Adicionar elementos**: Em Java, o tamanho de um array é fixo após a sua criação. Se você precisar adicionar elementos dinamicamente, é melhor considerar o uso de uma coleção, como `ArrayList`. As coleções permitem adicionar e remover elementos de forma dinâmica.

6. **Pesquisa**: Você pode pesquisar um array para encontrar um elemento específico. Isso pode ser feito usando um loop `for` ou `foreach` e comparando cada elemento com o valor desejado.

7. **Ordenação**: Se você precisar ordenar os elementos em um array, pode usar métodos de ordenação, como o algoritmo de classificação de bolha ou a classe `Arrays` que fornece o método `sort()` para ordenar os elementos em ordem crescente.

8. **Remoção de elementos**: Se você precisar remover elementos de um array, pode criar um novo array sem esses elementos ou definir o valor de um elemento específico como um valor nulo (dependendo do tipo de dados do array).

9. **Concatenação**: Para combinar dois arrays em um único array, você pode criar um novo array e copiar os elementos dos arrays originais para o novo.

10. **Cópia de arrays**: Para criar uma cópia de um array, você pode usar a função `System.arraycopy()` ou o método `clone()`.

11. **Verificação de igualdade**: Para verificar se dois arrays são iguais em conteúdo, você pode usar o método `Arrays.equals()`.

Lembre-se de que o tratamento de exceções é importante ao lidar com arrays, especialmente ao acessar elementos usando índices. Certifique-se de verificar os limites do array para evitar exceções `ArrayIndexOutOfBoundsException`. Além disso, considere usar as classes da biblioteca Java, como `Arrays` e `Collections`, que fornecem métodos úteis para muitas operações comuns em arrays e coleções.

### Array de objetos no Java

Um array de objetos em Java é uma estrutura de dados que permite armazenar múltiplos objetos de uma classe específica sob um único nome. Cada elemento do array contém uma referência a um objeto da classe, não o objeto em si. Isso significa que os objetos em um array são manipulados por referência. Aqui está uma visão geral de como trabalhar com arrays de objetos em Java:

1. **Declaração de um array de objetos**:
   Para declarar um array de objetos em Java, você deve especificar o tipo da classe dos objetos, seguido pelo nome do array e os colchetes `[]`. Por exemplo:
   
   ```java
   MinhaClasse[] meuArray; // Declara um array de objetos da classe MinhaClasse
   ```

2. **Inicialização de um array de objetos**:
   Após declarar o array, você pode inicializá-lo de duas maneiras:

   a. **Usando `new`**:
      Você pode criar uma instância do array com um tamanho específico usando a palavra-chave `new`:
   
      ```java
      meuArray = new MinhaClasse[5]; // Cria um array de objetos da classe MinhaClasse com 5 elementos
      ```

   b. **Atribuição direta de objetos**:
      Você pode criar objetos da classe diretamente e atribuí-los ao array:
   
      ```java
      MinhaClasse[] meuArray = new MinhaClasse[3]; // Cria um array com espaço para 3 objetos
      meuArray[0] = new MinhaClasse(); // Inicializa o primeiro objeto
      meuArray[1] = new MinhaClasse(); // Inicializa o segundo objeto
      meuArray[2] = new MinhaClasse(); // Inicializa o terceiro objeto
      ```

3. **Acesso a objetos no array**:
   Os objetos no array são acessados por meio de seus índices. O índice do primeiro elemento é 0, o do segundo é 1 e assim por diante. Você pode acessar os métodos e atributos dos objetos da classe da seguinte maneira:

   ```java
   MinhaClasse objeto1 = meuArray[0]; // Acessa o primeiro objeto no array
   objeto1.metodo(); // Chama um método da classe
   int valor = objeto1.atributo; // Acessa um atributo da classe
   ```

4. **Iteração sobre objetos no array**:
   Você pode percorrer os objetos em um array de objetos usando loops `for` ou `foreach`:

   ```java
   for (int i = 0; i < meuArray.length; i++) {
       MinhaClasse objeto = meuArray[i];
       // Faça algo com a instância da classe MinhaClasse
   }
   
   // Usando foreach (disponível a partir do Java 5)
   for (MinhaClasse objeto : meuArray) {
       // Faça algo com a instância da classe MinhaClasse
   }
   ```

5. **Redimensionamento de arrays de objetos**:
   Em Java, os arrays têm tamanho fixo após a sua criação. Se você precisar adicionar ou remover objetos dinamicamente, é recomendável considerar o uso de coleções, como `ArrayList`, que permitem redimensionamento dinâmico.

6. **Operações comuns em arrays de objetos**:
   As operações comuns em arrays de objetos incluem adicionar, remover, encontrar, ordenar e modificar objetos. Você pode fazer essas operações usando loops e métodos da classe da mesma forma que faria com objetos independentes.

Lembre-se de que, em um array de objetos, você está manipulando referências aos objetos, não os objetos reais. Portanto, qualquer modificação em um objeto refletirá nas outras referências a esse objeto no array. Certifique-se de compreender bem a manipulação de objetos e referências para evitar resultados inesperados.

## Listas no Java: ArrayList & LinkedList

Em Java, uma lista é uma estrutura de dados que armazena uma coleção de elementos, permitindo a inserção, remoção e recuperação de elementos de forma flexível. Existem várias implementações de listas em Java, sendo as mais comuns as `ArrayList` e `LinkedList`. Ambas implementam a interface `List` da API de Coleções do Java, o que significa que compartilham métodos comuns para manipulação de listas.

Aqui estão alguns conceitos importantes relacionados às listas em Java:

1. **ArrayList**:
   - O `ArrayList` é uma implementação de lista baseada em arrays dinâmicos. Ele é muito eficiente para acessar elementos pelo índice, mas não é tão eficiente para inserções e remoções no meio da lista.

2. **LinkedList**:
   - A `LinkedList` é uma implementação de lista baseada em listas duplamente encadeadas. É mais eficiente para inserções e remoções no meio da lista, mas o acesso aos elementos pelo índice é mais lento em comparação com o `ArrayList`.

3. **Interface List**:
   - Tanto `ArrayList` quanto `LinkedList` implementam a interface `List`, o que significa que elas compartilham métodos comuns, como `add()`, `remove()`, `get()`, `size()`, `clear()`, entre outros. Isso facilita a troca entre essas implementações.

4. **Genéricos**:
   - As listas em Java podem ser usadas com genéricos, o que permite que você especifique o tipo de elementos que a lista irá conter. Isso torna o código mais seguro e legível.

5. **Iteração**:
   - Você pode percorrer os elementos de uma lista usando um loop for, um loop for-each ou um iterador. O loop for-each é frequentemente preferido, pois é mais simples e legível.

Exemplo de uso de uma lista em Java:

```java
import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        // Criando uma lista de strings
        List<String> listaDeNomes = new ArrayList<>();

        // Adicionando elementos à lista
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Carol");

        // Acessando elementos
        String primeiroNome = listaDeNomes.get(0);
        System.out.println("Primeiro nome: " + primeiroNome);

        // Iteração usando for-each
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Removendo um elemento
        listaDeNomes.remove(1); // Remove "Bob"

        // Tamanho da lista
        int tamanho = listaDeNomes.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Verificando se a lista contém um elemento
        boolean contemCarol = listaDeNomes.contains("Carol");
        System.out.println("A lista contém Carol? " + contemCarol);
    }
}
```

Lembre-se de importar o pacote `java.util.List` e escolher a implementação de lista que melhor atende às suas necessidades, dependendo das operações que você planeja realizar com a lista.

### Métodos com listas

Em Java, as listas são uma parte essencial da linguagem e são fornecidas através da interface `List` que é implementada por várias classes, sendo a mais comum a `ArrayList`. As listas em Java são estruturas de dados dinâmicas que podem crescer ou diminuir de tamanho conforme necessário.

Aqui estão alguns métodos comuns associados às listas em Java:

1. **Adição de Elementos:**
   - `add(E elemento)`: Adiciona um elemento ao final da lista.
   - `add(int índice, E elemento)`: Adiciona um elemento em um índice específico da lista.

```java
List<String> lista = new ArrayList<>();
lista.add("Elemento1");
lista.add("Elemento2");
lista.add(1, "ElementoInserido");
```

2. **Remoção de Elementos:**
   - `remove(Object objeto)`: Remove o primeiro ocorrente do objeto na lista.
   - `remove(int índice)`: Remove o elemento no índice específico da lista.

```java
lista.remove("Elemento1");
lista.remove(0);
```

3. **Acesso a Elementos:**
   - `get(int índice)`: Retorna o elemento no índice especificado.
   - `set(int índice, E elemento)`: Substitui o elemento no índice especificado pelo novo elemento.

```java
String elemento = lista.get(0);
lista.set(1, "NovoElemento");
```

4. **Tamanho e Verificação:**
   - `size()`: Retorna o número de elementos na lista.
   - `isEmpty()`: Retorna verdadeiro se a lista estiver vazia.

```java
int tamanho = lista.size();
boolean vazia = lista.isEmpty();
```

5. **Verificação de Presença:**
   - `contains(Object objeto)`: Retorna verdadeiro se a lista contiver o objeto especificado.

```java
boolean contem = lista.contains("Elemento1");
```

6. **Iteração:**
   - Você pode usar loops, como `for` ou `foreach`, para iterar sobre os elementos da lista.

```java
for (String elemento : lista) {
    System.out.println(elemento);
}
```

Esses são apenas alguns dos métodos básicos disponíveis para manipulação de listas em Java. A escolha entre diferentes implementações de lista, como `ArrayList`, `LinkedList`, ou `Vector`, depende dos requisitos específicos do seu programa em termos de desempenho e uso.

