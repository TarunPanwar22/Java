import java.util.Scanner;

class MyMainEmployee{
    private int id ; 
    private String name;

    // public MyMainEmployee(){
    //     id = 45 ; 
    //     name = "Your-Name-Here ";
    // }

    public MyMainEmployee(String myName , int myId ){
        id = myId ; 
        name = myName;
    } 

   public String getName(){
       return name ; 
   }


    public void setName(String n ){
        name = n ; 
    }

    public void setId (int i ){
        id = i  ;
    }

    public int getId(){
        return id ;
    }

}


class constructor{
    public static void main(String[] args ){

        MyMainEmployee harry = new MyMainEmployee("ProgrammingwithHarry" , 12 );

        // harry.setName("CodeWithHarry");
        // harry.setId(34);
        
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}