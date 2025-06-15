package basics;
import java.util.Scanner;
public class mathFormula1 {
    public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            
            System.out.println("Enter first Number :");
                int a=scanner.nextInt();
            System.out.println("Enter Second number : ");
                int b=scanner.nextInt();
            System.out.println("Enter THird number : ");
                int c=scanner.nextInt();
            int result=((a+b)/c);
            System.out.print("a+b/c is "+result);
            scanner.close();
    
}}
