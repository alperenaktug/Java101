package Arrays;

public class ArrayIntroduce {

     static void printArray(int[] array) {   // dizileri fonksiyonlara parametre olarak geri döndürmek
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }


     static int[] reverse(int[] list) // dizileri fonksiyonlarda geri döndürmek
    {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
        {
            result[j] = list[i];
        }

        return result;
    }
    public static void main(String[] args) {
       // double [] list = new double[10];
        double [] list = {2.2 , 3.3 , 1.1 , 4.4 , 5.5};
        int [] myList = {10,20 , 30 , 40 , 50 , 60 , 70 ,80 ,90 ,100};

       for (int i= 0 ; i<myList.length ; i++){
           System.out.println(myList[i]);
       }
        System.out.println("--------------------------");
        for (int k= 0 ; k<list.length ; k++){
            System.out.println(list[k]);
        }



    }
}
