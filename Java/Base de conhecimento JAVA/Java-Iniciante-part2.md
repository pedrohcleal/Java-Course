# Java iniciante - part2
## Funções
Em Java, as funções são chamadas de métodos. Os métodos são blocos de código que executam tarefas específicas e podem ser chamados por outros métodos ou partes do programa para realizar ações específicas. Eles desempenham um papel fundamental na estruturação e organização do código Java e são essenciais para a orientação a objetos. Abaixo, descrevo os principais aspectos das funções (métodos) em Java:

1. Declaração de Método:
   Para declarar um método em Java, você deve especificar seu nome, o tipo de retorno (ou `void` se não retornar nenhum valor), e, opcionalmente, os parâmetros que ele aceita. A estrutura básica de uma declaração de método é a seguinte:

   ```java
   tipoDeRetorno nomeDoMetodo(parâmetros) {
       // Corpo do método
   }
   ```

2. Tipo de Retorno:
   O tipo de retorno indica que tipo de valor o método retorna após a execução. Se um método não retorna nenhum valor, você pode usar `void` como tipo de retorno. Caso contrário, você deve especificar o tipo de dados que o método retorna (por exemplo, `int`, `String`, `double`, etc.).

3. Nome do Método:
   O nome do método é como ele será chamado no código. Ele deve seguir as convenções de nomenclatura em Java, começando com uma letra minúscula e usando camelCase (por exemplo, `calcularSalario`, `imprimirMensagem`).

4. Parâmetros:
   Os parâmetros são variáveis que o método aceita como entrada. Eles são definidos entre parênteses após o nome do método. Você pode ter zero ou mais parâmetros, separados por vírgulas. A ordem e o tipo dos parâmetros devem corresponder à chamada do método.

5. Corpo do Método:
   O corpo do método contém o código que será executado quando o método for chamado. É delimitado por chaves `{}` e pode conter declarações de variáveis, estruturas de controle (como `if`, `for`, `while`), e outros métodos chamados para realizar tarefas específicas.

6. Chamada de Método:
   Para executar um método, você o chama pelo seu nome, seguido de parênteses contendo os argumentos (valores) para os parâmetros, se houver. Por exemplo:

   ```java
   int resultado = calcularSoma(5, 3);
   ```

7. Métodos Estáticos:
   Os métodos estáticos (ou métodos de classe) pertencem à classe em vez de uma instância específica da classe. Eles são definidos com a palavra-chave `static`. Você pode chamá-los diretamente usando o nome da classe, como `MinhaClasse.metodoEstatico()`.

8. Sobrecarga de Método:
   Java permite que você defina vários métodos com o mesmo nome em uma classe, desde que eles tenham parâmetros diferentes. Isso é conhecido como sobrecarga de método.

9. Métodos de Acesso (Getters e Setters):
   Os métodos de acesso são frequentemente usados para obter (getters) e definir (setters) valores de campos (variáveis de instância) de uma classe. Eles são úteis para manter o encapsulamento dos dados.

10. Construtores:
    Os construtores são métodos especiais que são usados para inicializar objetos quando eles são criados. Eles têm o mesmo nome da classe e não têm tipo de retorno.

11. Recursão:
    Em Java, é possível que um método chame a si mesmo, o que é conhecido como recursão. Isso é usado para resolver problemas de maneira iterativa e é comumente encontrado em algoritmos complexos.

Em resumo, os métodos em Java são blocos de código que encapsulam funcionalidades específicas e são essenciais para a estruturação e organização do código Java. Eles são a base da programação orientada a objetos e permitem a reutilização de código, modularidade e clareza no desenvolvimento de aplicativos.

## Funções matemáticas

Em Java, as funções matemáticas são realizadas por meio das classes e métodos da biblioteca padrão da linguagem. Essas classes fornecem uma variedade de funções matemáticas para realizar operações comuns, como cálculos aritméticos, exponenciação, raiz quadrada e outras operações matemáticas avançadas. Vou descrever algumas das principais classes e métodos relacionados a funções matemáticas em Java:

1. **Classe `Math`**: A classe `java.lang.Math` fornece uma ampla gama de funções matemáticas estáticas que podem ser usadas para executar cálculos matemáticos. Alguns dos métodos mais comuns incluem:

   - `Math.abs(x)`: Retorna o valor absoluto de `x`.
   - `Math.sqrt(x)`: Retorna a raiz quadrada de `x`.
   - `Math.pow(x, y)`: Retorna `x` elevado à potência `y`.
   - `Math.exp(x)`: Retorna o valor exponencial de `x`.
   - `Math.log(x)`: Retorna o logaritmo natural de `x`.
   - `Math.sin(x)`, `Math.cos(x)`, `Math.tan(x)`: Funções trigonométricas.
   - `Math.max(x, y)`, `Math.min(x, y)`: Retorna o máximo e o mínimo entre `x` e `y`, respectivamente.

2. **Classe `Random`**: A classe `java.util.Random` é usada para gerar números aleatórios. Ela pode ser usada para realizar operações matemáticas que envolvem valores aleatórios, como gerar números inteiros ou de ponto flutuante aleatórios.

   - `nextInt(n)`: Gera um número inteiro aleatório entre 0 (inclusive) e n (exclusivo).
   - `nextDouble()`: Gera um número de ponto flutuante aleatório entre 0 (inclusive) e 1 (exclusivo).

3. **Classe `BigDecimal`**: Para operações matemáticas precisas com números de ponto flutuante, você pode usar a classe `java.math.BigDecimal`. Ela permite realizar cálculos com precisão arbitrária e é especialmente útil quando a precisão é crítica, como em aplicações financeiras.

Além das classes mencionadas acima, Java também suporta operadores matemáticos padrão, como `+`, `-`, `*` e `/`, que podem ser usados em expressões matemáticas em código.

Aqui está um exemplo simples de como usar algumas dessas funções matemáticas em Java:

```java
public class ExemploMatematica {
    public static void main(String[] args) {
        int x = 5;
        int y = -10;

        System.out.println("Valor absoluto de x: " + Math.abs(x));
        System.out.println("Raiz quadrada de x: " + Math.sqrt(x));
        System.out.println("x elevado a y: " + Math.pow(x, y));

        // Gerando um número aleatório entre 0 e 1
        double numeroAleatorio = Math.random();
        System.out.println("Número aleatório: " + numeroAleatorio);
    }
}
```

Lembre-se de que, ao usar funções matemáticas em Java, você deve estar ciente dos tipos de dados que está manipulando para evitar erros de arredondamento e precisão, especialmente ao lidar com números de ponto flutuante.

