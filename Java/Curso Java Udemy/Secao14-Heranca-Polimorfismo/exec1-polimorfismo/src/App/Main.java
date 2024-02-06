package App;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list= new ArrayList<>();

        System.out.println("Bem vindo");
        System.out.println("Enter the number of products");
        int n = sc.nextInt();
        for (int i = 1; n >= i; i++){
            System.out.println("Product #" + i + " data");
            System.out.println("Common, used or imported? (c/u/i)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("nome:");
            String name = sc.nextLine();
            System.out.println("price:");
            Double price = sc.nextDouble();
            sc.nextLine();
            if (ch == 'i'){
                System.out.println("Customs fee");
                double customsFee = sc.nextDouble();
                var product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            } else if (ch == 'u') {
                System.out.println("Manufacture date:");
                String data = sc.nextLine();
                var product = new UsedProduct(name, price, data);
                list.add(product);
            } else if (ch == 'c') {
                var product = new Product(name, price);
                list.add(product);
            }
        }
        int cont = 0;
        for(Product produtos : list){
            cont++;
            System.out.println("produto nª" + cont + "\n" + produtos.priceTag());
        }
    }
}
