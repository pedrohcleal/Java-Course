# Java Inter - part2

## Construtores
Em Java, um construtor é um método especial em uma classe que é usado para inicializar objetos dessa classe. Os construtores são chamados automaticamente quando um novo objeto é criado e são responsáveis por realizar qualquer inicialização necessária para que o objeto seja usado corretamente.

Aqui estão algumas características importantes dos construtores em Java:

1. Nome do Construtor:
   - O nome de um construtor deve ser exatamente o mesmo nome da classe em que ele está definido.
   - O construtor não possui um tipo de retorno, nem mesmo void.

2. Tipos de Construtores:
   - Construtores padrão (default): Se uma classe não declara nenhum construtor, o Java fornece automaticamente um construtor padrão sem argumentos (conhecido como construtor padrão) que inicializa os campos da classe com valores padrão (0 para tipos numéricos, null para referências, etc.).
   - Construtores personalizados: Você também pode criar construtores personalizados, que podem ter argumentos e realizar a inicialização personalizada com base nos valores passados como argumentos.

3. Overloading de Construtores:
   - Você pode ter vários construtores em uma classe, desde que tenham assinaturas diferentes (ou seja, diferentes números ou tipos de argumentos). Isso é chamado de sobrecarga de construtores.

4. Uso de Construtores:
   - Os construtores são invocados usando a palavra-chave `new` seguida pelo nome da classe, seguido pelos argumentos (se houver) entre parênteses. Por exemplo: `MinhaClasse objeto = new MinhaClasse();`.

5. Inicialização de Campos:
   - Um dos principais usos dos construtores é para inicializar os campos (variáveis de instância) de um objeto. Você pode atribuir valores iniciais aos campos dentro do construtor.

6. Chamada de Outros Construtores:
   - Em uma classe, você pode chamar um construtor de outro construtor da mesma classe usando a palavra-chave `this(...)`. Isso é útil quando você tem vários construtores e deseja reutilizar a lógica de inicialização.

Exemplo de classe com construtores em Java:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor padrão
    public Pessoa() {
        nome = "Sem nome";
        idade = 0;
    }

    // Construtor personalizado
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters para acessar os campos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

Neste exemplo, a classe `Pessoa` possui dois construtores: um construtor padrão que inicializa os campos com valores padrão e um construtor personalizado que permite a inicialização personalizada dos campos. Esses construtores podem ser usados para criar objetos `Pessoa` com diferentes estados iniciais.

## ```this```

Em Java, a palavra-chave "this" é uma referência especial que se refere à instância atual de uma classe. Ela pode ser usada em vários contextos dentro de uma classe para se referir aos membros (variáveis de instância, métodos ou construtores) da instância atual. Aqui estão alguns dos principais usos de "this" em Java:

1. Referência a variáveis de instância:
   Você pode usar "this" para se referir às variáveis de instância da classe atual quando há ambiguidade entre uma variável de instância e uma variável local dentro de um método. Por exemplo:

   ```java
   public class Exemplo {
       private int numero;

       public void setNumero(int numero) {
           this.numero = numero;
       }
   }
   ```

   Neste exemplo, usamos "this.numero" para distinguir entre a variável de instância "numero" e o parâmetro do método "numero".

2. Invocação de construtores:
   "this" também pode ser usado para chamar um construtor sobrecarregado da mesma classe a partir de outro construtor. Isso é útil para evitar a duplicação de código em diferentes construtores. Aqui está um exemplo:

   ```java
   public class Pessoa {
       private String nome;
       private int idade;

       public Pessoa(String nome) {
           this(nome, 0);
       }

       public Pessoa(String nome, int idade) {
           this.nome = nome;
           this.idade = idade;
       }
   }
   ```

   Neste caso, o construtor com um único argumento chama o construtor com dois argumentos usando "this(nome, 0)".

3. Retornando a instância atual:
   Em certos casos, você pode usar "this" para retornar a instância atual de um objeto. Isso é útil para criar métodos encadeados, onde você pode chamar vários métodos na mesma linha. Por exemplo:

   ```java
   public class MinhaClasse {
       private int valor;

       public MinhaClasse setValor(int valor) {
           this.valor = valor;
           return this;
       }
   }
   ```

   Isso permite que você faça chamadas encadeadas, como: "minhaInstancia.setValor(42).outroMetodo()".

Em resumo, a palavra-chave "this" em Java é usada para se referir à instância atual da classe em que ela está sendo utilizada. Ela é útil para evitar ambiguidades, chamar construtores sobrecarregados e criar métodos encadeados.

## Sobrecarga

Em Java, a sobrecarga (ou "overloading" em inglês) é um conceito que permite que você defina múltiplos métodos com o mesmo nome em uma classe, desde que esses métodos tenham assinaturas diferentes. A assinatura de um método é composta pelo nome do método e pela lista de tipos e quantidade de parâmetros que ele aceita. A sobrecarga é uma forma de polimorfismo estático, onde o Java determina qual método chamar com base na assinatura dos argumentos passados.

Aqui estão alguns aspectos importantes sobre a sobrecarga em Java:

1. Assinaturas diferentes: Para sobrecarregar métodos, você precisa definir métodos com nomes idênticos, mas com parâmetros diferentes em termos de tipo, quantidade ou ordem. Isso significa que você pode ter métodos com o mesmo nome, desde que a JVM possa distingui-los com base em suas assinaturas.

2. Retorno: O tipo de retorno não é considerado ao determinar a sobrecarga de um método. Dois métodos com a mesma assinatura, exceto pelo tipo de retorno, são considerados sobrecarga inválida.

3. Exceções: A lista de exceções lançadas por um método não faz parte de sua assinatura. Portanto, você pode sobrecarregar métodos com diferentes exceções lançadas.

Aqui está um exemplo simples de sobrecarga de métodos em Java:

```java
public class ExemploSobrecarga {
    
    // Método que aceita dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado que aceita três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método sobrecarregado que aceita dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        ExemploSobrecarga exemplo = new ExemploSobrecarga();
        
        System.out.println(exemplo.somar(2, 3)); // Chama o primeiro método
        System.out.println(exemplo.somar(2, 3, 4)); // Chama o segundo método
        System.out.println(exemplo.somar(2.5, 3.5)); // Chama o terceiro método
    }
}
```

Neste exemplo, a classe `ExemploSobrecarga` contém três métodos chamados `somar`, cada um aceitando diferentes tipos e quantidades de argumentos. A JVM determinará qual método chamar com base nos argumentos passados durante a chamada.

A sobrecarga de métodos é uma técnica útil para criar interfaces de programação mais flexíveis e intuitivas, permitindo que os desenvolvedores escolham a versão do método que melhor se adapta às suas necessidades com base nos argumentos fornecidos.

## Encapsulamento

O encapsulamento é um dos quatro pilares da programação orientada a objetos (POO) e é uma técnica fundamental no Java e em muitas outras linguagens de programação orientadas a objetos. Ele se refere à prática de esconder os detalhes internos de uma classe e fornecer uma interface controlada para acessar e manipular os dados e comportamentos dessa classe. O encapsulamento é alcançado através da combinação de dois conceitos: acesso restrito aos membros da classe e o uso de métodos getter e setter.

Aqui estão alguns aspectos importantes do encapsulamento no Java:

1. **Atributos privados:** Os atributos de uma classe geralmente são declarados como privados (usando a palavra-chave `private`). Isso significa que esses atributos não podem ser acessados diretamente de fora da classe. Por exemplo:

```java
private int idade;
```

2. **Métodos públicos:** Para permitir o acesso controlado aos atributos privados, você deve fornecer métodos públicos na classe para ler (getter) e modificar (setter) esses atributos. Por exemplo:

```java
public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    if (idade >= 0) { // Verifica se a idade é válida
        this.idade = idade;
    }
}
```

3. **Controle de acesso:** O Java fornece quatro níveis de controle de acesso para membros de classe: `public`, `private`, `protected` e o padrão (quando nenhum modificador é especificado). O encapsulamento geralmente envolve a definição de atributos como privados e métodos relacionados como públicos, para garantir que os dados internos da classe sejam acessados apenas de maneira segura e controlada.

4. **Validação e lógica de negócios:** Com o encapsulamento, você pode adicionar lógica de validação aos métodos setter para garantir que os valores atribuídos aos atributos estejam dentro de limites aceitáveis. Isso ajuda a manter a integridade dos dados e a prevenir comportamentos indesejados.

5. **Flexibilidade e manutenção:** O encapsulamento ajuda a ocultar a implementação interna de uma classe, permitindo que você altere a implementação sem afetar o código que a utiliza. Isso facilita a manutenção e a evolução do código ao longo do tempo.

6. **Segurança:** O encapsulamento ajuda a proteger os dados de uma classe, evitando que eles sejam corrompidos ou acessados de maneira inadequada por outras partes do programa.

Em resumo, o encapsulamento no Java envolve o uso de modificadores de acesso, como `private`, juntamente com métodos getter e setter para controlar o acesso aos atributos de uma classe, garantindo assim a segurança, a manutenção e a flexibilidade do código. Isso é fundamental para o princípio da ocultação de informações na POO e ajuda a criar classes mais robustas e coesas.

## Controles de acesso - public, private, protected

No Java, os controles de acesso são modificadores que determinam a visibilidade e a acessibilidade de classes, atributos, métodos e construtores em seu programa. Existem quatro modificadores de acesso principais no Java:

1. **public:** Os membros com esse modificador de acesso são acessíveis de qualquer lugar, dentro ou fora da classe. Por exemplo, uma classe ou método público pode ser usado por qualquer outra classe no mesmo projeto ou por classes externas.

   ```java
   public class MinhaClasse {
       public int meuAtributo;
       public void meuMetodo() {
           // código aqui
       }
   }
   ```

2. **private:** Os membros com esse modificador de acesso são acessíveis apenas dentro da própria classe. Isso significa que eles não podem ser acessados de fora da classe, mesmo por subclasses. O encapsulamento frequentemente usa o modificador `private` para proteger atributos e métodos internos da classe.

   ```java
   public class MinhaClasse {
       private int meuAtributo;
       private void meuMetodo() {
           // código aqui
       }
   }
   ```

3. **protected:** Os membros com esse modificador de acesso são acessíveis apenas dentro da classe, em subclasses (mesmo que estejam em pacotes diferentes) e em classes no mesmo pacote. Isso é útil quando você deseja permitir que subclasses acessem alguns membros, mas não o público em geral.

   ```java
   public class MinhaClasse {
       protected int meuAtributo;
       protected void meuMetodo() {
           // código aqui
       }
   }
   ```

4. **padrão (sem modificador):** Quando nenhum modificador de acesso é especificado, os membros são acessíveis apenas no mesmo pacote. Isso é muitas vezes chamado de acesso de pacote. Isso é útil quando você deseja restringir o acesso aos membros de classes em um pacote específico, mas ainda permitir o acesso a classes dentro desse pacote.

   ```java
   class MinhaClasse {
       int meuAtributo;
       void meuMetodo() {
           // código aqui
       }
   }
   ```

Para utilizar os controles de acesso, você deve considerar a visibilidade necessária para seus membros de classe, atributos e métodos. Aqui estão algumas diretrizes gerais:

- Use `public` quando você deseja que um membro seja acessível de qualquer lugar em seu código.
- Use `private` quando você deseja encapsular um membro e impedir o acesso direto a ele fora da classe.
- Use `protected` quando você deseja permitir que subclasses acessem membros, mas ainda deseja restringir o acesso de classes externas.
- Use o acesso de pacote (sem modificador) quando você deseja limitar o acesso a classes dentro do mesmo pacote.

Ao definir a visibilidade apropriada para seus membros, você pode criar classes mais seguras, encapsuladas e modulares, facilitando a manutenção e a evolução do código.
