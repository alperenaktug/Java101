package DataTypes;

import java.util.Scanner;

public class VucutKitleIndexApp {
    public static void main(String[] args) {

        double  vucutKitleIndex ,kilo , boy  ;

        Scanner input  = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        vucutKitleIndex = kilo / (boy * boy) ;

        System.out.print("Vücut kitle indexsiniz : " + vucutKitleIndex);

    }
}
