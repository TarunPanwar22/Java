import java.util.Scanner; 

class Cyclinder{
    private int radius ; 
    private int height ; 

    public int getRadius(){
        return radius ;
    }
    public void setRadius(int radius){
        this.radius = radius ; 
    }

    public int getHeight(){
        return height ;
    }
    public void setHeight(int height){
        this.height = height ; 
    }

    public double surfaceArea(){
        return 2 * 3.14 * radius * radius + 2 * 3.14* radius * height ; 
    }    

}


public class accessModifiersPra{
    public static void main(String[] args ){

        Cyclinder myCyclinder = new Cyclinder();
        myCyclinder.setHeight(12);
        myCyclinder.getHeight();
        int h = myCyclinder.getHeight();
        System.out.println(h);
        myCyclinder.setRadius(9);
        myCyclinder.getRadius();
        System.out.println(myCyclinder.getRadius());
        System.out.println(myCyclinder.surfaceArea());
    }
}