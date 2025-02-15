package DSA;
import java.util.Scanner;
public class TwodArrays {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of colums : ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of colums : ");
        int colums=sc.nextInt();
        int[][] array=new int[rows][colums];
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colums;j++){
                    System.out.print("Enter the data for ("+i+","+j+") : ");
                   array[i][j]=sc.nextInt(); 
            }
        }
        System.out.println("Your two dimantion array if here :" );
        for(int k=1;k<=rows;k++){
            for(int m=1;m<=colums;m++){
                System.out.println("Your two dimantion array if here : "+array[k][m]);
            }
        }
        
    }

    
}
