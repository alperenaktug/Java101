package Loops;

import java.util.Scanner;

public class FaktoriyelHesaplayanApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktöriyel sayısı : ");
        int n = scan.nextInt();
        int total = 1 ;

        for (int i = 1 ; i <= n ; i++){
            total *= i ;

        }

        System.out.println(n + ". Faktöriyel : " + total);


    }
}
