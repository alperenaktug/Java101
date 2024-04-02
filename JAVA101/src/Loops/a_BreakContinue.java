package Loops;

public class a_BreakContinue {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 10 ; i++){

            if (i == 5 ){
                System.out.println("i değeri 5 tir ...");
                break;
            }
            System.out.println(i);
        }

        for (int k=1 ; k <= 10 ; k++){
            if (k == 5){
                continue;
            }
            System.out.println(k);
        }
    }


}
