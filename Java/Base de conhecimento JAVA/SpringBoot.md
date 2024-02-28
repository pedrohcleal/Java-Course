# Java ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)


## API Restful
As APIs RESTful (Representational State Transfer) são um estilo arquitetural para o design de sistemas distribuídos, especialmente na construção de serviços da web. Essas APIs seguem os princípios do REST, que foram introduzidos por Roy Fielding em sua tese de doutorado em 2000.

Aqui estão alguns conceitos-chave relacionados a APIs RESTful:

1. **Recursos (Resources):**
   - Os recursos são entidades ou objetos que são manipulados por meio da API. Cada recurso é identificado por um URI (Uniform Resource Identifier), e a manipulação desses recursos é feita através dos métodos HTTP.

2. **URI (Uniform Resource Identifier):**
   - Cada recurso é identificado por um URI exclusivo, que serve como um endereço para acessar ou manipular esse recurso. Por exemplo, em uma API de blog, um URI para acessar um post específico pode ser algo como "/posts/123".

3. **Métodos HTTP (HTTP Methods):**
   - As operações em recursos são mapeadas para métodos HTTP padrão. Os métodos mais comuns em APIs RESTful são:
     - **GET:** Recuperar um recurso.
     - **POST:** Criar um novo recurso.
     - **PUT ou PATCH:** Atualizar um recurso.
     - **DELETE:** Excluir um recurso.

4. **Representação de Recursos:**
   - Os recursos podem ter várias representações, como JSON, XML ou outros formatos. A representação dos recursos é enviada ou recebida nas requisições HTTP.

5. **Statelessness (Estado):**
   - As APIs RESTful são stateless, o que significa que cada requisição do cliente para o servidor contém toda a informação necessária para entender e processar a requisição. O servidor não mantém o estado da sessão do cliente entre requisições.

6. **HATEOAS (Hypermedia As The Engine Of Application State):**
   - Este princípio sugere que a navegação em um aplicativo deve ser guiada pelas informações presentes nas representações dos recursos, permitindo que os clientes descubram dinamicamente a funcionalidade disponível.

7. **Convenção sobre Configuração:**
   - As APIs RESTful geralmente seguem convenções e padrões para facilitar a compreensão e a utilização. Por exemplo, o uso consistente de pluralização para os nomes dos recursos (por exemplo, "/users" em vez de "/user") é comum.

8. **Segurança:**
   - O HTTPS é frequentemente usado para garantir a segurança das comunicações, e a autenticação e autorização são tratadas de acordo com os padrões da web.

As APIs RESTful são amplamente utilizadas na construção de serviços web devido à sua simplicidade, escalabilidade e interoperabilidade. Elas são adequadas para uma variedade de casos de uso, incluindo o desenvolvimento de aplicativos web, serviços de back-end para aplicativos móveis e implementações de microsserviços.

## Spring Boot

O Spring Boot é um projeto do ecossistema Spring que simplifica o desenvolvimento de aplicativos Java. Ele fornece uma estrutura robusta e conveniente para criar aplicativos Java baseados em Spring com configuração mínima e esforço. O principal objetivo do Spring Boot é facilitar a criação de aplicativos Java autônomos e prontos para produção.

Aqui estão algumas características e conceitos-chave do Spring Boot:

1. **Convenção sobre Configuração:**
   - O Spring Boot segue o princípio de "convenção sobre configuração", o que significa que muitas configurações padrão são fornecidas, reduzindo a quantidade de código necessário para começar um projeto.

2. **Autônomo:**
   - Os aplicativos Spring Boot são autônomos, o que significa que podem ser executados sem a necessidade de um servidor de aplicativos externo. Eles incorporam um servidor incorporado (por exemplo, Tomcat, Jetty ou Undertow) e podem ser iniciados como aplicações Java autônomas.

3. **Configuração externa:**
   - O Spring Boot suporta configuração externa por meio de arquivos de propriedades, YAML, variáveis de ambiente, entre outros. Isso facilita a modificação do comportamento do aplicativo sem a necessidade de recompilação.

4. **Prontidão para Produção:**
   - O Spring Boot fornece recursos que facilitam a preparação de um aplicativo para produção, como métricas, monitoramento, segurança e suporte a vários perfis de ambiente.

5. **Spring Boot Starter:**
   - Os Starters do Spring Boot são conjuntos de dependências pré-configuradas que facilitam a inclusão de recursos específicos no projeto. Eles são projetados para simplificar a configuração de um aplicativo com base nas necessidades, como starters para web, dados, segurança, etc.

6. **Spring Boot CLI (Command Line Interface):**
   - Permite a criação e execução de aplicativos Spring Boot usando a linha de comando, simplificando ainda mais o processo de desenvolvimento.

7. **Integração com Spring Framework:**
   - O Spring Boot é construído sobre o Spring Framework, aproveitando muitos de seus recursos e conceitos, como injeção de dependência, controle transacional, MVC, entre outros.

8. **Suporte a Microsserviços:**
   - O Spring Boot é frequentemente usado no desenvolvimento de microsserviços devido à sua natureza modular e à facilidade de criação de serviços autônomos.

Para começar a usar o Spring Boot, você pode criar um projeto usando o Spring Initializr (https://start.spring.io/) e selecionar as dependências e configurações desejadas. Em seguida, você pode importar o projeto em sua IDE preferida e começar a desenvolver seu aplicativo com base nas necessidades específicas.

## MVC

MVC, que significa Model-View-Controller, é um padrão arquitetural amplamente utilizado no desenvolvimento de software. Esse padrão separa as preocupações relacionadas à lógica de negócios, apresentação e gerenciamento de dados em três componentes distintos. O MVC é especialmente popular em estruturas de desenvolvimento de software para criar interfaces de usuário interativas e robustas. Aqui estão as descrições dos três componentes principais do padrão MVC:

1. **Model (Modelo):**
   - O Modelo representa a camada de dados e lógica de negócios da aplicação. Ele é responsável por recuperar e manipular os dados, bem como por conter a lógica de negócios subjacente. O Modelo notifica a View sobre quaisquer alterações nos dados, para que a interface do usuário possa ser atualizada conforme necessário. Ele é a camada que lida com a interação com o banco de dados, regras de negócios e estado da aplicação.

2. **View (Visão):**
   - A View é responsável por apresentar os dados ao usuário e interagir com ele. Ela exibe a informação ao usuário de uma forma compreensível e coleta as entradas do usuário. A View não contém lógica de negócios; em vez disso, ela recebe informações do Modelo e as apresenta visualmente. Quando há interação do usuário, como clicar em um botão, a View notifica o Controlador sobre essa ação.

3. **Controller (Controlador):**
   - O Controlador atua como um intermediário entre o Modelo e a View. Ele recebe eventos da View, processa esses eventos (normalmente interações do usuário) e atualiza o Modelo conforme necessário. O Controlador também é responsável por receber atualizações do Modelo e garantir que a View seja notificada para que ela possa atualizar a interface do usuário adequadamente. Em resumo, o Controlador gerencia o fluxo de dados entre o Modelo e a View e controla a lógica de fluxo da aplicação.

A separação dessas responsabilidades no padrão MVC traz vários benefícios, como a manutenção mais fácil do código, maior reutilização de componentes e facilitação da colaboração em equipes de desenvolvimento. Além disso, a arquitetura MVC é escalável e oferece uma estrutura organizada para o desenvolvimento de aplicativos, o que é especialmente útil em projetos de grande porte. O padrão MVC é aplicado em muitos frameworks de desenvolvimento web e desktop, como Ruby on Rails, Django, Spring MVC (Java), Angular (JavaScript/TypeScript), entre outros.

## Marcações

No contexto do Spring Boot em Java, as annotations desempenham um papel crucial para simplificar a configuração e o desenvolvimento de aplicativos. As annotations são marcadores especiais que podem ser aplicados a classes, métodos, campos e outros elementos do código fonte. Elas fornecem metadados adicionais ao compilador ou ao ambiente de execução, permitindo que o Spring Boot realize diversas tarefas automaticamente.

Aqui estão algumas das annotations mais comuns usadas no Spring Boot:

1. **@SpringBootApplication:**
   - Anotando a classe principal do aplicativo com `@SpringBootApplication`, você está marcando-a como a classe de inicialização do Spring Boot. Isso combina três outras annotations importantes: `@Configuration`, `@EnableAutoConfiguration` e `@ComponentScan`.

```java
@SpringBootApplication
public class MinhaAplicacao {
    public static void main(String[] args) {
        SpringApplication.run(MinhaAplicacao.class, args);
    }
}
```

2. **@Controller:**
   - Usado para marcar uma classe como um controlador no padrão MVC do Spring. Os métodos dentro dessa classe são mapeados para manipuladores de solicitação HTTP.

```java
@Controller
public class MeuControlador {
    @RequestMapping("/pagina")
    public String minhaPagina() {
        return "pagina";
    }
}
```

3. **@RestController:**
   - Similar a `@Controller`, mas indica que cada método do controlador retorna diretamente dados no formato JSON, em vez de renderizar uma página HTML.

```java
@RestController
public class MeuRestController {
    @RequestMapping("/dados")
    public String obterDados() {
        return "Algum dado importante";
    }
}
```

4. **@RequestMapping:**
   - Utilizada para mapear solicitações HTTP a métodos específicos. Pode ser aplicada em nível de classe ou método.

```java
@Controller
@RequestMapping("/exemplo")
public class ExemploController {
    @RequestMapping("/metodo")
    public String meuMetodo() {
        return "pagina";
    }
}
```

5. **@Autowired:**
   - Utilizada para injetar dependências automaticamente. Pode ser aplicada a construtores, métodos ou campos.

```java
@Service
public class MeuServico {
    private final OutroServico outroServico;

    @Autowired
    public MeuServico(OutroServico outroServico) {
        this.outroServico = outroServico;
    }
}
```

6. **@Repository, @Service, @Component:**
   - Usadas para marcar classes como componentes gerenciados pelo Spring. `@Repository` é usado para classes de acesso a dados, `@Service` para serviços e `@Component` para qualquer outro componente.

```java
@Repository
public class MeuRepositorio {
    // Implementação do acesso a dados
}

@Service
public class MeuServico {
    // Implementação do serviço
}
```

Estas são apenas algumas das muitas annotations disponíveis no Spring Boot. Elas são essenciais para aproveitar ao máximo a automação e a configuração simplificada oferecidas pelo framework.

## `record` 

No ecossistema Spring, especialmente em aplicações que seguem o estilo arquitetural RESTful, o uso de Data Transfer Objects (DTOs) é comum para transferir dados entre as camadas da aplicação. Um Record DTO é uma abordagem específica que aproveita a capacidade de criação simplificada de registros introduzida no Java 16 para criar DTOs de forma concisa.

Aqui está uma explicação sobre Record DTOs no ecossistema Spring:

1. **O que é um Record:**
   - Um record é uma nova feature introduzida no Java 16 que simplifica a criação de classes imutáveis e expressivas para modelar dados. Records são frequentemente usados para representar dados com um conjunto fixo de campos, e eles geram automaticamente métodos como `equals()`, `hashCode()`, `toString()`, e métodos de acesso para os campos.

   Exemplo de um Record simples:
   ```java
   public record Pessoa(String nome, int idade) {
       // Nenhum método adicional necessário, pois métodos padrão são gerados automaticamente
   }
   ```

2. **Record DTOs no Spring:**
   - Record DTOs podem ser usados como objetos simples e imutáveis para transportar dados entre camadas da aplicação. Ao usar records, a quantidade de código boilerplate é reduzida, uma vez que os métodos padrão são gerados automaticamente.

   Exemplo de um Record DTO em um cenário Spring:
   ```java
   // Record DTO para representar dados de um cliente
   public record ClienteDTO(String nome, String email) {
       // Nenhum método adicional necessário
   }

   // Em um serviço Spring, por exemplo
   @Service
   public class MeuServico {

       public ClienteDTO obterDetalhesCliente() {
           // Lógica para obter detalhes do cliente
           return new ClienteDTO("João", "joao@email.com");
       }
   }
   ```

3. **Benefícios dos Record DTOs:**
   - **Concisão:** O uso de records reduz a quantidade de código necessário para criar DTOs, uma vez que os métodos padrão são gerados automaticamente.
   - **Imutabilidade:** Records são imutáveis por padrão, o que é desejável para objetos DTO que geralmente devem representar dados de forma consistente.

4. **Integração com Frameworks Spring:**
   - Record DTOs podem ser facilmente integrados em aplicativos Spring. Eles podem ser usados em controladores, serviços, e em outras camadas da aplicação de maneira similar a qualquer outro objeto.

   Exemplo de uso em um controlador Spring:
   ```java
   @RestController
   @RequestMapping("/api/clientes")
   public class ClienteController {

       @GetMapping("/{clienteId}")
       public ResponseEntity<ClienteDTO> obterClientePorId(@PathVariable Long clienteId) {
           // Lógica para obter cliente por ID
           ClienteDTO clienteDTO = new ClienteDTO("Maria", "maria@email.com");
           return ResponseEntity.ok(clienteDTO);
       }
   }
   ```

O uso de Record DTOs no ecossistema Spring proporciona uma forma concisa e eficiente de modelar dados para transferência entre diferentes partes da aplicação, mantendo a clareza e a expressividade do código.

## Interfaces no Spring:
Ao criar classes de interface que estendem `JpaRepository` no contexto do Spring, você está aproveitando a funcionalidade fornecida pelo Spring Data JPA para simplificar a interação com um banco de dados. A anotação `@Repository` é usada para indicar que a interface é um bean de repositório e, portanto, permite a tradução de exceções específicas do banco de dados em exceções mais genéricas do Spring.

Vamos analisar os elementos-chave envolvidos nesse processo:

1. **Interface que estende JpaRepository:**
   - Crie uma interface que estenda `JpaRepository` ou uma de suas interfaces especializadas, como `CrudRepository`. Esta interface deve ser parametrizada com a entidade JPA (Java Persistence API) que representa a tabela do banco de dados e o tipo da chave primária dessa entidade.

   ```java
   import org.springframework.data.jpa.repository.JpaRepository;
   import org.springframework.stereotype.Repository;

   @Repository
   public interface ExemploRepository extends JpaRepository<Exemplo, Long> {
       // Métodos de consulta podem ser definidos aqui
   }
   ```

2. **Anotação `@Repository`:**
   - A anotação `@Repository` é opcional, mas é uma boa prática usá-la para indicar ao Spring que essa interface representa um bean de repositório. A anotação também permite a tradução de exceções específicas do banco de dados em exceções do Spring.

3. **Entidade JPA (`Exemplo` no exemplo acima):**
   - A entidade JPA representa a tabela do banco de dados e deve ser uma classe anotada com `@Entity`. O nome da entidade geralmente corresponde ao nome da tabela no banco de dados.

   ```java
   import javax.persistence.Entity;
   import javax.persistence.GeneratedValue;
   import javax.persistence.GenerationType;
   import javax.persistence.Id;

   @Entity
   public class Exemplo {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       // Outros campos e métodos getters/setters
   }
   ```

4. **Uso dos métodos do JpaRepository:**
   - A interface `ExemploRepository` herda métodos CRUD padrão do `JpaRepository`, como `save`, `findById`, `findAll`, `delete`, entre outros. Além disso, você pode definir métodos de consulta personalizados usando convenções de nomenclatura ou anotações `@Query`.

   ```java
   import java.util.List;

   public interface ExemploRepository extends JpaRepository<Exemplo, Long> {
       List<Exemplo> findByNome(String nome);
   }
   ```

Ao seguir essa abordagem, o Spring Data JPA implementará automaticamente os métodos CRUD e as consultas personalizadas definidas na interface `ExemploRepository`. Isso simplifica significativamente o código relacionado à persistência de dados, eliminando a necessidade de escrever consultas SQL manualmente e gerenciando transações de maneira transparente.

## Boilerplate code

**Boilerplate code** refere-se a trechos de código repetitivos e verbose, que são necessários, mas não contribuem significativamente para a lógica do programa. Exemplos incluem getters/setters, construtores padrão, implementações de métodos de interfaces e tratamento de exceções.

Exemplos:

1. **Getters/Setters:**
    ```java
    public class Exemplo { private String nome; public String getNome() { return nome; } public void setNome(String nome) { this.nome = nome; } }
    ```

2. **Construtores Padrão:**
    ```java
    public class OutroExemplo {
       private int valor;
       public OutroExemplo() {}
       public OutroExemplo(int valor) {
          this.valor = valor;
    } }
    ```

### **Prevenção:**

- **Uso de Records (Java 14+):**
    ```java
    public record Pessoa(String nome, int idade) {}
    ```

- **Frameworks e Anotações:**
    ```java
    @Entity
    public class Produto {
       @Id @GeneratedValue private Long id;
       private String nome;
       private BigDecimal preco; }
    ```

- **Uso de Lombok (para reduzir getters/setters):**
    ```java
    @Getter @Setter public class Exemplo { private String nome; }
    ```

- **Padrões de Projeto (Factory, Builder):**
    ```java
    public class ObjetoComplexo {
       private int valor;
       private String texto;
    /* Padrão Builder public static class Builder {
       private int valor;
       private String texto;
       public Builder(int valor) { this.valor = valor; }
       public Builder comTexto(String texto) {
          this.texto = texto;
          return this; }
       public ObjetoComplexo build() {
          return new ObjetoComplexo(this); } }
       private ObjetoComplexo(Builder builder) {
           this.valor = builder.valor;
          this.texto = builder.texto; } }*/
    ```

A prevenção do boilerplate code envolve o uso de recursos da linguagem, frameworks, anotações e padrões de projeto. Isso pode melhorar a legibilidade do código, reduzir erros e facilitar a manutenção.
