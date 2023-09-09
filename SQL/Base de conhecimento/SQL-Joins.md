# Joins

Os "joins" no SQL são operações usadas para combinar dados de duas ou mais tabelas em um único conjunto de resultados. Eles são essenciais para consultar informações de várias tabelas relacionadas em um banco de dados relacional. Os joins são executados usando uma cláusula SQL específica, geralmente a cláusula `JOIN`, que permite que você especifique as condições sob as quais as linhas de diferentes tabelas devem ser combinadas. Aqui estão os tipos mais comuns de joins no SQL:

1. **INNER JOIN:** O INNER JOIN retorna apenas as linhas que têm valores correspondentes em ambas as tabelas envolvidas na junção. É usado quando você deseja recuperar apenas os registros que têm correspondência em ambas as tabelas.

   Exemplo:
   ```sql
   SELECT orders.order_id, customers.customer_name
   FROM orders
   INNER JOIN customers ON orders.customer_id = customers.customer_id;
   ```

2. **LEFT JOIN (ou LEFT OUTER JOIN):** O LEFT JOIN retorna todas as linhas da tabela à esquerda (a primeira tabela mencionada) e as linhas correspondentes da tabela à direita (a segunda tabela mencionada). Se não houver correspondência na tabela à direita, as colunas correspondentes na saída serão preenchidas com valores NULL.

   Exemplo:
   ```sql
   SELECT customers.customer_name, orders.order_id
   FROM customers
   LEFT JOIN orders ON customers.customer_id = orders.customer_id;
   ```

3. **RIGHT JOIN (ou RIGHT OUTER JOIN):** O RIGHT JOIN é semelhante ao LEFT JOIN, mas retorna todas as linhas da tabela à direita e as linhas correspondentes da tabela à esquerda. Se não houver correspondência na tabela à esquerda, as colunas correspondentes na saída serão preenchidas com valores NULL. Alguns sistemas de banco de dados não suportam o RIGHT JOIN diretamente, mas você pode usar um LEFT JOIN invertendo a ordem das tabelas.

4. **FULL OUTER JOIN:** O FULL OUTER JOIN retorna todas as linhas de ambas as tabelas, combinando-as onde houver correspondência e preenchendo com valores NULL onde não houver correspondência.

   Exemplo:
   ```sql
   SELECT customers.customer_name, orders.order_id
   FROM customers
   FULL OUTER JOIN orders ON customers.customer_id = orders.customer_id;
   ```

5. **SELF JOIN:** Um SELF JOIN é uma operação em que uma tabela é combinada com ela mesma. Isso é útil quando você tem uma tabela que armazena informações hierárquicas ou relacionamentos entre registros na mesma tabela.

   Exemplo:
   ```sql
   SELECT e1.employee_name, e2.employee_name
   FROM employees e1
   INNER JOIN employees e2 ON e1.manager_id = e2.employee_id;
   ```

6. **CROSS JOIN:** Um CROSS JOIN retorna o produto cartesiano de duas tabelas, combinando cada linha da primeira tabela com cada linha da segunda tabela. Isso resulta em um conjunto de resultados muito grande e é geralmente usado com cuidado.

   Exemplo:
   ```sql
   SELECT products.product_name, categories.category_name
   FROM products
   CROSS JOIN categories;
   ```

Lembre-se de que é importante escolher o tipo de join adequado com base nos requisitos da consulta, a fim de obter os resultados desejados e evitar resultados inesperados. Também é fundamental usar as condições de junção corretas nas cláusulas ON ou WHERE para garantir que as tabelas sejam combinadas de acordo com a lógica apropriada.
