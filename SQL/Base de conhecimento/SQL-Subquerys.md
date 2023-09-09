# Subquerys

Uma subconsulta (também conhecida como subquery ou query aninhada) no SQL é uma consulta que está incorporada dentro de outra consulta SQL maior. Elas são usadas para recuperar informações de uma ou mais tabelas com base em critérios específicos e, em seguida, essa subconsulta é incorporada à consulta principal para fornecer resultados mais precisos ou filtrados.

Aqui estão alguns pontos-chave sobre subconsultas no SQL:

1. Propósito:
   - As subconsultas são usadas para realizar consultas mais complexas e precisas, filtrando os resultados da consulta principal com base em critérios específicos.
   - Elas podem ser usadas em várias cláusulas SQL, como WHERE, FROM, SELECT, HAVING e JOIN, dependendo do que você deseja alcançar.

2. Sintaxe:
   - Uma subconsulta é colocada dentro de parênteses e pode aparecer em qualquer lugar onde uma expressão seja permitida.
   - A subconsulta é precedida por uma cláusula, como SELECT, FROM, WHERE, etc.

3. Exemplo de Subconsulta na cláusula WHERE:
   - Uma subconsulta na cláusula WHERE é usada para filtrar as linhas da consulta principal com base em uma condição que envolve outra tabela.
   - Exemplo:
     ```sql
     SELECT nome
     FROM funcionarios
     WHERE departamento_id = (SELECT id FROM departamentos WHERE nome = 'Vendas');
     ```

4. Exemplo de Subconsulta na cláusula FROM:
   - Uma subconsulta na cláusula FROM é usada para criar uma tabela temporária que pode ser usada na consulta principal.
   - Exemplo:
     ```sql
     SELECT AVG(salario)
     FROM (SELECT salario FROM funcionarios WHERE departamento_id = 2) AS salario_departamento_2;
     ```

5. Tipos de Subconsultas:
   - Subconsultas correlacionadas: Dependem de valores da consulta externa e são executadas para cada linha da consulta principal.
   - Subconsultas não correlacionadas: Não dependem dos valores da consulta externa e são executadas uma vez antes de a consulta principal ser processada.

6. Resultados:
   - O resultado de uma subconsulta pode ser um valor único, uma lista de valores ou até mesmo um conjunto de resultados tabulares, dependendo da consulta e de como ela é usada na consulta principal.

Subconsultas são uma ferramenta poderosa para escrever consultas SQL complexas e flexíveis, permitindo que você execute operações avançadas de filtragem e seleção de dados em bancos de dados relacionais. Elas desempenham um papel crucial na manipulação e recuperação de dados de forma eficaz em sistemas de gerenciamento de banco de dados SQL.

## Exemplos

Claro, vou fornecer exemplos de cada tipo de subconsulta que você mencionou:

**Exemplo 1: Subquery no WHERE**

Neste exemplo, usaremos uma subconsulta na cláusula WHERE para recuperar todos os funcionários que têm um salário maior do que a média de salários em seu departamento.

```sql
SELECT nome, salario
FROM funcionarios
WHERE salario > (SELECT AVG(salario) FROM funcionarios WHERE departamento_id = funcionarios.departamento_id);
```

Neste caso, a subconsulta na cláusula WHERE calcula a média de salários para cada departamento e compara o salário de cada funcionário com a média de seu próprio departamento.

**Exemplo 2: Subquery com WITH**

A cláusula `WITH` (também conhecida como CTE - Common Table Expression) permite criar uma subconsulta nomeada que pode ser referenciada na consulta principal. Aqui está um exemplo usando `WITH` para calcular a soma total dos salários em um departamento específico:

```sql
WITH SomaSalarios AS (
  SELECT departamento_id, SUM(salario) AS total_salarios
  FROM funcionarios
  GROUP BY departamento_id
)

SELECT d.nome, ss.total_salarios
FROM departamentos d
JOIN SomaSalarios ss ON d.id = ss.departamento_id;
```

Neste exemplo, a subconsulta com `WITH` calcula a soma total dos salários para cada departamento, e a consulta principal junta essa informação com os nomes dos departamentos.

**Exemplo 3: Subquery no FROM**

Aqui está um exemplo de subconsulta na cláusula FROM que cria uma tabela temporária que pode ser usada na consulta principal. Vamos criar uma tabela temporária contendo os funcionários que ganham mais do que um valor específico:

```sql
SELECT *
FROM (
  SELECT *
  FROM funcionarios
  WHERE salario > 50000
) AS funcionarios_alto_salario;
```

Neste caso, a subconsulta na cláusula FROM cria uma tabela temporária chamada `funcionarios_alto_salario` que contém apenas os funcionários com salários superiores a 50.000.

**Exemplo 4: Subquery no SELECT**

Aqui está um exemplo de subconsulta na cláusula SELECT que recupera informações adicionais para cada linha da consulta principal. Vamos adicionar o nome do chefe de cada departamento à consulta:

```sql
SELECT nome AS departamento, (SELECT nome FROM funcionarios WHERE id = d.chefe_id) AS chefe
FROM departamentos d;
```

Neste exemplo, a subconsulta no SELECT recupera o nome do chefe de cada departamento com base no ID do chefe armazenado na tabela de departamentos. Isso adiciona uma coluna de nome do chefe à consulta principal.
