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

