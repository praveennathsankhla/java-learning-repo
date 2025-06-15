package basics;
import java.util.Scanner;
public class multiplicationNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A number");
        int number = scanner.nextInt();
     
        for(int i=1;i<=10;i++){

            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
   
}
