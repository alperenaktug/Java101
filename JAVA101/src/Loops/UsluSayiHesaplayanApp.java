package Loops;

import java.util.Scanner;

public class UsluSayiHesaplayanApp {
    public static void main(String[] args) {
        int n  , k ;
        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz : ");
        n = scan.nextInt();

        System.out.print("Üs olucak sayıyı giriniz : ");
        k = scan.nextInt();
        int total = 1 ;

        int i = 1;
        while (i <= k){
            total *= n ;
            i++;

        }
        System.out.println("Cevap : "  +  total);
    }
}
