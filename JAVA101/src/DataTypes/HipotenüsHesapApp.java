package DataTypes;

import java.util.Scanner;

public class HipotenüsHesapApp {
    public static void main(String[] args) {
        int k , l ;
        double m ;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz : ");
        k = input.nextInt();

        System.out.print("2. Kenarı giriniz : ");
        l = input.nextInt();

        m = Math.sqrt((k*k) + (l*l));
        System.out.println("Hipotenüs : " + m);

    }
}
