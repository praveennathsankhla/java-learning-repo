package Projects;

import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.print("Enter opration: ");
        String task = scanner.next();
        System.out.println("Enter first number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter the second nUmber: ");
        int num2=scanner.nextInt();
        if(task.equals(("+"))){
            result=num1+num2;
            System.out.println("Addition of "+num1+" and "+num2+ " is = "+result );
            
        }
            else if(task.equals(("-"))){
                result=num1-num2;
            System.out.println("Subtraction of "+num1+" and "+num2+ " is = "+result );
            }
            else if(task.equals(("/"))){
                result=num1/num2;
            System.out.println("Division of "+num1+" and "+num2 +" is = "+result );
            }
            else if(task.equals(("%"))){
             result=num1%num2;
            System.out.println("Reminder  of "+num1+" and "+num2+ " is = "+result );
            }
            else if(task.equals(("*"))){
                result=num1*num2;
            System.out.println("Multiplaction of "+num1+" and "+num2+ " is = "+result );
            }
            else 
            System.out.println("Please Enter Valid Opration. ");
            scanner.close();
    }
   
}
