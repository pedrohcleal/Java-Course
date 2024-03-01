package application;

import entities.Rectangle;
import java.util.Scanner;

public class aula5_exec1 {
    public static void main(String[] args){
        System.out.println("Inicializado");
        Scanner sc = new Scanner(System.in);
        Rectangle rtl1 = new Rectangle();
        System.out.println("Informar altura do retangulo");
        rtl1.Height = sc.nextDouble();
        System.out.println("Informar lado do retangulo");
        rtl1.Width = sc.nextDouble();
        System.out.println(rtl1.toString());
        sc.close();
    }
}
