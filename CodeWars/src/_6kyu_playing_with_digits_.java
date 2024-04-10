public class _6kyu_playing_with_digits_ {
    public static void main(String[] args) {
        System.out.println(digPow(46288,3));

    }
    public static long digPow(int n, int p) {
        String digits = String.valueOf(n);
        int cont = 0;
        final int p1 = p;

        for (String dig : digits.split("")){
            cont += (int) Math.pow(Integer.parseInt(dig),p);
            System.out.println(cont);
            p++;
        }
        p--;
        System.out.println(cont);
        System.out.println(p);
        System.out.println(cont/n);
        if(cont/n * n== cont){
            return cont/n;
        }
        return -1;
    }
}
//n = 89; p = 1 ---> 1 since 8¹ + 9² = 89 = 89 * 1
//
//n = 92; p = 1 ---> -1 since there is no k such that 9¹ + 2² equals 92 * k
//
//n = 695; p = 2 ---> 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
//
//n = 46288; p = 3 ---> 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

//Dados dois inteiros positivos n e p, queremos encontrar um inteiro positivo k,
// se existir, tal que a soma dos dígitos de n elevados a potências consecutivas
// começando em p seja igual a k * n.
//
//Em outras palavras, escrevendo os dígitos consecutivos de n como a, b, c, d...,
// existe um inteiro k tal que:
//(ap+bp+1+cp+2+dp+3+...)=n∗k
//
//Se for o caso retornaremos k, caso contrário retornaremos -1.
//
//Nota: n e p serão sempre números inteiros estritamente positivos.