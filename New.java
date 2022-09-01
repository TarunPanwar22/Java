
import java.util.Scanner;  
public class New 
{
    public static void main(String[] args) 
    {
    double h,un;
    System.out.println("Enter the unit");
    Scanner sc= new Scanner(System.in);
    un=sc.nextDouble();
        if(un>=50)
        {
            h=(un*0.50) + 0.2;
        }
        else if(un>=100)
        {
            h=(un*0.75) + 0.2;
        }   
        else if(un>=150)
        {
            h=(un*1.20) + 0.2;
        }
        else 
        {
            h=((un*1.50) + 0.2);
        }
        System.out.println("Charge" + " rs." + h);
    }    
}
