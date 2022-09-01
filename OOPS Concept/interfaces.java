import java.util.Scanner; 

interface Bicycle{
    
    int a = 45 ;
    public void applyBrake(int decrement); 
    public void speedUp(int increment);
    
}

interface HornBicycle{
    public void Blowk3g();  
    public void blogHornmhn(); 
}


class AvonCycle implements Bicycle {
    public void blowHorn(){
        System.out.println("pifjdfddff");
    }

    public void applyBrake(int decrement){
        System.out.println("Applying Brake "); 

    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp "); 
    }
    public void Blowk3g(){
        System.out.println("Kabhi khushi kabhi ghum "); 
    }
    public void blogHornmhn(){
        System.out.println("Main hoon na pooo ppo oodif "); 
    }

}



public class interfaces{
    public static void main(String [] args ){

        AvonCycle cycleHarry = new AvonCycle(); 
        System.out.println(cycleHarry.a);

        cycleHarry.blowHorn();  
        cycleHarry.Blowk3g(); 
    }
}