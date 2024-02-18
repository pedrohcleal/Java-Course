# Part7 Java

## Manipulação de arquivos em Java

Em Java, a manipulação de arquivos é uma tarefa comum e essencial em muitos aplicativos. A linguagem fornece várias classes e métodos na API Java IO (Input/Output) para lidar com operações de leitura e gravação de arquivos. A partir do Java 7, a API NIO (New I/O) também oferece funcionalidades mais avançadas e eficientes para manipulação de arquivos.

Aqui estão alguns conceitos e exemplos básicos relacionados à manipulação de arquivos em Java:

### Leitura de Arquivos:

1. **Classe FileReader e BufferedReader:**
   Para ler dados de um arquivo de texto, você pode usar `FileReader` para abrir o arquivo e `BufferedReader` para ler linhas eficientemente.

    ```java
    try (BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            System.out.println(linha);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    ```

2. **Classe Scanner:**
   A classe `Scanner` também pode ser usada para ler arquivos.

    ```java
    try (Scanner scanner = new Scanner(new File("arquivo.txt"))) {
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    ```

### Escrita em Arquivos:

1. **Classe FileWriter e BufferedWriter:**
   Para escrever em um arquivo, você pode usar `FileWriter` e `BufferedWriter`.

    ```java
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("arquivo_saida.txt"))) {
        writer.write("Conteúdo a ser escrito no arquivo");
    } catch (IOException e) {
        e.printStackTrace();
    }
    ```

### Manipulação de Arquivos e Diretórios:

1. **Classe File:**
   A classe `File` em Java pode ser usada para manipular arquivos e diretórios. Ela fornece métodos para criar, deletar, renomear arquivos, entre outros.

    ```java
    File file = new File("arquivo.txt");

    // Verificar se o arquivo existe
    if (file.exists()) {
        // Obter informações sobre o arquivo
        System.out.println("Nome do arquivo: " + file.getName());
        System.out.println("Caminho absoluto: " + file.getAbsolutePath());
        System.out.println("Tamanho do arquivo: " + file.length() + " bytes");
    }
    ```

2. **Classe Path (NIO):**
   A API NIO introduziu a classe `Path` para representar caminhos de arquivo. Isso oferece métodos mais avançados para manipulação de caminhos.

    ```java
    Path path = Paths.get("caminho/do/arquivo.txt");

    // Resolvendo um caminho relativo
    Path resolvedPath = path.resolve("outroArquivo.txt");
    ```

Estes são apenas exemplos básicos e muitas outras funcionalidades estão disponíveis na API Java para manipulação de arquivos. Sempre é recomendável usar as classes do pacote NIO para operações mais avançadas devido à sua eficiência e funcionalidades adicionais.

**1. Classes Fundamentais:**

* **java.io.File:** Representa um arquivo ou diretório no sistema de arquivos. Através dessa classe, você pode obter informações sobre o arquivo, como nome, tamanho, data de modificação e permissões.
* **java.io.InputStream:** Permite ler dados de um arquivo.
* **java.io.OutputStream:** Permite escrever dados em um arquivo.
* **java.io.Reader:** Permite ler caracteres de um arquivo.
* **java.io.Writer:** Permite escrever caracteres em um arquivo.

**2. Leitura e Escrita de Arquivos de Texto:**

* **Leitura:**
    * Utilize `java.io.FileReader` para criar um leitor de caracteres.
    * Utilize `BufferedReader` para ler linhas do arquivo de forma eficiente.
    * Leia cada linha e processe o conteúdo de acordo com suas necessidades.
* **Escrita:**
    * Utilize `java.io.FileWriter` para criar um escritor de caracteres.
    * Utilize `BufferedWriter` para escrever linhas no arquivo de forma eficiente.
    * Escreva cada linha desejada no arquivo.

**3. Manipulação de Arquivos Binários:**

* Utilize `java.io.FileInputStream` e `java.io.FileOutputStream` para ler e escrever bytes em um arquivo.
* Utilize `java.io.DataInputStream` e `java.io.DataOutputStream` para ler e escrever tipos primitivos de dados em um arquivo binário.

**4. Serialização de Objetos:**

* A serialização permite converter objetos Java em um formato binário que pode ser armazenado em um arquivo.
* Utilize a classe `java.io.Serializable` para marcar seus objetos como serializáveis.
* Utilize as classes `java.io.ObjectOutputStream` e `java.io.ObjectInputStream` para serializar e desserializar objetos, respectivamente.

**5. Recursos Adicionais:**

* **NIO (New Input/Output):** Uma API mais moderna para manipulação de arquivos, com foco em eficiência e escalabilidade.
* **Apache Commons IO:** Uma biblioteca de terceiros que fornece diversas ferramentas para manipulação de arquivos, simplificando o desenvolvimento.

**6. Exemplos Práticos:**

* **Leitura e escrita de um arquivo de texto:** [https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-de-texto-em-java/25529](https://www.devmedia.com.br/leitura-e-escrita-de-arquivos-de-texto-em-java/25529)
* **Manipulando arquivos e pastas com Java:** [https://www.youtube.com/watch?v=bIPd_451uEg](https://www.youtube.com/watch?v=bIPd_451uEg)
* **Manipulando Arquivo Txt com Java:** [https://www.mballem.com/post/manipulando-arquivo-txt-com-java/](https://www.mballem.com/post/manipulando-arquivo-txt-com-java/)

**7. Melhores Práticas:**

* Utilize blocos `try-catch` para tratar exceções relacionadas à manipulação de arquivos.
* Verifique se um arquivo existe antes de tentar abri-lo.
* Feche os streams de entrada e saída após o uso para evitar vazamento de recursos.
* Utilize APIs de alto nível, como NIO, para melhorar o desempenho e a escalabilidade.

**Conclusão:**

A manipulação de arquivos em Java é uma habilidade essencial para o desenvolvimento de aplicações robustas e completas. Através das classes e APIs disponíveis, você pode realizar diversas operações com arquivos de texto e binários, abrindo um mundo de possibilidades para o armazenamento e gerenciamento de dados em seus projetos.

**Lembre-se:** este guia é apenas um ponto de partida. Explore os recursos mencionados e pratique a manipulação de arquivos em seus projetos para dominar essa importante habilidade.
