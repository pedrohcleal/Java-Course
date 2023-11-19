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
