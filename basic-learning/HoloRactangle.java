package DSA;
import java.util.Scanner;
public class HoloRactangle {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of rows : ");
        int colums=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colums;j++){
                if(j==1||i==1||i==rows||j==colums){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    


}
