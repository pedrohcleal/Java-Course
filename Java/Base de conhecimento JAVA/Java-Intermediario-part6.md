# Java part 6

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

A pilha de chamadas de métodos, também conhecida como "stack" em inglês, é uma estrutura de dados fundamental no contexto de execução de programas Java. Essa pilha é usada para controlar a execução de métodos e manter o contexto de cada chamada de método durante a execução do programa.

Aqui está uma visão geral de como a pilha de chamadas de métodos funciona em Java:

1. **Criação de Frame (Quadro):**
   - Cada vez que um método é chamado, um bloco de memória chamado "frame" é criado na pilha de chamadas de métodos para esse método específico. O frame contém informações como variáveis locais, operandos, endereço de retorno e outros detalhes relacionados à execução do método.

2. **Empilhamento (Push) e Desempilhamento (Pop):**
   - À medida que os métodos são chamados, seus frames correspondentes são empilhados na pilha. Quando um método conclui sua execução, seu frame é removido da pilha, processo conhecido como desempilhamento (pop). Isso ocorre de forma LIFO (Last In, First Out), ou seja, o último método que entrou é o primeiro a sair.

3. **Chamadas Recursivas:**
   - Quando um método chama a si mesmo de forma recursiva, novos frames são empilhados para cada chamada recursiva. Cada chamada recursiva tem seu próprio conjunto de variáveis locais e outros dados.

4. **Overflow e Underflow da Pilha:**
   - A pilha de chamadas de métodos tem um tamanho limitado. Se a pilha atingir seu limite, ocorre um erro conhecido como "StackOverflowError". Por outro lado, se um método tentar acessar um frame que não está presente na pilha, ocorre um "StackUnderflowError".

5. **Chamadas de Métodos e Retornos:**
   - Quando um método é chamado, o endereço de retorno é empilhado junto com o frame do método chamador. Isso permite que, quando o método chamado é concluído, o controle seja transferido de volta ao método chamador no endereço de retorno desempilhado.

A pilha de chamadas de métodos desempenha um papel crítico na execução de programas Java, garantindo que a execução de métodos seja gerenciada de maneira eficiente e que o controle seja transferido de volta corretamente após a conclusão de cada método. O entendimento dessa estrutura é essencial para compreender como o controle de fluxo é mantido durante a execução de um programa Java.
