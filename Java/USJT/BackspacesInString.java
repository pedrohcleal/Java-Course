public class BackspacesInString {
    public static String cleanString(String s) {
        StringBuilder finalS = new StringBuilder(s.replace("#",""));
        char hashtag = '#';
        long countHash = s.chars().filter(ch -> ch == hashtag).count();

        if(countHash > finalS.length()){
            return "";
        }
        //finalS.delete((int) countHash);
        return finalS.toString();
    }
    public static void main(String[] args){
        System.out.println(cleanString("abc#d##c")
                + "  resultado deve ser: 'ac'");
    }
}