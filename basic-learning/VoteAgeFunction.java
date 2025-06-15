//Write a function that takes in age as input and returns if that person is eligible to vote or not. 
//A person of age > 18 is eligible to vote.
package DSA;
import java.util.Scanner;
public class VoteAgeFunction {
        public void CheckElegeblity(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the age : ");
            int age=sc.nextInt();
            if(age>=18){
                System.out.println("You are elegble for the VOTE.");
            }
            else if(age<18){
                System.out.println("You are NOT elegble to VOTE");

            }
            else System.out.println("Please enter Age in valid numbers.");
        }
        public static void main(String []args){
            VoteAgeFunction o1=new VoteAgeFunction();
                o1.CheckElegeblity();
        }
}
