package DataTypes;

import java.util.Scanner;

public class ManavKasaApp {
    public static void main(String[] args) {
       int armut  , elma , domates  , muz, patlican ;
       double tutar ;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ?");
        armut = input.nextInt();
        System.out.print("elma Kaç Kilo ?");
        elma = input.nextInt();
        System.out.print("domates Kaç Kilo ?");
        domates = input.nextInt();
        System.out.print("muz Kaç Kilo ?");
        muz = input.nextInt();
        System.out.print("patlıcan Kaç Kilo ?");
        patlican = input.nextInt();

        tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5);
        System.out.println("Armut Kaç Kilo ? :" + armut  );
        System.out.println("Elma Kaç Kilo ?  :" + elma);
        System.out.println("Domates Kaç Kilo ? :"+ domates);
        System.out.println("Muz Kaç Kilo ? :" + muz);
        System.out.println("Patlıcan Kaç Kilo ? :" + patlican);

        System.out.println("Toplam tutar : " + tutar);





    }
}
