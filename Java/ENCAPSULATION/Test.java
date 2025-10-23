package ENCAPSULATION;

public class Test {
    
    public static void main(String[] args) {

        // creating object for getter and setter to accessing encapsulation
        Student student = new Student();
       
        // use setter here
        student.setName("Nihal");
        student.setRollnumber(45);
        student.setAge(25);


        // use getter here
        System.out.println("Student Roll Number : " + student.getRollnumber());
        System.out.println("Student Name        : " + student.getName());
        System.out.println("Student Age         : " +student.getAge());
    
    }
}
