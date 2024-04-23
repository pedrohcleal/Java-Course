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

### Runnable, Callable & Comparator

1. **Runnable**: A interface `Runnable` em Java é usada para criar threads independentes que podem ser executadas em paralelo. Ela define um único método chamado `run()`, que contém o código que será executado pela thread. Para utilizar a interface `Runnable`, você precisa implementar esse método em uma classe e então passá-la como argumento para um objeto `Thread`, ou usar um `ExecutorService` para executá-la.

   Exemplo:
   ```java
   public class MyRunnable implements Runnable {
       public void run() {
           // Código que será executado pela thread
       }
   }
   ```

2. **Callable**: A interface `Callable` é similar à `Runnable`, mas difere na capacidade de retornar um resultado e de lançar exceções. A interface `Callable` possui um método chamado `call()` que pode retornar um resultado e lançar exceções verificadas. Ela é frequentemente utilizada junto com um `ExecutorService` para executar tarefas assíncronas e recuperar resultados.

   Exemplo:
   ```java
   import java.util.concurrent.Callable;

   public class MyCallable implements Callable<String> {
       public String call() throws Exception {
           // Código que será executado assincronamente
           return "Resultado da tarefa";
       }
   }
   ```

3. **Comparator**: A interface `Comparator` é usada para definir uma ordem de classificação personalizada para objetos em Java. Ela permite que você compare dois objetos e especifique como eles devem ser ordenados. A interface `Comparator` possui um único método chamado `compare()`, que retorna um valor inteiro negativo, zero ou positivo, dependendo se o primeiro objeto deve ser classificado antes, igual ou depois do segundo objeto.

   Exemplo:
   ```java
   import java.util.Comparator;

   public class MyComparator implements Comparator<String> {
       public int compare(String s1, String s2) {
           return s1.compareTo(s2); // Ordena em ordem alfabética
       }
   }
   ```

Esses conceitos são fundamentais em Java para trabalhar com threads, execução assíncrona e ordenação de objetos.



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
