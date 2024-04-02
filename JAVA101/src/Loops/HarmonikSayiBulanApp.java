package Loops;

import java.util.Scanner;

public class HarmonikSayiBulanApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz : " ) ;
        int N = scan.nextInt();
        double result = 0 ;

        for (int i = 1 ; i <= N ; i++){
            result += (1.0 / i);
        }

        System.out.println(result);

    }
}
