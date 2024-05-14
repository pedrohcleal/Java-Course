import java.util.LinkedHashMap;

public class _4kyu_Roman_Numerals_helper {
    public static void main(String[] args) {
        int test1 = 1525;
        String test2 = "MCDL";
        //System.out.println(toRoman(test1));
        //System.out.println(fromRoman("MCCXXXVII") + "deve ser = 1237");
        System.out.println(fromRoman(test2) + "deve ser = 1450");

    }
    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        int zeros = String.valueOf(n).length() - 1;

        for (char charN: String.valueOf(n).toCharArray()) {
            StringBuilder current = new StringBuilder(String.valueOf(charN));
            for (int i = 0; i < zeros; i++) {
                current.append("0");
            }
            String romanStr = "";
            while (n > 0) {
                for (int key : romanDict.keySet()) {
                    if (key <= n) {
                        romanStr = romanDict.get(key);
                        n -= key;
                        break;
                    }
                }
                result.append(romanStr);
            }
            zeros -= 1;
        }
        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        if (romanDict2.containsKey(romanNumeral)){
            return romanDict2.get(romanNumeral);
        }
        int result = 0;

        for (int i = 0; i < romanNumeral.length()-1;){
            String apend = String.valueOf(romanNumeral.charAt(i));
            String prox = romanNumeral.substring(i, i + 2);
            int value;
            if (romanDict2.containsKey(prox)){
                value = romanDict2.get(prox);
                result += value;
                i += 2;
            }
            else {
                i++;
                value = romanDict2.get(apend);
                result += value;
            }
            if (i == romanNumeral.length()-1){
                value = romanDict2.get(String.valueOf(romanNumeral.charAt(i)));
                result += value;
                break;
            }
        }
        return result;
    }

    static LinkedHashMap<Integer,String> romanDict = new LinkedHashMap<Integer,String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    static LinkedHashMap<String,Integer> romanDict2 = new LinkedHashMap<String,Integer>() {{
        put("M",1000);
        put("CM", 900);
        put("D", 500);
        put("CD", 400);
        put("C",100);
        put("XC", 90);
        put("L", 50);
        put("XL", 40);
        put("X", 10);
        put("IX", 9);
        put("V", 5);
        put("IV", 4);
        put("I", 1);
    }};
}

//        +--------+-------+
//        | Symbol | Value |
//        +--------+-------+
//        |    M   |  1000 |
//        |   CM   |   900 |
//        |    D   |   500 |
//        |   CD   |   400 |
//        |    C   |   100 |
//        |   XC   |    90 |
//        |    L   |    50 |
//        |   XL   |    40 |
//        |    X   |    10 |
//        |   IX   |     9 |
//        |    V   |     5 |
//        |   IV   |     4 |
//        |    I   |     1 |
//        +--------+-------+
