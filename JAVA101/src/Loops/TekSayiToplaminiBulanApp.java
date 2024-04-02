package Loops;

import java.util.Scanner;

public class TekSayiToplaminiBulanApp {
    public static void main(String[] args) {
        int g ;
        int total = 0 ;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Lütfen sayı giriniz : ");
            g = scan.nextInt();
            if(g%2 == 1){
                total += g ;

            }
        }while (g > 0);
        System.out.println("Girilen tek sayıların toplamı : " + total);
    }
}
