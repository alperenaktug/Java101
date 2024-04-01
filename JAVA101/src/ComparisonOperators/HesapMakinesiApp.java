package ComparisonOperators;

import java.util.Scanner;

public class HesapMakinesiApp {
    public static void main(String[] args) {
        int f1 , f2 ,select ;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz : ");
        f1 = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz :");
        f2 = input.nextInt();

        System.out.println("1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        if (select ==1 )
        {
            System.out.println("Toplam sonucu : " + (f1 + f2));
        }
        else if (select == 2)
        {
            System.out.println("Çıkarma sonucu : " + (f1 -f2));
        }
        else if (select == 3)
        {
            System.out.println("Çarpma sonucu : " + (f1 *f2));
        }
        else if (select == 4)
        {
            if ( f2 != 0)
            {
                System.out.println("Bölme sonucu : "+ (f1 / f2));
            }else
            {
                System.out.println("Bir sayı 0' a bölünemez...");
            }


        }
        else {
            System.out.println("Yanlış bir sayı girdiniz Lütfen geçerli bir sayı giriniz ");
        }

    }
}
