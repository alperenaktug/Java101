package Loops;

import java.util.Scanner;

public class CiftSayiBulanApp {
    public static void main(String[] args) {
        int number ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz : ");
        number = input.nextInt();

        for (int i =1 ; i <= number ; i++){
            if(i%2 == 0 ){
                System.out.println(i);
            }
        }

    }

}
