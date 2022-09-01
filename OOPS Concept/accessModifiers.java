import java.util.Scanner; 

class MyEmployee{
    private int id ; 
    private String name; 

   public String getName(){
       return name ; 
   }


    public void setName(String n ){
        name = n ; 
    }

    public void setId ( int i ){
        id = i  ; 
    }

    public int getId(){
        return id ;

    }

}

public class accessModifiers{
    public static void main(String[] args ){
        MyEmployee harry = new MyEmployee();
        // harry.id = 45 ; 
        // harry.name = "Code With harry ";
        harry.setName("code With harry ");
        System.out.println(harry.getName());
        harry.setId(334);
        System.out.println(harry.getId());


    }
}