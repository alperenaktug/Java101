package privateClass;

import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {

        String word = "merhaba";

        System.out.println(word.charAt(2));
        System.out.println(word.toUpperCase(Locale.ROOT)); // büyük harflere dönüştürür.
        System.out.println(word.toLowerCase(Locale.ROOT)); // küçük harflere dönüştürür.

        System.out.println(word.concat(" Dünya")); // sona ekleme yapılır.
        System.out.println(word.endsWith("a")); // bitiş karakterini öğrenmek için
        System.out.println(word.equals("merhaba")); // karakterler birbirine eşit mi bunu  kontrol eder
        System.out.println(word.indexOf("h")); // harfin kaçıncı index de olduğunu belirtir
        System.out.println(word.isEmpty()); // bir dizenin boş olup olmadığının değerini verir.


    }
}
