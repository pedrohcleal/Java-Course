# Part5 - Java

## *Enumeração*
Em Java, uma enumeração, ou simplesmente "enum", é um tipo de dado especial que consiste em um conjunto fixo de constantes nomeadas. As enums foram introduzidas no Java 5 para oferecer uma maneira mais elegante e segura de representar conjuntos de valores constantes.

Aqui estão alguns pontos-chave sobre as classes Enum em Java:

1. **Definição de Enum:**
   - Uma enumeração é definida usando a palavra-chave `enum`.
   - Exemplo de declaração de uma enumeração simples:

     ```java
     enum DiaDaSemana {
         SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
     }
     ```

2. **Constantes Enum:**
   - As constantes dentro de uma enumeração são chamadas de membros enum.
   - No exemplo acima, `SEGUNDA`, `TERCA`, etc., são membros da enumeração `DiaDaSemana`.

3. **Métodos e Propriedades em Enums:**
   - Enums podem ter métodos e propriedades, assim como outras classes em Java.
   - Cada membro enum pode ter seus próprios métodos e propriedades.

     ```java
     enum DiaDaSemana {
         SEGUNDA("Monday"), TERCA("Tuesday"), QUARTA("Wednesday");

         private String nome;

         DiaDaSemana(String nome) {
             this.nome = nome;
         }

         public String getNome() {
             return nome;
         }
     }
     ```

4. **Iteração sobre Enums:**
   - É possível iterar sobre os valores de uma enumeração usando o método `values()`.

     ```java
     for (DiaDaSemana dia : DiaDaSemana.values()) {
         System.out.println(dia);
     }
     ```

5. **Comparação de Enums:**
   - Como as enums são objetos, a comparação entre membros enum é feita usando o operador `==`.

     ```java
     DiaDaSemana dia1 = DiaDaSemana.SEGUNDA;
     DiaDaSemana dia2 = DiaDaSemana.TERCA;

     if (dia1 == dia2) {
         System.out.println("Os dias são iguais.");
     } else {
         System.out.println("Os dias são diferentes.");
     }
     ```

6. **Switch com Enums:**
   - O uso de enums em instruções `switch` é bastante comum e melhora a legibilidade do código.

     ```java
     DiaDaSemana dia = DiaDaSemana.QUARTA;

     switch (dia) {
         case SEGUNDA:
             System.out.println("Primeiro dia útil.");
             break;
         case TERCA:
         case QUARTA:
         case QUINTA:
         case SEXTA:
             System.out.println("Dias úteis.");
             break;
         case SABADO:
         case DOMINGO:
             System.out.println("Fim de semana.");
             break;
     }
     ```

As enums em Java são uma maneira poderosa e segura de representar conjuntos fixos de valores. Elas ajudam a tornar o código mais legível, evitando o uso de constantes mágicas e fornecendo uma estrutura mais robusta para representar conceitos específicos.

## Interface

Uma interface em Java é uma coleção de métodos abstratos (sem implementação) e constantes (variáveis estáticas finais) que podem ser implementados por classes que desejam fornecer uma implementação específica para esses métodos. As interfaces proporcionam um meio de definir um contrato ou um conjunto de regras que as classes devem seguir. Em Java, as interfaces são uma parte fundamental da programação orientada a objetos e são frequentemente usadas para atingir a abstração e a implementação de múltiplas interfaces.

Aqui estão alguns pontos importantes sobre interfaces em Java:

1. **Declaração de Interface:**
   - Para declarar uma interface, use a palavra-chave `interface` seguida pelo nome da interface. Por exemplo:

     ```java
     public interface Imprimivel {
         void imprimir();
     }
     ```

2. **Métodos Abstratos:**
   - Todos os métodos em uma interface são implicitamente públicos e abstratos. Não há necessidade de usar as palavras-chave `public` e `abstract` ao declarar esses métodos.

3. **Constantes:**
   - Interfaces podem conter constantes, que são implicitamente públicas, estáticas e finais.
   - Por exemplo:

     ```java
     public interface Cores {
         String VERMELHO = "Vermelho";
         String AZUL = "Azul";
         String VERDE = "Verde";
     }
     ```

4. **Implementação em Classes:**
   - Uma classe pode implementar uma ou mais interfaces usando a palavra-chave `implements`.
   - Quando uma classe implementa uma interface, ela deve fornecer implementações para todos os métodos abstratos definidos pela interface.

     ```java
     public class Impressora implements Imprimivel {
         @Override
         public void imprimir() {
             System.out.println("Imprimindo...");
         }
     }
     ```

5. **Herança de Interface:**
   - Interfaces podem estender outras interfaces usando a palavra-chave `extends`. Isso permite criar hierarquias de interfaces.

     ```java
     public interface ImprimivelColorido extends Imprimivel, Cores {
         void imprimirColorido();
     }
     ```

6. **Default Methods e Métodos Estáticos (Java 8 em diante):**
   - A partir do Java 8, interfaces podem ter métodos com implementação utilizando a palavra-chave `default`.
   - Também é possível ter métodos estáticos em interfaces.

     ```java
     public interface Calculadora {
         default int somar(int a, int b) {
             return a + b;
         }

         static int multiplicar(int a, int b) {
             return a * b;
         }
     }
     ```

7. **Uso de Interfaces:**
   - Interfaces são amplamente utilizadas em Java para definir contratos comuns, possibilitando o desenvolvimento de classes que compartilham funcionalidades comuns, mas podem ter implementações específicas.

     ```java
     public class Exemplo implements Imprimivel, Cores {
         @Override
         public void imprimir() {
             System.out.println("Implementação do método imprimir");
         }
     }
     ```

Interfaces em Java fornecem um mecanismo flexível para definir contratos e promovem a criação de código mais modular e reutilizável. Elas são uma parte crucial da programação orientada a objetos, facilitando a implementação de polimorfismo e permitindo a construção de sistemas mais flexíveis e extensíveis.

## Record

Em Java, a palavra-chave `record` foi introduzida no Java 14 como uma nova maneira de criar classes imutáveis para representar dados simples e comumente usados para transferência de dados (DTOs), entidades, entre outros. Os records são uma forma concisa de definir classes cujo principal objetivo é armazenar dados de maneira eficiente e facilitar a criação de objetos imutáveis. Eles fornecem uma série de recursos automáticos, reduzindo significativamente a quantidade de código boilerplate necessário.

Aqui estão alguns pontos importantes sobre records em Java:

1. **Declaração de Record:**
   - Para declarar um record, use a palavra-chave `record` seguida pelo nome do record e a lista de componentes (campos). Os campos são automaticamente final e privados.

     ```java
     public record Pessoa(String nome, int idade) {
     }
     ```

2. **Métodos Acessores (Getters):**
   - Records automaticamente geram métodos acessores (getters) para todos os campos definidos.

     ```java
     Pessoa pessoa = new Pessoa("João", 30);
     System.out.println(pessoa.nome()); // Acessando o campo nome
     System.out.println(pessoa.idade()); // Acessando o campo idade
     ```

3. **Método `toString`:**
   - Records geram automaticamente um método `toString` que fornece uma representação de string formatada dos valores dos campos.

     ```java
     System.out.println(pessoa); // Saída: Pessoa[nome=João, idade=30]
     ```

4. **Método `equals` e `hashCode`:**
   - Records geram automaticamente métodos `equals` e `hashCode` que comparam os valores dos campos.

     ```java
     Pessoa pessoa1 = new Pessoa("João", 30);
     Pessoa pessoa2 = new Pessoa("João", 30);

     System.out.println(pessoa1.equals(pessoa2)); // Saída: true
     ```

5. **Imutabilidade:**
   - Os records são automaticamente imutáveis. Uma vez que os valores dos campos são definidos no momento da criação do objeto, eles não podem ser modificados.

     ```java
     // Isso não é permitido, pois os campos são final
     pessoa.nome("Maria");
     ```

6. **Deconstrução (Destructuring):**
   - Records suportam deconstrução, permitindo atribuir os valores dos campos a variáveis individuais.

     ```java
     var (nome, idade) = pessoa;
     System.out.println("Nome: " + nome + ", Idade: " + idade);
     ```

7. **Construtores:**
   - Records geram automaticamente um construtor que aceita todos os campos como parâmetros.

     ```java
     Pessoa pessoa = new Pessoa("João", 30);
     ```

8. **Extensão de Records (Java 16 em diante):**
   - A partir do Java 16, é possível estender records para adicionar mais métodos ou campos.

     ```java
     public record PessoaEstendida(String nome, int idade) {
         public String saudacao() {
             return "Olá, " + nome + "!";
         }
     }
     ```

Os records em Java simplificam a criação de classes imutáveis e fornecem uma abordagem mais concisa e legível para definir estruturas de dados simples. Eles são especialmente úteis quando a principal função da classe é armazenar dados e não exigir lógica de negócios complexa.

## Annotation

Em Java, as annotations (anotações) são marcadores especiais que podem ser adicionados a códigos-fonte para fornecer metadados sobre o código. As anotações são usadas para incorporar informações adicionais ou instruções para o compilador, ferramentas de desenvolvimento ou tempo de execução. Elas ajudam na organização e fornecem informações sem alterar diretamente a lógica do código.

Aqui estão alguns pontos importantes sobre annotations em Java:

1. **Sintaxe:**
   - As annotations são precedidas pelo símbolo `@` e podem ser colocadas em vários elementos do código, como classes, métodos, variáveis, parâmetros de métodos, etc.

     ```java
     @MinhaAnnotation
     public class MinhaClasse {
         @MinhaAnnotation
         private int minhaVariavel;

         @MinhaAnnotation
         public void meuMetodo(@MinhaAnnotation int parametro) {
             // Código do método
         }
     }
     ```

2. **Propósito das Annotations:**
   - As annotations podem ter vários propósitos, incluindo:
     - **Informar o Compilador:** Algumas annotations fornecem informações adicionais ao compilador para influenciar seu comportamento durante a compilação.
     - **Controle de Tempo de Execução:** Algumas annotations são lidas em tempo de execução para fornecer informações ou instruções durante a execução do programa.
     - **Processamento de Anotações (Annotation Processing):** Ferramentas de processamento de anotações podem analisar annotations e gerar código, fornecendo funcionalidades adicionais.

3. **Annotations Padrão em Java:**
   - Java fornece várias annotations padrão, como `@Override`, `@Deprecated`, e `@SuppressWarnings`, que são amplamente utilizadas em diferentes contextos.

     ```java
     @Override
     public void meuMetodo() {
         // Implementação do método
     }

     @Deprecated
     public void metodoAntigo() {
         // Código obsoleto
     }

     @SuppressWarnings("unchecked")
     public void metodoComAviso() {
         // Código com aviso desativado
     }
     ```

4. **Definição de Annotations Customizadas:**
   - É possível criar annotations personalizadas para atender a requisitos específicos do código.
   - Uma annotation personalizada é definida usando a interface `@interface`.

     ```java
     import java.lang.annotation.*;

     @Retention(RetentionPolicy.RUNTIME)
     @Target({ElementType.TYPE, ElementType.METHOD})
     public @interface MinhaAnnotation {
         String value() default "Padrão";
         int numero() default 42;
     }
     ```

5. **Retenção (Retention) e Destino (Target):**
   - As annotations podem ter diferentes níveis de retenção (`RetentionPolicy`) que indicam até quando elas devem ser retidas (source, class ou runtime).
   - O elemento `@Target` indica onde a annotation pode ser aplicada (classe, método, campo, etc.).

6. **Processamento de Anotações (Annotation Processing):**
   - O processamento de annotations envolve ferramentas que analisam annotations em tempo de compilação para gerar código adicional ou realizar verificações estáticas.
   - Um exemplo de processamento de annotations é a geração automática de código com base em annotations.

As annotations em Java são uma poderosa ferramenta para fornecer informações adicionais ao compilador, ferramentas de desenvolvimento e em tempo de execução. Elas ajudam na documentação do código, na automação de tarefas e na melhoria da legibilidade e manutenção do código. As annotations são amplamente utilizadas em diversos frameworks e bibliotecas para configurar e estender o comportamento das aplicações Java.

## Composição

Composição é um conceito fundamental em programação orientada a objetos (OOP) que permite a criação de objetos complexos através da combinação de objetos mais simples. Em termos simples, a composição envolve a construção de objetos complexos por meio da inclusão de objetos menores como partes constituintes. Essa relação é muitas vezes chamada de "tem-um" (has-a) em oposição à relação de herança, que é conhecida como "é-um" (is-a).

Aqui estão alguns pontos importantes sobre composição:

1. **Objetos como Componentes:**
   - Na composição, um objeto é composto por outros objetos que são considerados seus componentes.
   - Esses componentes podem ser instâncias de classes diferentes e podem desempenhar papéis específicos no objeto composto.

2. **Encapsulamento:**
   - A composição favorece o princípio de encapsulamento, já que os detalhes internos de cada componente podem ser ocultos do objeto composto.
   - Cada componente é responsável por sua própria implementação, e o objeto composto não precisa conhecer todos os detalhes internos dos componentes.

3. **Relação Forte:**
   - A relação entre o objeto composto e seus componentes é normalmente mais forte do que a relação de herança.
   - Mudanças na implementação interna dos componentes não afetam diretamente o objeto composto, a menos que a interface seja modificada.

4. **Flexibilidade:**
   - A composição oferece mais flexibilidade do que a herança em muitos casos.
   - É possível alterar os componentes de um objeto composto em tempo de execução, o que pode ser útil para adaptar o comportamento do objeto.

5. **Exemplo em Java:**
   - Vamos considerar um exemplo simples de composição em Java, onde uma classe `Carro` é composta por objetos das classes `Motor` e `Rodas`.

     ```java
     public class Carro {
         private Motor motor;
         private Rodas rodas;

         public Carro(Motor motor, Rodas rodas) {
             this.motor = motor;
             this.rodas = rodas;
         }

         // Métodos e lógica relacionados ao carro
     }
     ```

     Aqui, `Carro` tem-um `Motor` e tem-um conjunto de `Rodas`, exemplificando a relação de composição.

6. **Vantagens:**
   - A composição promove a reutilização de código, já que objetos existentes podem ser reutilizados como componentes em diferentes contextos.
   - Oferece uma maneira mais flexível de construir objetos complexos em comparação com a herança.

7. **Desvantagens:**
   - Pode resultar em uma hierarquia complexa de objetos quando muitas composições são utilizadas.
   - Em alguns casos, a herança pode ser mais adequada, dependendo da relação entre as classes.

Em resumo, a composição é um conceito poderoso na OOP que permite criar objetos complexos através da inclusão de objetos menores. Ela promove a flexibilidade, reutilização de código e encapsulamento, tornando-a uma abordagem valiosa na construção de sistemas orientados a objetos.

## MVC
A arquitetura MVC (Model-View-Controller) é um padrão de design amplamente utilizado no desenvolvimento de software, incluindo aplicações Java. Ela visa separar as responsabilidades do sistema em três componentes principais: Model (Modelo), View (Visão) e Controller (Controlador). Isso promove a modularidade, reutilização de código e facilita a manutenção do software.

Aqui está uma descrição básica de cada componente na arquitetura MVC em contexto Java:

1. **Model (Modelo):**
   - O Modelo representa a camada de dados e lógica de negócios.
   - É responsável por armazenar e gerenciar o estado do aplicativo, bem como realizar operações relacionadas a dados.
   - No contexto de Java, os modelos geralmente consistem em classes que representam objetos de negócios, acesso a dados (como bancos de dados) e lógica de aplicação.

2. **View (Visão):**
   - A Visão é responsável por apresentar os dados ao usuário e interagir com ele.
   - Ela exibe a interface do usuário e recebe entradas do usuário.
   - Em Java, as visões geralmente são implementadas usando tecnologias como JavaFX para aplicativos de desktop ou JSP (JavaServer Pages) para aplicativos web.

3. **Controller (Controlador):**
   - O Controlador atua como intermediário entre o Modelo e a Visão.
   - Ele recebe as entradas do usuário da Visão, processa essas entradas e atualiza o Modelo conforme necessário.
   - Em Java, os controladores geralmente são implementados como classes que respondem a eventos do usuário, como cliques de botões em interfaces gráficas, e coordenam a comunicação entre o Modelo e a Visão.

**Fluxo de Trabalho:**
1. O usuário interage com a Visão.
2. A Visão passa as interações do usuário para o Controlador.
3. O Controlador processa as interações, realiza as operações necessárias no Modelo e atualiza a Visão conforme necessário.
4. A Visão exibe os resultados ao usuário.

**Vantagens da Arquitetura MVC em Java:**
- **Separação de Responsabilidades:** Cada componente tem uma função específica, facilitando a manutenção e a evolução do código.
- **Reusabilidade:** Os componentes podem ser reutilizados em diferentes partes do aplicativo.
- **Testabilidade:** A separação permite testar cada componente independentemente, facilitando a implementação de testes unitários.
- **Escalabilidade:** Facilita a escalabilidade do projeto, permitindo a adição de novas funcionalidades sem afetar drasticamente outras partes do sistema.

Ao implementar a arquitetura MVC em Java, é comum utilizar frameworks como Spring MVC para aplicações web ou JavaFX para aplicações desktop, que fornecem estruturas e convenções para facilitar a implementação desse padrão.
