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
