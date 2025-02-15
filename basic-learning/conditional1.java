package basics;
import java.util.Scanner;

public class conditional1{
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A Intiger");
                int a=scanner.nextInt();
                if(a>=50){
                    System.out.println("Yes,it is greater than 50");

                }
                else
                   System.out.println("No,It is not grater then 50.");

            }
    }

