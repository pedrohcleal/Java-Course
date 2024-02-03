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
