public class Main {
    public static String print(int n) {
        if (n % 2 == 0 || n <= 0) {return null;};
        StringBuffer Rprint = new StringBuffer();
        String atx = "*";
        String space = " ";
        int inicial = (n - 1)/ 2;
        for (int i = 1; i  < n; i++){
            Rprint.append(space.repeat(inicial));
            Rprint.append(atx.repeat(i) + "/n");

        }
        return Rprint.toString();
    }

    public static void main(String[] args) {

        System.out.println(print(5) + " Resultado esperado: "+
                "  *\n" +
                " ***\n" +
                "*****\n" +
                " ***\n" +
                "  *\n" );
        System.out.println(print(7) + " Resultado esperado: "+
                "   *\n" +
                "  ***\n" +
                " *****\n" +
                "*******\n" +
                " *****\n" +
                "  ***\n" +
                "   *\n" );
    }



}