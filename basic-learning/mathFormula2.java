package basics;
import java.util.Scanner;
public class mathFormula2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a =scanner.nextInt();
        System.out.println();
        System.out.println("Enter value of b :");
        int b=scanner.nextInt();
        System.out.println("Enter the value of c ");
        int c=scanner.nextInt();
        System.out.println("Enter value of d :");
        int d=scanner.nextInt();
        int y=(a+b)/(c-d);
        System.out.println(" Y=a+b/c-d is "+y);
scanner.close();
    }
    
}
