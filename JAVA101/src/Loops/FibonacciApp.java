package Loops;

public class FibonacciApp {
    public static void main(String[] args) {
        int n = 9 ;

        int first = 0 ;
        int second = 1 ;

        System.out.println("9 Elemanlı Fibonacci Dizisi : ");


        for (int i = 2 ; i < n ; i++){
            int next = first + second ;
            System.out.println(next + "");
            first = second ;
            second = next ;
        }

    }


}
