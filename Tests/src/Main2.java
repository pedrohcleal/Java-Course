import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main2 {
    public static int josephusSurvivor(final int n, final int k) {
        int contador = 0;

        List<Integer> numeros =
                    IntStream.rangeClosed(1, n)
                    .boxed().collect(Collectors.toList());

        System.out.println("lista: " + numeros);

        while (numeros.size() > 1){
            contador += k - 1;
            //System.out.println(contador);
            while (contador >= numeros.size()) {
                contador -= numeros.size();
            }
            if (contador == 2 && numeros.size() == 2) {
                numeros.remove(0);
                break;
            }
            //System.out.println(contador);
            //System.out.println(numeros);
            numeros.remove(contador);
        }
        return numeros.get(0);
    }

    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3)
                + " Resultado esperado: 4");
        System.out.println(josephusSurvivor(11, 19)
                + " Resultado esperado: 10");
        System.out.println(josephusSurvivor(40, 3)
                + " Resultado esperado: 28");
        System.out.println(josephusSurvivor(14, 2)
                + " Resultado esperado: 13");
        System.out.println(josephusSurvivor(100, 1)
                + " Resultado esperado: 100");
    }
}