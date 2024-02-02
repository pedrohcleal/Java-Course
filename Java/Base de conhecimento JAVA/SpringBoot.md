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

## `record` e `interface` Java

O uso de `record` e `interface` no desenvolvimento com o framework Spring é bastante comum, pois ambos oferecem recursos valiosos que se alinham bem com os princípios e práticas recomendadas no desenvolvimento de aplicações Spring.

### Records no Spring:

1. **DTOs (Data Transfer Objects):**
   - `record` é particularmente útil ao criar objetos que atuam como DTOs para transferência eficiente de dados entre camadas da aplicação, especialmente em operações de leitura ou escrita em bancos de dados.

   ```java
   @RestController
   public class UserController {

       @GetMapping("/users")
       public ResponseEntity<List<UserDTO>> getAllUsers() {
           // Obter dados do serviço
           List<UserDTO> users = userService.getAllUsers();

           return ResponseEntity.ok(users);
       }
   }

   public record UserDTO(String username, String email) {}
   ```

2. **Entidades Simples:**
   - Para representar entidades simples, como registros de banco de dados, `record` pode ser uma escolha elegante, proporcionando uma forma concisa e imutável de definir essas estruturas de dados.

   ```java
   @Entity
   public record Product(String name, BigDecimal price) {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;

       // getters, setters, etc.
   }
   ```

### Interfaces no Spring:

1. **Contratos e Abstrações:**
   - Interfaces são amplamente utilizadas para definir contratos e abstrações em uma aplicação Spring. Elas permitem a injeção de dependências e a aplicação do princípio da inversão de controle (IoC).

   ```java
   public interface UserService {
       List<User> getAllUsers();
       User getUserById(Long userId);
       void saveUser(User user);
   }

   @Service
   public class UserServiceImpl implements UserService {
       // Implementações dos métodos da interface
   }
   ```

2. **Controllers:**
   - Interfaces podem ser usadas para definir contratos para controllers, tornando o código mais modular e permitindo fácil substituição de implementações.

   ```java
   @RestController
   public class UserController implements UserControllerInterface {
       private final UserService userService;

       @Autowired
       public UserController(UserService userService) {
           this.userService = userService;
       }

       @GetMapping("/users")
       public ResponseEntity<List<User>> getAllUsers() {
           // Implementação
       }
   }

   public interface UserControllerInterface {
       ResponseEntity<List<User>> getAllUsers();
   }
   ```

3. **Integração com Spring Data:**
   - Interfaces são frequentemente usadas ao definir repositórios com o Spring Data JPA, onde as consultas podem ser derivadas automaticamente a partir do nome dos métodos.

   ```java
   public interface UserRepository extends JpaRepository<User, Long> {
       List<User> findByUsername(String username);
   }
   ```

4. **Anotações e Aspectos:**
   - Interfaces podem ser usadas em conjunto com anotações e aspectos do Spring para definir pontos de corte para a aplicação de aspectos como logging, transações, etc.

   ```java
   @Aspect
   @Component
   public class LoggingAspect {

       @Before("execution(* com.example.service.*.*(..))")
       public void logBefore(JoinPoint joinPoint) {
           // Logging statements
       }
   }
   ```

Em resumo, tanto `record` quanto `interface` têm papéis importantes no desenvolvimento de aplicações Spring. Os `records` oferecem uma maneira concisa de definir objetos de dados imutáveis, enquanto as `interfaces` são fundamentais para a criação de contratos e abstrações, promovendo a modularidade e facilitando a injeção de dependências no ecossistema Spring.

