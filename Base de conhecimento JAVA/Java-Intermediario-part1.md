# Java intermediário part1

## Classes em Java

Em Java, as classes são a base da programação orientada a objetos (POO) e desempenham um papel fundamental na criação de objetos e na organização do código. Aqui está uma descrição completa das classes em Java:

1. **Declaração de Classe:**
   Para criar uma classe em Java, você usa a palavra-chave `class`, seguida pelo nome da classe. O nome da classe deve começar com uma letra maiúscula e seguir a convenção CamelCase, onde cada palavra subsequente começa com uma letra maiúscula.

   ```java
   public class MinhaClasse {
       // corpo da classe
   }
   ```

2. **Atributos (Variáveis de Instância):**
   As classes podem conter variáveis de instância, que são também conhecidas como atributos ou campos. Essas variáveis representam características ou estados do objeto criado a partir da classe.

   ```java
   public class Pessoa {
       String nome;
       int idade;
   }
   ```

3. **Métodos (Funções de Instância):**
   As classes podem conter métodos, que são funções que definem o comportamento dos objetos dessa classe. Os métodos são usados para executar operações específicas em instâncias da classe.

   ```java
   public class Calculadora {
       public int somar(int a, int b) {
           return a + b;
       }
   }
   ```

4. **Construtor:**
   Um construtor é um método especial que é chamado quando um objeto da classe é criado. Ele é usado para inicializar os atributos da classe e pode ser sobrecarregado com diferentes assinaturas.

   ```java
   public class Pessoa {
       String nome;
       int idade;

       public Pessoa(String nome, int idade) {
           this.nome = nome;
           this.idade = idade;
       }
   }
   ```

5. **Método Main:**
   A classe Java que contém o método `main` é geralmente usada como ponto de entrada para o programa. É aqui que a execução do programa começa.

   ```java
   public class MinhaAplicacao {
       public static void main(String[] args) {
           // Código da aplicação
       }
   }
   ```

6. **Membros de Acesso:**
   As classes em Java podem ter modificadores de acesso, como `public`, `private`, `protected` e `package-private`, que controlam a visibilidade dos membros da classe. Isso ajuda a encapsular os detalhes de implementação e a proteger os dados.

   ```java
   public class Exemplo {
       private int valorPrivado;
       public String valorPublico;
   }
   ```

7. **Herança:**
   Java suporta herança, permitindo que você crie novas classes (subclasses) com base em classes existentes (superclasses). A herança permite reutilizar código e estabelecer uma hierarquia de classes.

   ```java
   public class Animal {
       // Atributos e métodos comuns a todos os animais
   }

   public class Cachorro extends Animal {
       // Atributos e métodos específicos de cachorros
   }
   ```

8. **Polimorfismo:**
   O polimorfismo permite que objetos de classes diferentes sejam tratados como objetos de uma classe comum por meio da sobrescrita de métodos. Isso facilita a flexibilidade e extensibilidade do código.

   ```java
   public class Animal {
       public void fazerSom() {
           // Implementação padrão
       }
   }

   public class Cachorro extends Animal {
       public void fazerSom() {
           System.out.println("Cachorro fazendo som: Woof!");
       }
   }
   ```

9. **Encapsulamento:**
   O encapsulamento é um princípio da POO que envolve ocultar os detalhes de implementação e fornecer uma interface pública para interagir com um objeto. Isso é alcançado usando modificadores de acesso e métodos getters e setters.

   ```java
   public class ContaBancaria {
       private double saldo;

       public void depositar(double valor) {
           // Implementação para depositar dinheiro
       }

       public void sacar(double valor) {
           // Implementação para sacar dinheiro
       }

       public double getSaldo() {
           return saldo;
       }
   }
   ```

Esses são os principais conceitos relacionados a classes em Java. As classes são a base da programação orientada a objetos em Java e são usadas para modelar objetos do mundo real e implementar funcionalidades em um programa.

## Métodos em Object

Em Java, a classe `Object` é a superclasse de todas as outras classes. Isso significa que cada classe em Java é direta ou indiretamente derivada da classe `Object`. A classe `Object` define métodos que estão disponíveis para todas as instâncias de objetos em Java. Aqui estão alguns dos métodos mais comuns e úteis fornecidos pela classe `Object`:

1. `toString()`: Este método retorna uma representação em string do objeto. Por padrão, ele retorna uma representação do objeto no formato "nome_da_classe@identificador_hash". Você pode substituir esse método em suas próprias classes para fornecer uma representação mais significativa em string do objeto.

```java
@Override
public String toString() {
    return "MinhaClasse{" +
           "atributo1=" + atributo1 +
           ", atributo2=" + atributo2 +
           '}';
}
```

2. `equals(Object obj)`: Este método é usado para comparar se dois objetos são iguais. Por padrão, ele verifica se as referências dos objetos são idênticas (ou seja, os objetos têm o mesmo endereço de memória). Muitas vezes, é necessário sobrescrever este método em suas próprias classes para realizar uma comparação significativa com base no conteúdo dos objetos.

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    MinhaClasse outraClasse = (MinhaClasse) obj;
    return atributo1 == outraClasse.atributo1 &&
           Objects.equals(atributo2, outraClasse.atributo2);
}
```

3. `hashCode()`: Este método retorna um valor numérico que representa o objeto. Geralmente, é usado em conjunto com o método `equals()` para garantir que objetos iguais produzam o mesmo valor de hash.

```java
@Override
public int hashCode() {
    return Objects.hash(atributo1, atributo2);
}
```

4. `getClass()`: Retorna um objeto `Class` que representa a classe do objeto em tempo de execução.

```java
Class<?> classeDoObjeto = meuObjeto.getClass();
```

Estes são apenas alguns dos métodos fornecidos pela classe `Object`. Você pode usá-los diretamente em todos os objetos em Java e, se necessário, sobrescrevê-los em suas próprias classes para personalizar o comportamento de acordo com as necessidades do seu programa.

## Membros estáticos

Em Java, membros estáticos (ou métodos e campos estáticos) são elementos de uma classe que pertencem à própria classe em vez de pertencerem a instâncias específicas dessa classe. Isso significa que eles são compartilhados por todas as instâncias da classe e podem ser acessados diretamente através do nome da classe, sem a necessidade de criar uma instância da classe.

Existem dois tipos de membros estáticos em Java: campos estáticos (ou variáveis estáticas) e métodos estáticos. Aqui está uma descrição mais detalhada de ambos:

1. Campos Estáticos (Variáveis Estáticas):
   - Um campo estático é uma variável que é compartilhada por todas as instâncias da classe.
   - É declarado com a palavra-chave `static` antes do tipo de dado.
   - Geralmente, os campos estáticos são usados para armazenar informações que são relevantes para a classe como um todo, em vez de para instâncias individuais.
   - Eles são inicializados apenas uma vez, quando a classe é carregada pela primeira vez.
   - Pode ser acessado diretamente usando o nome da classe, seguido do nome do campo.
   
   Exemplo de declaração e uso de um campo estático:
   
   ```java
   public class MinhaClasse {
       public static int contador = 0;
   }
   
   // Uso do campo estático
   int valor = MinhaClasse.contador;
   ```

2. Métodos Estáticos:
   - Um método estático é um método que pertence à classe em vez de pertencer a uma instância específica da classe.
   - É declarado com a palavra-chave `static` antes do tipo de retorno.
   - Pode ser chamado diretamente usando o nome da classe, seguido do nome do método.
   - Geralmente, os métodos estáticos são usados para operações que não dependem do estado das instâncias da classe.
   - Eles não podem acessar ou modificar campos não estáticos diretamente, a menos que tenham uma instância específica como parâmetro.
   
   Exemplo de declaração e uso de um método estático:
   
   ```java
   public class MinhaClasse {
       public static int somar(int a, int b) {
           return a + b;
       }
   }
   
   // Chamada do método estático
   int resultado = MinhaClasse.somar(5, 3);
   ```

Membros estáticos são úteis em situações em que você deseja compartilhar dados ou funcionalidades comuns entre todas as instâncias de uma classe, sem a necessidade de criar múltiplas cópias desses dados ou funcionalidades. Eles são frequentemente usados em classes utilitárias, para implementar padrões de projeto como o Singleton e em situações em que você precisa armazenar informações globais acessíveis de qualquer lugar do código Java. É importante notar que membros estáticos não têm acesso a membros não estáticos da classe diretamente, pois não estão associados a uma instância específica da classe.
