package Arrays;

public class Foreach {
    public static void main(String[] args) {

        int [] myList = {1,2,3,4,5,6,7,8,9};

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

    /*    for(int i=0 ; i < myList.length ; i++ ){
            System.out.println(myList[i]);
        }
    */

        for (int k : myList){
            System.out.println(myList[k-1]);

        }

        System.out.println("-------------------");

        for( int[] u : matris){
            for (int elem : u ){
                System.out.print(elem);
            }
            System.out.println();
        }

    }
}
