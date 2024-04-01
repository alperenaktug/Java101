package ComparisonOperators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SinifGecmeDurumuApp {
    public static void main(String[] args) {
        int mat , fizik , kimya , turkce , muzik ;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik) / 5 ;

        if (avarage < 55 )
        {
            System.out.println("Maalesef , sınıfta kaldınız seneye görüşürüz !!");
        }else {
            System.out.println("Tebrikler sınıfı geçtiniz başarılarınızın devamını dilerim !!");
        }
        System.out.println("Ortalamanız : " + avarage);
    }
}
