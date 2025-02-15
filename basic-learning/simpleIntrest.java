package basics;
import java.util.Scanner;
public class simpleIntrest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int p=100;
        System.out.println("Enter the rate of intreat annully: ");
        float r=scanner.nextFloat();
        System.out.println("Enter the time period of intrest ");
        float t=scanner.nextFloat();
        float simpleIntrest=(p*r*t)/100;
        System.out.println("Your Simple Intrest is "+simpleIntrest);
        scanner.close();
        
    }
    
}
