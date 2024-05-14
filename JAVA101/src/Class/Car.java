package Class;

public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Davranışlar

     int increaseSpeed(int increment){
        speed += increment ;
        return speed;
    }
    int decreasedSpeed(int decrease){
        if(speed > 0){
            speed -= decrease;
        }
        return speed;
    }

     void printSpeed(){
         System.out.println("Hızınız : " + speed);
     }

}
