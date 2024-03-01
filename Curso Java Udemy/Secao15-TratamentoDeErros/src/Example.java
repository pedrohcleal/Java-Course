import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args){
        System.out.println("Inicializado");
        List<String> lista = Arrays.asList("Maçã", "Banana", "Pera");
        lista.stream()
                .filter(fruta -> fruta.startsWith("M"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
