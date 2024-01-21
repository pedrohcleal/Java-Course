# Base de dados relacionais

## Conceitos

As bases de dados relacionais são uma forma de organizar e armazenar dados em um sistema de gerenciamento de banco de dados relacional (SGBDR). Esse modelo de dados foi proposto por Edgar F. Codd na década de 1970 e é amplamente utilizado em sistemas de informação e desenvolvimento de software. Aqui estão alguns conceitos-chave relacionados a bases de dados relacionais:

1. **Tabelas (ou Relações):**
   - A unidade fundamental de armazenamento de dados em um banco de dados relacional é a tabela.
   - Cada tabela é composta por linhas (tuplas) e colunas (atributos).
   - As colunas representam os diferentes tipos de informações que são armazenadas, enquanto as linhas contêm os dados reais.

2. **Chaves Primárias:**
   - Cada tabela geralmente tem uma coluna ou conjunto de colunas chamada chave primária.
   - A chave primária é única para cada linha na tabela e é usada para identificar exclusivamente cada registro.
   - Garante a integridade referencial e facilita a indexação eficiente dos dados.

3. **Relacionamentos:**
   - Relacionamentos são estabelecidos entre tabelas por meio de chaves.
   - Chaves estrangeiras são usadas para representar relacionamentos entre as tabelas.
   - Esses relacionamentos garantem a integridade referencial, permitindo a consistência dos dados entre tabelas.

4. **Normalização:**
   - Processo de organização de dados em uma tabela de forma que redundâncias e dependências funcionais sejam minimizadas.
   - Normalização ajuda a reduzir a duplicação de dados e melhora a consistência e eficiência do banco de dados.

5. **Consultas SQL:**
   - A Structured Query Language (SQL) é a linguagem padrão para interagir com bancos de dados relacionais.
   - Permite a realização de operações como inserção, atualização, exclusão e recuperação de dados.

6. **Transações:**
   - Uma transação é uma sequência de uma ou mais operações de banco de dados que formam uma unidade lógica de trabalho.
   - As propriedades ACID (Atomicidade, Consistência, Isolamento e Durabilidade) garantem a integridade dos dados em transações.

7. **Índices:**
   - Índices são estruturas que melhoram a velocidade de recuperação de dados em consultas, funcionando como um guia para a localização eficiente de registros.
   - As chaves primárias e estrangeiras geralmente têm índices associados automaticamente.

8. **Visões (Views):**
   - Visões são consultas SQL predefinidas que podem ser tratadas como tabelas virtuais.
   - Elas simplificam a complexidade da consulta ao apresentar uma visão simplificada dos dados.

9. **Restrições (Constraints):**
   - Restrições são regras aplicadas aos dados para garantir sua integridade.
   - Exemplos incluem restrições de chave primária, chave estrangeira, valores únicos, entre outras.

Esses conceitos formam a base dos sistemas de banco de dados relacionais, oferecendo uma estrutura robusta e flexível para armazenamento, organização e recuperação de dados.

## Relacionamentos

Os relacionamentos são uma parte fundamental dos bancos de dados relacionais e são usados para conectar informações entre diferentes tabelas. Esses relacionamentos garantem a integridade referencial e permitem que os dados sejam organizados de maneira eficiente. Existem vários tipos de relacionamentos que podem ser estabelecidos entre as tabelas em um banco de dados relacional:

1. **Relacionamento Um para Um (1:1):**
   - Neste tipo de relacionamento, uma linha em uma tabela está relacionada a uma única linha em outra tabela.
   - É menos comum em comparação com outros tipos de relacionamentos, mas pode ser útil para dividir informações específicas em tabelas separadas.

2. **Relacionamento Um para Muitos (1:N):**
   - É o tipo mais comum de relacionamento.
   - Uma linha em uma tabela está relacionada a várias linhas em outra tabela.
   - Por exemplo, uma tabela de "Clientes" pode ter um relacionamento 1:N com uma tabela de "Pedidos", indicando que um cliente pode fazer vários pedidos, mas cada pedido está associado a apenas um cliente.

3. **Relacionamento Muitos para Muitos (N:N):**
   - Este tipo de relacionamento é implementado por meio de uma tabela intermediária (tabela de junção).
   - Múltiplas linhas em uma tabela podem estar relacionadas a várias linhas em outra tabela.
   - Por exemplo, em um sistema de gerenciamento de cursos, uma tabela de "Alunos" pode ter um relacionamento N:N com uma tabela de "Cursos" através de uma tabela de junção "Matrículas", indicando que um aluno pode se matricular em vários cursos e um curso pode ter vários alunos matriculados.

4. **Chaves Primárias e Chaves Estrangeiras:**
   - Chaves primárias são utilizadas para identificar exclusivamente cada linha em uma tabela.
   - Chaves estrangeiras são usadas para estabelecer relacionamentos entre tabelas, referenciando a chave primária de outra tabela.
   - A chave estrangeira em uma tabela refere-se à chave primária da tabela relacionada.

5. **Integridade Referencial:**
   - A integridade referencial garante que os relacionamentos entre as tabelas sejam mantidos de maneira consistente.
   - Isso significa que uma chave estrangeira em uma tabela deve sempre corresponder a uma chave primária existente na tabela relacionada.

6. **Ações de Cascata (CASCADE):**
   - Em alguns SGBDRs, é possível definir ações de cascata para operações como exclusão ou atualização.
   - Por exemplo, se uma linha em uma tabela pai é excluída, as linhas correspondentes nas tabelas filhas também podem ser automaticamente excluídas (CASCADE DELETE).

7. **Auto-relacionamento:**
   - Uma tabela pode se relacionar consigo mesma, o que é conhecido como auto-relacionamento.
   - Por exemplo, em uma tabela de "Funcionários", pode haver um relacionamento onde um funcionário pode ter um supervisor que também é um funcionário na mesma tabela.

8. **Relacionamentos de Atributos Compostos:**
   - Em alguns casos, uma relação pode ser estabelecida com base em um conjunto de atributos em vez de uma única chave.
   - Isso é conhecido como relacionamento de atributos compostos.

Os relacionamentos são essenciais para modelar e organizar dados de maneira eficaz, permitindo a representação de informações complexas e suas interconexões em um banco de dados relacional.
