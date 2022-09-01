import java.util.Scanner; 

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning... ");
    }

     default void record4kVideo(){
     greet(); 
        System.out.println("Recording in 4k ... "); 
     }

}

class MyCellPhone {

    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pick(){
        System.out.println("PickCall");
    }
    
}


interface Wifi{
    String[] getNetworks(); 
    void connectNetwork(String network);
    
}



class MySmartPhone  extends MyCellPhone implements Wifi , Camera{
    public void takeSnap(){
        System.out.println("Taking Snap"); 
    }
    public void recordVideo(){
        System.out.println("Taking Snap"); 
    }

    // public void record4kVideo(){
    //     System.out.println("Taking Snap and recording in 4k "); 
    // }

    public String[] getNetworks(){
    String[] networkList = {"Harry" , "Prashanth" , "Anjali56"}; 
    return networkList; 

    }
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network); 
    }
}



public class defaultMethod{
    public static void main (String[] args ){

        MySmartPhone ms = new MySmartPhone(); 
        String[] ar = ms.getNetworks(); 
        ms.record4kVideo(); 
        for ( String item : ar ){
            System.out.println(item); 
        }

    }
}