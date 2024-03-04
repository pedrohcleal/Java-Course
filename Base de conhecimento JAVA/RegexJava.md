Em Java, expressões regulares, ou regex (abreviação de "regular expressions"), são manipuladas pela classe `java.util.regex`. As expressões regulares são padrões de texto que permitem a busca, correspondência e manipulação eficiente de strings. Elas são frequentemente utilizadas para validar e extrair informações de strings, bem como para realizar substituições e buscas complexas.

A classe principal que lida com expressões regulares em Java é `java.util.regex.Pattern`. Aqui está um exemplo básico de como usar expressões regulares em Java:

```java
import java.util.regex.*;

public class ExemploRegex {

    public static void main(String[] args) {
        // Definindo uma expressão regular
        String regex = "a.b";

        // Compilando a expressão regular em um padrão
        Pattern pattern = Pattern.compile(regex);

        // Criando uma string de teste
        String texto = "acb";

        // Criando um objeto Matcher para encontrar correspondências
        Matcher matcher = pattern.matcher(texto);

        // Verificando se há correspondência
        if (matcher.find()) {
            System.out.println("Encontrado!");
        } else {
            System.out.println("Não encontrado!");
        }
    }
}
```

Neste exemplo, a expressão regular "a.b" será correspondida com qualquer string que tenha "a", seguido por qualquer caractere, seguido por "b". Neste caso, a string de teste "acb" atende a essa condição, e portanto, "Encontrado!" será impresso no console.

A classe `Matcher` é usada para aplicar a expressão regular a uma string específica e realizar operações de correspondência. Além disso, a classe `Pattern` fornece métodos estáticos para criar padrões a partir de strings de expressão regular.

Outros métodos úteis da classe `Matcher` incluem `matches()` para verificar se a expressão regular corresponde à string inteira, `group()` para obter o trecho correspondente, `start()` e `end()` para obter as posições de início e fim da correspondência, e muitos outros.

Expressões regulares podem se tornar bastante complexas, com uma variedade de operadores e caracteres especiais que têm significados específicos. É recomendável consultar a documentação oficial da classe `java.util.regex` para uma compreensão mais profunda e para explorar todas as funcionalidades oferecidas por essa API.

Expressões regulares (regex) oferecem uma poderosa ferramenta para realizar filtragens e buscas em strings, com base em padrões definidos. Abaixo, estão alguns dos filtros mais utilizados com expressões regulares:

1. **Correspondência de Caracteres Simples:**
   - `.`: Corresponde a qualquer caractere único, exceto quebras de linha.
   - `\d`: Corresponde a qualquer dígito (0-9).
   - `\D`: Corresponde a qualquer caractere que não seja um dígito.
   - `\w`: Corresponde a qualquer caractere de palavra (letras, números, sublinhados).
   - `\W`: Corresponde a qualquer caractere que não seja um caractere de palavra.
   - `\s`: Corresponde a qualquer caractere de espaço em branco.
   - `\S`: Corresponde a qualquer caractere que não seja um espaço em branco.

2. **Quantificadores:**
   - `*`: Corresponde a zero ou mais ocorrências do caractere anterior.
   - `+`: Corresponde a uma ou mais ocorrências do caractere anterior.
   - `?`: Torna o caractere anterior opcional (zero ou uma ocorrência).
   - `{n}`: Corresponde exatamente a n ocorrências do caractere anterior.
   - `{n,}`: Corresponde a n ou mais ocorrências do caractere anterior.
   - `{n,m}`: Corresponde a pelo menos n e no máximo m ocorrências do caractere anterior.

3. **Âncoras:**
   - `^`: Corresponde ao início da linha.
   - `$`: Corresponde ao final da linha.

4. **Classes de Caracteres:**
   - `[abc]`: Corresponde a qualquer caractere 'a', 'b' ou 'c'.
   - `[^abc]`: Corresponde a qualquer caractere que não seja 'a', 'b' ou 'c'.
   - `[a-z]`: Corresponde a qualquer caractere entre 'a' e 'z'.
   - `[A-Z]`: Corresponde a qualquer caractere entre 'A' e 'Z'.
   - `[0-9]`: Corresponde a qualquer dígito.

5. **Agrupamento e Captura:**
   - `()`: Agrupa expressões e captura a correspondência.
   - `(?:)`: Agrupa expressões sem capturar a correspondência.

6. **Escape de Caracteres Especiais:**
   - `\`: Utilizado para escapar caracteres especiais, permitindo a correspondência literal. Por exemplo, `\.` corresponde a um ponto, não a qualquer caractere.

7. **Metacaracteres de Fronteira de Palavras:**
   - `\b`: Corresponde a uma fronteira de palavra (início ou fim).
   - `\B`: Corresponde a uma posição que não é uma fronteira de palavra.

8. **Operadores Lógicos:**
   - `|`: Representa a lógica "OU". Por exemplo, `a|b` corresponde a 'a' ou 'b'.

9. **Quantificadores Preguiçosos:**
   - `*?`, `+?`, `??`: Tornam os quantificadores anteriores preguiçosos, correspondendo ao mínimo possível.

Esses são apenas alguns dos elementos e construtores mais comuns em expressões regulares. A complexidade das expressões regulares pode variar de simples a altamente sofisticada, dependendo dos requisitos específicos. Ao criar expressões regulares, é fundamental testá-las em várias situações para garantir que correspondam corretamente ao que é esperado.

## Exemplos úteis:

Vamos explorar alguns exemplos úteis de expressões regulares em Java para situações comuns:

1. **Validação de Endereço de E-mail:**
   ```java
   String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
   ```

   Esta expressão regular valida endereços de e-mail, exigindo que contenham um nome de usuário seguido por "@" e um domínio válido.

2. **Extração de Números de Telefone:**
   ```java
   String regexTelefone = "\\b\\d{3}[-.]?\\d{3}[-.]?\\d{4}\\b";
   ```

   Esta expressão regular extrai números de telefone que podem estar no formato "123-456-7890" ou "123.456.7890".

3. **Remoção de Espaços em Branco no Início e no Fim:**
   ```java
   String regexEspacos = "^\\s+|\\s+$";
   ```

   Essa expressão regular remove espaços em branco no início e no final de uma string.

4. **Validação de Números Inteiros e Decimais:**
   ```java
   String regexNumeros = "[-+]?\\d+\\.?\\d*";
   ```

   Esta expressão regular valida números inteiros e decimais, aceitando formatos como "-123", "456.789" e "+0.123".

5. **Extração de Tags HTML:**
   ```java
   String regexTagsHTML = "<[^>]+>";
   ```

   Essa expressão regular extrai todas as tags HTML de uma string.

6. **Validação de Data (Formato dd/mm/aaaa):**
   ```java
   String regexData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
   ```

   Essa expressão regular valida datas no formato "dd/mm/aaaa".

7. **Validação de Senha Forte:**
   ```java
   String regexSenha = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
   ```

   Esta expressão regular valida senhas fortes que contenham pelo menos uma letra minúscula, uma letra maiúscula, um número e um caractere especial.

8. **Extração de CEP (Código de Endereçamento Postal):**
   ```java
   String regexCEP = "\\b\\d{5}-\\d{3}\\b";
   ```
Vamos explorar cada um desses padrões de expressões regulares:

9. **Padrão: "\\s"**

   - **Descrição:** Este padrão corresponde a qualquer caractere de espaço em branco. Em Java, o caractere de escape `\` precisa ser duplicado (`\\`) dentro de uma string, então "\\s" representa um espaço em branco.

   - **Exemplo de Uso:**
     ```java
     import java.util.regex.*;

     public class ExemploEspacos {
         public static void main(String[] args) {
             String texto = "Exemplo de regex com espaços em branco.";
             Pattern pattern = Pattern.compile("\\s");
             Matcher matcher = pattern.matcher(texto);

             while (matcher.find()) {
                 System.out.println("Encontrado espaço em branco na posição: " + matcher.start());
             }
         }
     }
     ```
     Neste exemplo, o programa encontrará e imprimirá as posições de cada caractere de espaço em branco na string fornecida.

10. **Padrão: "[^\\d]"**

   - **Descrição:** Este padrão corresponde a qualquer caractere que não seja um dígito. O `^` dentro dos colchetes nega a classe de caracteres, tornando-a uma correspondência para qualquer coisa que não seja um dígito.

   - **Exemplo de Uso:**
     ```java
     import java.util.regex.*;

     public class ExemploNaoDigitos {
         public static void main(String[] args) {
             String texto = "123 Main Street";
             Pattern pattern = Pattern.compile("[^\\d]");
             Matcher matcher = pattern.matcher(texto);

             while (matcher.find()) {
                 System.out.println("Encontrado caractere não-dígito: " + matcher.group());
             }
         }
     }
     ```
     Neste exemplo, o programa encontrará e imprimirá os caracteres não-dígitos na string, excluindo os números.


Esses são apenas exemplos básicos, e a complexidade das expressões regulares pode aumentar dependendo dos requisitos específicos. Ao utilizar expressões regulares em Java, lembre-se de lidar com barras invertidas duplicadas, pois elas são caracteres de escape em strings Java. Além disso, teste suas expressões regulares em uma variedade de casos para garantir que atendam aos requisitos esperados.
