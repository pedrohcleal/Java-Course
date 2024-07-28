import java.util.Arrays;

public class _7kyu_jaden_casing_strings {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));

    }
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        return Arrays.stream(phrase.split(" ")).map(_7kyu_jaden_casing_strings::maps).toString();

//        StringBuilder finals = new StringBuilder();
//        for (String words : phrase.split(" ")) {
//            StringBuilder sb = new StringBuilder(words);
//            char title = Character.toUpperCase((char) words.charAt(0));
//            sb.setCharAt(0, title);
//
//            finals.append(sb + " ");
//        }
//        return finals.toString().strip();
    }
    public static String maps(String mapear) {
        StringBuilder sb = new StringBuilder(mapear);
        char title = Character.toUpperCase((char) mapear.charAt(0));
        sb.setCharAt(0, title);
        return sb.toString();
    }
}
