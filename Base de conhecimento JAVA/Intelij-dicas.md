# Dicas Intelij

## Como criar getter,setters e construtores de forma automática no intelij

Para criar getters, setters e construtores de forma automática no IntelliJ, siga estas etapas:

1. Abra o arquivo de classe que deseja gerar os métodos.
2. Selecione o campo para o qual deseja gerar os métodos.
3. Pressione **Alt+Insert** ou clique com o botão direito do mouse e selecione **Generate** > **Getters and Setters**.
4. Na caixa de diálogo que aparece, selecione as opções desejadas e clique em **OK**.

As opções disponíveis na caixa de diálogo incluem:

* **Generate getters:** Cria um método getter para o campo selecionado.
* **Generate setters:** Cria um método setter para o campo selecionado.
* **Generate toString:** Cria um método toString() para a classe.
* **Generate equals:** Cria um método equals() para a classe.
* **Generate hashCode:** Cria um método hashCode() para a classe.

**Exemplo**

Aqui está um exemplo de como gerar getters e setters para um campo chamado `nome` em uma classe chamada `Pessoa`:

```java
public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
```

Para gerar esses métodos, siga estas etapas:

1. Abra o arquivo `Pessoa.java`.
2. Selecione o campo `nome`.
3. Pressione **Alt+Insert** ou clique com o botão direito do mouse e selecione **Generate** > **Getters and Setters**.
4. Na caixa de diálogo que aparece, selecione as opções **Generate getters** e **Generate setters** e clique em **OK**.

O IntelliJ IDEA irá gerar o seguinte código:

```java
public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
```

**Observações**

* Se você selecionar um campo que já possui getters ou setters, o IntelliJ IDEA irá solicitar que você confirme se deseja substituir os métodos existentes.
* Você também pode gerar getters e setters para todos os campos de uma classe de uma só vez. Para fazer isso, selecione a classe na janela **Project** e pressione **Alt+Insert** ou clique com o botão direito do mouse e selecione **Generate** > **Getters and Setters**.
