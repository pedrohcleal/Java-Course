public class _7kyu_get_the_middle_chars {
    public static void main(String[] args){
        System.out.println(getMiddle("12345"));
    }
    public static String getMiddle(String word){
//        int len = word.length();
//        if (len % 2 == 0){
//            return word.substring(len/2-1, (len/2)+1);
//        }
//        return word.substring(len/2, len/2 + 1);
        return (word.length() % 2 == 0) ?
                word.substring(word.length()/2-1, (word.length()/2)+1) :
                word.substring(word.length()/2, word.length()/2 + 1);
    }
}
