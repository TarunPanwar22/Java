/*import java.util.Scanner;
public class array 
{
    public static void main(String[] args )
    {
        int [] marks;               // declaration of the variable ;
        marks = new int[5]  ;
        marks[0] = 100 ; 
        marks [1] = 60 ; 
        marks [2] = 70 ; 
        marks [3] = 80 ; 
        marks [4] = 90 ; 
        marks [4] = 100 ;  
        System.out.println("Marks of the number is : " + marks[4]);
    }
}*/
/*{
    public static void main(String[] args )
    {
        int [] marks = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 }; 
            System.out.println(marks[8]);
    }
}*/
// array with looping 
/*{
    public static void main(String [] args )
    {
        int [] marks  = { 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 } ;
        //System.out.println(marks.length);
        for (int i = 0 ; i < marks.length ; i ++ )
        {
            System.out.println(marks[i]);
        }
    }
}*/
// 5 total marks of the number , average and percentage . 
/*{
    public static void main( String [] args )
    {
        String sub[] = new String[6];
        int marks[] = new int[6];
        int total = 0 ; 
        float average , percentage ;
        Scanner obj = new Scanner(System.in);
        for ( int i = 1 ; i < sub.length ; i ++ )
        {
            System.out.println("\nEnter the five subject marks of the number is : ");
            marks[i] = obj.nextInt();
            total = total + marks[i] ;
        }
        average = total / 5 ;
        percentage = (total*100 / 500 ) ;
        System.out.println("The total marks of the subject is : " +total );
        System.out.println("Average marks of the subject is : "+average );
        System.out.println("Total marks of the total percentage is : " +percentage );
    }
}*/
// which number is greter and smaller 
// eq - 1 , 2 , 3 -> 3 is greater and 1 is smaller . 
/*{
    public static void main( String [] args )
    {
    int []arr = new int [5] ;
    int i , max = 0 , min = 9 ; 
    Scanner obj = new Scanner(System.in );
    System.out.println("Enter the number is : ");
    for ( i = 0 ; i < arr.length ; i ++ )
    {
        arr[i] = obj.nextInt();
    }
    for ( i = 0 ; i < arr.length ; i ++ )
    {
        if ( max < arr[i])
        {
            max = arr[i] ; 
        }
        if ( min > arr[i])
        {
            min = arr[i] ;
        }
    }
    System.out.println("maximum value of the number is : " + max );
    System.out.println("minimum value of the number is : " + min );
}
}*/
//2nd Method 
/*{
    public static void main(String[] args )
    {
        int i , max , min ;   
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the array is : ");
        int size = obj.nextInt();
        int [] arr = new int [size] ; 
        for ( i = 0 ; i < size ; i ++ )
        {
            System.out.println("Enter the array element of the number is : " );
            arr[i] = obj.nextInt();
        }
        max = arr[0] ; 
        min = arr[0] ; 
        for ( i = 1 ; i <  size ; i ++ )
        {
            if ( max < arr[i] )
            {
                max = arr[i] ; 
            }
            if ( min > arr[i])
            {
                min = arr[i] ; 
            }
        }
        System.out.println("Maximum of the number is : "+ max ) ;
        System.out.println("Minimum of the number is : " + min ); 
    }
}*/ 
// Write a java program to add two matrixe of size 2 * 3 . 
// array of the element is initialize . 
/*
{
    public static void main(String [] args )
    {
        int [][] sum  = new int [2][2] ;
        int [][] arr = new int [2][3];
        arr[0][0] = 1 ; 
        arr[0][1] = 2 ; 
        arr[0][2] = 3 ; 
        arr[1][0] = 4 ; 
        arr[1][1] = 5 ; 
        arr[1][2] = 6 ;
        int [][] arr1 = new int [3][2] ; 
        arr1[0][0] = 1 ; 
        arr1[0][1] = 2 ; 
        arr1[1][0] = 3 ; 
        arr1[1][1] = 4 ; 
        arr1[2][0] = 5 ; 
        arr1[2][1] = 6 ;
        // 2nd Method 
        // arr[][] = {{1 , 2 , 3 } , {4 , 5 , 6 }};
        // arr1[][]= {{1 , 2 , 3 } , {4 , 5 , 6 }};  
        for ( int i = 0 ; i < sum.length ; i ++ )
        {
            for ( int j = 0 ; j < sum[i].length ; j ++ )
            {
                sum[i][j] = arr[i][j] + arr1[i][j] ; 
            }
        }
        System.out.print("sum of the array element is :\n " );
        for ( int i = 0 ; i < sum.length ; i ++ )
        {
            for ( int j = 0 ; j < sum.length ; j ++ )
            {
                System.out.print(sum[i][j] + " \t ");
            }
            System.out.print("\n");
        }
    }
}*/
//Declaration in 2-D Array 
/*{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st length of the array is : ");
        int n = sc.nextInt();
        System.out.println("Enter the 2nd arrary length of the array is : ");
        int m = sc.nextInt();
        int [][] arr = new int [n][m] ;
        int [][] arr1 = new int [m][n];
        int sum[][] = new int [n][n];
        for ( int i = 0 ; i < arr.length ; i ++ )
        {
            for ( int j = 0 ; j < arr[i].length ; j ++ )
            {
                System.out.println("Enter the 1 st array element of the number is : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for ( int i = 0 ; i < arr1.length ; i ++ )
        {
            for ( int j = 0 ; j < arr1[i].length ; j ++ )
            {
                System.out.println("Enter the 2nd arraay element of the number is : ");
                arr1[i][j] = sc.nextInt();
            }
        }
        for ( int i = 0 ; i < sum.length ; i ++ )
        {
            for ( int j = 0 ; j < sum[i].length ; j ++ )
            {
                sum[i][j] = arr[i][j] + arr1[i][j] ;
            }
        }
        for ( int i = 0 ; i < sum.length ; i ++ )
        {
            for ( int j = 0 ; j < sum[i].length ; j ++ )
            {
                System.out.print(sum[i][j]+ " \t ");
            }
            System.out.println("");
        }
    }
}*/
