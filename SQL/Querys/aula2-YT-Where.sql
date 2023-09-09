-- Exemplo1
-- mostra apenas os produtos com preços iguais ou maiores  que 1800
SELECT *
FROM produtos
WHERE Preco_Unit >= 1800;

-- exemplo2
-- mostra apenas os produtos com preco igual a 3100
SELECT *
FROM produtos
WHERE Preco_Unit = 3100;

-- Exemplo3
-- mostra apenas os produtos da marca DELL
SELECT *
FROM produtos
WHERE Marca_Produto = 'DELL';

-- Exemplo 4
-- apenas pedidos feitos no dia 03-01-2019
SELECT *
FROM pedidos
WHERE Data_Venda = '2019-01-03';

-- Exemplo 5
-- Mostra apenas os clientes solteiros do sexo masculino
SELECT *
FROM clientes
WHERE Estado_Civil = 'S' AND Sexo = 'M';

-- Exemplo 6
-- MOstre apenas os produtos das marcas DELL ou Sansung
SELECT * 
FROM produtos
WHERE Marca_Produto = 'DELL' OR Marca_Produto = 'Samsung';