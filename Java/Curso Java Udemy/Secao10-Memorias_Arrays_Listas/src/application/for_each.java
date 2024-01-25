package application;

public class for_each {
    public static void main(String[] args){
        System.out.println("Inicializado");
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        System.out.println("\nfor normal");
        for (int i=0; i< vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("\nfor each");
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
