import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> abc = new ArrayList<>();

        for (char c = 'A'; c <= 'z'; c++) {
            if (Character.isAlphabetic(c)) {
                abc.add(c);
                System.out.println(c);
            }

        }
    }
}