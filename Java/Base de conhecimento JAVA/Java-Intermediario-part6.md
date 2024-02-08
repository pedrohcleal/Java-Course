# Java part 6

## Classe `Optional<>`

`Optional` é uma classe introduzida no Java 8 no pacote `java.util`. Ela foi projetada para ajudar a lidar com valores possivelmente nulos de maneira mais segura e expressiva. O objetivo do `Optional` é evitar o uso excessivo de `null` e, assim, reduzir a possibilidade de `NullPointerException`.

A principal ideia por trás do `Optional` é representar a presença ou ausência de um valor sem a necessidade de usar `null`. Em vez de retornar `null` quando um valor não está presente, um método pode retornar um `Optional` que pode conter ou não um valor.

Alguns pontos-chave sobre `Optional`:

1. **Construção de Optional:**
   ```java
   Optional<String> optionalValue = Optional.of("Hello, World!"); // Valor presente
   Optional<String> emptyOptional = Optional.empty(); // Valor ausente
   Optional<String> nullableOptional = Optional.ofNullable(possivelValorNulo); // Valor que pode ser nulo
   ```

2. **Verificação da Presença de Valor:**
   ```java
   if (optionalValue.isPresent()) {
       String value = optionalValue.get(); // Obtém o valor se presente
   }
   ```

3. **Manipulação de Valores:**
   ```java
   String value = optionalValue.orElse("Default Value"); // Retorna o valor se presente, senão retorna um valor padrão
   optionalValue.ifPresent(val -> System.out.println(val)); // Executa uma ação se o valor estiver presente
   ```

4. **Tratamento de Valores Nulos:**
   O uso de `Optional` pode reduzir a necessidade de verificar nulidade, tornando o código mais limpo e menos propenso a `NullPointerException`.

5. **Operações Funcionais:**
   `Optional` também oferece métodos funcionais como `map`, `filter` e `flatMap`, que permitem realizar operações em valores opcionais de maneira mais elegante.

Exemplo de uso com um método que retorna `Optional`:
```java
public Optional<String> buscarAlgo() {
    // Lógica para obter o valor (pode ser nulo)
    // Retorna Optional com o valor ou Optional vazio se não encontrado
}
```

Em relação ao contexto original, ao usar `Optional` com Spring Data JPA, o método `orElseThrow` foi utilizado para lançar uma exceção caso o valor não esteja presente. Isso é uma prática comum para indicar que a ausência do valor é uma situação excepcional que deve ser tratada.

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
