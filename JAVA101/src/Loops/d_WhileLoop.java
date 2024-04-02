package Loops;

import java.util.Scanner;

public class d_WhileLoop {
    public static void main(String[] args) {
        int i = 1  , k;

        System.out.println("Program başladı..");

        while(i <= 5){
            System.out.println(i);
            i++ ;

            k=1 ;
            while (k <= 10){
                System.out.print(k);
                k++ ;
            }
            System.out.println();
        }
        System.out.println("Program bitti..");
        System.out.println("\n");


        System.out.println("Yeni program başladı..");
        int left = 100 , right = 200 ;

        while (++left < --right);
        System.out.println(left);

        System.out.println("Yeni program bitti..");


        int password ;
        boolean isPasswordSuccess = true ;
        Scanner input = new Scanner(System.in);




       while(isPasswordSuccess)
       {
           System.out.print("Lütfen şifreyi giriniz :");
           password = input.nextInt();
           if(password == 123)
           {
               System.out.println("Şifre doğru");
               isPasswordSuccess = false ;
           }
           else
           {
               System.out.println("Şifre yanlış");


           }

       }



    }
}
