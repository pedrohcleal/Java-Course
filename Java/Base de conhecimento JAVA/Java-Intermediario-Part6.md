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
