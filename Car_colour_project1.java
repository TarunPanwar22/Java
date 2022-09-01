import java.util.Scanner;
class Car_color_project1{
    public static void main(String[] args) {
        System.out.println("Welcome to My New Carshowroom ");
        System.out.println("\n----------------------------------------------------\n");
        System.out.println("Hello sir !! How are you ... ");
        System.out.println("Would you purchase the car ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Yes or No ");
        String ans = sc.nextLine();
        String ans1 = ans.toLowerCase();
        if ( ans1.equals("yes"))
        {
            System.out.println("Okk fine ");
            System.out.println("1 . Maruti Sizuki ");
            System.out.println("2 . Scorpio ");
            System.out.println("3. Boloro ");
            System.out.println("Balino");
            System.out.println("enter your choice ");
            int choice = sc.nextInt();
            choice = sc.nextInt();
            if ( choice == 1 )
            
            {
                System.out.println("Are you buy the car ");
                System.out.println("yes or no ");
                String ans11 = sc.nextLine();
                String ans12 = ans11.toLowerCase();
                if ( ans12.equals("yes"))
                {
                    System.out.println("Which colour do you like between in : 'White' , 'Black' , 'Blue' ");
                    String colour = sc.nextLine();
                    String colour1 = colour.toLowerCase();
                }
            }
        }
    }
}
    