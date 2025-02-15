// Two numbers are entered by the user, x and n. Write a function to find the value of one number
//  raised to the power of another i.e. xn.
package DSA;
import java.util.Scanner;
public class PowerFunction {
        public int powerCalculate(){
                Scanner sc=new Scanner(System.in);
                System.out.println("Please enter base number : ");
                int base=sc.nextInt();
                System.out.println("Enter the Power of base number : ");
                int power=sc.nextInt();
                int result=1;
                    for(int i=1;i<=power;i++){
                            result*=base;
                    }
                    System.out.println(base+" to the power  "+power+" is "+result);
            return result ;
        }
        public static void main(String[] args) {
            PowerFunction o1=new PowerFunction();
            o1.powerCalculate();
        }
}
