package DSA;

import java.util.Scanner;

class DimondPattern{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of rows : ");
            int rows=sc.nextInt();

            //upper half

            for(int i=1;i<=rows;i++){
                for(int j=1;j<=(rows-i);j++){
                        System.out.print(" ");
                }
                for(int j=1;j<=(i*2)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
            //lower half
            for(int i=rows-1;i>=1;i--){
                for(int j=1;j<=(rows-i);j++){
                        System.out.print(" ");
                }
                for(int j=1;j<=(i*2)-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
              

            }
           
    }

