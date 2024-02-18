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
