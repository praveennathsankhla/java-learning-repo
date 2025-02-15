package DSA;
import java.util.Scanner;
public class MirrorPiramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of raws : ");
        int raws=sc.nextInt();
        for(int i=1;i<=raws;i++){
            for(int j=1;j<=(raws-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               
                    System.out.print("*");
                
            }
             System.out.println();
        }
    }
    
}
