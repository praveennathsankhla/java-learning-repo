package DSA;
import java.util.Scanner;
public class PiramidBinaryNumbersPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows : ");
            int rows=sc.nextInt();
            int number=1;

            for(int i=1;i<=rows;i++){
                
                for(int j=1;j<=i;j++){
                    if(((i+j)%2)==0){
                        System.out.print(" 0 ");
                    }
                    else
                        System.out.print(" 1 ");
                        
                }
                System.out.println();
            }


    }
}
