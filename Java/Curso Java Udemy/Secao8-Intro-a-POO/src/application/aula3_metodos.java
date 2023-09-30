package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class aula3_metodos {
    public static void main(String[] args){
        System.out.println("Inicializado");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();
        sc.close();
    }
}
