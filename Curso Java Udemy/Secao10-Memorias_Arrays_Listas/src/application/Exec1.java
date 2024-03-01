package application;

import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inicializado");
        System.out.println("Quantos numeros vai digitar?");
        int n = sc.nextInt();
        double[] a_numbers = new double[n];
        for (int i=0; i<n; i++) {
            System.out.println("Digite um numero:");
            a_numbers[i] = sc.nextDouble();
            }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i=0; i<n; i++) {
            if (a_numbers[i] < 0){
                System.out.println(a_numbers[i] + "\n");
            }
        }



        sc.close();
    }
}
