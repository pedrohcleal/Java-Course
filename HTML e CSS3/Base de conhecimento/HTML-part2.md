# HTML part2

## id & class

No HTML, os atributos `id` e `class` são usados para identificar e estilizar elementos, facilitando a manipulação e o design de páginas web por meio de CSS (Cascading Style Sheets).

### Atributo `id`:
O atributo `id` é usado para atribuir uma identificação única a um elemento na página. Cada `id` deve ser exclusivo em um documento HTML, o que significa que não deve haver mais de um elemento com o mesmo `id` na mesma página. Os identificadores são frequentemente usados para selecionar elementos específicos para manipulação por meio de JavaScript ou para fornecer ancoragens dentro da própria página.

Exemplo:
```html
<div id="cabecalho">
   <h1>Meu Site</h1>
</div>
```

### Atributo `class`:
O atributo `class` é utilizado para agrupar elementos que compartilham estilos semelhantes ou comportamentos específicos. Ao contrário do atributo `id`, o mesmo valor de `class` pode ser atribuído a vários elementos na mesma página, permitindo a aplicação consistente de estilos a vários elementos.

Exemplo:
```html
<p class="destaque">Este é um parágrafo destacado.</p>
<p class="destaque">Este também é um parágrafo destacado.</p>
```

### Utilizando `id` e `class` juntos:
Você pode atribuir tanto um `id` quanto uma ou mais classes a um único elemento.

Exemplo:
```html
<div id="cabecalho" class="destaque">
   <h1>Meu Site</h1>
</div>
```

### CSS e Manipulação com JavaScript:
Ao utilizar `id` e `class`, você pode estilizar elementos de maneira específica em CSS e selecionar e manipular esses elementos usando JavaScript.

Exemplo de CSS:
```css
#cabecalho {
   background-color: #3498db;
   color: #fff;
}

.destaque {
   font-weight: bold;
   color: #e74c3c;
}
```

Exemplo de JavaScript (usando `id` para seleção):
```javascript
var elementoCabecalho = document.getElementById('cabecalho');
elementoCabecalho.innerHTML = 'Novo Título';
```

Exemplo de JavaScript (usando `class` para seleção com `getElementsByClassName`):
```javascript
var elementosDestaque = document.getElementsByClassName('destaque');
for (var i = 0; i < elementosDestaque.length; i++) {
   elementosDestaque[i].style.fontSize = '16px';
}
```

Lembre-se de que a escolha entre `id` e `class` depende do contexto e dos requisitos específicos do seu projeto. Em geral, `id` é usado quando um elemento é único na página, enquanto `class` é usado para agrupar elementos semelhantes.
