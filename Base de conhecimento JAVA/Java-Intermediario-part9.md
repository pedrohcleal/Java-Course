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
