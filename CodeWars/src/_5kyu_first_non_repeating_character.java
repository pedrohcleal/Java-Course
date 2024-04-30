public class _5kyu_first_non_repeating_character {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("stress") + " return = 't'");
        System.out.println(firstNonRepeatingLetter("sTreSS") + " return = 'T");
        System.out.println(firstNonRepeatingLetter("aabbccdd") + " return = '' ");
        System.out.println(firstNonRepeatingLetter("a") + " return = 'a' ");
        System.out.println(firstNonRepeatingLetter("AbBa") + " return = '' ");

    }

    public static String firstNonRepeatingLetter(String s){
        for (char letter: s.toCharArray()){
            int index = s.indexOf(letter) + 1;
            int count = 0;

            for (char let: s.toCharArray()){
                if (Character.toLowerCase(letter) == Character.toLowerCase(let)) {
                    count++;
                }
            }
            if (count == 1){
                return String.valueOf(letter);
            }
            else {
                count = 0;
            }
        }
        return "";
    }

}
// criando um lista para comprar, assim podendo percorrer somente uma vez