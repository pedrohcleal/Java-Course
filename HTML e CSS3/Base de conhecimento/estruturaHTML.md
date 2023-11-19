# HTML

O HTML, que significa Linguagem de Marcação de Hipertexto (em inglês, Hypertext Markup Language), é a linguagem padrão para a criação e a estruturação de páginas web. Ele fornece um conjunto de elementos que os desenvolvedores utilizam para descrever o conteúdo e a estrutura de uma página web. Aqui está uma descrição básica da estrutura do HTML:

1. **DOCTYPE:**
   O elemento `<!DOCTYPE html>` declara a versão do HTML que está sendo usada. Este elemento não é uma tag HTML, mas é crucial para informar ao navegador que o documento está usando a versão mais recente do HTML.

   Exemplo:
   ```html
   <!DOCTYPE html>
   ```

2. **HTML:**
   A tag `<html>` é o elemento raiz de uma página HTML. Todo o conteúdo da página é encapsulado dentro desta tag.

   Exemplo:
   ```html
   <html>
     <!-- Conteúdo da página vai aqui -->
   </html>
   ```

3. **Cabeçalho (Head):**
   O cabeçalho da página é definido entre as tags `<head>...</head>`. Ele contém informações sobre o documento, como metadados, links para folhas de estilo (CSS), scripts, título da página, entre outros.

   Exemplo:
   ```html
   <head>
     <title>Título da Página</title>
     <!-- Outros elementos do cabeçalho vão aqui -->
   </head>
   ```

4. **Corpo (Body):**
   O conteúdo principal da página é definido entre as tags `<body>...</body>`. Essa seção inclui todo o texto, imagens, links, formulários e outros elementos que são exibidos na página web.

   Exemplo:
   ```html
   <body>
     <h1>Meu Título</h1>
     <p>Este é um parágrafo de exemplo.</p>
     <!-- Outros elementos do corpo vão aqui -->
   </body>
   ```

5. **Elementos HTML:**
   Dentro do corpo da página, você utiliza vários elementos HTML para estruturar o conteúdo. Alguns exemplos comuns incluem:

   - **Cabeçalhos (`<h1>`, `<h2>`, ..., `<h6>`):** Usados para títulos e subtítulos.
   - **Parágrafos (`<p>`):** Usados para agrupar blocos de texto.
   - **Listas (`<ul>`, `<ol>`, `<li>`):** Usadas para criar listas não ordenadas ou ordenadas.
   - **Links (`<a>`):** Usados para criar hiperlinks.
   - **Imagens (`<img>`):** Usadas para exibir imagens na página.

   Exemplo:
   ```html
   <h2>Subtítulo</h2>
   <p>Este é um parágrafo com um <a href="https://www.example.com">link</a>.</p>
   <img src="imagem.jpg" alt="Descrição da imagem">
   ```

Essa é uma estrutura HTML básica. Ao utilizar esses elementos de maneira combinada e adequada, os desenvolvedores podem criar páginas web bem estruturadas e apresentáveis.

## Tags
### Lista de Tags HTML

- `<!-- -->`: Este tag é utilizado para aplicar comentários em um documento HTML.

- `<!DOCTYPE>`: Este tag é utilizado para especificar a versão do HTML.

### A

- `<a>`: Conhecido como tag de âncora, cria um hyperlink ou link.
- `<abbr>`: Define uma abreviação para uma frase ou palavra mais longa.
- `<acronym>`: Define um acrônimo para uma palavra. (Não suportado no HTML5)
- `<address>`: Define as informações de contato do autor do artigo HTML.
- `<applet>`: Define um applet Java incorporado. (Não suportado no HTML5)
- `<area>`: Define a área de um mapa de imagem.
- `<article>`: Define o conteúdo autocontido.
- `<aside>`: Define o conteúdo separado do conteúdo principal, geralmente representado como uma barra lateral.
- `<audio>`: É usado para incorporar conteúdo sonoro em um documento HTML.

### B

- `<b>`: É usado para tornar o texto em negrito.
- `<base>`: Este tag define a URL base para todas as URLs relativas dentro do documento.
- `<basefont>`: Este tag é usado para definir a fonte padrão, tamanho e cor para todos os elementos do documento. (Não suportado no HTML5)
- `<bdi>`: Este tag é usado para isolar uma parte do texto que pode ser formatada em direções diferentes do texto circundante.
- `<bdo>`: É usado para substituir a direção de texto atual.
- `<big>`: Este tag é usado para aumentar o tamanho da fonte em um nível maior que o conteúdo circundante. (Não suportado no HTML5)
- `<blockquote>`: É usado para definir um conteúdo que é retirado de outra fonte.
- `<body>`: É usado para definir a seção do corpo de um documento HTML.
- `<br>`: É usado para aplicar uma quebra de linha simples.
- `<button>`: Representa um botão clicável.

### C

- `<canvas>`: É usado para fornecer um espaço gráfico dentro de um documento da web.
- `<caption>`: É usado para definir uma legenda para uma tabela.
- `<center>`: É usado para alinhar o conteúdo no centro. (Não suportado no HTML5)
- `<cite>`: É usado para definir o título do trabalho, livro, site, etc.
- `<code>`: É usado para exibir uma parte do código de programação em um documento HTML.
- `<col>`: Define uma coluna dentro de uma tabela que representa propriedades comuns das colunas e é usado com o elemento `<colgroup>`.
- `<colgroup>`: É usado para definir um grupo de colunas em uma tabela.

### D

- `<data>`: É usado para vincular o conteúdo à tradução legível por máquina.
- `<datalist>`: É usado para fornecer uma lista predefinida para opções de entrada.
- `<dd>`: É usado para fornecer uma definição/descrição de um termo em uma lista de descrição.
- `<del>`: Define um texto que foi excluído do documento.
- `<details>`: Define detalhes adicionais que o usuário pode visualizar ou ocultar.
- `<dfn>`: É usado para indicar um termo definido dentro de uma sentença/frase.
- `<dialog>`: Define uma caixa de diálogo ou outros componentes interativos.
- `<dir>`: É usado como contêiner para uma lista de diretórios de arquivos. (Não suportado no HTML5)
- `<div>`: Define uma divisão ou seção dentro do documento HTML.
- `<dl>`: É usado para definir uma lista de descrição.
- `<dt>`: É usado para definir um termo em uma lista de descrição.

### E

- `<em>`: É usado para enfatizar o conteúdo aplicado dentro deste elemento.
- `<embed>`: É usado como um contêiner incorporado para arquivos/aplicativos/mídias externas, etc.

### F

- `<fieldset>`: É usado para agrupar elementos/rótulos relacionados dentro de um formulário da web.
- `<figcaption>`: É usado para adicionar uma legenda ou explicação para o elemento `<figure>`.
- `<figure>`: É usado para definir o conteúdo autocontido, geralmente referido como uma única unidade.
- `<font>`: Define a fonte, tamanho, cor e face para o conteúdo. (Não suportado no HTML5)
- `<footer>`: Define a seção de rodapé de uma página da web.
- `<form>`: É usado para definir um formulário HTML.
- `<frame>`: Define uma área específica de uma página da web que pode conter outro arquivo HTML. (Não suportado no HTML5)
- `<frameset>`: Define um grupo de frames. (Não suportado no HTML5)

### H

- `<h1>` a `<h6>`: Define cabeçalhos para um documento HTML de nível 1 a nível 6.
- `<head>`: Define a seção de cabeçalho de um documento HTML.
- `<header>`: Define o cabeçalho de uma seção ou página da web.
- `<hr>`: É usado para aplicar uma quebra temática entre elementos de nível de parágrafo.
- `<html>`: Representa a raiz de um documento HTML.

### I

- `<i>`: É usado para representar um texto em uma voz diferente.
- `<iframe>`: Define um quadro inline que pode incorporar outro conteúdo.
- `<img>`: É usado para inserir uma imagem dentro de um documento HTML.
- `<input>`: Define um campo de entrada dentro de um formulário HTML.
- `<ins>`: Representa um texto que foi inserido em um documento HTML.
- `<isindex>`: É usado para exibir uma string de pesquisa para o documento atual. (Não suportado no HTML5)

### K

- `<kbd>`: É usado para definir a entrada do teclado.

### L

- `<label>`: Define um rótulo de texto para o campo de entrada de um formulário.
- `<legend>`: Define uma legenda para o conteúdo de `<fieldset>`.
- `<li>`: É usado para representar itens em uma lista.
- `<link>`: Representa uma relação entre o documento atual e um recurso externo.

### M

- `<main>`: Representa o conteúdo principal de um documento HTML.
- `<map>`: Define um mapa de imagem com áreas ativas.
- `<mark>`: Representa um texto destacado.
- `<marquee>`: É usado para inserir texto rolando ou uma imagem horizontal ou verticalmente. (Não suportado no HTML5)
- `<menu>`: É usado para criar uma lista de comand
