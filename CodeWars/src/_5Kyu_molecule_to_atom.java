public class _5Kyu_molecule_to_atom {

    public static void main(String[] args) {

        String test1 = generate_bc("mysite.com/pictures/holidays.html", " : ");
        System.out.println("mysite.com/pictures/holidays.html" + " sep= ' : '");
        System.out.println(test1 + "Resultado correto: <a href=\"/\">HOME</a> : <a href=\"/pictures/\">PICTURES</a> : <span class=\"active\">HOLIDAYS</span>");

        String test2 = generate_bc("www.codewars.com/users/GiacomoSorbi", " / ");
        System.out.println("www.codewars.com/users/GiacomoSorbi" + " sep=' / '");
        System.out.println(test2 + "Resultado correto: '<a href=\"/\">HOME</a> / <a href=\"/users/\">USERS</a> / <span class=\"active\">GIACOMOSORBI</span>'");

    }

    public static String generate_bc(String url, String separator) {
        StringBuilder str1 = new StringBuilder("<a href=\"/\">HOME</a>" + separator);
        System.out.println(url);
        for (String word : url.split("/")) {
            System.out.println(word);
        }
        return "";
    }
}

//O desafio propõe a criação de uma função que recebe uma URL e um separador como parâmetros. A função deve extrair os elementos da URL, transformá-los em breadcrumbs (migalhas de pão) e formatá-los de acordo com algumas regras específicas.
//
//1. O primeiro elemento deve sempre ser "HOME".
// 2. Cada elemento, exceto o último, deve ser um link `<a>` para a parte relevante da URL.
// 3. O último elemento deve ser um `<span>` com a classe "active".
// 4. Todos os elementos devem estar em letras maiúsculas e separados pelo separador fornecido.
//
// Além disso, há algumas regras adicionais:
//
//- Se um elemento (exceto o raiz/home) tiver mais de 30 caracteres, ele deve ser reduzido para suas iniciais.
//- Algumas palavras, como "the", "of", "in", etc., devem ser ignoradas durante a redução para iniciais.
// - Se a URL for composta por mais de uma palavra separada por hífens e tiver 30 caracteres ou menos, ela deve ser apenas em maiúsculas, com hífens substituídos por espaços.
//
//O desafio fornece exemplos de entrada e saída esperadas para ilustrar o funcionamento da função.
//
//Em suma, o desafio consiste em criar uma função que processe URLs e gere breadcrumbs de acordo com as regras especificadas, tratando cada parte da URL de forma adequada e aplicando as formatações corretas
