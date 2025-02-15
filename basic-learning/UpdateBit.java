package DSA;

import java.util.*;

public class UpdateBit {
    
        public static void updateOne(){
      Scanner sc=new Scanner(System.in);
            System.out.print("Enter the position : ");
            int pos=sc.nextInt();
            System.out.print("Enter the Decimal or binary number ");
            int n=sc.nextInt();
             int bitmask=1<<pos;
             int newNumber=bitmask|n;
              System.out.println(newNumber);
        }
         public static void updateZero(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Decimal  number : ");
            int n=sc.nextInt();
            System.out.print("Enter the position which you want to Clear : ");
            int pos=sc.nextInt();
             int bitmask=1<<pos;
             int notBitmask=~bitmask;
             System.out.println(notBitmask&n);
        }
        public static void main(String[] args) {
            Scanner sc1=new Scanner(System.in);
            System.out.print("Enter the operation 1 or 0 : ");
            int operation=sc1.nextInt();
            if(operation==1){
                Scanner sc=new Scanner(System.in);
            System.out.print("Enter the position : ");
            int pos=sc.nextInt();
            System.out.print("Enter the Decimal or binary number ");
            int n=sc.nextInt();
             int bitmask=1<<pos;
             int newNumber=bitmask|n;
              System.out.println(newNumber);
                
            }
            else if(operation==0){
                System.out.print("Enter the Decimal  number : ");
                int n=sc1.nextInt();
                System.out.print("Enter the position which you want to Clear : ");
                int pos=sc1.nextInt();
                 int bitmask=1<<pos;
                 int notBitmask=~bitmask;
                 System.out.println(notBitmask&n);
            }
            else System.out.println("Enter 0 or 1 becase this code change in binary ");
            UpdateBit o1=new UpdateBit();
           
        }
}
