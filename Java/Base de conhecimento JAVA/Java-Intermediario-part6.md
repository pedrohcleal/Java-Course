# Java part 6

## Classe `Optional<>`

A classe `Optional` em Java foi introduzida no Java 8 como parte do pacote `java.util`. Ela foi projetada para lidar com situações em que um valor pode ou não estar presente, permitindo que você evite a necessidade de verificar constantemente se uma referência é nula. A principal ideia por trás do `Optional` é fornecer uma maneira mais expressiva e segura de representar valores opcionais, incentivando boas práticas de programação.

Aqui estão alguns conceitos-chave sobre a classe `Optional`:

1. **Representação de Valores Opcionais:**
   `Optional` é uma espécie de invólucro (wrapper) que pode conter um valor ou nenhum valor (null). Isso ajuda a expressar de maneira mais clara a possibilidade de um valor ausente.

2. **Evita NullPointerException:**
   Usar `Optional` pode ajudar a reduzir a incidência de `NullPointerException`, pois você não precisa verificar manualmente se um objeto é nulo antes de acessar seus métodos ou propriedades.

3. **Métodos Principais:**
   Alguns dos métodos principais fornecidos por `Optional` incluem `of`, `ofNullable`, `isPresent`, `get`, `orElse`, `orElseGet`, e `orElseThrow`. Aqui está um exemplo simples de como você pode usar alguns desses métodos:

   ```java
   Optional<String> optionalString = Optional.of("Valor presente");
   
   // Verificar se o valor está presente
   if (optionalString.isPresent()) {
       System.out.println("Valor presente: " + optionalString.get());
   } else {
       System.out.println("Valor ausente");
   }
   
   // Usar orElse para fornecer um valor padrão se ausente
   String valorOuPadrao = optionalString.orElse("Valor padrão");
   System.out.println("Valor ou padrão: " + valorOuPadrao);
   ```

4. **Método `orElseGet`:**
   Em comparação com `orElse`, o método `orElseGet` aceita um `Supplier` que será invocado apenas quando o valor estiver ausente. Isso permite a avaliação preguiçosa, o que pode ser útil para evitar a execução desnecessária de código.

   ```java
   String valorOuCalculado = optionalString.orElseGet(() -> calcularValor());
   ```

5. **Evitar o Uso Excessivo:**
   Embora `Optional` seja útil em muitos casos, não é apropriado usá-lo em todos os lugares. É mais adequado para retornos de métodos ou argumentos que podem ser opcionais. Não é recomendado usá-lo para campos de classe ou parâmetros de método, por exemplo.

Em resumo, a classe `Optional` em Java fornece uma abordagem mais segura e expressiva para lidar com valores opcionais, ajudando a evitar problemas relacionados a `NullPointerException` e tornando o código mais legível.

## NullPointerException 

`NullPointerException` é uma exceção que ocorre em tempo de execução em linguagens de programação que têm tratamento explícito de ponteiros ou referências de objetos, como Java. Essa exceção é lançada quando um programa tenta acessar um objeto usando uma referência que aponta para `null` (um valor nulo).

Em Java, os objetos são alocados dinamicamente na memória heap, e as referências são usadas para acessar esses objetos. Se uma referência não aponta para nenhum objeto (ou seja, seu valor é `null`) e você tentar acessar um método ou uma propriedade desse objeto através dessa referência, uma `NullPointerException` será lançada.

Exemplo de código que pode causar `NullPointerException`:

```java
String texto = null;
int comprimento = texto.length(); // Isso resultará em NullPointerException
```

Neste exemplo, a variável `texto` é atribuída como `null`, e quando tentamos chamar o método `length()` nela, uma exceção será lançada porque não podemos chamar métodos em uma referência que aponta para `null`.

Para evitar `NullPointerException`, é importante verificar se uma referência é `null` antes de tentar acessar métodos ou propriedades dela. O uso adequado de estruturas como `if` ou a classe `Optional` pode ajudar a lidar com valores nulos de forma mais segura.

```java
String texto = null;

// Verificar se a referência é null antes de acessar
if (texto != null) {
    int comprimento = texto.length(); // Isso será executado apenas se texto não for null
} else {
    System.out.println("A variável 'texto' é null.");
}
```

Essa abordagem ajuda a evitar exceções indesejadas e torna o código mais robusto.

## Tratamento de erros

O tratamento de exceções em Java é uma técnica fundamental para lidar com erros durante a execução de um programa, permitindo que o código responda de maneira apropriada a situações inesperadas. O mecanismo de tratamento de exceções em Java é baseado no uso de três blocos principais: try, catch e finally.

1. **Bloco try:**
   - O bloco try envolve o código que pode gerar exceções. Quando ocorre uma exceção dentro do bloco try, o controle é transferido para o bloco catch correspondente.

   ```java
   try {
       // Código que pode gerar exceções
   } catch (ExcecaoTipo1 e1) {
       // Tratamento para exceções do tipo ExcecaoTipo1
   } catch (ExcecaoTipo2 e2) {
       // Tratamento para exceções do tipo ExcecaoTipo2
   } finally {
       // Bloco opcional que é executado sempre, independentemente de exceções
   }
   ```

2. **Bloco catch:**
   - Quando uma exceção ocorre no bloco try, o controle é transferido para o bloco catch correspondente que trata a exceção. Um bloco catch pode lidar com uma ou mais exceções específicas.

3. **Bloco finally:**
   - O bloco finally é opcional e é usado para conter código que deve ser executado independentemente de ocorrer ou não uma exceção. Este bloco é frequentemente usado para liberar recursos, como fechar conexões de banco de dados ou arquivos.

   ```java
   try {
       // Código que pode gerar exceções
   } catch (ExcecaoTipo1 e1) {
       // Tratamento para exceções do tipo ExcecaoTipo1
   } catch (ExcecaoTipo2 e2) {
       // Tratamento para exceções do tipo ExcecaoTipo2
   } finally {
       // Código que será executado sempre
   }
   ```

4. **Lançamento de exceções:**
   - Além de lidar com exceções, os desenvolvedores também podem lançar exceções explicitamente usando a palavra-chave `throw`. Isso é útil quando uma condição específica no código indica um problema que deve ser tratado mais adiante.

   ```java
   if (condicao) {
       throw new MinhaExcecao("Mensagem de erro");
   }
   ```

5. **Exceções verificadas e não verificadas:**
   - Exceções em Java podem ser classificadas como verificadas (checked) ou não verificadas (unchecked). Exceções verificadas são aquelas que o compilador exige que sejam tratadas ou declaradas no método usando a palavra-chave `throws`. Exceções não verificadas incluem subclasses de `RuntimeException` e não exigem tratamento ou declaração.

O tratamento de exceções em Java é uma prática essencial para criar programas robustos, fornecendo uma maneira de lidar com situações imprevistas e manter a integridade do sistema durante a execução.

## Pilha de chamada de métodos

A pilha de chamadas de métodos, ou "call stack", é uma estrutura fundamental em linguagens de programação como Java, que mantém o controle do fluxo de execução do programa. No contexto de tratamento de exceções, a pilha de chamadas de métodos desempenha um papel importante ao rastrear a origem e o encadeamento das chamadas de métodos quando uma exceção ocorre.

Quando um método é chamado em Java, um novo quadro de pilha (stack frame) é criado e adicionado à pilha de chamadas. Esse quadro contém informações como variáveis locais, endereço de retorno e outros dados necessários para a execução do método. Quando um método é concluído, seu quadro é removido da pilha.

Ao ocorrer uma exceção, o Java procura automaticamente por um bloco `catch` correspondente no método atual. Se não houver um bloco de `catch` no método atual, a exceção é propagada para o método que chamou o método atual, continuando assim até que um bloco `catch` adequado seja encontrado ou até atingir o topo da pilha.

Vamos considerar um exemplo para ilustrar esse processo:

```java
public class ExcecaoExemplo {

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void metodo1() {
        try {
            metodo2();
        } catch (RuntimeException e) {
            System.out.println("Exceção capturada em metodo1: " + e.getMessage());
        }
    }

    public static void metodo2() {
        int resultado = dividir(10, 0);
        System.out.println("Resultado: " + resultado);
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
```

Neste exemplo, o método `dividir` pode lançar uma exceção `ArithmeticException` se a divisão por zero ocorrer. Se essa exceção não for tratada dentro do método `dividir`, ela será propagada para o método `metodo2`. Se também não for tratada em `metodo2`, a exceção será propagada para `metodo1`. Finalmente, o bloco `catch` em `metodo1` captura a exceção e exibe uma mensagem.

A pilha de chamadas de métodos mantém o rastro das chamadas de métodos, permitindo que o programa trate exceções de maneira hierárquica e localize onde a exceção ocorreu originalmente. Isso facilita a depuração e o entendimento do fluxo de controle durante situações excepcionais.

## `throws`

Em Java, a palavra-chave `throws` é usada na declaração de uma função ou método para indicar que a função pode lançar exceções de um determinado tipo. Isso significa que, ao chamar essa função, o código que a chama precisa lidar com essas exceções usando um bloco `try-catch` ou propagar a exceção adicionando a cláusula `throws` à sua própria declaração.

A sintaxe básica é a seguinte:

```java
public void minhaFuncao() throws TipoDeExcecao {
    // código da função que pode lançar a exceção
}
```

Aqui está um exemplo mais detalhado:

```java
public class Exemplo {

    public void minhaFuncao() throws MinhaExcecao {
        // código que pode lançar MinhaExcecao
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();

        try {
            exemplo.minhaFuncao();
        } catch (MinhaExcecao e) {
            // lidar com a exceção
            e.printStackTrace();
        }
    }
}

class MinhaExcecao extends Exception {
    // Defina a classe de exceção personalizada, se necessário
}
```

Neste exemplo, `minhaFuncao()` é declarada como lançando uma exceção do tipo `MinhaExcecao`. No método `main`, ao chamar `minhaFuncao()`, o código é envolvido em um bloco `try-catch` para lidar com a possível exceção. Se `minhaFuncao()` lançar `MinhaExcecao`, o bloco `catch` será executado para tratar a exceção conforme necessário.

## Classe personalizada de erros

Em Java, é possível criar classes personalizadas que estendem a classe `Exception` para criar exceções personalizadas. Essas exceções podem ser úteis quando você precisa lidar com situações específicas em seu código que não podem ser representadas adequadamente por exceções padrão do Java.

A criação de uma classe de exceção personalizada envolve estender a classe `Exception` ou uma de suas subclasses diretas, como `RuntimeException`. Aqui está um exemplo básico:

```java
public class MinhaExcecaoPersonalizada extends Exception {

    public MinhaExcecaoPersonalizada() {
        super("Esta é uma exceção personalizada.");
    }

    public MinhaExcecaoPersonalizada(String mensagem) {
        super(mensagem);
    }
}
```

Neste exemplo, `MinhaExcecaoPersonalizada` é uma classe que estende `Exception`. Ela fornece dois construtores: um sem argumentos, que define uma mensagem padrão, e outro que permite especificar uma mensagem personalizada.

Agora, você pode usar essa exceção personalizada em seu código da seguinte maneira:

```java
public class Exemplo {

    public void meuMetodo() throws MinhaExcecaoPersonalizada {
        // Alguma lógica que pode lançar a exceção personalizada
        throw new MinhaExcecaoPersonalizada("Ocorreu um erro específico neste método.");
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();

        try {
            exemplo.meuMetodo();
        } catch (MinhaExcecaoPersonalizada e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
```

No exemplo acima, o método `meuMetodo()` lança uma instância de `MinhaExcecaoPersonalizada`. No método `main`, essa exceção é capturada usando um bloco `try-catch`, e a mensagem da exceção é exibida. Essas classes de exceção personalizadas proporcionam uma maneira estruturada de lidar com erros específicos em seu código.
