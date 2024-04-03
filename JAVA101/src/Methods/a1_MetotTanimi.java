package Methods;



public class a1_MetotTanimi {

    static void helloWorld(){
        System.out.println("You are mad Iam back!!");
    }

   static int power (int base , int exp){
        int result = 1 ;
        for (int i = 1 ; i <= exp ; i++){
            result *= base ;
        }
        return result;
    }



    public static void main(String[] args) {

        System.out.println(power(2,3));

        helloWorld();
        helloWorld();


    }
}
