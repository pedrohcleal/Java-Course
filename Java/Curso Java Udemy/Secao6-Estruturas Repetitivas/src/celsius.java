import java.util.Scanner;

public class celsius {
    public static void main(String[] args){
        System.out.println("Inicializado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja converter F para C? (s/n)");
        char rep = sc.next().charAt(0);
        while(rep == 's'){
            System.out.println("informar fahrenheit: ");
            int soma = sc.nextInt();
            System.out.println(soma + " convertido pra celsius é " + (((9*soma)/5) + 32));
            System.out.println("Deseja converter F para C? (s/n)");
            rep = sc.next().charAt(0);}
        System.out.println("App encerrado");
        sc.close();
    }
}
