import java.util.Scanner;

public class escopo_var {
    public static void main(String[] args){
        System.out.println("Inicializado");
        System.out.println("Inserir dado double: ");
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        if (price > 100.0) {
            double discount = price * 0.1;
            System.out.println(discount);
        }
    }
}
