import java.util.Scanner; 

class Base{

    public int x ;

    public int getx(){

        return x ;

    }

    public void setx(int x ){
        System.out.println("I am in base setting x now");
        this.x = x ;

    }

    public void printMe(){
        System.out.println("Hello I am a constructor of class Base");
    }

}


class Derived extends Base {
    int y ;

    public int gety(){
        return y ;
    }
    public void sety(int y ){
        System.out.println("I am in base setting y now");
        this.y = y ; 
    }
    public void printMe(){
        System.out.println("Hello I am a constructor of class derived ");
    }

}
public class inheritance{
    public static void main(String[] args ){

        Base b = new Base(); 
        Derived d = new Derived(); 
        b.setx(4);

        System.out.println(b.getx());

        d.sety(53);
        System.out.println(d.gety());


        // b.sety(76);
        // System.out.println(b.gety());        ------>  Throws an Error


        d.setx(78);
        System.out.println(d.getx());

    }
}


