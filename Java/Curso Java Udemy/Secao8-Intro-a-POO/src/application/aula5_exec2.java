package application;
import entities.Functionary;
import java.util.Scanner;
public class aula5_exec2 {
    public static void main(String[] args){
        System.out.println("Inicializado");
        Scanner sc = new Scanner(System.in);
        Functionary f1 = new Functionary();

        System.out.println("Informar nome do Funcionário F1");
        f1.Name = sc.nextLine();

        System.out.println("Informar salário bruto");
        f1.GrossSalary = sc.nextDouble();

        System.out.println("Informar Imposto em cima do salário Bruto");
        f1.Tax = sc.nextDouble();

        System.out.println("Informar porcentagem de acréscimo de salário em cima do salário bruto");
        double pctg = sc.nextDouble();
        f1.IncreaeSalary(pctg);

        System.out.println(f1);
        sc.close();
        System.out.println("Encerrado");
    }
}
