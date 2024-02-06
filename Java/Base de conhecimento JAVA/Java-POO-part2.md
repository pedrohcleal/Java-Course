# Java POO - part2

## Polimorfismo

Em Java, o polimorfismo é um conceito fundamental que permite que objetos de diferentes tipos sejam tratados de maneira uniforme. Existem duas formas principais de polimorfismo em Java: polimorfismo de compilador (ou estático) e polimorfismo de tempo de execução (ou dinâmico). Vamos explorar cada um deles:

1. **Polimorfismo de Compilador (Estático):**
   - Também conhecido como sobrecarga de método ou sobrecarga de operador, ocorre quando uma classe possui vários métodos com o mesmo nome, mas parâmetros diferentes.
   - O compilador seleciona qual método chamar com base nos tipos e número de argumentos passados durante a chamada do método.
   - Exemplo de sobrecarga de método:

     ```java
     public class Calculadora {
         public int somar(int a, int b) {
             return a + b;
         }

         public double somar(double a, double b) {
             return a + b;
         }
     }
     ```

2. **Polimorfismo de Tempo de Execução (Dinâmico):**
   - Também conhecido como polimorfismo de herança, ocorre quando uma classe herda de outra classe ou implementa uma interface.
   - Permite que objetos de subclasses sejam tratados como objetos da classe base durante a execução do programa.
   - A resolução do método a ser chamado ocorre em tempo de execução com base no tipo real do objeto.
   - Exemplo de polimorfismo de herança:

     ```java
     class Animal {
         public void fazerSom() {
             System.out.println("Som genérico de um animal");
         }
     }

     class Cachorro extends Animal {
         public void fazerSom() {
             System.out.println("Latido de um cachorro");
         }
     }

     class Gato extends Animal {
         public void fazerSom() {
             System.out.println("Miado de um gato");
         }
     }
     ```

   - Uso do polimorfismo:

     ```java
     Animal animal1 = new Cachorro();
     Animal animal2 = new Gato();

     animal1.fazerSom(); // Saída: Latido de um cachorro
     animal2.fazerSom(); // Saída: Miado de um gato
     ```

   - Neste exemplo, mesmo que `animal1` seja declarado como tipo `Animal`, o método `fazerSom` chamado é o da classe `Cachorro`, porque `animal1` é, na verdade, uma instância de `Cachorro`.

O polimorfismo em Java facilita a criação de código flexível e reutilizável, pois permite tratar objetos de diferentes tipos de maneira uniforme. Isso é fundamental para a implementação de conceitos como herança e interfaces, proporcionando uma maior abstração e modularidade ao código.

## Classes abstratas

Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente, mas serve como uma base para outras classes. Ela é declarada usando a palavra-chave `abstract`. Uma classe abstrata pode conter métodos abstratos (métodos sem implementação) e métodos concretos (métodos com implementação).

Principais características e conceitos associados a classes abstratas:

1. **Declaração:**
   - Uma classe abstrata é declarada usando a palavra-chave `abstract`.
   - Pode conter tanto métodos abstratos quanto métodos concretos.
   - Exemplo de declaração de uma classe abstrata:

     ```java
     public abstract class Animal {
         public abstract void emitirSom(); // Método abstrato
         
         public void dormir() {
             System.out.println("Zzz..."); // Método concreto
         }
     }
     ```

2. **Métodos Abstratos:**
   - Métodos abstratos são declarados sem uma implementação na classe abstrata.
   - As subclasses devem fornecer uma implementação para esses métodos.
   - Exemplo:

     ```java
     public abstract class Animal {
         public abstract void emitirSom(); // Método abstrato
     }

     public class Cachorro extends Animal {
         public void emitirSom() {
             System.out.println("Latido"); // Implementação do método abstrato
         }
     }
     ```

3. **Objetivo:**
   - O principal objetivo das classes abstratas é fornecer uma estrutura comum para outras classes que serão derivadas dela.
   - Elas são frequentemente usadas em conjunto com herança para criar uma hierarquia de classes.

4. **Herança:**
   - Uma classe abstrata pode ser estendida por outras classes, que são conhecidas como subclasses.
   - As subclasses devem fornecer implementações para todos os métodos abstratos da classe abstrata pai.
   - Exemplo de herança:

     ```java
     public class Gato extends Animal {
         public void emitirSom() {
             System.out.println("Miado"); // Implementação do método abstrato
         }
     }
     ```

5. **Instanciação:**
   - Não é possível criar uma instância direta de uma classe abstrata usando `new ClasseAbstrata()`.
   - Pode-se usar uma referência de tipo da classe abstrata para se referir a uma instância de uma subclasse.

     ```java
     Animal animal = new Gato();
     ```

6. **Construtores:**
   - Uma classe abstrata pode ter construtores, que são chamados quando uma instância de uma subclasse é criada.
   - No entanto, a instância da classe abstrata em si não pode ser criada.

     ```java
     public abstract class Animal {
         public Animal() {
             System.out.println("Construindo um animal");
         }

         public abstract void emitirSom();
     }
     ```

As classes abstratas são uma ferramenta poderosa na programação orientada a objetos, permitindo a criação de hierarquias de classes e fornecendo uma estrutura comum para comportamentos relacionados. Elas são especialmente úteis quando você deseja garantir que determinados métodos sejam implementados por todas as subclasses.
