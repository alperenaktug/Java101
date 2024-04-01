package ComparisonOperators;

import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;

public class KullaniciGirisiApp {
    public static void main(String[] args) {
        String userName , password ;

        Scanner input =  new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz  : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("PolatAlemdar") && password.equals("java123")){
            System.out.println("Başarıyla giriş yaptınız !!!");
        }else{
            System.out.println("Kulalnıcı bilgilerinizi kontrol edin!!!");
        }
    }
}
