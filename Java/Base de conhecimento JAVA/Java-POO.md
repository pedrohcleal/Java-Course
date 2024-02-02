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


## Upcasting e Downcasting

Upcasting e downcasting são termos relacionados a manipulação de tipos em herança, especialmente em linguagens de programação orientadas a objetos, como Java. Vamos entender cada um desses conceitos:

1. **Upcasting:**
   - Upcasting refere-se à conversão de um objeto de uma classe mais específica para uma classe mais genérica na hierarquia de herança.
   - Ocorre implicitamente quando você atribui uma instância de uma subclasse a uma variável de tipo de superclasse.
   - Não há necessidade de uma sintaxe especial; a conversão é feita automaticamente pelo compilador.

   Exemplo em Java:

   ```java
   Animal animal = new Cachorro();
   ```

   Neste exemplo, `Cachorro` é uma subclasse de `Animal`, e a instância de `Cachorro` é atribuída a uma variável de tipo `Animal`. Isso é upcasting.

2. **Downcasting:**
   - Downcasting é a conversão de um objeto de uma classe mais genérica para uma classe mais específica.
   - É uma operação mais arriscada, pois você está tentando converter um tipo mais amplo para um tipo mais específico, o que pode resultar em uma exceção em tempo de execução se o objeto não for realmente uma instância da classe desejada.
   - É necessário usar a sintaxe de downcasting e verificar a compatibilidade usando o operador `instanceof`.

   Exemplo em Java:

   ```java
   Animal animal = new Cachorro();
   if (animal instanceof Cachorro) {
       Cachorro cachorro = (Cachorro) animal;  // Downcasting
       cachorro.latir();
   }
   ```

   Neste exemplo, `animal` é um `Animal`, mas o downcasting é feito para verificar se ele é realmente um `Cachorro` antes de chamar métodos específicos de `Cachorro`.

É importante ter cuidado ao usar downcasting, pois pode levar a exceções em tempo de execução se a verificação não for feita corretamente. Uma prática recomendada é usar `instanceof` para verificar a compatibilidade antes de realizar downcasting e garantir que o objeto seja realmente uma instância da classe desejada.

## instaceof

A palavra-chave `instanceof` em Java é um operador usado para testar se um objeto é uma instância de uma determinada classe, de uma subclasse ou de uma interface. O `instanceof` retorna um valor booleano, indicando se o objeto em questão pode ser convertido para o tipo especificado sem causar uma exceção em tempo de execução.

A sintaxe básica é a seguinte:

```java
if (objeto instanceof Tipo) {
    // Código a ser executado se o objeto for uma instância do Tipo
}
```

Aqui está um exemplo prático:

```java
public class Exemplo {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.latir();
        } else if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            gato.miar();
        }
    }
}
```

Neste exemplo, `animal` é uma instância de `Cachorro`, e o `instanceof` é usado para verificar se `animal` é uma instância de `Cachorro` ou `Gato`. Isso ajuda a evitar exceções em tempo de execução ao realizar downcasting, garantindo que a conversão seja segura.

É importante usar `instanceof` com cautela e considerar se há uma maneira mais apropriada de estruturar o código, como o uso de polimorfismo e métodos polimórficos, para evitar verificações excessivas de tipos. O `instanceof` é útil em situações em que a hierarquia de classes é necessária e é necessário realizar operações específicas com base no tipo de objeto em tempo de execução.

## Super()

O método `super()` é uma construção em Java usada dentro dos construtores de uma subclasse para chamar explicitamente o construtor da superclasse. Esse é um conceito fundamental quando se trabalha com herança, e é usado para garantir que a inicialização adequada da parte herdada da classe ocorra.

A chamada `super()` deve ser a primeira instrução no corpo do construtor da subclasse. Se não for explicitamente chamado, o Java automaticamente insere uma chamada implícita para o construtor padrão da superclasse.

Aqui está um exemplo para ilustrar o uso do `super()`:

```java
class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Algum som genérico");
    }
}

class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, String raca) {
        super(nome);  // Chamada explícita ao construtor da superclasse
        this.raca = raca;
    }

    public void latir() {
        System.out.println("Au Au");
    }
}
```

Neste exemplo, a classe `Cachorro` estende a classe `Animal`. O construtor da classe `Animal` recebe um parâmetro `nome`. Para garantir que o construtor da superclasse seja chamado corretamente ao instanciar um objeto da subclasse `Cachorro`, a instrução `super(nome)` é usada no construtor da subclasse.

Essencialmente, `super()` permite que a subclasse inicialize a parte herdada da sua superclasse antes de executar qualquer lógica específica da subclasse. Isso é útil para garantir que o estado da superclasse seja configurado corretamente antes que a subclasse faça suas próprias operações de inicialização.

Vale notar que se a superclasse não tiver um construtor padrão (sem parâmetros), a chamada para `super()` deve incluir os argumentos necessários para corresponder a uma das assinaturas de construtores da superclasse.


## @Override

A sobreposição (ou override em inglês) é um conceito na Programação Orientada a Objetos (POO) que permite a uma subclasse fornecer uma implementação específica de um método que já está definido em sua superclasse. Isso significa que a subclasse está substituindo (ou sobrepondo) a implementação da superclasse com sua própria implementação. Isso é particularmente útil para personalizar o comportamento de um método em uma classe derivada.

Na linguagem de programação Java, a anotação `@Override` é usada para indicar explicitamente que um método em uma classe está sendo sobreposto de uma superclasse. O compilador Java pode usar essa anotação para verificar se o método na subclasse realmente está substituindo um método na superclasse. Se não, o compilador gera um erro.

Aqui está um exemplo simples:

```java
class Animal {
    void fazerBarulho() {
        System.out.println("Algum som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerBarulho() {
        System.out.println("Latindo");
    }
}
```

Neste exemplo, a classe `Cachorro` estende a classe `Animal` e sobrepõe o método `fazerBarulho`. A anotação `@Override` é usada para indicar explicitamente que o método está substituindo o método da superclasse. Se houver um erro de digitação no nome do método ou se o método na superclasse não existir, o compilador gerará um erro.

Além disso, usar a anotação `@Override` não é estritamente necessário, mas é uma prática recomendada porque ajuda a evitar erros de digitação e sinaliza explicitamente a intenção do programador de sobrepor um método da superclasse.

Em resumo, a sobreposição permite que uma subclasse forneça uma implementação específica para um método da superclasse, enquanto a anotação `@Override` ajuda a garantir que essa sobreposição seja feita corretamente, evitando erros comuns.
