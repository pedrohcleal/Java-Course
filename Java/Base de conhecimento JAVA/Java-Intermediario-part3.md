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
