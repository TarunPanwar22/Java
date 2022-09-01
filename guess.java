import java.util.Random;
public class guess {
    public static void main(String[] args )
    {
        int n ; 
        System.out.println("Computer already decide the number : ");
        Random r = new Random();
        n = r.nextInt(100)+1 ;
        System.out.print(n);
    }
    
}
