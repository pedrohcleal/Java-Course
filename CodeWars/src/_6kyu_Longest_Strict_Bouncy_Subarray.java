public class _6kyu_Longest_Strict_Bouncy_Subarray {
    public static void main(String[] args) {
        String[] strs = {"","cbc","c","ca"};
        String[] strs2 = {"flower","flow","flight"};
        String[] strs3 = {"a"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }

    public static String longestCommonPrefix(String[] strs) {
        String word = strs[0];

        for (int i1 = 0; i1 < word.length();i1 ++){
            String prefixo = word.substring(0,i1+1);
            for (int int2 = 1; int2 < strs.length; int2++){
                if (!strs[int2].startsWith(prefixo)){
                    return prefixo.substring(0,i1);
                }
            }
        }
        return strs[0];
    }
}



//Escreva uma função para encontrar a string
//de prefixo comum mais longa entre uma matriz
//de strings.
//if (word2.contains(prefixo)){
//                        currentstr = new StringBuilder(prefixo);
//                        if (currentstr.length() > finalstr.length()){
//                            finalstr = new StringBuilder(currentstr);
//                            //System.out.println("finalstr = " + finalstr);
//                        }
//                        //System.out.println("ok");
//                    }
//for (int i2 = i+1; i2 < strs.length; i2++ ){
//                    String word2 = strs[i2];
//                    if (!word2.startsWith(prefixo.toString()))  {
//                        currentstr = new StringBuilder(prefixo.substring(0,i1-2));
//                        System.out.println(currentstr);
//                        if (currentstr.length() > finalstr.length()){
//                            finalstr = new StringBuilder(currentstr);
//                            //System.out.println("finalstr = " + finalstr);
//                        }
//                    }
//
//                }