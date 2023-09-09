# Funções agregadas
As funções agregadas em SQL são usadas para realizar cálculos em conjuntos de valores, geralmente em colunas de tabelas, para obter resultados resumidos, como média, soma, mínimo, máximo, etc. Tanto o MySQL quanto o PostgreSQL suportam um conjunto de funções agregadas para ajudar a realizar esses tipos de operações. Vou listar algumas funções agregadas com exemplos para ambos os sistemas de gerenciamento de banco de dados.

### Exemplos de Funções Agregadas no MySQL:

1. **COUNT**: Conta o número de registros em uma coluna.
   ```sql
   SELECT COUNT(*) FROM orders;
   ```

2. **SUM**: Calcula a soma dos valores em uma coluna.
   ```sql
   SELECT SUM(amount) FROM transactions;
   ```

3. **AVG**: Calcula a média dos valores em uma coluna.
   ```sql
   SELECT AVG(price) FROM products;
   ```

4. **MIN**: Retorna o valor mínimo em uma coluna.
   ```sql
   SELECT MIN(date) FROM events;
   ```

5. **MAX**: Retorna o valor máximo em uma coluna.
   ```sql
   SELECT MAX(score) FROM exam_results;
   ```

### Exemplos de Funções Agregadas no PostgreSQL:

1. **COUNT**: Conta o número de registros em uma coluna.
   ```sql
   SELECT COUNT(*) FROM orders;
   ```

2. **SUM**: Calcula a soma dos valores em uma coluna.
   ```sql
   SELECT SUM(amount) FROM transactions;
   ```

3. **AVG**: Calcula a média dos valores em uma coluna.
   ```sql
   SELECT AVG(price) FROM products;
   ```

4. **MIN**: Retorna o valor mínimo em uma coluna.
   ```sql
   SELECT MIN(date) FROM events;
   ```

5. **MAX**: Retorna o valor máximo em uma coluna.
   ```sql
   SELECT MAX(score) FROM exam_results;
   ```

6. **STRING_AGG**: Concatena valores de uma coluna em uma única string, com um separador definido.
   ```sql
   SELECT STRING_AGG(name, ', ') FROM employees;
   ```

7. **ARRAY_AGG**: Agrupa valores de uma coluna em um array.
   ```sql
   SELECT department_id, ARRAY_AGG(name) FROM employees GROUP BY department_id;
   ```

8. **JSON_AGG**: Agrupa valores em formato JSON.
   ```sql
   SELECT department_id, JSON_AGG(name) FROM employees GROUP BY department_id;
   ```

9. **PERCENTILE_CONT**: Calcula o valor do percentil para uma coluna.
   ```sql
   SELECT PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY score) FROM exam_results;
   ```

Lembre-se de que esses exemplos são apenas uma introdução às funções agregadas disponíveis no MySQL e PostgreSQL. Ambos os sistemas oferecem uma ampla variedade de funções para atender às necessidades de análise e cálculos em conjuntos de dados. Certifique-se de consultar a documentação oficial do MySQL e do PostgreSQL para obter informações detalhadas sobre todas as funções agregadas suportadas.

## Sobre groupby & having
