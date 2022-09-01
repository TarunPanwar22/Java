                                         // JAVA PROGRAMMING PRACTICE QUESTION 
                                        // BASIC TYPES OF THE QUESITON 
import java.util.Scanner ;
import java.util.Random;

//import org.graalvm.compiler.lir.sparc.SPARCArithmetic.FloatConvertOp.FloatConvert;

import java.lang.Math;
import java.security.cert.X509CRLSelector;
import java.text.BreakIterator;
class practice_question 
/*
{
    /*public static void main(String[] args )
    {
        System.out.println("hello world ");
    }
    
}*/
/*
{
    Write a program the radius of the circle then find the area and circumference of the circle . 
    public static void main(String[] args )
    {
        int  radius ;
        float circumference; 
        float area ;
        System.out.println("Enter the radius is : ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        area = 3.14f * radius * radius ; 
        circumference = 2*3.14f ; 
        System.out.println("Area of the circle is : "+area);
        System.out.println("Circumference of the circle is : "+ circumference);
    }
}*/
/*
{
    Write a program to enter the length and breadth y the rectangle then find teh area and perimeter of the rectangle .a = l * b 
    p = 2 * ( l + b ) 
    d = sqrt(l * l + b + b ) 
    public static void main(String[] args )
    {
        int length , breadth , perimeter , area ;
        System.out.println("Enter the length and breadth is : ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        area = length * breadth ;
        perimeter = 2 * ( length * breadth );
        
        System.out.println("Area of the rectangle is : "+ area );
        System.out.println("Perimeter of the rectangle is : "+ perimeter );
        System.out.println("Diagonal of the rectanle is : "+  Math.sqrt((length * length) + (breadth * breadth )));
    }

}*/
/*
{

    Write a program to enter teh base and perpendicular of triangle then find the hypotaneous of triangle . 
    // h = sqrt(b*b+p*p)
    public static void main(String[] args )
    {
        int b , p ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and perpendicular is : ");
        b = sc.nextInt();
        p = sc.nextInt();
        System.out.println("The Hypotaneous of the triangle : " + Math.sqrt(b*b+p*p));
    }
}*/
/*
{
    Write a program to enter teh three sides of a scalene triangle then find the area using herons formula . 
    // s = (a + b + c )/ 2 ; 
    //ar = sqrt(s(s-c)(s-b)(s-c))
    public static void main(String[] args )
    {
        int s , a , b , c ; 
        System.out.println("Enter three side of a scalene triangle is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = ( a + b + c )/ 2 ;
        System.out.println("Area of a triangle is : "+ s );
        System.out.println("Area of a scalene triangle is : "+Math.sqrt(s*(s-c)*(s-c)*(s-b)*(s-c)));
    }
}
*/
/*{
    Write a program to enter the side of an equilateral triangle then find the area of the triangle . 
    // a = sqrt(3)/4*s*s;
    public static void main(String[] args )
    {
        int s ;
        System.out.println("Enter the side of an equilateral triangle : ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        System.out.println("Area of the square is : "+ Math.sqrt(3)/4*s*s);
    } 
}*/
/*{
    // Swapping of two number 
    public static void main(String[] args )
    {
        int a , b , c ;
        System.out.println("Enter the number a and b is: ");
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swapping value of a and b : "+a+" "+b);
        c = a ; 
        a = b ; 
        b = c ; 
        System.out.println("After Swapping value of a and b : "+a +" "+b );
    }
}*/
/*{
    // Swapping of two number without using three variable .
    public static void main(String[] args )
    {
        int a , b ; 
        System.out.println("Enter the two value of the number a and b is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swapping the value of a and b is : "+a +" "+b );
        a = a + b ; 
        b = a - b ;
        a = a - b ;
        System.out.println("Afte Swapping the value of a and b is : "+a +" "+b );
    }
}*/
/*{
    // Write a program to enter teh days and find number of year , month and days . 
    public static void main(String[] args )
    {
        int year , month , weeks , days ; 
        System.out.println("Enter the days : ");
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        year = days / 365 ; 
        days = days % 365 ; 
        month = days / 30 ; 
        days = days % 30 ;
        weeks = days / 7  ; 
        days = days % 7 ; 
        System.out.println("Year : "+year );
        System.out.println("Month : "+month );
        System.out.println("Weeks : "+weeks); 
        System.out.println("Remaining Days : "+days );
    }
}*/
/*{
    // Write a program to enter the amount then find teh possible number of 500 , 100 , 50 , 10 , 2 and 1 are possible 
    // Example : 1745
    public static void main(String[] args )
    {
        int amount , a , b , c , d , e , f ; 
        System.out.println("Enter the amount : ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        a = amount/ 500 ;
        amount = amount% 500 ; 
        b = amount / 100 ; 
        amount = amount % 100 ; 
        c = amount/ 50 ; 
        amount = amount % 50 ; 
        d = amount / 10 ; 
        amount = amount % 10 ; 
        e = amount / 2 ; 
        amount = amount % 2 ; 
        f = amount / 1 ; 
        System.out.println("Total Count of 500 Rupess : "+a); 
        System.out.println("Total Count of 100 Rupess : "+b); 
        System.out.println("Total Count of 50 Rupess : "+c); 
        System.out.println("Total Count of 10 Rupess : "+d); 
        System.out.println("Total Count of 2 Rupess : "+e); 
        System.out.println("Total Count of 1 Rupess : "+f); 
    } 
}*/
/*{
    // Write a program to enter the number of years , then find the possible number of month , days , weeks , hours , minute and seconds . 
    public static void main(String [] args)
    {
        int year , month , weeks , days , hours , minute , seconds ; 
        System.out.println("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        month = year * 12 ; 
        weeks = year * 52 ; 
        days = year * 365 ;
        hours = year * 24 * 365 ; 
        minute = year * 365 * 60 * 24  ; 
        seconds =  year * 365 * 24 * 3600 ; 
        System.out.println("Month: "+month );
        System.out.println("weeks: "+weeks );
        System.out.println("days: "+days );
        System.out.println("hours: "+hours );
        System.out.println("Minute: "+minute );
        System.out.println("Second: "+seconds);
    }
}*/
/*{
    // Write a program to enter the distance in km then find convert it into meter , cm , i , f(foot). 
    // i = cm / 2.54 ;    // f = i / 12 ; 
    public static void main(String[] args )
    {
        float i , f , cm ; 
        int km ; 
        System.out.println("Enter the distance in kilometer(km): ");
        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();
        cm = km * 1000 * 100 ; 
        i = cm / 2.54f; 
        f = i / 12 ; 
        System.out.println("Centimeter(cm): "+cm);
        System.out.println("Inches: "+i );
        System.out.println("Foot: "+f );
    }
}*/
/*{
    // Write a program to enter teh marks of the student in 5 student then find the percentage in each 100 marks . 
    public static void main(String[] args )
    {
        float math , english , art , science , hindi , total ; 
        float percentage , average; 
        System.out.println("Enter the 5 subject number of the number is : ");
        Scanner sc = new Scanner(System.in);
        math = sc.nextFloat();
        english = sc.nextFloat();
        art = sc.nextFloat();
        hindi = sc.nextFloat();
        science = sc.nextFloat();
        total = (math + english + art + science + hindi );
        average = (math + english + art + science + hindi ) / 5 ;
        percentage = ((math + english + art + science + hindi )* 100)/ 500 ; 
        System.out.println("Average marks of the student is : "+average);
        System.out.println("Total marks of the student is : "+total);
        System.out.println("Total marks of the per student percentage is : "+percentage );
    }
}*/
/*{
    // Write to find the area of the square if the Permiter is Given . 
    public static void main( String[] args )
    {
        float side , area , perimeter ;
        System.out.println("Enter the Perimeter : ");
        Scanner sc = new Scanner(System.in);
        perimeter = sc.nextFloat();
        side = perimeter/ 4 ; 
        area = side * side ; 
        System.out.println("Area of square is : "+area );
    }*/
//------------------------------------------------DECISION MAKING---------------------------------------------------
//****************************************************IF-ELSE********************************************************
//--------------------------------------------------Basic If-Else Practice Question----------------------------------
/*{
    // Write a program to enter the number then check the number is even or odd . 
    public static void main(String[] args )
    {
        int n ; 
        System.out.println("Enter any number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if ( n % 2 == 0 )
        {
            System.out.println(n+" is an even number ");
        }
        else 
        {
            System.out.println(n+" is a odd number");
        }
    }
}*/
/*{
    // Write a program to enter the year and check the year is leap year or not . 
    public static void main(String[] args )
    {
        int year ; 
        System.out.println("Enter any number is : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if ( year % 4 == 0 )
        {
            System.out.println(year+" is a leap year ");
        }
        else 
        {
            System.out.println(year+" is not a leap year ");
        }

    }
}*/
/*{
    // Write a program to enter any two number of who is largest number . 
    public static void main(String[] args )
    {
        int a , b ; 
        System.out.println("Enter any two number is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if ( a > b )
        {
            System.out.println(a+" is a largest number ");
        }
        else 
        {
            System.out.println(b+" is a largest number ");
        }
    }
}*/
/*{
    // Write a program to enter the three number which is greatest number . 
    public static void main(String [] args )
    {
        int a , b , c ; 
        System.out.println("Enter any three number is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ( a > b && a > c )
        {
            System.out.println(a+" is a greatest number ");
        }
        else if ( b > a && b > c )
        {
            System.out.println(b+" is a greatest number ");
        }
        else 
        {
            System.out.println(c+" is a greatest number ");
        }
    }
}*/
/*{
    // Write a program to enter the number then check the number is positive , negative and 0 . 
    public static void main(String[] args )
    {
        int n ; 
        System.out.println("Enter any number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if ( n > 0 )
        {
            System.out.println(n+" is a positive number ");
        }
        if ( n < 0 )
        {
            System.out.println(n+" is a negative number ");
        }
        if ( n == 0 ) 
        {
            System.out.println(n+" is a zero number ");
        }
    }
}*/
/*{
    // Write a program to enter the age of a person find the person is eligible for voting or not . 
    public static void main(String [] args )
    {
        int age ; 
        System.out.println("Enter the age is : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if ( age >= 18 )
        {
            System.out.println(age+" Person can gives the votes above 18 years ");
        }
        else 
        {
            System.out.println(age+" Person can not gives the votes below 18 years ");
        }
    }
}*/
/*{
    // Write a program to enter the number then find the last digit is 7 or not . 
    public static void main(String[] args )
    {
        int n , last_digit ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        last_digit = n % 10 ;
        if ( 7 == last_digit )
        {
            System.out.println("7 is a last digit number ");
        }
        else 
        {
            System.out.println("7 is not a last digit number ");
        }
    }
}*/
/*{
    // Write a program to enter the three sides then find the number is Equilateral , scalene and isocelles . 
    public static void main(String[] args )
    {
        int a , b , c ; 
        System.out.println("Enter the three side of a triangle is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ( a == b && b == c && a == c  )
        {
            System.out.println("The Triangle is Equilateral triangle");
        }
        else if ( a == b && b != c && a!= c  )
        {
            System.out.println("The Triangle is Isocelles trianlge");
        }
        else 
        {
            System.out.println("The Triangle is Scalene triangle ");
        }
    }
}*/
/*{
    // Write a program to enter the number then check the number is divisible by 3 display the square of that number
    // other wise cube of that number . 
    public static void main(String[] args )
    {
        int n ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if ( n % 3 == 0 )
        {
            System.out.println(n+" is divisible by 3 ");
        }
        else 
        {
            System.out.println(" cube of that number "+n+" is : "+n*n*n);
        }
    }
    
}*/
/*{
    // Write a program to find the roots of a quadratic equation if the dis criminent is given . 
    // d = b * b - r * a * c ; 
    // condition if d >= 0 
    // r1 = (-b + sqrt(b*b-4*a*c))/2*a 
    // r2 = (-b - sqrt(b*b-4*a*c))/2*a
    // if d<0 Roots are imaginary . 
    public static void main(String[] args )
    {
        int d , b , r , a , c ; 
        System.out.println("Enter the value of b , a , c and r is : ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        a = sc.nextInt();
        c = sc.nextInt();
        r = sc.nextInt();
        System.out.println("Enter the value of d is : ");
        d = sc.nextInt(); 
        if ( d >= 0 )
        {
            System.out.println("Roots of a Qudratic equation : "+(-b+ Math.sqrt(b*b-4*r*a*c))/2*a); 
            System.out.println("Roots of a Quadratic equation :"+(-b - Math.sqrt(b*b-4*r*a*c))/2*a);
        }
        else 
        {
            System.out.println("Roots are Imaginary");
        }
    }
}*/
//----------------------------------------------------NESTED IF-ELSE---------------------------------------------------------------
/*{
    // Write a program the basic salary of an employes then calculate the following allowances according to the given tables. 
    bs >= 6000
    hra = 40% of basic 
    da = 30% of basic 
    ta = 20% of basic 
    pf = 10% of basic 
    Gross = bs + hra + da + ta 
    Net = gross - pf 
    bs < 6000 of basic 
    hra = 35% of basic 
    da  = 25% of basic 
    ta = 15 % of basic 
    pf = 10 % of basic 
    public static void main(String [] args )
    {
        int bs , hra , da , ta , pf , gross , net ; 
        System.out.println("Enter the basic salary(bs) : ");
        Scanner sc = new Scanner(System.in);
        bs = sc.nextInt();
        if ( bs >= 6000 )
        {
            hra = (40 / 100 ) * bs ; 
            da = ( 30 / 100 ) * bs ; 
            ta = ( 20 / 100 ) * bs ; 
            pf = ( 10 * bs ) / 100 ; 
            
        }
        else 
        {
            hra = ( 35 / 100 ) * bs ; 
            da = ( 25 / 100 ) * bs ;
            ta = ( 15 / 100 ) * bs ; 
            pf = ( 10 * bs ) / 100  ; 
        }
        gross = bs + hra + da + ta ;
        net = gross - pf ;  
        System.out.println("Gross value : "+gross );
        System.out.println("Net value : "+net );
    }
}*/
/*{
     Income- tax on the basic of Anual salary 
    Anual Salary                                   Tax 
    upto 1000                                      0                      
    100001 to 150000                      10% of exceeded amount
    150001 to 250000                      20% of the exceeded amount + 5000 
    more than 250000                      30% of exceded amount + 25000 
    public static void main(String [] args )
    {
        int an , tax ; 
        System.out.println("Enter the Anual Salary is : ");
        Scanner sc = new Scanner(System.in);
        an = sc.nextInt();
        if ( an < 100000 )
        {
            tax = 0 ;
        }
        else if ( an > 100001 && an <= 150000)
        {
            tax = ( an - 100000 )* 10 / 100 ; 
        }
        else if ( an > 150001 && an <= 250000)
        {
            tax = ( an - 15000 ) * 20 / 100  + 5000 ;
        }
        else
        {
            tax = (an - 250000 ) * 30 / 100  + 25000 ;
        }
        System.out.println("Tax : "+tax);
       
    }
}*/
/*{
     Write a program to enter the shoping amount , then amount the following discount , according , then amount the following discount , according to the given condition . 
    Amount                  Discount                Gifts 
    upto 5000                   5%                  Toys 
    5001 to 10000              10%                  Bicycle
    10001 to 20000             15%                  Phone
    mare than 20000            20%                  laptop 
    public static void main(String[] args )
    {
        int amount , discount ; 
        System.out.println("Enter the amount is : ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        if ( amount < 5000 )
        {
            discount = amount * 5 / 100 ; 
            amount = amount - discount ; 
            System.out.println("Gift name is Toys (Discount of the Amount is ): " +amount );
        }
        else if( amount > 5000 && amount < 10000 )
        {
            discount = amount * 10 / 100 ; 
            amount = amount - discount ; 
            System.out.println("Gift name is Bicycle (Discount of the Amount is ) : "+amount );
        }
        else if ( amount > 10000 && amount < 20000 )
        {
            discount = amount * 15 / 100 ; 
            amount = amount - discount ; 
            System.out.println("Gift name is Phone (Discount of the Amount is ) : "+amount);
        }
        else
        {
            discount = amount * 20 / 100 ; 
            amount = amount - discount ; 
            System.out.println("Gift name is Laptop (Discount of the Amount is ) : "+amount );
        }
    }
}*/
/*{ 
    // A shopkeeper offers 10% discount on the printed price of a digital Camera / However a customer has to pay 6% sales tax on the remaining amount to be paid by the customer , taking printed price . 
    public static void main(String[] args )
    {
        Float amount , discount , sales_tax ; 
        System.out.println("Enter the shopping Amount of Camera ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextFloat();
        discount = amount * 10 / 100 ;
        amount = amount - discount ; 
        sales_tax = amount + (amount * 6 / 100) ; 
        System.out.println("Sales Tax : "+sales_tax);
    }
}*/
/*{
    /*Write to prepare the electricity bill according to the given terrif . 
    Unit                                 Charges
    upto 100 unit                         1.50 paise 
    101 to 200 units                      2 rupee / unit 
    more than 200/ units                  3 / units 
    Additiory every consumer have to pay rupes 180 for service to charge . 
    public static void main(String [] args )
    {
        float unit , charge , total_charge ; 
        System.out.println("Enter the Electricity bill pay is : ");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        if ( unit < 100 )
        {
            charge = (unit * 1.50f) ; 
        }
        else if ( unit > 100 && unit < 200 )
        {
            charge = ( unit - 100 ) * 2 ; 
        }
        else
        {
            charge = ( unit - 200 ) * 3 ; 
        }
        total_charge = charge + 180 ;
        System.out.println("Unit of the Charge is : "+charge);
        System.out.println("Totol Amount of the Charges : "+total_charge);
    }
}*/                             // same Question 
/*{
    /* Write a program to input electricity charge and calculate total electricity bill according to the given condiotion for
    1.)for 1st 50 units rs- 0.50 units rs - 0.50 / units .
    2.)for the next 100 units rs-0.75/unit 
    3.)for the next 150 units rs-1.20/unit charge
    4.)for unit above 250 rs-1.50/unit
    5.)an additional sur charge of 20% is added to the bill.
    note:-suppose user inputed 175 electricity units.
    public static void main(String [] args )
    {
        float unit , charge , sur_charge; 
        System.out.println("Enter the pay of the bill is : ");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextInt();
        if ( unit <= 50 )
        {
            charge = unit * 0.50f  ; 
        }
        else if ( unit <= 100 )
        {
            charge = (unit - 50 ) * 0.75f ; 
        }
        else if ( unit <= 150 )
        {
            charge = ( unit - 100 )* 1.20f ; 
        }
        else
        {
            charge = ( unit - 150 )* 1.50f ; 
        }

        sur_charge = charge + 0.20f ; 
        System.out.println("total Amount of the bill is : "+ sur_charge );
    }
}
// without using if-else 2nd Method 
{
    public static void main(String [] args )
    {
        float unit , charges , sur_charges ; 
        System.out.println("Enter pay the bill : ");
        Scanner sc = new Scanner(System.in);
        unit = sc.nextFloat();
        charges = unit * 0.50f; 
        charges = (unit - 50) * 0.75f ; 
        charges = (unit - 100 )*1.20f ; 
        charges = (unit - 150 )*1.50f ;
        sur_charges = charges + 0.20f ; 
        System.out.println("Total Amount of the bill is : "+sur_charges );
    }
}*/                             // small Project 
/*{
    public static void main(String [] args )
    {
        System.out.println("Hello sir !! ");
        System.out.println("Do you want buy a Car ");
        System.out.println("Yes or no ");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        String ans1 = ans.toLowerCase();
        if ( ans1.equals("yes"))
        {
            System.out.println("What is your favourite colour between in Red , blue , Green , Black ");
            String ans11 = sc.nextLine();
            String ans12 = ans11.toLowerCase();
            if ( ans12.equals("red"))
            {
                System.out.println("We have it in stock would you like to see it ");
                System.out.println("Yes or no ");
                String ans13 = sc.nextLine();
                String ans14 = ans13.toLowerCase();
                if ( ans14.equals("yes"))
                {
                    System.out.println("Lets go and check for a car ");
                }
                else 
                {
                    System.out.println("Fine !! Lets go for other option ");
                }
            }
            else if ( ans12.equals("blue"))
            {
                System.out.println("Do you want to see blue car ");
                System.out.println("Yes or no ");
                String ans15 = sc.nextLine();
                String ans16 = ans15.toLowerCase();
                if ( ans16.equals("yes"))
                {
                    System.out.println("We booked your car . Thanku for visiting again ");
                }
                else 
                {
                    System.out.println("NO Worries !! lets go for other option ");
                }
            }
            else if ( ans12.equals("green"))
            {
                System.out.println("Do you want to see Green Car ");
                System.out.println("Yes or No");
                String ans17 = sc.nextLine();
                String ans18 = ans17.toLowerCase();
                if ( ans18.equals("yes"))
                {
                    System.out.println("Soryy Sir !! This Car is already booking before ");
                }
                else 
                {
                    System.out.println("Don't Worry Sir !! We have so many colour in stock , lets go and check for a car ");
                }
            }
            else if ( ans12.equals("black"))
            {
                System.out.println("Do you want to see Black colour Car ");
                System.out.println("Yes or No");
                String ans19 = sc.nextLine();
                String ans20 = ans19.toLowerCase();
                if ( ans20.equals("yes"))
                {
                    System.out.println("Sorry Sir !! Option Unavailable ");
                }
                else 
                {
                    System.out.println("Invalid Option");
                }
            }
        }
        else 
            {
                System.out.println("No Worries We have so , so many Costumers , So fuck off ");
            }
    }
}*/             // 2nd project                // Banking
/*{
    public static void main(String [] args )
    {
        long  n , balance ; 
        System.out.println("Hello sir !! ");
        System.out.println("Welcome to my new Java Bank ");
        System.out.println("Choose the number what number you want ");
        System.out.println("1. Money deposit ");
        System.out.println("2. Money transfer ");
        System.out.println("3. Money Withdraw ");
        System.out.println("4. Exit ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        System.out.println(" Check the previous balance :");
        balance = sc.nextInt();
        if ( n == 1 )
        {
            long deposit ;
            System.out.println("How much you want money deposit in the bank : ");
            deposit = sc.nextLong();
            if ( deposit <= 40000)
            { 
                System.out.println("Your Before balance : "+balance );
                System.out.println("Your Total  Current Balance : "+(deposit + balance ));
            }
            else 
            {
                System.out.println("Your Before Balance : "+balance );
                System.out.println("Your Total Current Balance : "+( balance + 40000 ));
                System.out.println("You don't have deposit money above 40000 Rupees ");
                System.out.println("Please!! visit it Tomorrow ");
                System.out.println("Your remaining money : "+(deposit - 40000));
            }
            
        }
        else if ( n == 2 )
        {
            System.out.println("How much money you transfer in other account : ");
            long transfer = sc.nextLong();
            if ( balance > transfer )
            {
                System.out.println("Your Money Transfer is : "+(balance - transfer));
            }
            else 
            {
                System.out.println("Sorry!! There is no enough balance in your account ");
                System.out.println("You don't transfer money in another account ");
            }
        }
        else if ( n == 3 )
        {
            System.out.println("How much money you witdraw in your account : ");
            long withdraw = sc.nextLong();
            if ( withdraw < balance )
            {
                System.out.println("Your withdraw successfull!! ");
                System.out.println("your Remaining money : "+(balance - withdraw));
            }
            else 
            {
                System.out.println("There is no enough balance in your current account : ");
                System.out.println("you don't get to it money ");
            }
        }
        else 
        {
            System.out.println("Thankuu Visiting again !! ");
        }
    }
}*/
                                     // Switch Case 
/*{
    // Write a program to enter the number then display the day of the week using switch case . 
    public static void main(String[] args )
    {
        int n ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Monday");
                     break ; 
            case 2 : System.out.println("Tuesday");
                     break ;
            case 3 : System.out.println("Wednesday");
                    break; 
            case 4 : System.out.println("Thursday");
                     break ;
            case 5 : System.out.println("Friday");
                     break ;
            case 6 : System.out.println("Saturday");
                     break ;
            case 7 : System.out.println("Sunday");
                     break; 
            default : System.out.println("Invalid Weeks ");
                     break ; 
        }
    }
}*/
/*{
    // Write a program to enter the number then display all the colours of spectrum . Eq : VIBGYOR 
    public static void main(String [] args )
    {
        int n ; 
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Violet");
                     break ; 
            case 2 : System.out.println("Indigo");
                     break ; 
            case 3 : System.out.println("Blue");
                     break ; 
            case 4 : System.out.println("Green");
                     break ; 
            case 5 : System.out.println("Yellow");
                     break ; 
            case 6 : System.out.println("Orange");
                     break ; 
            case 7 : System.out.println("Red");
                     break ; 
            default : System.out.println("Invalid colour");
                      break ; 
        }
    }
}*/
/*{
    //Write a program to enter a character then check the character is vowel or not a vowel . 
    public static void main(String[] args )
    {
        String ch ; 
        System.out.println("Enter any character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next();
        switch(ch)
        {
            case "a" : System.out.println("vowel a ");
                       break ; 
            case "e" : System.out.println("vowel e ");
                       break ; 
            case "i" : System.out.println("vowel i ");
                       break ; 
            case "o" : System.out.println("vowel o ");
                       break ; 
            case "u" : System.out.println("vowel u ");
                       break ; 
            default : System.out.println("Invalid Vowel");
                       break ; 
        }
    }
}*/
/*{
    // Write a program to create a menu driven program to find the area of circle , rectangle and Square . 
    public static void main(String[] args )
    {
        int n ; 
        float r , a , l , b , s ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area of circle ");
        System.out.println("2.Area of rectangle ");
        System.out.println("3.Area of square ");
        System.out.println("Enter the choice any number : ");
        n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Enter the radius ");
                     r = sc.nextFloat();
                     a = 3.14f * r * r ; 
                     System.out.println("Area of circle : "+a );
                     break ; 
            case 2 : System.out.println("Enter the length and breadth : ");
                     l = sc.nextInt();
                     b = sc.nextInt();
                     System.out.println("Area of rectangle : "+(l*b) );
                     break ; 
            case 3 : System.out.println("Enter the side : ");
                     s = sc.nextInt();
                     a = s * s ; 
                     System.out.println("Area of square : "+a);
                     break ; 
            case 4 : System.out.println("Invalid Choice ");
                     break ; 
        }
    }
}*/
/*                                // Switch Case 
   {
    public static void main(String[] args) {
        System.out.println("Hello!! ");
        System.out.println("Welcome back to my New Java Bank ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender is : ");
        String gender = sc.nextLine();
        String gender1 = gender.toLowerCase();
        if (gender1.equals("male")) 
        {
            System.out.println("Name (Male): ");
            String name = sc.nextLine();
            System.out.println("Age : ");
            long age = sc.nextInt();
            if (age >= 18) 
            {
                System.out.println("Date of Birth : ");
                char date = sc.next().charAt(0);
                System.out.println("Account Number (A/c) : ");
                long account_number = sc.nextLong();
                System.out.println("Email-id : ");
                char email = sc.next().charAt(0);
                System.out.println("Your sign-in is successfull !! ");
            } 
            else 
            {
                System.out.println("Sorry Sir!! you don't fill this form because you are not under 18 years");
            }
        } 
        else 
        {
            System.out.println("Name (Female): ");
            String name = sc.nextLine();
            System.out.println("Age : ");
            int age = sc.nextInt();
            if (age >= 18)
            {
                System.out.println("Date of Birth : ");
                char date = sc.next().charAt(0);
                System.out.println("Account Number (A/c) : ");
                long account_number = sc.nextLong();
                System.out.println("Email-id : ");
                char email = sc.next().charAt(0);
                System.out.println("Your sign-in is successfull !! ");
            }
            else 
            {
                System.out.println("Sorry Maam !! you don't fill this form because you are not under 18 years");
            }
        }
        int n ;
        System.out.println("1.sign-up");
        System.out.println("2.Check the balance ");
        System.out.println("3.Money deposit");
        System.out.println("4.Money Transfer ");
        System.out.println("5.Money Withdraw");
        System.out.println("6.Exit");
        System.out.println("Choose any number between 1-6 ");
        n = sc.nextInt();
        switch(n)
        {
            case 1 : System.out.println("Enter the User-id : ");
                    char user_id = sc.next().charAt(0);
                     System.out.println("a part for 'password' and b part for 'pin' " );
                     System.out.println("Choose any one character : ");
                     char id = sc.next().charAt(0);
                    switch(id)
                    {
                        case 'a' : System.out.println("Enter the Password : ");
                                          char password = sc.next().charAt(0);
                                          break; 
                        case 'b' : System.out.println("Enter the Pin : ");
                                     long pin = sc.nextLong();
                                     break ; 
                    }
                    break ;

                        case 2 : System.out.println("Check the balance : ");
                                 float money = sc.nextFloat();
                                 System.out.println("Your Current Balance is : "+money );
                                 break ;

                        case 3 : System.out.println("Your previous balance : ");
                                 float balance = sc.nextFloat();
                                 System.out.println("How much money you deposit in your account");
                                 int deposit = sc.nextInt();
                                 if ( deposit <= 40000)
                                 { 
                                    System.out.println("Your Before balance : "+balance );
                                    System.out.println("Your Total  Current Balance : "+(deposit + balance ));
                                 }
                                 else 
                                {
                                    System.out.println("Your Before Balance : "+balance );
                                    System.out.println("Your Total Current Balance : "+( balance + 40000 ));
                                    System.out.println("You don't have deposit money above 40000 Rupees ");
                                    System.out.println("Please!! visit it Tomorrow ");
                                    System.out.println("Your remaining money : "+(deposit - 40000));
                                }
                                break ;  

                        case 4 : System.out.println("Your Previous Balance is : ");
                                 float balance1 = sc.nextFloat();
                                 System.out.println("How much money you transfer in other account : ");
                                 long transfer = sc.nextLong();
                                 if ( balance1 > transfer )
                                 {
                                    System.out.println("Your Money Transfer is : "+(balance1 - transfer));
                                 }
                                 else 
                                 {
                                    System.out.println("Sorry!! There is no enough balance in your account ");
                                    System.out.println("You don't transfer money in another account ");
                                 }
                                 break ;  
                                  
                        case 5 : System.out.println("Your Previous Balance : ");
                                 float balance2 = sc.nextFloat();
                                 System.out.println("How much money you witdraw in your account : ");
                                 long withdraw = sc.nextLong();
                                 if ( withdraw < balance2 )
                                 {
                                    System.out.println("Your withdraw successfull!! ");
                                    System.out.println("your Remaining money : "+(balance2 - withdraw));
                                 }
                                 else 
                                 {
                                    System.out.println("There is no enough balance in your current account : ");
                                    System.out.println("you don't get to it money ");
                                 }
                                 break ; 
                        default : System.out.println("Exit");
                                  break ; 
        }
    }
}*/ 
//                                      // Looping( loops )
//Write a program to generate natural number upto n . 
/*{
    public static void main(String [] args )
    {
        int n ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( int i = 1 ; i <= n ; i ++ )
        {
            System.out.println("Natural number : "+i); 
        }
    }
}
// 2nd Method 
{
    public static void main(String [] args )
    {
        int i = 1 , n ; 
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (i <= n )
        {
            System.out.println("Natural number : "+i);
            i++ ; 
        }
    }
}
// 3 rd Method 
{
    public static void main(String [] args )
    {
        int n , i = 1 ; 
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do 
        {
            System.out.println("Natural Number : "+i);
            i++ ;
        }
        while(i <= n ); 
    }
}*/
/*{
    // Write a program to enter a number then check whether it is one digit , 2 digit , 3 digit or more than 3 digit number
    public static void main(String [] args )
    {
        int n ; 
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if ( n >= -9 && n <= 9 )
        {
            System.out.println(n+"number is one digit ");
        }
        else if ( n >= -99 && n <= 99 )
        {
            System.out.println(n+"number is two digit");
        }
        else 
        {
            System.out.println(n+"number is three digit ");
        }
    }
}*/
/*{
    // Write a program to find the sum of the natural number upto n . 
    public static void main(String[] args )
    {
        int i , sum = 0 , n ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( i = 1 ; i <= n ; i ++ )
        {
            sum = sum + i ; 
        }
        System.out.println("The sum of the natural number is : "+sum );
    }
}
{
    // 2nd Method 
    public static void main(String [] args )
    {
        int i = 1 , sum = 0 , n ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while ( i <= n )
        {
            sum = sum + i ; 
            i ++ ; 
        }
        System.out.println("The sum of the natural number is : "+sum );
    }
}
{
    // 3rd Method 
    public static void main(String [] args )
    {
        int i = 1 , n , s = 0 ; 
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        do
        {
            s = s + i ; 
            System.out.println("Sum of the Natural number : "+s );
            i ++ ; 
        }
        
        while(i <= n );
    }
}*/
/*{
    // Write a program to find the sum of even and odd number seperately . 
   public static void main(String [] args )
   {
       int n , even_sum = 0 , odd_sum = 0  ; 
       System.out.println("Enter the number : ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for ( int i = 1 ; i <= n ; i ++ )
       {
           if ( i % 2 == 0 )
           {
              even_sum =even_sum + i ; 
           }
           else 
           {
               odd_sum = odd_sum + i ; 
           }
       }
       System.out.println("Even sum of the number : "+even_sum );
       System.out.println("odd number of the sum  : "+odd_sum );
       System.out.println("sum of all even number and odd number of the sum is : "+(even_sum + odd_sum ));
   }
}*/
/*{
    // Write a program to enter a number the print the table of the number . 
    public static void main(String [] args )
    {
        int i , n , t ; 
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( i = 1 ; i <= 10 ; i ++ )
        {
            t = n * i ; 
            System.out.println("Table of the number"+n+" is : "+t );
        }

    }
}
{ // 2nd Method 
    public static void main(String [] args )
    {
        int i , n ; 
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( i = 1 ; i <= 10 ; i ++ )
        {
            System.out.println("Table of : "+ n +" * "+ i +" = "+ n * i );
        }

    }
}*/
/*{
    // Write a program to enter the number then find the factorial of the number .
    // 5! = 1 * 2 * 3 * 4 * 5 = 120 
    public static void main(String[] args )
    {
        int n , f = 1 ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( int i = 1 ; i <= n ; i ++ )
        {
            f = f * i ; 
        }
        System.out.println("Factorial of the number "+n +" is : "+f );
    }
}*/
/*{
    // Write a program  to enter a number then find the factors of the number (excluded the number itself . ).
    public static void main(String[] args )
    {
       int n , f ; 
       System.out.println("Enter the number is : ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for ( int i = 1 ; i <= n ; i ++ )
       {
            if ( n % i == 0 )
            {
                System.out.println("Factors of "+n+" is : "+i);
            }
       }
       
    }
}*/
/*
{
    // Write a program to enter the number then check the number is prime number or not . 
    public static void main(String [] args )
    {
        int n , i , k = 0 ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( i = 1 ; i <= n ; i ++ )
        {
            if ( n % i == 0 )
            {
                k ++ ; 
            }    
        }
            if( k == 2 )
            {
                System.out.println(n+" is a prime number ");
            }
            else 
            {
                System.out.println(n+" is not a prime number ");
            }
    }
}*/
/*{
    // Write a program to enter the number then check the number is perfect number or not . 
    //eq -: 6 = 1,2,3 = 1 + 2 + 3 = 6.
    public static void main(String [] args )
    {
       int n , sum = 0 ; 
       System.out.println("Enter any number is : ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for ( int i = 1 ; i < n ; i ++ )
       {
            if ( n % i == 0 )
            {
                sum = sum + i ; 
            }
       }
       if ( sum == n )
       {
           System.out.println(n+" is a perfect number ");
       }
       else 
       {
           System.out.println(n+" is not a perfect number ");
       }
    }
}*/
/*{
    // Write a program to enter a number then find the sum of all the digit of the number . 
    // eq :- 1234 =  1 + 2 + 3 + 4 = 10 
    public static void main(String [] args )
    {
        int n , r , s = 0 ; 
        System.out.println("Enter the digit of the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while ( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ;
            s = s + r ; 
        }
        System.out.println("Sum of all the digit of the number is : "+s );
    }
}*/
/*{
    // Reverse digit 
    public static void main(String [] args )
    {
        int n , r , s = 0  ; 
        System.out.println("Enter the digit of the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ;
            s = s * 10  + r ; 
        }
        System.out.println("Reverse of the number is : "+s );
    }
}*/
/*{
    // Write a program to enter a number then check the number is pallindrome or not . 
    //eq :-  121 , 111 , 101 , 202 , 555  =  121 , 111 , 101 , 202 , 555;
    public static void main(String[] args )
    {
        int n , r , s = 0 , p ;
        System.out.println("Enter the digit of the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = n ; 
        while ( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ; 
            s = s * 10 + r ; 
        }
        if ( p == s )
        {
            System.out.println("Pallindrome number ");
        }
        else 
        {
            System.out.println("Not Pallindrome number ");
        }
    }
}*/
/*{
    // Write a program to enter a number then check teh number is Armstrong . 
    // eq :- 153 = 1^3 + 5^3 + 3^3 
    public static void main(String [] args )
    {
        int arm , n , r , s = 0 ; 
        System.out.println("Enter the digit of the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arm = n ; 
        while ( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ; 
            s = s + r * r * r ; 
        }
        if ( arm == s )
        {
            System.out.println(arm+" is an armstrong number ");
        }
        else
        {
            System.out.println(arm+"is not an armstrong number ");
        }

    }
}*/
/*{
    // Write a program to enter a number then check the number is neon number or not . 
    //eq -:  9 = 81 = 8 + 1 = 9 ;
    public static void main(String [] args )
    {
        int n , ne , r , s = 0 ; 
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ne = n * n ; 
        while ( ne > 0 )
        {
            r = ne % 10 ; 
            ne = ne / 10 ; 
            s = s + r ; 
        }
        if ( s == n )
        {
            System.out.println(n+" is a neon number ");
        }
        else 
        {
            System.out.println(n+" is not a neon number ");
        }
    }
}*/
/*{
    // Write a program to enter the number then find the largest digit of number . 
    // eq :- 385 ---> 8 digit is the largest number .
    public static void main(String [] args )
    {
        int n , max = 0 , r ; 
        System.out.println("Enter the digit of the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ;
            if ( max < r )
            {
                max = r ; 
            }
        }
        System.out.println("Largest digit of the number is : "+max );
    }
}*/
/*{
    // Write a program to enter the number then find the Smallest digit of number . 
    // eq :- 385 ---> 8 digit is the largest number .
    public static void main(String [] args )
    {
        int n , min = 9 , r ; 
        System.out.println("Enter the digit of the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while( n > 0 )
        {
            r = n % 10 ; 
            n = n / 10 ;
            if ( min > r )
            {
                min = r ; 
            }
        }
        System.out.println("Largest digit of the number is : "+min );
    }
}*/
/*{
    // Write a program to enter a number then number H.C.F . 
    public static void main(String[] args )
    {
        int n1 , n2 , h = 0 ; 
        System.out.println("Enter the two number is : ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for ( int i = 1 ; i <= n1 ; i ++ )
        {
            if ( n1 % i == 0 && n2 % i == 0 )
                h = i ; 
        }
        System.out.println("H.C.F : "+h );
    }
}*/
/*{
    // Write a program to enter the number then print the number L.C.M .
    public static void main(String [] args )
    {
        int a , b , h = 0 , l = 0 ; 
        System.out.println("Enter the two number is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for ( int i = 1 ; i <= a ; i ++ )
        {
            if ( a % i == 0 && b % i == 0 )
            {
                h = i ; 
                l = ( a * b ) / h ;
            }
        }
        System.out.println("L.C.M is : "+l );
    }
}*/
/*{
    //Write a program to generate the febonicca series upto terms .
    // eq : 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 .
    public static void main(String [] args )
        {
            int a = 0 , b = 0 , c = 1 ; 
            for ( int i = 1 ; i <= 10 ; i ++ )
            {
                System.out.println("Febonicca series is : "+c );
                a = b  ; 
                b = c ; 
                c = a + b ; 
            }
            
            
        }
}*/
//-----------------------------------------------------------NESTED LOOPING------------------------------------------------------------
/*                                1
                                1 2 1 
                              1 2 3 2 1 
                            1 2 3 4 3 2 1 
                          1 2 3 4 5 4 3 2 1
*/
/*{
    public static void main(String[] args )
    {
        int i , j , k , p ; 
        for ( i = 1 ;  i <= 5 ; i ++ )
        {
            for ( j = i ; j <= 5 ; j ++ )
            {
                System.out.print(" ");
            }
            for ( k = 1 ; k <= i ; k ++ )
            {
                System.out.print(""+k);
            }
            for ( p = i - 1 ; p >= 1 ; p -- )
            {
                System.out.print(""+p );
            }
            System.out.print("\n");
        }
    }
}*/
/*                        1 2 3 4 5 4 3 2 1 
                            1 2 3 4 3 2 1 
                              1 2 3 2 1 
                                1 2 1 
                                  1 
                                  
{
    public static void main(String[] args )
    {
        int i , j , k , p ; 
        for ( i = 5 ; i >= 1 ; i -- )
        {
            for ( j = i ; j < 5 ; j ++ )
            {
                System.out.print(" ");
            }
            for ( k = 1 ; k <= i ; k ++ )
            {
                System.out.print(""+k);
            }
            for ( p = i - 1 ; p >= 1 ; p -- )
            {
                System.out.print(""+p);
            }
            System.out.print("\n");
        }
    }
}*/
/*               1
               1 2 1 
             1 2 3 2 1 
           1 2 3 4 3 2 1 
         1 2 3 4 5 4 3 2 1 
           1 2 3 4 3 2 1 
             1 2 3 2 1 
               1 2 1 
                 1 
{
    public static void main(String[] args )
    {
        int i , j , k , p ; 
        for ( i = 1 ; i <= 5 ; i ++ )
            {
                for ( j = i ; j <= 4 ; j ++ )
                {
                    System.out.print(" ");
                }
                for ( k = 1 ; k <= i ; k ++ )
                {
                   System.out.print(""+k);
                }
                for ( p = i - 1 ; p >= 1 ; p -- )
                {
                   System.out.print(""+p);
                }
                System.out.print("\n");
            }
            for ( i = 4 ; i >= 1 ; i -- )
            {
                for ( j = i ; j <= 4 ; j ++ )
                {
                    System.out.print(" ");
                }
                for ( k = 1 ; k <= i ; k ++ )
                {
                    System.out.print(""+k );
                }
                for ( p = i - 1 ; p >= 1 ; p -- )
                { 
                   System.out.print(""+p);
                }
                System.out.print("\n"); 
            }
    }
}*/
    // Write a program to print alphabet pattern 
       /*
             * * * * 
           *         *
           *         *
           *         *
           * * * * * *
           *         *
           *         *
           *         *
           *         *

{
    public static void main(String[] args )
    {
        int n ; 
        int row  , coll ;
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( row = 0 ; row <=n ; row ++ )
        {
            for ( coll = 0 ; coll <=n/2 ; coll ++ )
            {
                if ((( coll == 0 || coll == n/2 ) && row != 0  ) || 
                ( row == 0 && coll != 0 && coll != n / 2 ) || row == n/2 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
/*{
               
              * * * * 
              *       *
              *       *
              * * * * 
              *       * 
              *       *
              * * * *

public static void main(String[ ] args )
{
    int i , j , width , height ;
    System.out.println("Enter the height of the alphabet words is : ");
    Scanner sc = new Scanner(System.in );
    height = sc.nextInt();
    width = height - 2 ; 
    for ( i = 0 ; i < height ; i ++ )
    {
        System.out.print("*");
        for ( j = 0 ; j < width ; j ++ )
        {
            if ( ( i == 0 || i == height/2 || i == height- 1 ) && j < width - 1 ) 
            {
                System.out.print("*");
            }
            else if (( j == width - 1 ) &&! ( i == 0 ||  i == height/ 2 || i == height - 1 ))
            {
                System.out.print("*");
            }
            else 
            {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
   
}

}*
{
    public static void main(String [] args )
    {
        int i , j , height , width ; 
        System.out.println("Enter the heigth of the length is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = height - 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < width ; j ++ )
            {
                if (( i == 0 || i == height - 1 ) || j == 0 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print("");
                }
            }
            System.out.print("\n");
        }
    }
}*/ 
/*{
               ******  
               *       *
               *       *
               *       *
               *       *
               ******   
    public static void main(String[] args )
    {
        int i , j , height , width ; 
        System.out.print("Enter the height of the number is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = height + 1; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < width ; j ++ )
            {
                if ( ( i == 0 || i == height - 1 || j == 0 ) && ( j < width - 2 ) )
                {
                    System.out.print("*");
                }
                else if ( ( j == width - 1 ) &&! ( i == 0 || i == height - 1 ) )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        
    }
}
*/
/*{
     
       * * * 
       *
       *
       * * * 
       * 
       * 
       * * * 
    public static void main(String[] args )
    {
        int i , j , height , width ; 
        System.out.println("Enter the height is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = ( height  / 2 )    ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height / 2   ; j ++ )
            {
                if ( ( i == 0 || i == height/2  || i == height - 1 || j == 0 ) && ( j < width ) ) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.println(" ");
                }
                
             }
             System.out.print("\n");
        
       }
    }
}*/
/*{
     
                 * * * 
                 *
                 *  
                 * * *
                 *
                 * 
                 * 
                 * 
    
    public static void main(String[] args )
    {
        int i , j , height , width ; 
        System.out.print("Enter the height is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        width = height / 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < width ; j ++ )
            {
                if ( ( ( i == 0 ||  i == height / 2 || j == 0 ) && ( j < width ) )) 
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
    /* 
                     * * * *  
                     * 
                     * 
                     *   * * *
                     *     *
                     *     *
                     * * * *  
                     
    

{
    public static void main(String [] args )
    {
        int i , j , height , half , half2 ; 
        System.out.println("Enter the height : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ;
        half2 = half / 2 ;  
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height ; j ++ )
            {
                if ( ( ( j == 0 && i != 0 ) && i < height - 1) || ( ( i == 0 && j != 0 )&& j <=half ) || ( ( i == height - 1 && j != 0 ) && j <= half ) || ( i == half && j == half ) || ( ( i == half && j > half2 ) && j < half ) || ( ( i == half && j > half ) && j != height - 1 ) || (i != 0 && j == half ) && i >= half + 1 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
/*
{
       *     *
       *     *
       * * * * 
       *     * 
       *     * 
    public static void main(String[] args )
    {
        int i , j , height , half ;
        System.out.println("Enter the height is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height ; j ++ )
            {
                if ( ( j == 0 || j == height - 1 ) || i == half )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}*/
/*{
    * * * * * * * 
          * 
          *
          * 
          *
    * * * * * * * 
    public static void main(String [] args )
    {
        int i , j , height , half ; 
        System.out.print("Enter the Height : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ;
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height ; j ++ )
            {
                if( ( i == 0 || i == height - 1 || j == half ) )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/ 
/*{
     
     * * * * * * * * * * 
             *
             * 
             * 
             * 
             * 
         *   * 
         * * *
    public static void main(String [] args )
    {
        int i , j , height , half , half2 ; 
        System.out.println("Enter the height of the number is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ;
        half2 = half / 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height ; j ++ )
            {
                if ( ( i == 0 || j == half ) || ( ( i != 0 && j == half2) && i > half + 1 ) || ( ( i == height - 1 && j != 0 ) && j <  half ) )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
/*{
     
           * * * * 
         *         *
         *         *
         *         *
         *         *
         *         *
         *         *
         *         *
         *         *
           * * * *  
    public static void main(String[] args )
    {
        int i , j , height , half ; 
        System.out.println("Enter the height is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ;
        for ( i = 0 ; i <= height ; i ++ )
        {
            for ( j = 0 ; j <= half ; j ++ )
            {
                if ( ( ( i != 0 && j == 0 ) && i < height - 1) || ( ( j == half && i != 0 ) && i < height - 1 ) || ( ( i == 0 && j != 0 ) && j < half ) || (( i == height - 1 && j != 0 )&& j < half )) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    } 
}*/
/*{
               * * * * *  
               *         *
               *         *
               *         *
               *         *
               * * * * * 
               * 
               * 
               * 
               * 
               * 
               * 
               * 
    public static void main(String [] args )
    {
        int i , j , height , half ; 
        System.out.println("Enter the height is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < half ; j ++ )
            {
                if ( ( ( i == 0 || j == 0 ) && j < half )|| ( ( i == 0 || j == 0 )&& j < half ) || (( i == half - 1 || j == 0 ) && j < half - 1 ) || ( ( j == half - 1 )&& i < half ) || ( i == 0 && j == half - 2 ) && j < half - 1 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
                            
/*{                   
                   * * * * 
                 *         * 
                 *          * 
                 * 
                 * 
                   *         
                     * 
                       *
                         *
                           * 
                 *          * 
                   * * * * *   

                 // n = 8 
    public static void main(String[] args )
    {
        int i , j , height , half , half2 ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in );
        height = sc.nextInt();
        half = height / 2 ; 
        half2 = half / 2 ;
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < half ; j ++ )
            {
                if ( ( ( i == 0 && j != 0 ) && j <= half - 2 ) || ( ( i == height - 1 && j != 0 )&& j < half ) || ( ( j == 0 && i != 0 ) && i < half ) || (i == height - 2 && j == half - 1 ) || ( j == 0 && i == height - 2 ) || ( ( i != 0 && j == half - 1 ) && i < half2 ) ||(  i == half && j == half - 3 ) || ( i == height - 3 && j == half2 ) && i > half )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
/*{
    *           *
    *           *
    *           *
    *           *
    *           *
    *           *
    *           *
      * * * * *
    
    public static void main(String [] args )
    {
        int i , j , height , half ; 
        System.out.println("Enter the height of the number : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j <= half ; j ++ )
            {
                if ( ( ( j == 0 || j == half )&& i < height - 1 ) || ( i == height - 1  && j != 0 ) && j < half  )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}*/
/*{
  
    * * * *  
    * 
    * 
    *   * * *
    *     *
    *     *
    * * * *  

    public static void main(String [] args )
    {
        int i , j , height , half , half2 ; 
        System.out.println("Enter the height : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ;
        half2 = half / 2 ;  
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height ; j ++ )
            {
                if ( ( ( j == 0 && i != 0 ) && i < height - 1) || ( ( i == 0 && j != 0 )&& j <=half ) || ( ( i == height - 1 && j != 0 ) && j <= half ) || ( i == half && j == half ) || ( ( i == half && j > half2 ) && j < half ) || ( ( i == half && j > half ) && j != height - 1 ) || (i != 0 && j == half ) && i >= half + 1 )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/
/*
         * * * * 
       *
       * 
         * * * * 
                 *
                 *
         * * * * 
{
    public static void main(String [] args )
    {
        int i , j , height , half ;
        System.out.println("Enter the height of the number is : ");
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        half = height / 2 ; 
        for ( i = 0 ; i < height ; i ++ )
        {
            for ( j = 0 ; j < height ; j ++ )
            {
                if ((( i == 0 && j != 0 ) && j <= half ) || (( i != 0 && j == 0 ) && i < half ) || ( ( i == half && j != 0 ) && j <= half ) || ( ( i == height - 1 && j != 0 ) && j <= half ) || ( ( ( i > half && j == half + 1 ) && i > half ) && i < height - 1 ) )
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}*/ 
/*{     
    * * * * 
  *         *
  *         *
  *         *
  *         *
  *         *
  *         *
  *         *
  * *       *
    * * * * 
        * 

  public static void main(String [] args )
  {
      int i , j , half , height , half2 ; 
      System.out.println("Enter the height of the number : ");
      Scanner sc = new Scanner(System.in);
      height = sc.nextInt();
      half = height / 2 ; 
      half2 = half / 2 ;
      for ( i = 0 ; i <= height ; i ++ )
      {
          for ( j = 0 ; j <= half ; j ++ )
          {
            if ( ( ( i != 0 && j == 0 ) && i < height - 1) || ( ( j == half && i != 0 ) && i < height - 1 ) || ( ( i == 0 && j != 0 ) && j < half ) || (( i == height - 1 && j != 0 )&& j < half ) || ( i == height - 2 && j == 1 ) ||( i == height && j == half - 1 ) || ( i == height - 1 && j == half - 1 ) )
              {
                  System.out.print("*");
              }
              else 
              {
                  System.out.print(" ");
              }
          }
          System.out.print("\n");
      }
  }
}
*/
//----------------------------------------------Small project------------------------------------------------------- 
/*{
    Write a program to generate random number and ask the user to guess what the number is if the user gues is higher then random number it will display too hight try again and it will say too low try again if the value input is low . the program should use a loop that repeats untill the user correctly guess the number . 
    public static void main(String [] args )
    {
        int n , i = 0 , guess ; 
        //System.out.pirntln("Computer already choose the number : ");
        Random r = new Random() ; 
        n = r.nextInt(100)+1 ; 
        System.out.println("  ----------------     Guess my number    ----------------------    ");
        do 
        {
            System.out.println("Enter the number between 0 to n : ");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            i ++ ; 
            if ( guess > n )
            {
                System.out.println("Your Guess is too high and do try again ");
            }
            else if ( guess < n )
            {
                System.out.println("Your Guess is too low and do try again ");
            }
            else 
            {
                System.out.println("Your Guess is correct !! and your number is :: "+n+"  you have guess "+i+" times get it in");
            }
        }
        while ( n != guess );
    }
}*/
//-------------------------------------------SIMPLE PROJECT 2 ---------------------------------------
/*{
    public static void main(String[] args )
    {
        int n , i , num ; 
        char you , comp ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for ( i = 1 ; i <= num ; i ++ )
        {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Enter 's' for snake , 'w' for water , 'g' for gun ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Choose any one character what you want by a user :- ");
            System.out.println("-----------------------------------------------------------------------------------");
            you = sc.next().charAt(0);
            Random r = new Random();
            n = r.nextInt();
            if ( n < 33 )
            {
                comp = 's' ; 
            }
            else if ( n > 33 && n < 66 )
            {
                comp = 'w' ; 
            }
            else 
            {
                comp = 'g' ; 
            }
            if ( you == comp )
            {
                System.out.println("Congratulation !! Match Draw "); 
            }
            else if ( you == 's' && comp == 'w' )
            {
                System.out.println("Congratulation!! You win the match");
            }
            else if ( you == 's' && comp == 'g' )
            {
                System.out.println("Sorry !! you lost the match .... ");
                System.out.println("Computer win the match ");
            }
            else if ( you == 'w' && comp == 'g')
            {
                System.out.println("Congratulation!! You win the match");
            }
            else if ( you == 'w' && comp == 's')
            {
                System.out.println("Sorry !! you lost the match .... ");
                System.out.println("Computer win the match ");
            }
            else if ( you == 'g' && comp == 's' )
            {
                System.out.println("Congratulation!! You win the match");
            }
            else if ( you == 'g' && comp == 'w' )
            {
                System.out.println("Sorry !! you lost the match .... ");
                System.out.println("Computer win the match ");
            }
            System.out.println("Computer has chosse "+comp+" and your choose is : "+ you );
        }
    }
}*/
//------------------------------------------ARRAY------------------------------------------------
//                               INITIALIZATION  OF ARRAY ELEMENT 
/*{
    // Write a program to accept the number array then display the contents of the array . 
    public static void main(String [] args )
    {
        int i ; 
        int [] arr = { 23 , 24 , 423 , 43 , 33 , 55 };
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            System.out.println(arr[i]);
        }
    }
}*/
//                               DECLERATION OF ARRAY ELEMENT 
/*{
    public static void main(String [] args )
    {
        int i ; 
        int [] arr ;
        arr = new int [5] ; 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            System.out.println("Enter the Array element of the number is : ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for ( i = 0 ; i < 5 ; i ++ )
        {
            System.out.println(arr[i]);
        }

    }      
}*/
/*{
    // Write a program to find the sum of the array. 
    public static void main(String[] args )
    {
        int arr[] , sum = 0 , n ; 
        System.out.println("Enter the length of the array element is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int [n] ; 
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            System.out.println("Enter the array element "+ i +" of the number : ");
            
            arr[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            sum = sum + arr[i] ;             
        }
        System.out.println("The sum of the array element is : "+ sum );
    }
}*/
/*{
    // Write a program to find teh maximum value of the array . 
    public static void main(String [] args )
    {
        int arr [] , n ; 
        System.out.println("Enter the length of the array element is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int [n] ;
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            System.out.println("Enter the array element "+i+" of the number ");
            arr[i] = sc.nextInt();
        }
        for ( int i = 1 ; i < arr.length ; i ++ )
        {
            if ( arr[0] < arr[i] )
            {
                arr[0] = arr[i] ;
            }
        }
        System.out.println(" Maximum value of the array element is : "+arr[0]);
    }
}*/
                        // SEARCHING 
//      1. lINEAR SEARCHING 
//      2. BINARY SEARCHING 
/*{
    // Write a program to search a particular number in array by using linear search method . 
    public static void main(String[] args )
    {
        int n , k = 0 , num ; 
        System.out.println("Enter the maximum length of the array element is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int [n] ;
        System.out.println("Enter any number those number you are searching in array element of the number : ");
        num = sc.nextInt();
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            System.out.println("Enter the value of the array element of the number is : ");
            arr[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            if ( num == arr[i] )
            {
                k = 1 ; 
            }
            else 
            {
                k = 0 ; 
            }
        }
        if ( k == 1 )
        {
            System.out.println(num+" number is found ");
        }
        else 
        {
            System.out.println(num+" number is not found ");
        }
    }
}*/
/*{
    //                    Find the frequency of the number in the array 
    public static void main(String[] args )
    {
        int num , n , k = 0 ; 
        System.out.println("Enter maximum lenght of the array element is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int [n] ;
        System.out.println("Enter the number those number you want to check in array element of the number : ");
        num = sc.nextInt();
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            System.out.println("Enter the number of array element is : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i ++ )
        {
            if ( num == arr[i] )
            {
                k ++ ; 
            }
        }
        System.out.println("The number is repeted "+k );
    }
}*/
//                      BINARY SEARCHING 
// Searching by using binary search Metod . 
/*{
    // Write a program to accept the number in the array then sort the using buble sort mehtod . 
    public static void main(String [] args )
    {
        int arr[] , i , j , k ; 
        arr = new int [5] ; 
        for ( i = 0 ; i < 5 ; i ++ )
        {
            System.out.println("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
            for ( i = 0 ; i < 5 ; i ++ )
            {
                for ( j = 0 ; j < 5 ; j ++ )
                {
                    if ( arr[i] < arr[j] )
                    {
                        k = arr[i] ; 
                        arr[i] = arr[j] ; 
                        arr[j] = k ; 
                    }
                }
            }
        for ( i = 0 ; i < 5 ; i ++ )
        {
            System.out.println(arr[i]+"\t");
        } 
    }
}*/
/*{
    // Write a program to accept the number in the array then sort the using buble sort mehtod . 
    public static void main(String [] args )
    {
        int arr[] , i , j , k ; 
        arr = new int [5] ; 
        for ( i = 0 ; i < 5 ; i ++ )
        {
            System.out.println("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
            for ( i = 0 ; i < 5 ; i ++ )
            {
                for ( j = 0 ; j < 5 ; j ++ )
                {
                    if ( arr[i] > arr[j] )
                    {
                        k = arr[i] ; 
                        arr[i] = arr[j] ; 
                        arr[j] = k ; 
                    }
                }
            }
        for ( i = 0 ; i < 5 ; i ++ )
        {
            System.out.println(arr[i]+"\t");
        } 
    }
}*/
/*{
    // Write a program to find teh smallest and largest digit in the array . 
    public static void main(String [] args )
    {
        int arr[] , i , high = 0 , low = 9 ; 
        arr = new int [5] ; 
        for ( i = 0 ; i < 5 ; i ++ )
        {
            System.out.println("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        for ( i = 1 ; i < 5 ; i ++ )
        {
            if ( arr[i] > high )
            {
                high = arr[i] ;
            }
            else if ( arr[i] < low )
            {
                low = arr[i] ; 
            }
        }
        System.out.println("Smallest number : "+low );
        System.out.println("Largest number : "+high );
    }
}*/
//                 2nd Array (2nd DIMENSTIONAL ARRAY )
/*{
    // Write a program to enter the number in a 2-D Array then display the Array in matrix form . 
    public static void main(String[] args )
    {
        int arr[][] ;
        arr = new int [2][3] ; 
        int i , j ; 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("Enter the number is : ");
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
            }
        } 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}*/
/*{
    // Write a program to enter the number in sum of the matrix number . 
    public static void main(String [] args )
    {
        int arr[][] , i , j , sum = 0 ; 
        arr = new int [3][3] ; 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("Enter the number is : ");
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                sum = sum + arr[i][j] ; 
            }
        }
        System.out.println("sum of the array is : "+sum);
    }
}*/
/*{
    // Write a program to find the sum of the array as row wise . 
    public static void main(String [] args )
    {
        int arr[][] , i , j , sum = 0 ; 
        arr = new int [3][3] ; 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("Enter the number : ");
                Scanner sc = new Scanner(System.in);
                arr[i][j] = sc.nextInt();
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr[i][j]+"\t");
                
            }
            System.out.println();
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for( j = 0 ; j < arr[i].length ; j ++ )
            {
                sum = sum + arr[i][j] ; 
            }
            System.out.println("sum : "+sum );
            sum = 0 ; 
            System.out.println();
        }
    }
}*/
/*{
    // Write a program to find the sum of the left diagonal . 
    public static void main(String [] args )
    {
        int arr[][] , i , j  , sum = 0 ; 
        arr = new int [3][3] ; 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("Enter the number : ");
                Scanner sc = new Scanner( System.in);
                arr[i][j] = sc.nextInt();
            }
        }
            for ( i = 0 ; i < arr.length ; i ++ )
            {
                for ( j = 0 ; j < arr[i].length ; j ++ )
                {
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
            for ( i = 0 ; i < arr.length ; i ++ )
            {
                for ( j = 0 ; j < arr[i].length ; j ++ )
                {
                    if ( i == j )
                    {
                        sum = sum + arr[i][j] ; 
                    }
                }
            }
            System.out.println("sum of the left deiagonal number is : "+sum );
    }
}*/
/*{
    public static void main(String[] args )
    {
        int arr[][] , i , j , sum = 0 ; 
        arr = new int [3][3] ; 
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("Enter the number is : ");
                Scanner sc = new Scanner(System.in); 
                arr[i][j] = sc.nextInt();
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                if ( i + j == 2 )
                {
                    sum = sum + arr[i][j] ; 
                }
            }
        }
        System.out.println("The sum of the right diagonal is : "+sum );
    }
}*/
/*{
    public static void main(String [] args )
    {
        int n , m ; 

        System.out.println("-------------------------------------------------");
        System.out.println("Enter the 1st maximum array of the number is : ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.println("-------------------------------------------------");

        System.out.println("Enter the 2nd maximum array of the number is : ");
        m = sc.nextInt();
        System.out.println("-------------------------------------------------");

        int arr[][] , i , j , arr1[][] , arr2[][]; 
        arr = new int [n][m] ; 
        arr1 = new int [n][m] ; 
        arr2 = new int [n][m] ; 
        for ( i =0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Enter the 1st array's element of the number is : ");
                arr[i][j] = sc.nextInt();
                System.out.println("-------------------------------------------------");
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Enter the 2nd array's element of the number is : ");
                arr1[i][j] = sc.nextInt();
                System.out.println("-------------------------------------------------");
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------");
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------");
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                arr2[i][j] = arr[i][j] + arr1[i][j] ; 
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr2[i][j]+"\t"); 
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
    }
}*/
/*{
    // Write a program to enter the number in a 2nd D array then find the transpose . 
    public static void main(String [] args )
    {
        int n , m ; 

        System.out.println("-------------------------------------------------");
        System.out.println("Enter the 1st maximum array of the number is : ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.println("-------------------------------------------------");

        System.out.println("Enter the 2nd maximum array of the number is : ");
        m = sc.nextInt();
        System.out.println("-------------------------------------------------");

        int arr[][] , i , j , arr1[][] ;
        arr = new int [n][m] ; 
        arr1 = new int [n][m] ; 
        for ( i =0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Enter the 1st array's element of the number is : ");
                arr[i][j] = sc.nextInt();
                System.out.println("-------------------------------------------------");
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Enter the 2nd array's element of the number is : ");
                arr1[i][j] = sc.nextInt();
                System.out.println("-------------------------------------------------");
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                arr1[j][i] = arr[i][j] ; 
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
    }
}*/
/*{
    // Write a program to enter the number in a 2nd D array then find teh matrix Multiplication . 
    public static void main(String [] args )
    {
        int n , m ; 

        System.out.println("-------------------------------------------------");
        System.out.println("Enter the 1st maximum array of the number is : ");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.println("-------------------------------------------------");

        System.out.println("Enter the 2nd maximum array of the number is : ");
        m = sc.nextInt();
        System.out.println("-------------------------------------------------");

        int arr[][] , i , j , arr1[][] , arr2[][] , k ;
        arr = new int [n][m] ; 
        arr1 = new int [m][n] ; 
        arr2 = new int [n][n] ;
        for ( i =0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Enter the 1st array's element of the number is : ");
                arr[i][j] = sc.nextInt();
                System.out.println("-------------------------------------------------");
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr1[i].length ; j ++ )
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Enter the 2nd array's element of the number is : ");
                arr1[i][j] = sc.nextInt();
                System.out.println("-------------------------------------------------");
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr1[i].length ; j ++ )
            {
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr2[i].length ; j ++ )
            {
                arr2[i][j] = 0 ; 
                for ( k = 0 ; k < arr2.length ; k ++ )
                {
                    arr2[i][j] = arr2[i][j] + arr[i][k] * arr1[k][j]; 
                }
            }
        }
        for ( i = 0 ; i < arr.length ; i ++ )
        {
            for ( j = 0 ; j < arr2[i].length ; j ++ )
            {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}*/
// {
//     public static void main(String[] args )
//     {
//         System.out.println("Enter your number");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(sc.hasNextInt());
//     }
// }
//------------------------------------------------------------------------------------------------
//                            METHODS(FUNCTION)
/*{
    // How to create a function 
    public static void main(String[] args )
    {
        System.out.println("Welcome in C ");
        display();
        System.out.println("For good learning ");
    }
    static void display()
    {
        System.out.println("All the best ");
    }
}*/
/*{
    // Write a program to add 2 number by all the categories 
    // First Category 
    public static void main(String[] args )
    {
        sum();
    }
    static void sum()
    {
        int a , b , c ; 
        System.out.println("Enter the 2 number is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b ; 
        System.out.println("Sum of the 2 number is : "+c );
    }
}
{
    // 2nd Category 
    public static void main(String[] args )
    {
        int a , b ; 
        System.out.println("Enter the 2 number is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sum( a , b );
    }
    static void sum(int x , int y )
    {
        int z ; 
        z = x + y ; 
        System.out. println("Sum of the 2 number is : "+z );
    }
}
{
    // 3rd Category 
    public static void main(String [] args )
    {
        int a , b , c ;
        System.out.println("Enter the 2 number is : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sum( a , b );
        System.out.println("sum of the 2 number is : "+c );
    }
    static int sum( int x , int y )
    {
        int z ; 
        z = x + y ; 
        return z ; 
    }
}*/
/*{
    // Write a program to find the factorial of a number . 
    public static void main(String [] args )
    {
        fact();
    }
    static void fact()
    {
        int f = 1 , n ;
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for ( int i = 1 ; i <= n ; i ++ )
        {
            f = f * i ; 
            System.out.println("Factorial is : "+f );

        } 
    }
}
// 2nd Category 
{
    public static void main(String[] args )
    {
        int n ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fact(n);
    }
    static void fact( int x )
    {
        int i , f = 1 ; 
        for ( i = 1 ; i <= x ; i ++ )
        {
            f = f * i ; 
            System.out.println("Factorial number is : "+f );
        }
    }
}
// 3rd Category 
{
    public static void main(String [] args )
    {
        int n , f  ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner (System.in) ;
        n = sc.nextInt();
        f = fact( n);
        System.out.println("Factorial number is : "+f );
    }
    static int fact(int x)
    {
        int i , y = 1 ;
        for ( i = 1 ; i <= x ; i ++ )
        {
            y = y * i ;
        }
        return y ;
    }
}*/
/*{
    // Write a program to enter a number then find the sum off all the digit oh=ff the number .
    // eq : 1 + 2 + 3 + 4 = 10 
    public static void main(String[] args )
    {
        int n , s ; 
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner (System.in );
        n = sc.nextInt();
        s = sum(n);
        System .out.println("Sum of the number is : "+s );
    }
    static int sum ( int x )
    {
        int r , y = 0 ; 
        while ( x > 0 )
        {
            r = x % 10 ; 
            x = x / 10 ; 
            y = y + r ;
        }
        return y ;
    }
}*/
/*{
    // Reverse Number 
    public static void main(String[] args )
    {
        int n , r ; 
        System.out.println("Enter the number ");
        Scanner sc = new Scanner (System.in );
        n = sc.nextInt();
        r = rev(n);
        System.out.println("Reverse of the number is : "+r );
    }
    static int rev(int x )
    {
        int z = 0 , y ;
        while ( x > 0 )
        {
            y = x % 10 ;
            x = x / 10 ; 
            z = z * 10 + y ; 
        }
        return z ; 

    }
}*/
/*{
    // prime number 
    public static void main(String[] args )
    {
        prime();
    }
    static void prime()
    {
        int n , s = 0 , i ; 
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in );
        n = sc.nextInt();
        for ( i = 1 ; i <= n ; i ++ )
        {
            if ( n % i == 0 )
            {
                s ++ ;
            }   
        }
        if ( s == 2 )
        {
            System.out.println("Number is Prime number ");
        }
        else 
        {
            System.out.println("Number is not Prime number ");
        }
    }
}*/
/*{
    //2nd Method 
    public static void main(String[] args )
    {
        int n , p  ; 
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p = prime(n);
        if ( p == 1 )
        {
            System.out.println("Number is Prime number ");
        }
        else 
        {
            System.out.println("Number is not Prime number ");
        }
    }
    static int prime(int x )
    {
        int i , s = 0 ; 
        for ( i = 1 ; i <= x ; i ++ )
        {
            if ( x % i == 0 )
            {
                s ++ ; 
            }
        }
        if ( s == 2 )
        {
            return 1 ; 
        }
        else 
        {
            return 0 ; 
        }

    }
}*/
/*{
    // Write a program to print all Armstrong number  between given interested using function .
    public static void main(String[] args )
    {
        int n , arm ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in );
        n = sc.nextInt();
        arm = arm(n);
        if ( arm == 1 )
        {
            System.out.println("This is Armstrong number ");
        }
        else
        {
            System.out.println("This is not Armstrong number ");
        }
    }
    static int arm(int x ) 
    {
        int r , s = 0 , p  ;
        p = x ; 
        while ( x > 0 )
        {
            r = x % 10 ; 
            x = x / 10 ; 
            s = s + r * r * r ; 
        } 
        if ( s == p )
        {
            return 1 ; 
        }
        else 
        {
            return 0 ; 
        }
    }
}*/
//-------------------------------------------------------------------------------------------------------
//                                    RECURSION 
/*{
    // Write a program to enter a number then find the factorial using recursion . 
    public static void main(String [] args )
    {
        int n , k ;
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner (System.in );
        n = sc.nextInt();
        k = fact(n);
        System.out.println("Factorial of the number is : "+k );
    }
    static int fact(int n )
    {
        if ( n == 1 || n == 0 )
        {
            return 1 ; 
        }
        else 
        {
            return n * fact( n - 1 );
        }
    }
}*/
/*{
    // Write a program to enter a number the sum of all natural number upto that number . 
    // n = 5 
    // 1 + 2 + 3 + 4 + 5 = 15 
    public static void main(String[] args )
    {
        int n , k ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner (System.in );
        n = sc.nextInt();
        k = sum(n);
        System.out.println("Total sum of the number is : "+k );
    }
    static int sum(int n )
    {
        if ( n == 1 )
        {
            return 1 ; 
        }
        else 
        {
            return n + sum( n- 1 );
        }
    }
}*/
/*{
    // Write a C program to print all natural numbers between 1 to n using recursion.
    public static void main(String [] args )
    {
        int n1 , n2 , k ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in );
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd number is : ");
        n2 = sc.nextInt();
        System.out.println("All natural number of the number is : "+n1 +" "+n2 );
        nat(n1 , n2 );
        
    }
    static void nat(int n1 , int n2 )
    {
        if ( n1 > n2 ) 
        {
            return ; 
        }
        System.out.println("Natural number is : "+n1 );
        nat(n1 + 1 , n2 );
    }
}*/
/*{
    // Write a C program to print all even or odd numbers in given range using recursion. 
    public static void main(String[] args )
    {
        int n1 , n2 ; 
        System.out.println("Enter the 1st number is : ");
        Scanner sc  = new Scanner (System.in );
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd number is : ");
        n2 = sc.nextInt();
        System.out.println("The number between in "+n1 +" "+ n2 );
        num(n1 , n2 );
    }
    static void num(int n1 , int n2 )
    {
        if ( n1 > n2 )
        {
            return ; 
        }
        System.out.println("Odd number of the number is "+n1 );
        num(n1 + 2 , n2 );
    }
}*/
/*{
    // Write a C program to find sum of all natural numbers between 1 to n using recursion.
    public static void main(String[] args )
    {
        int n1 , n2 , k ; 
        System.out.println("Enter the 1st number is : ");
        Scanner sc  = new Scanner (System.in );
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd number is : ");
        n2 = sc.nextInt();
        System.out.println("The number between in "+n1 +" "+ n2 );
        k = sum(n1 , n2 );
        System.out.println("sum of all the number is : "+ k );
    }
    static int sum(int n1 , int n2 )
    {
        if ( n1 == n2 )
        {
            return n1 ;
        } 
        else 
        {
            return n1 + sum(n1 + 1  , n2 );
        }
    }
}*/
/*{
    // Write a C program to find reverse of any number using recursion.
    public static void main(String [] args )
    {
        // Write a C program to find reverse of any number using recursion. 
        int n , k ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner (System.in );
        n = sc.nextInt();
        k = rev(n);
        System.out.println("Reverse Number : "+k );
    }
    static int rev( int n )
    {
        int r , s = 0 ; 
        if ( n == 0 )
        {
            return n ; 
        }
        else
        {
            while ( n > 0 )
            {
                r = n % 10 ; 
                n = n / 10 ; 
                s = s * 10 + r ;  
            }
            return s ; 
        }
    }
}*/
{
    // Write a C program to generate nth Fibonacci term using recursion.
    public static void main(String[] args )
    {
        int n ,result ; 
        System.out.println("Enter the number is : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        result = fib(n);
        System.out.println("Fibonacci : "+result );
    }
    static int fib(int n )
    {
        /*if ( n == 1 || n == 2 )
        {
            n = n - 1 ; 
        }*/
        if ( n == 1 )
        {
            return 0 ; 
        }
        else if ( n == 2 )
        {
            return 1 ; 
        }
        else 
        {
            return fib ( n - 1 ) + fib (n - 2 );
        }
    }
}