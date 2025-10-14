package OOP;

public class Car2 {

    String brand;
    String model;
    double price;

    //Constuctor initialize data
    Car2(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.price = price;

    }
        
    // This is Methos to Display car Details
    void DisplayDetails() {

        System.out.println("Car Brand " + brand);
        System.out.println("Car Model " + model);
        System.out.println("Car Price " + price);

        System.out.println("------------------------------");

    }

     //This Method applying Discount

    void applyDiscount(double Percentage) {
        double DiscountAmount = price * (Percentage / 100);

        price = price - DiscountAmount;

        System.out.println(" Discount of " + Percentage + " % applied successfully");
        System.out.println("New price after discount : Rs. " + price);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
       
        // created  Car objects 
        Car2 car1 = new Car2("Toyota", "Fortuner", 4500000);
        Car2 car2 = new Car2("Tata", "Nexon", 500000);
         
        //display Car1 details and Discount
        car1.DisplayDetails();
        car1.applyDiscount(10);

        //display Car2 details and Discount
        car2.DisplayDetails();
        car2.applyDiscount(5);
    }
}
