package OOP;

// By using Method to initialise the Object

public class Animal2 {
    
    String color;
    int age;

    void intObj(String c, int a){

        color = c;
        age   = a;
    }
    
    void display(){
        System.out.println("My Cat Color is " + color + " " +"and Age is " + age);
    }

    public static void main(String[] args){

        Animal2 Cat = new Animal2();
        Cat.intObj("brown", 2);
        Cat.display();

    }
}
