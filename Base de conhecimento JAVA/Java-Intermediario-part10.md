# Part10

# Consumer

Em Java, a classe `Consumer` é uma interface funcional pertencente ao pacote `java.util.function`. Ela é utilizada para representar uma operação que aceita um único argumento de entrada e não retorna nenhum resultado. O método definido na interface é `accept(T t)`, onde `T` é o tipo do argumento de entrada.

A principal finalidade de uma instância de `Consumer` é consumir, ou seja, utilizar o valor do argumento passado para realizar alguma ação, como por exemplo, imprimir o valor, modificá-lo ou aplicar uma função sobre ele.

Aqui está um exemplo básico de como usar a interface `Consumer`:

```java
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Definindo um Consumer que imprime o valor passado como argumento
        Consumer<String> consumer = (String s) -> System.out.println(s);

        // Usando o Consumer para imprimir uma mensagem
        consumer.accept("Olá, mundo!");
    }
}
```

Neste exemplo, criamos um `Consumer` que aceita uma string e imprime essa string no console. Em seguida, passamos uma string para o método `accept()`, que aciona a operação definida no `Consumer`.

Além disso, a interface `Consumer` é frequentemente utilizada em conjunto com Streams, que são parte do Java Stream API. Por exemplo, podemos usar um `Consumer` dentro de um método `forEach()` para realizar operações em cada elemento de um stream:

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Pedro", "Ana");

        // Utilizando um Consumer dentro do método forEach para imprimir cada elemento da lista
        nomes.forEach((String nome) -> System.out.println(nome));
    }
}
```

No código acima, estamos usando um `Consumer` para imprimir cada elemento da lista `nomes` utilizando o método `forEach()`. O `Consumer` é passado como um lambda que aceita uma string e imprime essa string no console.

Em resumo, a interface `Consumer` em Java é uma forma flexível e poderosa de definir operações que aceitam um argumento e realizam uma ação sobre ele, sem retornar nenhum valor. Ela é amplamente utilizada em programação funcional e em operações em coleções, especialmente em conjunto com Streams.

