# POO

## Herança

A herança é um dos conceitos fundamentais da Programação Orientada a Objetos (POO) e é amplamente utilizada na linguagem de programação Java. A herança permite que uma classe herde características e comportamentos de outra classe, promovendo a reutilização de código e facilitando a criação de hierarquias de classes.

Aqui estão alguns conceitos-chave relacionados à herança em Java:

1. **Classe Base (Superclasse):**
   - Uma classe base, também conhecida como superclasse, é a classe da qual outras classes herdam propriedades.
   - Contém atributos e métodos comuns que são compartilhados por suas subclasses.

```java
public class Animal {
    String nome;

    public void emitirSom() {
        System.out.println("Algum som genérico");
    }
}
```

2. **Classe Derivada (Subclasse):**
   - Uma classe derivada, também chamada de subclasse, é aquela que herda de uma superclasse.
   - Pode ter seus próprios atributos e métodos adicionais, além dos herdados da superclasse.

```java
public class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au Au");
    }
}
```

3. **Palavra-chave `extends`:**
   - Em Java, a herança é estabelecida usando a palavra-chave `extends`.
   - Na declaração da classe, a subclasse menciona a superclasse da qual está herdando.

```java
public class Subclasse extends Superclasse {
    // corpo da classe
}
```

4. **Método `super`:**
   - O operador `super` é usado para chamar métodos da superclasse ou acessar seus atributos.
   - Ajuda a evitar ambiguidades quando uma subclasse tem métodos ou atributos com o mesmo nome da superclasse.

```java
public class Cachorro extends Animal {
    public void emitirSom() {
        super.emitirSom();  // Chama o método da superclasse
        System.out.println("Latindo");
    }
}
```

5. **Herança de Construtores:**
   - Os construtores também podem ser herdados, mas é necessário garantir que o construtor da superclasse seja chamado usando `super()` na primeira linha do construtor da subclasse.

```java
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);  // Chama o construtor da superclasse
    }
}
```

A herança em Java fornece uma maneira poderosa de organizar e estruturar o código, promovendo a reutilização e a extensibilidade. No entanto, é importante usá-la com cuidado para evitar problemas de design, como a dependência excessiva entre classes. O encapsulamento e o polimorfismo são outros conceitos que complementam a herança na POO e são frequentemente usados em conjunto para criar sistemas robustos e flexíveis.
