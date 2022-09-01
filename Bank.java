import java.util.Scanner;
public class Bank 
{
    public static void main(String [] args )
    {
        System.out.println("Welcome sir !! ");
        System.out.println("To My New Java bank ");
        System.out.println("Click numbers to choose :" );
        System.out.println("1.) MONEY DEPOSIT ");
        System.out.println("2.) MONEY TRANSFER ");
        System.out.println("3.)Withdrawl ");
        System.out.println("4.)Exit");
        System.out.println("********Enter Any number*****");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if ( number == 1 )
        {
            System.out.println("Enter your balance : ");
            long balance = sc.nextLong();
            System.out.println("How many Rupees are you deposit in bank : ");
            long deposit = sc.nextLong(); 
            System.out.println("Your Total amount : " +(deposit + balance));
        }
        else if ( number == 2 )
        {
            System.out.println("Enter your balance : ");
            long balance1 = sc.nextLong();
            System.out.println("How many Rupees are you transfer to another account : ");
            long Transfer = sc.nextLong();
            if ( balance1 >= Transfer )
            {
                System.out.println("Your current Balance : " + ( balance1 - Transfer ));
            }
            else 
            {
                System.out.println("There is no sufficient balance you can't data trasfered money "+ balance1);
            }
        }
        else if ( number == 3 )
        {
            System.out.println("Please enter your balance : ");
            long balance2 = sc.nextLong();
            System.out.println("How many Rupees are you withdrawl money in account : ");
            long withdrawl = sc.nextLong();
            if ( balance2 > withdrawl )
            {
                System.out.printf("your current current balance : ");
            }
            else 
            {
                System.out.println("you can't withdrawl money ");
            }
        }
        else 
        {
            System.out.println("Thankuu visiting again ");
        }
    }
}
