// Importa as classes necessárias do pacote java.util
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
// Declaração da classe chamada Example
public class Example {
    // Método estático que recebe uma coleção e retorna uma string
    public static String conteudo(Collection<?> colecao) {
        // Obtém um iterador para a coleção
        Iterator<?> i = colecao.iterator();
        // Cria um StringBuffer inicializado com "["
        StringBuffer sb = new StringBuffer("[");
        // Imprime o conteúdo atual do StringBuffer
        System.out.println(sb);
        // Verifica se a coleção possui pelo menos um elemento
        if (i.hasNext()) {
            // Adiciona o primeiro elemento ao StringBuffer
            sb.append(i.next());

            // Imprime o conteúdo atualizado do StringBuffer
            System.out.println(sb);
        }
        // Adiciona "]" ao final do StringBuffer
        sb.append("]");
        // Retorna a representação em string do StringBuffer
        return sb.toString();
    }
    // Método principal (main) que é executado ao iniciar o programa
    public static void main(String[] args) {
        // Converte o array de strings (args) em uma coleção e atribui a col
        Collection<?> col = Arrays.asList("ola pessoal");
        // Chama o método conteudo e imprime o resultado
        System.out.println(Example.conteudo(col));
    }
}
