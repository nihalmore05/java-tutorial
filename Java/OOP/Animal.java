package OOP;

public class Animal {
    // using Reference variable
    
    String color;
    int  age;

    public static void main(String[] args){

        Animal Dog = new Animal();
        Dog.color = "Black";
        Dog.age = 4;

        System.out.println("The Rockey Color is " + Dog.color  + " And he is " + Dog.age + " year old");
    }
}
