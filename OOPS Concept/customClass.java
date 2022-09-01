import java.util.Scanner; 


class Employee {
    int id = 34 ;
    String name ; 
    int salary; 
    public void printDetails(){
        System.out.println("My id is " + id );
        System.out.println("And my name is "+name);
    }
    public int getSalary(){
        return salary;
    }

}

public class customClass{
    public static void main(String[] args ){
        System.out.println("this is our custom class ");   // Instantiating a new Employee Object 
        Employee harry = new Employee();
        Employee john = new Employee();
        // Setting properties for harry 
        harry.id = 12 ; 
         harry.name = "Code With Harry " ;
         harry.salary = 490000; 

         // Setting attributes for john 
         john.id = 17 ; 
         john.name = "John Khandelwal " ;
         john.salary = 90000;
         harry.printDetails();
         john.printDetails();
         int salary = john.getSalary();
         System.out.println(salary);

         // Printing the Attributes 
        harry.printDetails();
        //System.out.println(harry.id);
        //System.out.println(harry.name);
    }
}