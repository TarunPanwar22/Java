import java.util.Scanner; 
class HandlingSpecificException {
    public static void main(String[] args ){
        int [] marks = new int [5] ; 
        marks[0] = 7 ;
        marks[1] = 56 ; 
        marks[2] = 6 ; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the array index "); 
        int ind = sc.nextInt(); 
        System.out.println("Enter the array index ");

        System.out.println("Enter the number yu want to divide the value with "); 
        int number = sc.nextInt(); 
         try{
            System.out.println("The value at array index entered is : " +marks[ind]);
            System.out.println("The vlaue of array- value / number is : "+ marks[ind] / number );
        }
        catch(ArithmeticException e ){
            System.out.println("Arithmetic Exception occured! "); 
            System.out.println(e); 
            // System.out.println("Some Exception occurred");

        }
        // catch(ArrayIndexOutBoundsException e ){
        //     System.out.println(" ArrayIndexOutBoundsException occurred");
        //     System.out.println(e);
        // }
        catch(Exception e ){
            System.out.println("Some Other Exception occurred");
            System.out.println(e);
        } 
    }
}