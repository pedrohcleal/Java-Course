public class _5kyu_first_non_repeating_character {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("stress") + " return = 't'");
        System.out.println(firstNonRepeatingLetter("sTreSS") + " return = 'T");
        System.out.println(firstNonRepeatingLetter("aabbccdd") + " return = '' ");
        System.out.println(firstNonRepeatingLetter("a") + " return = 'a' ");
        System.out.println(firstNonRepeatingLetter("AbBa") + " return = '' ");

    }

    public static String firstNonRepeatingLetter(String s){
        StringBuilder str = new StringBuilder(s.toLowerCase());
        //System.out.println();
        if (s.length() == 1){
            return Character.toString(s.charAt(0));
        }
        String strfinal = s;
        for (char letter: s.toCharArray()){
            int index = s.indexOf(letter) + 1;
            int count = 0;

            for (;index < s.length(); index++){
                if (s.toLowerCase().charAt(index) == Character.toLowerCase(letter)) {
                    count++;
                }
                if (count > 1) {
                    count = 0;
                    break;
                }
                if (index == s.length()-1 && count == 0){
                    return Character.toString(letter);
                }
            }
        }
        return "";
    }

}
// criando um lista para comprar, assim podendo percorrer somente uma vez