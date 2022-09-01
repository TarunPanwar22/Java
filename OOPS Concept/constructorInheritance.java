import java.util.Scanner;

class Base1{

    Base1(){
        System.out.println("Main Ekk Constructor hoo "); 
    }

    Base1( int x ){
        System.out.println("I am an overloaded constructor with value of a as : " + x ); 
    }

    public int x ; 
    
    public int getx(){
        return x ; 
    }

    public void setx(int x ){
        this.x = x ; 
    }
    
}


class Derived1 extends Base1 {
    Derived1(){
        // super(0); 
        System.out.println("I am a derived class constructor"); 
    }
    Derived1(int x , int y ){
        super(x); 
        System.out.println("I am an overloaded constructor of Derived with value of y as : " +y );
    }
     public int y ; 
    
    public int gety(){
        return y ; 
    }
    public void sety(int y ){
        this.y = y ; 
    }
}


class ChildofDerived extends Derived1 {
    ChildofDerived(){
        System.out.println("I am a child of derived Constructor ");
    }

    ChildofDerived(int x , int y , int z ){
        super(x , y ); 
        System.out.println("I am an overloaded constructor of Derived with value of z as : "+z );

    }

}


public class constructorInheritance{
    public static void main(String[] args ){

        // Base1 b = new Base1(); ]
        // Derived1 d = new Derived1(3 , 4 ); 

        ChildofDerived ch = new ChildofDerived(2 , 4 , 5 ); 

    }
}