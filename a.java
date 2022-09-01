/*import java.util.Scanner;
class Firstprogram
{
	public static void main(String args[])
	{
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
		}
		
		
		
		
	}
}*/