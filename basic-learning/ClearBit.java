package DSA;

import java.util.Scanner;

public class ClearBit {
     void ClearBit(){
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
        ClearBit  o1=new ClearBit();
         o1.ClearBit();
         
     }
    
}
