import java.util.Scanner; 
public class Car_color_project {
    // int choice ;
    public static void main(String[] args) {
         
        System.out.println("Welcome to My new Cars showroom");
        System.out.println("\n---------------------------------------------------------------\n");
        System.out.println("Hello Sir !! How are you .... ");
        System.out.println("Would you Purchase the Car !! ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Yes or No ?? ");
        String ans = sc.nextLine();
        String ans1 = ans.toLowerCase();
        if ( ans1.equals("yes")){
            System.out.println("Ohkkkk fine !! Lets we go to check the detail , which type of the car are in present heere ");
            System.out.println("1.\t\t------------------- Swift Dzire--------------------------------");
            System.out.println("2.\t\t------------------- Scorpio------------------------------------");
            System.out.println("3.\t\t------------------- Bolaro ------------------------------------");
            System.out.println("4.\t\t------------------- Balino ------------------------------------\n");
        }
            System.out.println("\n\n\t\t\t\t Enter your choice : \t\t\t\t\t");
            // choice = sc.nextInt();
            if ( choice == 1 ){
            System.out.println("Are you want buy the Car !! ");
            System.out.println("Yes or No !! ");
            String ans11 = sc.nextLine();
            String ans12 = ans11.toLowerCase();
            if ( ans12.equals("yes")){
                System.out.println("Which colour do you like in between : 'White' , 'Black' , 'Blue' ");
                String colour = sc.nextLine();
                String colour1 = colour.toLowerCase();
                if (colour1.equals("white")){
                    System.out.println("Did you Purchase The White Colour Car ");
                    System.out.println("Yes or no ");
                    String ans13 = sc.nextLine();
                    String ans14 = ans13.toLowerCase();
                    if (ans14.equals("yes")){
                        System.out.println("Your Car is successfully done  !! ... ");
                    }
                    else {
                        System.out.println("Don't be worry we have so many car !! lets go to another ");
                    }
                }        
            }    
                else if ( colour1.equals("black")){
                    System.out.println("Did you like Black Colour Car ");
                    String ans15 = sc.nextLine();
                    System.out.println("Yes or No ");
                    String ans16 = ans15.toLowerCase();
                    if ( ans16.equals("yes")){
                        System.out.println("Your Car is successfully !! Done ");
                        System.out.println("Your Car is Safe ");
                    }
                    else{
                        System.out.println("lets move go for ahead ");
                    }
                }
                else if ( colour1.equals("blue")){
                    System.out.println("Do you like Blue Colour Car ");
                    System.out.println("Yes or No ");
                    String ans17 = sc.nextLine();
                    String ans18 = ans17.toLowerCase();
                    if ( ans18.equals("yes")){
                        System.out.println("Sorry sir !! This car is not available in my showroom ");
                    }
                    else{
                        System.out.println("We have it in stock .... let's check to another car ");
                    }
                }
                else {
                    System.out.println("Other Colour's car is not available .... ");
                }
        }
    }
}
