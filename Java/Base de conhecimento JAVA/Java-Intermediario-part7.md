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

## `FileReader` e `BufferedReader`

`FileReader` e `BufferedReader` são classes em Java que facilitam a leitura de dados a partir de arquivos. Vamos entender cada uma delas:

### 1. `FileReader`:

A classe `FileReader` em Java é usada para criar um fluxo de caracteres vinculado a um arquivo. Ela é usada principalmente para ler dados de arquivos de texto. Aqui está um exemplo básico de como usar `FileReader`:

```java
try (FileReader fileReader = new FileReader("arquivo.txt")) {
    int caractere;
    while ((caractere = fileReader.read()) != -1) {
        System.out.print((char) caractere);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

No exemplo acima, o método `read()` de `FileReader` lê um caractere por vez do arquivo associado. O loop continua até que o método `read()` retorne -1, indicando o final do arquivo.

### 2. `BufferedReader`:

Embora `FileReader` seja útil para ler caracteres de um arquivo, `BufferedReader` fornece uma camada adicional de funcionalidade, tornando a leitura mais eficiente. Ele armazena em buffer os caracteres, o que reduz o número de operações de leitura física no arquivo. Isso pode melhorar o desempenho ao ler grandes volumes de dados. Aqui está um exemplo que usa `BufferedReader` em conjunto com `FileReader`:

```java
try (BufferedReader bufferedReader = new BufferedReader(new FileReader("arquivo.txt"))) {
    String linha;
    while ((linha = bufferedReader.readLine()) != null) {
        System.out.println(linha);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

No exemplo acima, `readLine()` do `BufferedReader` é usado para ler uma linha completa do arquivo. Isso é mais eficiente do que ler caractere por caractere, especialmente ao lidar com arquivos de texto.

Além da eficiência, `BufferedReader` oferece métodos convenientes, como `readLine()`, que facilitam a leitura de linhas inteiras de um arquivo. Isso é especialmente útil ao trabalhar com dados estruturados em linhas, como em arquivos CSV ou logs.

Lembre-se de que ao trabalhar com `FileReader` e `BufferedReader`, é importante lidar com exceções (por exemplo, `IOException`) para garantir que erros durante a leitura do arquivo sejam tratados adequadamente. O uso do bloco `try-with-resources` (introduzido no Java 7) garante que os recursos associados aos fluxos sejam fechados corretamente após o uso.

## `FileWriter` e `BufferedWriter`

Assim como `FileReader` e `BufferedReader` são usados para leitura de arquivos, `FileWriter` e `BufferedWriter` são classes em Java utilizadas para escrever dados em arquivos. Vamos explorar cada uma delas:

### 1. `FileWriter`:

A classe `FileWriter` é usada para criar um fluxo de caracteres vinculado a um arquivo para operações de escrita. Aqui está um exemplo básico de como usar `FileWriter` para escrever em um arquivo:

```java
try (FileWriter fileWriter = new FileWriter("arquivo_saida.txt")) {
    fileWriter.write("Conteúdo a ser escrito no arquivo");
} catch (IOException e) {
    e.printStackTrace();
}
```

No exemplo acima, o método `write()` é usado para escrever uma string no arquivo associado. Se o arquivo não existir, o `FileWriter` o criará; se existir, o conteúdo anterior será substituído pelo novo.

### 2. `BufferedWriter`:

Semelhante ao `BufferedReader`, `BufferedWriter` fornece uma camada adicional de funcionalidade para melhorar a eficiência ao escrever em arquivos. Ele armazena em buffer os dados antes de escrevê-los fisicamente no arquivo, o que pode resultar em melhor desempenho ao lidar com grandes volumes de dados. Aqui está um exemplo que utiliza `BufferedWriter` em conjunto com `FileWriter`:

```java
try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("arquivo_saida.txt"))) {
    bufferedWriter.write("Conteúdo a ser escrito no arquivo");
    bufferedWriter.newLine(); // Adiciona uma nova linha
    bufferedWriter.write("Outro conteúdo na próxima linha");
} catch (IOException e) {
    e.printStackTrace();
}
```

No exemplo acima, `newLine()` é usado para adicionar uma nova linha após o primeiro conteúdo, proporcionando uma formatação mais legível no arquivo. O método `write()` é utilizado para escrever as strings no arquivo.

Assim como com `FileReader` e `BufferedReader`, ao trabalhar com `FileWriter` e `BufferedWriter`, é importante lidar com exceções (por exemplo, `IOException`). O uso do bloco `try-with-resources` garante que os recursos associados aos fluxos sejam fechados corretamente após o uso.

Essas classes são frequentemente utilizadas juntas para manipulação eficiente de arquivos de texto, proporcionando leitura e escrita eficazes, especialmente ao lidar com grandes quantidades de dados.
