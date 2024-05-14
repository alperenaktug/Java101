package Methods;

public class a5_RecursiveMethod {


    static int f (int n){
        if (n == 1){
            return 1 ;
        }
        int result = f(n-1) + n;
        System.out.println("result => " + result);
        return  result;
    }

    public static void main(String[] args) {

        System.out.println(f(3));




    }
}
