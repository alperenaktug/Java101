package Methods;

public class a2_ReturnVoidKavrami {

    static int sum(int a , int b){
        return a + b ;
    }

    static void carpma (int k , int l){
        int mama = k * l ;
        System.out.println(mama);

    }

    public static void main(String[] args) {
      int result = sum(10 , 20);
        System.out.println(result);

        carpma(10 ,10);

    }
}
