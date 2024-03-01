public class split {
    public static void main(String[] args){
        System.out.println("Inicializado");
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println(word1 + word2 + word3);
    }
}
