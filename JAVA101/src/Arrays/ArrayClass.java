package Arrays;

import java.util.Arrays;



public class ArrayClass {
    public static void main(String[] args) {

        int [] list = {1,2,3,4,5,6 ,56 , 21 , 9 ,43};
        double [] list2 = {1.1 , 2.3 , 4.5 , 1.2 , 5.9 , 3.4};

        // indislerin değerlerini değiştirebiliryoruz..
        Arrays.fill(list , 2 , 4 , 99);
        // dizideki elemanları küçükten büyüğe sıralar..
        Arrays.sort(list);


        // dizinin çıktısını nesne oluşturmadan alabiliryoruz..
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list2));

        // dizideki aranan elemanın hangi indiste oldupunu buluruz..
        int index = Arrays.binarySearch(list , 21);
        System.out.println("21 in index numarası : " + index );


        System.out.println("-------------------------------");

        int [] list3 = { 23, 45 ,5, 67 ,86 , 76,};
        // dizideki elemanı kopyalar kaç elamanı kopyalamak istiyorsak yazarız ve elde ederiz..
        int [] copyArray = Arrays.copyOf(list3 , 3);
        // dizideki bu aralılardaki elemanları getirir..
        int [] copyArray2 = Arrays.copyOfRange(list3 , 3 , 5);
        System.out.println(Arrays.toString(copyArray));
        System.out.println(Arrays.toString(copyArray2));
        // iki dizinin eşitliğini kontrol eder...
        System.out.println(Arrays.equals(list , list3));



    }
}
