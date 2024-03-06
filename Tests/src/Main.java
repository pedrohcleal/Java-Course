import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static int josephusSurvivor(final int n, final int k) {
        int contador = -1;
        int index = 0;

        List<Integer> numeros =
                    IntStream.rangeClosed(1, n)
                    .boxed().collect(Collectors.toList());

        System.out.println("lista: " + numeros);


        if (k > n) {
            for (int i = k; i < k*n ; i += k){
                contador += k;
                numeros.remove(contador%2);
            }
        }

        else {
            for (int i = k; i < k * n; i += k) {
                contador += k;

                if (contador > numeros.size()) {
                    contador -= numeros.size() + 1;
                }
                if (contador == numeros.size()) {
                    contador--;
                }

                if (numeros.size() == 2 && contador == 1) {
                    return numeros.get(1);
                }

                System.out.println(contador);
                if (i == numeros.size()) {
                    contador -= 1;
                }
                numeros.remove(contador);
                System.out.println(numeros);
            }
        }
        return numeros.get(0);
    }

    public static void main(String[] args) {
//        System.out.println(josephusSurvivor(7, 3)
//                + " Resultado esperado: 4");
//        System.out.println(josephusSurvivor(11, 19)
//                + " Resultado esperado: 10");
//        System.out.println(josephusSurvivor(40, 3)
//                + " Resultado esperado: 28");
        System.out.println(josephusSurvivor(14, 2)
                + " Resultado esperado: 13");
        System.out.println(josephusSurvivor(100, 1)
                + " Resultado esperado: 100");
    }
}