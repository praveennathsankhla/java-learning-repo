//Write a function to print the sum of all odd numbers from 1 to n.

package DSA;
import java.util.Scanner;

public class OddSumFunction {

    public int oddCalculate(){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum+=i;
            }
            else ;
        }
        System.out.println("Sum of all odd number between given number is "+sum);
        return sum;


    }
    public static void main(String[] args) {
        OddSumFunction o1=new OddSumFunction();
        o1.oddCalculate();
    }
}
