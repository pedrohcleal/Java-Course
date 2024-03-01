package application;

import entities.Alturas;

import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args){
        System.out.println("Inicializado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        double soma = 0.0;
        int qtd_menor16 = 0;
        Alturas[] vect = new Alturas[n];
        for(int i = 0; i < vect.length; i++){
            System.out.printf("Dados da %d%n pessoa:", i);
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();
            vect[i] = new Alturas(name,idade,altura);
        }
        for(int i = 0; i < vect.length; i++){
            soma += vect[i].getAltura();
        }
        System.out.println("Altura média" + (soma/n));
        // for identico ao de cima
        for (Alturas alturas : vect) {
            if (alturas.getIdade() < 17) {
                qtd_menor16 += 1;
            }
        }
        System.out.println("");

        sc.close();
    }
}
