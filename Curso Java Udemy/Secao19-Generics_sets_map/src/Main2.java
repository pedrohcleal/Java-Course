import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String test = "Uryyb Jbeyq!";
        System.out.println(rot13(test));
    }
    public static String rot13(String message) {
        StringBuilder rot13 = new StringBuilder("");
        List<Character> abc = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            abc.add(c);
        }
        for (String letra: message.split("")) {
            char letter = letra.toLowerCase().charAt(0);
            int indice = abc.indexOf(letter);
                if (letter < 'n') {
                    indice += 13;
                }
                else if(letter < 'z') {
                    indice -= 13;
                }
                else {
                    rot13.append(letra);
                }

                if (Character.isUpperCase(letra.charAt(0))) {
                    rot13.append(abc.get(indice).toString().toUpperCase());
                }
                else {rot13.append(abc.get(indice).toString().toLowerCase());
                }

            }
        return rot13.toString();
    }
}