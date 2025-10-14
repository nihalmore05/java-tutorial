package OOP;

public class Car {                                // This is class 
    
    String color;
    int speed;

    void start(){
        System.out.println("Car Start");
    }

    void stop(){
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {
        
        Car carStart = new Car();              // This is Objects
        
        carStart.color = "Red";

        carStart.speed = 60;

        System.out.println("Car Color: " + carStart.color);

        carStart.start();
        carStart.stop();

    }
}
