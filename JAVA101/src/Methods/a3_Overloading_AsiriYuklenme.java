package Methods;



public class a3_Overloading_AsiriYuklenme {

    static void print (){
        System.out.println("Parametresiz metot");
    }
    static void print( double a ){
        System.out.println("Parametreli Metot " + a);
    }
    static int print ( int a , int b){
       return a + b ;
    }
    static int print ( int a , int b , int c ){
       return a + b + c ;
    }




    public static void main(String[] args) {
        print();
        print(12.0);
        System.out.println(print(2,3));
        System.out.println(print(2,3,4));

    }
}
