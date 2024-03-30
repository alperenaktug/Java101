package DataTypes;
import java.util.Scanner;
public class g_KullanicidanVeriAlma {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        int a , b ;
        System.out.println("A sayısını giriniz :");
        System.out.println("B sayısını giriniz :");
        a = input.nextInt();
        b = input.nextInt();

        int toplam = a + b;
        int fark = a - b;
        int carpma = a * b;
        int bolme = a / b;


        System.out.println("A sayısı : " + a);
        System.out.println("B sayısı : " + b);

        System.out.println("A ile B sayısının toplamı : " + toplam);
        System.out.println("A ile B sayısının farkı : " + fark);
        System.out.println("A ile B sayısının çarpımı : " + carpma);
        System.out.println("A ile B sayısının bölümü : " + bolme);


    }
}
