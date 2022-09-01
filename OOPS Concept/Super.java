import java.util.Scanner; 
 
 class EkClass {
     int a ; 
     EkClass(int v ){
         this.a = v ; 
     }
     public int returnone(){
         return 1 ;
     }
     public int getA(){
         return a ; 
     }
 }

 class DoClass extends EkClass{
     DoClass(int c ){
         super(c);
         System.out.println("Main ekk constructor hoon ");
     }
 }


public class Super{
    public static void main(String[] args ){
        EkClass e= new EkClass(5); 
        DoClass d = new DoClass(44);
        System.out.println(e.getA());
        
    }
}