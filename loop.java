import java.util.Scanner;
import java.lang.Math ;
public class loop 

/*{
    public static void main(String[] args )
    {
        System.out.println("Enter the number is : ");
        int number , rem ; 
        int i  , sum = 0 ; 
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while ( number > 0 )
        {
            rem = number % 10 ;
            number = number/10;
            sum = sum * 10 + rem; 
        }
        System.out.println("Reverse number is : " + sum);
    }
}
{
        public static void main(String[] args )
        System.out.println("Enter the number is : ");
        int number , sum = 0 , rem ;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while ( number > 0 )
        {
            rem = number % 10 ;
            number = number / 10 ; 
            sum = sum + rem ; 
        }
        System.out.println("Total digit of the number is : " + sum );
    }
}*/
/*                  
                      * 
                    * * *       
                  * * * * *
                    * * * 
                      * 

{
    public static void main(String[] args )
    {
        int i , j , k , p ;
        for ( i = 1 ; i <= 3 ; i ++ ) 
        {
            for ( j = i ; j <=2 ; j ++ )
            {
                System.out.print(" ");
            }
            for ( k = 1 ; k <= i ; k ++ )
            {
                System.out.print("*");
            }
            for ( p = i - 1 ; p >= 1 ; p-- )
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for ( i = 2 ; i >= 1 ; i -- )
        {
            for ( j = 2 ; j >= i ; j -- )
            {
                System.out.print(" ");
            }
            for ( k = 1 ; k <= i ; k ++ )
            {
                System.out.print("*");
            }
            for( p = i - 1 ; p >= 1 ; p --  )
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}*/
/*
{
    public static void main(String[] args )
    {
        int base , exponent ; 
        System.out.println("Enter the base is : ");
        Scanner obj = new Scanner(System.in);
        base = obj.nextInt();
        System.out.println("Enter the exponent is : ");
        exponent = obj.nextInt();
        System.out.printf("Power is : " + base + " ^ " + exponent + " = " + Math.pow( base , exponent ));
    }
}
{
    public static void main(String[] args )
    {
        int  n , arm , r , s = 0 ; 
        System.out.println("Enter the number is : ");
        Scanner obj = new Scanner(System.in) ;
        n = obj.nextInt();
        arm = n ;
        while ( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ; 
            s = s + r * r * r ; 
        }
        if ( arm == s )
        {
            System.out.println("the number is armstrong number ");
        }
        else 
        {
            System.out.println("the number is not an armstrong number ");
        }
    }
}*/
/*
{
    public static void main(String [] args)
    {
        int n ;
        float sum = 0 ; 
        System.out.println("Enter the number is : ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        for ( float i = 1 ; i <= n ; i ++ )
        {
            if ( i % 2 == 1 )
            {
                sum = sum + 1 / i ; 
            }
            else 
            {
                sum = sum - 1 / i; 
            }
        }
        System.out.println("addition of log alogirthum is : "+sum);
    } 
}*/
/*{
    public static void main( String[] args )
    {
        int a , b , i ; 
        System.out.println("Enter the two number is : ");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        for ( i = 1 ; i <= 1 ; i ++ )
        {
            if ( a > b )
            {
                System.out.println("A is Greatest number ");
            }
            else 
            {
                System.out.println("B is Greatest number ");
            }
        }
    }
}*/
{
    public static void main( String[] args )
    {
        int n , i = 1 , flag = 0 ;
        System.out.println("Enter the number is : ");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        for ( i = 2 ; i <= n ; i ++ )
        {
            if ( n % i == 0 )
            {
                System.out.println("Not a prime number ");
                break ; 
            }
            else 
            {
                i ++ ; 
            }
            if ( i == n )
            {
                System.out.println("prime number ");
            }
        }
    }
}