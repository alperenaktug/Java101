package DataTypes;

import java.util.Scanner;

public class V_DaireninAlaniApp {
    public static void main(String[] args) {
       int r ;
       double alan  , cevre , pi=3.14 ;


        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı  giriniz : ");
        r = input.nextInt();

        cevre = 2 * pi * r ;
        alan = pi * (r*r);

        System.out.println("Dairenin çevresi : " + cevre);
        System.out.print("Dairenin alanı : " + alan);
    }
}
