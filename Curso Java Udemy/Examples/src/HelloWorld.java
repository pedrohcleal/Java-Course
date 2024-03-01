import java.util.ArrayList;
import java.util.Arrays;
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Inicializado");
        String s = "abde#cf#";
        cleanString(s);

    }
    public static String cleanString(String s) {
        StringBuilder finals = new StringBuilder("");
        String[] words = s.split("");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(words));

        int index = 0;
        for(String l: lista){
            if (index < lista.size()-1){
                System.out.println("Letra " + l + " index: " + index);
                if (lista.get(index+1).equals("#")) {
                    System.out.println("condicaoIf");
                    index++;
                    continue;
                }
                else if (l.equals("#")){
                    index++;
                    continue;
                }
                finals.append(l);
            } else if (!l.equals("#")) {
                finals.append(l);
            }


            //System.out.println("letra:" + l +" index: " + index );
            index++;
        }
        System.out.println(finals);
        return 
    }
}