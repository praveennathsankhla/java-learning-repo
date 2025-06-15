//Write a function which takes in 2 numbers and returns the greater of those two.

package DSA;
import java.util.Scanner;
public class GreatestFindFunction {
    
    public void findGreatest(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number : ");
            float num1=sc.nextFloat();
            System.out.println("Enter second number : ");
            float num2=sc.nextFloat();
            if(num1>num2){
                System.out.println("Greatest between "+num1+" and "+num2+" is "+num1);
            }
            else if(num1<num2){
                System.out.println("Greates between "+num1+" and "+num2+" is "+num2);
            }
            else if(num1==num2){
                System.out.println(num1+" and "+num2+" are EQUEL. ");
            }
                else
                System.out.println("You did something shit.");

    }
        public static void main(String[] args) {
            GreatestFindFunction o1=new GreatestFindFunction();
            o1.findGreatest();
        }
    
}
