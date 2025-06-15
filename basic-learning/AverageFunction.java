package DSA;
//Question Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;
public class AverageFunction{
    
    
    
   public float findAverage(){
          Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first number : ");
            int n1=sc.nextInt();
            System.out.println("Enter second number : ");
            int n2=sc.nextInt();
            System.out.println("Enter second number : ");
           int  n3=sc.nextInt();
            float average=(n1+n2+n3)/3;
            System.out.println(average);
        return average;
       
            
    }
    public static void main(String[] args) {
        AverageFunction o1=new AverageFunction();
        o1.findAverage();
    }
    
}