package OOP;
 // How To Call Object in class
 // how to create Object in java 
 
public class Bike {
    
    public void color(){
        System.out.println("The Bike Color is Red");
    }
    public void Speed(){
        System.out.println("The Bike Speed is 200 Kmph");
    }
    public static void main(String[] args){

        Bike b1 = new Bike();

        b1.color();
        b1.Speed();

        
    }
}
