# JDBC

JDBC (Java Database Connectivity) é uma API (Application Programming Interface) que permite a execução de operações sobre bases de dados usando a linguagem de programação Java. O JDBC proporciona uma interface padrão para conectar-se a bancos de dados relacionais, executar consultas SQL e manipular dados, tornando-se uma ferramenta fundamental para desenvolvedores Java que trabalham com persistência de dados. Aqui estão os principais pontos sobre JDBC:

### 1. **Arquitetura JDBC**

A arquitetura JDBC consiste em várias camadas que facilitam a interação com os bancos de dados:

- **Driver Manager**: Gerencia uma lista de drivers de banco de dados. Ele carrega os drivers necessários e estabelece a conexão entre a aplicação Java e o banco de dados.
- **Driver**: Uma implementação específica de um banco de dados que lida com a comunicação real entre a aplicação Java e o banco de dados.
- **Connection**: Interface que representa uma conexão com o banco de dados. É usada para criar declarações SQL e gerenciar transações.
- **Statement**: Interface usada para executar consultas SQL. Existem três tipos principais de declarações: `Statement`, `PreparedStatement`, e `CallableStatement`.
- **ResultSet**: Interface que representa o conjunto de resultados de uma consulta SQL. Permite iterar sobre os dados retornados.

### 2. **Processo de Conexão com um Banco de Dados**

Conectar-se a um banco de dados usando JDBC envolve vários passos:

1. **Carregar o Driver JDBC**:
   ```java
   Class.forName("com.mysql.cj.jdbc.Driver");
   ```

2. **Estabelecer uma Conexão**:
   ```java
   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco", "usuario", "senha");
   ```

3. **Criar uma Declaração**:
   ```java
   Statement statement = connection.createStatement();
   ```

4. **Executar uma Consulta SQL**:
   ```java
   ResultSet resultSet = statement.executeQuery("SELECT * FROM tabela");
   ```

5. **Processar os Resultados**:
   ```java
   while (resultSet.next()) {
       System.out.println(resultSet.getString("coluna"));
   }
   ```

6. **Fechar Recursos**:
   ```java
   resultSet.close();
   statement.close();
   connection.close();
   ```

### 3. **Tipos de Statements**

- **Statement**: Usado para executar consultas SQL estáticas.
- **PreparedStatement**: Usado para consultas parametrizadas, prevenindo injeção de SQL e melhorando a performance em consultas repetitivas.
  ```java
  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tabela WHERE coluna = ?");
  preparedStatement.setString(1, "valor");
  ResultSet resultSet = preparedStatement.executeQuery();
  ```
- **CallableStatement**: Usado para chamar stored procedures no banco de dados.
  ```java
  CallableStatement callableStatement = connection.prepareCall("{call minha_procedure(?)}");
  callableStatement.setString(1, "valor");
  ResultSet resultSet = callableStatement.executeQuery();
  ```

### 4. **Gerenciamento de Transações**

JDBC permite o controle manual de transações através dos métodos `commit`, `rollback`, e `setAutoCommit` da interface `Connection`:

- **Desabilitar o Auto-Commit**:
  ```java
  connection.setAutoCommit(false);
  ```

- **Executar Várias Operações**:
  ```java
  statement.executeUpdate("INSERT INTO tabela VALUES ...");
  statement.executeUpdate("UPDATE tabela SET ...");
  ```

- **Commit ou Rollback**:
  ```java
  connection.commit();  // Confirma as operações
  // connection.rollback();  // Desfaz as operações em caso de erro
  ```

### 5. **Drivers JDBC**

Existem quatro tipos principais de drivers JDBC:

- **Type 1**: Driver JDBC-ODBC Bridge, que usa ODBC para comunicação com o banco de dados.
- **Type 2**: Driver Nativo-API Parte-Java, que converte chamadas JDBC em chamadas nativas do banco de dados.
- **Type 3**: Driver de Rede Puro-Java, que usa middleware para converter chamadas JDBC.
- **Type 4**: Driver Puro-Java (Thin Driver), que converte diretamente as chamadas JDBC em protocolos de banco de dados.

### Conclusão

JDBC é uma ferramenta poderosa e essencial para qualquer desenvolvedor Java que precise interagir com bancos de dados relacionais. Ele fornece uma interface flexível e robusta para executar operações de banco de dados, gerenciar conexões e garantir que as transações sejam tratadas de maneira segura e eficiente.
