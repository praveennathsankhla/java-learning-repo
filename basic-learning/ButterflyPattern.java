package DSA;
import java.util.Scanner;


public class ButterflyPattern {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of raws : ");
        int rows=sc.nextInt();
       
        //uper half
        for(int i=1;i<=rows;i++){
            //part fist stars
            for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            //spaces
                int formula=2*(rows-i);
            for(int j=1;j<=formula;j++){
                System.out.print(" ");
            //second part star
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        System.out.println();
            }
            //lower half
            for(int k=rows;k>=1;k--){
                  //part fist stars
            for(int m=1;m<=k;m++){
                System.out.print("*");
            }
        //spaces
            int formulaLower=2*(rows-k);
        for(int m=1;m<=formulaLower;m++){
            System.out.print(" ");
        //second part star
        }
        for(int m=1;m<=k;m++){
            System.out.print("*");
        }

    System.out.println();

            }
        }
    }