import java.util.Scanner; 
class method

{


   static int logic (int x , int y ) {
        int z  ; 
        if ( x > y ){


            z = x + y ; 

        }
        else {
            z = ( x + y ) * 5 ; 
        }

        return z ; 
   }


    public static void main(String[] args){

        int a1 = 70 ; 
        int b1 = 6 ; 
        int c1 ;
        
        method obj = new method(); 
        c1 = obj.logic(a1,b1);
        System.out.println("The value of the c2 is :- "+ c1);


        int a2 = 7 ; 
        int b2 = 8 ;
        int c2 ; 
        c2 = obj.logic(a2,b2);
        System.out.println("The value of the c2 is :- "+ c2);
        
    }
}