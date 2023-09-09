select * from temp_tables.tabela_1
select * from temp_tables.tabela_2


select t1.cpf, t1.name, t2.state
from temp_tables.tabela_1 as t1 
full join temp_tables.tabela_2 as t2
on t1.cpf = t2.cpf


select
	cus.professional_status,
	count(fun.paid_date) as pagamentos
from sales.funnel as fun
left join sales.customers as cus
on fun.customer_id = cus.customer_id
group by cus.professional_status
order by pagamentos desc

-- EXERCÍCIOS ########################################################################

-- (Exercício 1) Identifique quais as marcas de veículo mais visitada na tabela sales.funnel
select count(visit_page_date) as visit, prod.brand
from sales.funnel as fun left join sales.products as prod
on fun.product_id = prod.product_id
group by prod.brand
order by count(visit_page_date) desc

-- (Exercício 2) Identifique quais as lojas de veículo mais visitadas na tabela sales.funnel
select count(visit_id) as visit, fun.store_id
from sales.funnel as fun left join sales.products as prod
on fun.product_id = prod.product_id
group by fun.store_id
order by count(visit_id) desc

-- (Exercício 3) Identifique quantos clientes moram em cada tamanho de cidade (o porte da cidade
-- consta na coluna "size" da tabela temp_tables.regions)



