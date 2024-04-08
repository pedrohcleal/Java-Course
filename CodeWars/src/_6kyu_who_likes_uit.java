public class _6kyu_who_likes_uit {
    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }

        else if (names.length == 1){
            return names[0] + " like this";
        }

        else if (names.length == 2){
            return names[0] + " and " + names[1] + " likes this";
        }

        else if (names.length == 3) {
            return String.format("%s, %s and %s likes this", names[0], names[1], names[2]);
        }

        else {
            int cont = names.length - 2;
            return String.format("%s, %s and %s others likes this", names[0], names[1], cont);
        }
    }

    public static void main(String[] args) {
        String[] nomes = {};
        String[] nomes2 = {"Peter"};
        String[] nomes3 = {"Jacob", "Alex"};
        String[] nomes4 = {"Max", "John", "Mark"};
        String[] nomes5 = {"Alex", "Jacob", "Mark", "Max"};

        System.out.println(whoLikesIt(nomes));
        System.out.println(whoLikesIt(nomes2));
        System.out.println(whoLikesIt(nomes3));
        System.out.println(whoLikesIt(nomes4));
        System.out.println(whoLikesIt(nomes5));
    }
}
//[]                                -->  "no one likes this"
//["Peter"]                         -->  "Peter likes this"
//["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"