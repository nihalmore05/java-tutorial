package ENCAPSULATION;

public class Student {

//----Encapsulation----------------
    private String name;

    private int rollnumber;

    private int age;

//-------Getter and Setter---------------------
// Geter  :-  use for get(read) the value of private variable.
// always returns something


//Setter :- use to set(change) the value of private variable.
//      Usually takes a parameter and doesn’t return anything (void).


    // NAME
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //Roll Number
    public int getRollnumber() {
        return this.rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
   // Age
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid Age");
        }else{
        this.age = age;
    }}

}