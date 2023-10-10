package application;

import java.util.Arrays;
import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args){
        System.out.println("Inicializado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        double soma = 0;
        double[] a_numbers = new double[n];
        for(int i =0; i < n; i++){
            System.out.println("Digite um numero:");
            a_numbers[i] = sc.nextDouble();
        }
        System.out.println("VALORES =" + Arrays.toString(a_numbers));

        for(int i =0; i < n; i++){
            soma += a_numbers[i];
        }

        System.out.println("SOma = " + soma);
        System.out.println("media= " + (soma/n));

        sc.close();
    }
}
