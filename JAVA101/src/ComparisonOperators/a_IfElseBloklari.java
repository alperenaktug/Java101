package ComparisonOperators;

public class a_IfElseBloklari {
    public static void main(String[] args) {
        int a=10 , b=20 ,  c=30;
        boolean compare = a==b;

        // String str = compare ? "Eşittir" : "Eşit değildir";
        // System.out.println(str);

        if (compare){
            System.out.println("Eşittir");
        }else{
            System.out.println("Eşit değildir");
        }
        System.out.println("Program bitti!!");


        if((a < b) && (a < c)){
            System.out.println("A en küçük sayıdır.");
        }else if((b <a) && (b < c)){
            System.out.println("B en küçük sayıdır.");
        }else{
            System.out.println("C en küçük sayıdır.");
        }
    }
}
