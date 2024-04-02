# part9

## Generics

Em Java, Generics é uma característica que permite que classes e métodos possam ser parametrizados por tipos. Isso proporciona maior flexibilidade, segurança de tipos e reutilização de código. Generics foram introduzidos na linguagem Java na versão 5.0 para lidar com problemas relacionados à falta de tipos parametrizados em coleções e algoritmos.

A principal vantagem de usar Generics é a capacidade de escrever código que é independente do tipo específico com o qual está lidando. Em vez de criar métodos ou classes separadas para diferentes tipos de dados, você pode criar uma única versão genérica que pode ser usada com qualquer tipo. Isso promove a reutilização de código e evita a duplicação.

Por exemplo, considere a classe ArrayList, que é uma coleção que armazena elementos em uma lista dinâmica. Antes de Generics, se você quisesse criar uma lista que armazenasse apenas Strings, teria que fazer algo assim:

```java
ArrayList listaDeStrings = new ArrayList();
```

No entanto, isso significa que a lista pode conter qualquer tipo de objeto, não apenas Strings. Com Generics, você pode especificar o tipo de elementos que a lista deve conter:

```java
ArrayList<String> listaDeStrings = new ArrayList<>();
```

Isso torna o código mais claro e seguro, pois você obtém verificação de tipos em tempo de compilação. Se você tentar adicionar um tipo diferente de objeto à lista, receberá um erro de compilação.

Além de coleções, Generics podem ser usados em classes, interfaces e métodos. Você pode criar classes genéricas, como por exemplo:

```java
public class Caixa<T> {
    private T conteudo;

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }
}
```

Dessa forma, você pode criar uma instância de Caixa que pode conter qualquer tipo de objeto:

```java
Caixa<Integer> caixaDeInteiros = new Caixa<>();
caixaDeInteiros.setConteudo(10);

Caixa<String> caixaDeStrings = new Caixa<>();
caixaDeStrings.setConteudo("Olá");
```

Generics também são úteis para criar classes e métodos que trabalham com tipos desconhecidos, como em estruturas de dados genéricas ou algoritmos de ordenação genéricos.

Em resumo, Generics em Java oferecem uma maneira poderosa de escrever código genérico e reutilizável, melhorando a segurança de tipos e a clareza do código. Eles são uma parte fundamental da linguagem Java moderna e são amplamente utilizados em muitas bibliotecas e frameworks.

## Comparable<T>

A interface `Comparable<T>` em Java é usada para definir uma ordem natural para objetos de uma determinada classe. Isso permite que esses objetos sejam comparados entre si e ordenados em coleções, como Listas ou Conjuntos, usando métodos como `Collections.sort()`.

A interface `Comparable<T>` contém um único método:

```java
int compareTo(T objeto)
```

O método `compareTo()` compara o objeto atual com outro objeto do mesmo tipo (`T`) e retorna um valor inteiro que indica a relação de ordem entre os dois objetos. Este método deve ser implementado pela classe que deseja ter uma ordem natural definida.

- Se o objeto atual for considerado menor que o objeto passado como parâmetro, o método deve retornar um número negativo.
- Se o objeto atual for considerado maior que o objeto passado como parâmetro, o método deve retornar um número positivo.
- Se os dois objetos forem considerados iguais, o método deve retornar zero.

Por exemplo, considere uma classe `Pessoa` que possui um atributo `idade`. Podemos implementar a interface `Comparable<Pessoa>` para permitir a ordenação de objetos `Pessoa` com base em suas idades:

```java
public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.idade - outraPessoa.getIdade();
    }
}
```

Com essa implementação, podemos ordenar uma lista de pessoas por idade simplesmente chamando `Collections.sort()`:

```java
List<Pessoa> pessoas = new ArrayList<>();
pessoas.add(new Pessoa("Alice", 30));
pessoas.add(new Pessoa("Bob", 25));
pessoas.add(new Pessoa("Carol", 35));

Collections.sort(pessoas);

for (Pessoa pessoa : pessoas) {
    System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
}
```

Isso resultaria na seguinte saída ordenada por idade:

```
Bob - 25
Alice - 30
Carol - 35
```

Essa é apenas uma aplicação comum da interface `Comparable<T>`. Ela permite que objetos sejam comparados e ordenados de acordo com uma ordem natural específica definida pela classe.

## Tipos coringa

Em Java, os "tipos coringa" são usados em conjunção com Generics para fornecer flexibilidade adicional ao lidar com tipos parametrizados desconhecidos ou genéricos. Eles são representados pelo caractere curinga (`?`) e são usados em situações em que você não se importa com o tipo exato, mas apenas com a estrutura ou funcionalidade associada ao tipo.

Existem três tipos principais de curingas em Java: o curinga não-limitado (`?`), o curinga limitado superior (`? extends Tipo`), e o curinga limitado inferior (`? super Tipo`).

1. **Curinga não-limitado (`?`)**:
   O curinga não-limitado é usado quando você não se importa com o tipo exato, mas apenas com o uso genérico da classe ou método. Por exemplo, se você tem uma lista de elementos de tipo desconhecido e só quer imprimir esses elementos, você pode usar um curinga não-limitado.

   ```java
   List<?> lista;
   ```

   Com esse tipo de declaração, você pode usar a lista para acessar os elementos, mas não pode adicionar novos elementos a ela (exceto `null`, porque qualquer referência pode ser atribuída a um tipo curinga).

2. **Curinga limitado superior (`? extends Tipo`)**:
   O curinga limitado superior é usado quando você deseja especificar que o tipo desconhecido deve ser uma subclasse de um tipo específico. Isso é útil quando você quer apenas ler elementos da estrutura, mas não adicioná-los. Por exemplo, se você tem uma lista de `Number` e só quer ler os elementos, pode usar um curinga limitado superior.

   ```java
   List<? extends Number> lista;
   ```

   Com essa declaração, você pode garantir que a lista só pode conter elementos que são subtipos de `Number`, permitindo operações de leitura seguras.

3. **Curinga limitado inferior (`? super Tipo`)**:
   O curinga limitado inferior é usado quando você deseja especificar que o tipo desconhecido deve ser uma superclasse de um tipo específico. Isso é útil quando você quer adicionar elementos à estrutura, mas não precisa ler os elementos com precisão. Por exemplo, se você tem uma lista de `Object` e deseja adicionar elementos a ela, pode usar um curinga limitado inferior.

   ```java
   List<? super Number> lista;
   ```

   Com essa declaração, você pode garantir que a lista pode conter objetos do tipo `Number` ou de suas superclasses, permitindo a adição segura de elementos.

Os tipos coringa fornecem flexibilidade ao lidar com código genérico em Java, permitindo lidar com tipos parametrizados desconhecidos de forma mais genérica e segura. No entanto, é importante entender suas limitações e usá-los com cuidado para evitar problemas de tipo em tempo de execução.

## Diferença entre Super T e Extends T

Em Java, `super T` e `extends T` são utilizados em contextos diferentes quando se trata de generics, especificando restrições de tipo em declarações de tipo coringa.

1. **`super T`**:
   - `super T` é utilizado para permitir que o tipo coringa represente qualquer superclasse de `T`, incluindo `T` e todas as suas superclasses.
   - É útil quando você precisa adicionar elementos a uma coleção genérica.
   - Por exemplo, `List<? super Number>` significa que a lista pode conter elementos de `Number` ou de qualquer superclasse de `Number`.
   - Permite adicionar elementos ao contêiner com segurança, pois você pode ter certeza de que eles são pelo menos do tipo `T` ou de uma superclasse de `T`.

2. **`extends T`**:
   - `extends T` é utilizado para permitir que o tipo coringa represente qualquer subtipo de `T`, incluindo `T` e todas as suas subclasses.
   - É útil quando você precisa apenas acessar elementos de uma coleção genérica, sem a necessidade de adicionar novos elementos.
   - Por exemplo, `List<? extends Number>` significa que a lista pode conter elementos de `Number` ou de qualquer subclasse de `Number`.
   - Restringe o tipo do elemento que pode ser acessado da coleção, garantindo que você só possa obter elementos do tipo `T` ou de uma subclasse de `T`.

Em resumo:

- `super T`: Permite adicionar elementos ao contêiner. Usado quando você precisa de uma coleção em que você pode adicionar elementos do tipo `T` ou de suas superclasses.
- `extends T`: Permite acessar elementos da coleção. Usado quando você precisa de uma coleção em que você só pode obter elementos do tipo `T` ou de suas subclasses.

A escolha entre `super T` e `extends T` depende do que você pretende fazer com a coleção genérica em seu código.

## Equals e Hashcode

Em Java, os métodos `equals()` e `hashCode()` estão relacionados à implementação de comparação e identificação de objetos, especialmente em estruturas de dados como coleções.

### equals():
O método `equals()` é usado para determinar se dois objetos são iguais. Ele é um método da classe `Object`, mas geralmente é sobrescrito nas classes personalizadas para fornecer uma comparação mais significativa com base no conteúdo dos objetos. O contrato geral do método `equals()` é o seguinte:

1. Reflexivo: Um objeto deve ser igual a si mesmo. Ou seja, `obj.equals(obj)` deve retornar `true`.
2. Simétrico: Se `obj1.equals(obj2)` retorna `true`, então `obj2.equals(obj1)` também deve retornar `true`.
3. Transitivo: Se `obj1.equals(obj2)` e `obj2.equals(obj3)` retornam `true`, então `obj1.equals(obj3)` também deve retornar `true`.
4. Consistente: O resultado do método `equals()` deve permanecer o mesmo se os objetos não forem modificados.
5. Não nulo: `obj.equals(null)` deve sempre retornar `false`.

### hashCode():
O método `hashCode()` é usado para retornar um valor numérico único que representa o objeto. Esse valor é frequentemente usado em algoritmos de tabela de dispersão (hash table) para melhorar a eficiência da busca de objetos em estruturas de dados como `HashMap` e `HashSet`. O contrato do método `hashCode()` é:

1. Se `obj1.equals(obj2)` retorna `true`, então `obj1.hashCode()` deve retornar o mesmo valor que `obj2.hashCode()`.
2. Não há garantia de que dois objetos diferentes tenham hashcodes diferentes. No entanto, é desejável que distribuam bem os objetos para evitar colisões em estruturas de dados hash.
3. Se `equals()` for sobrescrito em uma classe, `hashCode()` também deve ser sobrescrito.

A recomendação mais comum ao implementar `hashCode()` é usar os mesmos campos que são usados na implementação de `equals()` para calcular o valor hash. Isso garante que objetos iguais tenham o mesmo valor hash.

A não conformidade com essas regras pode levar a comportamentos inesperados em estruturas de dados baseadas em hash. Portanto, é importante sempre sobrescrever os métodos `equals()` e `hashCode()` juntos quando você está criando uma classe personalizada.

## Set<T>

Em Java, `Set<T>` é uma interface que representa uma coleção que não permite elementos duplicados. Ela estende a interface `Collection<T>` e define um conjunto de métodos para manipulação de conjuntos, como adicionar, remover, verificar a existência de elementos, entre outros. `Set<T>` é uma das principais implementações do conceito matemático de conjuntos na linguagem Java.

Aqui estão algumas características importantes de `Set<T>`:

1. **Não permite elementos duplicados**: Um `Set<T>` não permite que um elemento seja adicionado mais de uma vez. Se você tentar adicionar um elemento que já está presente no conjunto, a operação de adição será ignorada.

2. **Sem garantia de ordem**: A implementação de `Set<T>` geralmente não garante a ordem dos elementos. Ou seja, não há garantia de que os elementos serão armazenados na mesma ordem em que foram inseridos.

3. **Aceita elementos nulos**: `Set<T>` geralmente aceita elementos nulos, mas apenas um elemento nulo é permitido, já que não permite elementos duplicados.

4. **Implementações comuns**: Algumas das implementações mais comuns da interface `Set<T>` incluem `HashSet`, `TreeSet` e `LinkedHashSet`.

   - `HashSet`: Implementação baseada em tabela de dispersão (hash table), oferecendo alta performance de inserção, remoção e busca, mas não garante ordem dos elementos.
   - `TreeSet`: Implementação baseada em árvore, que mantém os elementos em ordem natural ou de acordo com um Comparator fornecido durante a criação do TreeSet.
   - `LinkedHashSet`: Implementação que mantém a ordem de inserção dos elementos, além de oferecer as operações de um HashSet.

Aqui está um exemplo de como usar um `Set<T>`:

```java
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adicionando elementos
        set.add("Maçã");
        set.add("Banana");
        set.add("Laranja");
        set.add("Maçã"); // Não será adicionado, pois "Maçã" já está presente

        // Verificando a existência de um elemento
        System.out.println("Contém 'Banana'?: " + set.contains("Banana")); // Deve imprimir true
        System.out.println("Contém 'Pêra'?: " + set.contains("Pêra")); // Deve imprimir false

        // Iterando sobre os elementos do conjunto
        System.out.println("Elementos do conjunto:");
        for (String elemento : set) {
            System.out.println(elemento);
        }

        // Removendo um elemento
        set.remove("Laranja");

        // Verificando o tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + set.size()); // Deve imprimir 2
    }
}
```

Neste exemplo, criamos um `Set<String>` usando a implementação `HashSet`. Adicionamos alguns elementos ao conjunto e verificamos a existência de elementos usando o método `contains()`. Em seguida, iteramos sobre os elementos do conjunto e removemos um deles. Por fim, verificamos o tamanho atual do conjunto usando o método `size()`.

## Comparator<T>

Em Java, a interface `Comparator<T>` é usada para fornecer uma maneira de comparar objetos de um tipo específico `T`. Essa interface é genérica, o que significa que você pode usá-la para comparar objetos de qualquer tipo.

A interface `Comparator<T>` contém um único método abstrato chamado `compare()`, que recebe dois argumentos do tipo `T` e retorna um valor inteiro. Este método é usado para comparar dois objetos e determinar sua ordem relativa. Aqui está a assinatura do método:

```java
int compare(T obj1, T obj2);
```

O método `compare()` retorna um número inteiro que segue as seguintes convenções:

- Retorna um valor negativo se o `obj1` deve ser classificado antes de `obj2`.
- Retorna zero se `obj1` e `obj2` são considerados iguais em termos de ordenação.
- Retorna um valor positivo se `obj1` deve ser classificado após `obj2`.

Esses retornos específicos permitem a implementação de várias estratégias de ordenação. Por exemplo, se você estiver classificando números inteiros em ordem crescente, poderá simplesmente subtrair `obj2` de `obj1`:

```java
int compare(Integer obj1, Integer obj2) {
    return obj1 - obj2;
}
```

Você também pode usar a interface `Comparator<T>` com métodos de ordenação como `Collections.sort()` ou com classes que requerem uma lógica de comparação, como em um `TreeSet` ou `PriorityQueue`. Além disso, a interface `Comparator<T>` pode ser usada em conjunto com a interface `Comparable<T>`, onde a última permite que um objeto defina sua própria lógica de comparação, enquanto a primeira permite a definição de uma lógica de comparação separada.

Por exemplo, você pode ter uma classe `Pessoa` que implementa `Comparable<Pessoa>` para definir sua ordem natural com base em algum critério (por exemplo, idade), e depois usar um `Comparator<Pessoa>` para classificar as pessoas com base em critérios diferentes (por exemplo, nome).

No geral, a interface `Comparator<T>` fornece uma maneira flexível e poderosa de comparar objetos em Java, permitindo a implementação de diferentes lógicas de ordenação com base em requisitos específicos.

## Lambda

Em Java, uma expressão lambda é uma nova característica introduzida na versão 8 da linguagem. Ela permite a criação de funções anônimas de forma concisa. As expressões lambda são úteis principalmente para simplificar o código ao lidar com interfaces funcionais, que são interfaces que possuem um único método abstrato.

A sintaxe básica de uma expressão lambda é a seguinte:

```java
(parametros) -> expressao
```

- `parametros`: São os parâmetros da função lambda, que podem ser zero ou mais, separados por vírgulas. Se não houver parâmetros, você ainda precisa usar parênteses vazios `()`.
- `->`: É o operador de seta, que separa os parâmetros da expressão lambda.
- `expressao`: É o corpo da função lambda, que pode ser uma única instrução ou um bloco de código encapsulado por chaves `{}`.

Por exemplo, considere uma interface funcional `Operacao` que define um método `executar()`:

```java
interface Operacao {
    int executar(int a, int b);
}
```

Você pode criar uma instância dessa interface usando uma expressão lambda:

```java
Operacao soma = (a, b) -> a + b;
```

Neste exemplo, a expressão lambda `(a, b) -> a + b` representa uma função que recebe dois inteiros `a` e `b` e retorna sua soma.

As expressões lambda são frequentemente usadas em conjunto com as APIs de stream e functional do Java 8. Por exemplo:

```java
List<String> lista = Arrays.asList("Java", "é", "fantástico");

lista.stream()
    .filter(s -> s.length() > 2)
    .map(s -> s.toUpperCase())
    .forEach(System.out::println);
```

Neste código, `s -> s.length() > 2` é uma expressão lambda que é usada para filtrar strings com comprimento superior a 2, e `s -> s.toUpperCase()` é uma expressão lambda que é usada para converter cada string para maiúsculas.

As expressões lambda tornam o código mais legível, conciso e mais fácil de escrever quando você precisa passar comportamentos como parâmetros de métodos ou quando precisa implementar interfaces funcionais. Elas desempenham um papel fundamental na adoção de um estilo de programação funcional em Java.
