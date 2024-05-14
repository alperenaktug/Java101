package Class;

public class Car_nesneOlusturma {
    public static void main(String[] args) {
        Car audi = new Car("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        /*
        audi.model = "Audi";
        audi.speed = 10;
        audi.increaseSpeed(40);
        audi.decreasedSpeed(20);
        audi.printSpeed();
         */
        Car bmw = new Car("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);

        bmw.printInfo();

        /*
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(20);
        bmw.increaseSpeed(50);
        bmw.increaseSpeed(70);
        bmw.printSpeed();
        */
        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
        mercedes.speed = 20;
        mercedes.printInfo();
        /*
        mercedes.model = "Mercedes";
        mercedes.speed = 30;
        mercedes.printSpeed();
        */
    }
}
