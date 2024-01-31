# Part5 - Java

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
