import java.util.Scanner; 


abstract class Parent2{
     public Parent2(){
        System.out.println("Main base2 ka constructor hoon ");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
         public abstract void greet();
         public abstract void greet2();
}

class Child2 extends Parent2 {
    
        // @Override
         public void greet(){
            System.out.println("Good Morning");
        }
        // @Override
        public void greet2(){
            System.out.println("Good Afternoon");
        }
    
}


abstract class Child3 extends Child2{
    public void th(){
        System.out.println("I am good");
    }

}


class abstractClassAndMeth{
    public static void main(String[] args ){
        Child2 c=new Child2();
        c.greet();


    }
}

