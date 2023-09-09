## Operadores SQL

Em SQL (Structured Query Language), os operadores são símbolos especiais ou palavras-chave que são usados para realizar operações em dados, como comparações, cálculos matemáticos, junções de tabelas e muito mais. Os operadores são uma parte fundamental das consultas e comandos SQL. Aqui estão alguns dos principais tipos de operadores em SQL:

1. **Operadores Aritméticos**: Esses operadores realizam operações matemáticas em valores numéricos.
   - **+**: Adição.
   - **-**: Subtração.
   - **\***: Multiplicação.
   - **/**: Divisão.
   - **%**: Módulo (resto da divisão).

2. **Operadores de Comparação**: Esses operadores comparam valores para verificar se determinadas condições são verdadeiras ou falsas.
   - **=**: Igual a.
   - **!= / <>**: Diferente de.
   - **<**: Menor que.
   - **>**: Maior que.
   - **<=**: Menor ou igual a.
   - **>=**: Maior ou igual a.

3. **Operadores Lógicos**: Utilizados para combinar ou modificar condições lógicas.
   - **AND**: Retorna verdadeiro se todas as condições forem verdadeiras.
   - **OR**: Retorna verdadeiro se pelo menos uma das condições for verdadeira.
   - **NOT**: Inverte o valor de verdadeiro para falso e vice-versa.

4. **Operadores de Concatenação de Strings**: Usados para combinar strings.
   - **||**: Concatenação de strings em sistemas como Oracle e PostgreSQL.
   - **CONCAT**: Função de concatenação em sistemas como MySQL e SQL Server.

5. **Operadores de Junção**: Utilizados para combinar dados de várias tabelas em uma única consulta.
   - **INNER JOIN**: Retorna apenas as linhas que possuem correspondências nas tabelas relacionadas.
   - **LEFT JOIN**: Retorna todas as linhas da primeira tabela e as correspondências da segunda tabela.
   - **RIGHT JOIN**: Retorna todas as linhas da segunda tabela e as correspondências da primeira tabela.
   - **FULL JOIN**: Retorna todas as linhas de ambas as tabelas.

6. **Operadores de Atribuição**: Usados para atribuir valores a variáveis ou colunas.
   - **=**: Atribuição de valor a uma coluna em uma instrução UPDATE.
   - **:=**: Atribuição de valor a uma variável em sistemas como MySQL.

7. **Operadores de Agrupamento**: Usados com funções de agregação para especificar como os resultados são agrupados.
   - **GROUP BY**: Agrupa os resultados por uma ou mais colunas.
   - **HAVING**: Filtra grupos agregados com base em uma condição.

8. **Operadores de Subconsulta**: Usados para incluir consultas dentro de outras consultas.
   - **IN**: Verifica se um valor está presente em um conjunto de resultados de uma subconsulta.
   - **EXISTS**: Verifica se a subconsulta retorna algum resultado.
   - **ANY / ALL**: Usados para comparar um valor com um conjunto de valores retornados por uma subconsulta.

Esses são apenas alguns exemplos dos diversos operadores disponíveis em SQL. Cada sistema de gerenciamento de banco de dados pode ter algumas variações em termos de sintaxe e suporte a operadores específicos.

## Filtros SQL

Em SQL (Structured Query Language), filtros são usados para especificar condições que determinam quais registros de uma tabela serão retornados em uma consulta. Eles permitem que você recupere dados específicos que atendam a certas condições, reduzindo o conjunto de resultados para atender às necessidades da sua consulta. Os filtros são definidos principalmente através da cláusula WHERE em uma consulta SELECT, embora também possam ser usados em outras cláusulas, como UPDATE e DELETE.

Aqui estão alguns dos principais componentes e operadores usados para criar filtros em SQL:

1. **Cláusula WHERE**: A cláusula WHERE é usada para aplicar condições de filtro a uma consulta. A sintaxe básica é:
   
   ```sql
   SELECT coluna1, coluna2
   FROM tabela
   WHERE condição;
   ```

2. **Operadores de Comparação**: Esses operadores são usados para comparar valores. Alguns exemplos incluem:
   - `=` (igual)
   - `<>` ou `!=` (diferente)
   - `<` (menor que)
   - `>` (maior que)
   - `<=` (menor ou igual)
   - `>=` (maior ou igual)

3. **Operadores Lógicos**: Esses operadores são usados para combinar várias condições. Os operadores lógicos mais comuns são:
   - `AND` (e)
   - `OR` (ou)
   - `NOT` (não)

4. **Operadores de Pertencimento**: Esses operadores são usados para verificar se um valor está presente em uma lista. Exemplos incluem:
   - `IN` (pertence a uma lista)
   - `NOT IN` (não pertence a uma lista)

5. **Operadores de Texto**: Esses operadores são usados para comparar strings. Alguns exemplos incluem:
   - `LIKE` (usado com curingas para correspondência de padrões)
   - `ILIKE` (similar ao `LIKE`, mas case-insensitive)

6. **Operadores de Nulo**: Esses operadores são usados para verificar valores nulos.
   - `IS NULL` (valor é nulo)
   - `IS NOT NULL` (valor não é nulo)

7. **Operadores de Intervalo**: São usados para verificar se um valor está dentro de um intervalo.
   - `BETWEEN valor1 AND valor2` (valor está dentro do intervalo)
   - `NOT BETWEEN valor1 AND valor2` (valor não está dentro do intervalo)

8. **Expressões Condicionais**: Às vezes, você pode usar expressões condicionais para construir filtros mais complexos. Um exemplo é o uso do `CASE` para criar condições personalizadas.

A combinação desses elementos permite que você crie filtros sofisticados e direcionados para recuperar os dados desejados de suas tabelas em um banco de dados. Lembre-se de que a sintaxe exata pode variar dependendo do sistema de gerenciamento de banco de dados que você está usando, mas os princípios básicos dos filtros em SQL permanecem consistentes.
