package Methods;

public class a4_LocalMethod {

    static void ekranaBas(){
        System.out.println(a);
    }


    public static void main(String[] args) {
       int a = 10 ;
       if (a < 20 ) {
           int b = 20;
           System.out.println(a);
       }
        System.out.println(b);
    }
}
// javada metodun içinde tanımlanan değişken
// kendi kod blokları içinde kullanılabilir diğer
// taraflarda kullanışamaz.
