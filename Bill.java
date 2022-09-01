/* Write a program to input electricity charge and calculate total electricity bill according to the given condiotion for
1.)for 1st 50 units rs- 0.50 units rs - 0.50 / units .
2.)for the next 100 units rs-0.75/unit 
3.)for the next 150 units rs-1.20/unit charge
4.)for unit above 250 rs-1.50/unit
5.)an additional sur charge of 20% is added to the bill.
note:-suppose user inputed 175 electricity units.
import java.util.Scanner;
public class Bill
{
    public static void main(String[] args)
    {
        double ch = 175 , electricity ;
        System.out.print("Enter the Bill is :------>");
        Scanner sc = new Scanner(System.in);
        electricity = sc.nextDouble();
        if ( electricity >= 50 )
        {
            ch = ((electricity * 0.50 ) + 0.20) ; 
        }
        else if ( electricity <= 100 )
        {
            ch = (((electricity - 50 ) * 0.75 ) + 0.20 );
        }
        else if ( electricity <= 150 )
        {
            ch = (((electricity - 100 )* 1.20 ) + 0.20 );
        }
        else if ( electricity <= 250 ) 
        {
            ch = (((electricity - 150 )* 1.50 ) + 0.20 );
        }
        System.out.print("Electricity of the billing is : -------> " +ch);
    }
}*/
/*import java.util.Scanner; 
class Electricity 
{
    public static void main(String [] args )
    {
        double ele , ch ; 
        System.out.print("Enter the Pay Electricity Bills is :  ");
        Scanner sc = new Scanner(System.in);
        ele = sc.nextDouble();
        
        
    }
}*/