-- tabela clientes
SELECT * FROM clientes;

SELECT 
	ID_Cliente AS 'ID Cliente',
    Nome AS 'Nome do cliente',
    Data_Nascimento AS 'Data de nascimento',
    Email AS 'E-mail do cliente'
FROM clientes;

-- exemplo 3. Selecionar apenas as 5 primeiras linhas da tabela de produtos

SELECT * FROM produtos
LIMIT 10;

-- exemplo 4. Selecionar todas as linhas de tabela produtos, mas ordenando pela coluna Preco_Unit

select * from produtos
ORDER BY Preco_Unit DESC;


