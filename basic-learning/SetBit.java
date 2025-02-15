package DSA;
import java.util.*;
public class SetBit {

    public void setBit(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the position : ");
            int pos=sc.nextInt();
            System.out.print("Enter the Decimal or binary number ");
            int n=sc.nextInt();
             int bitmask=1<<pos;
             int newNumber=bitmask|n;
              System.out.println(newNumber);
              
    }
    public static void main(String [] args){
        SetBit o1=new SetBit();
        o1.setBit();
    }
    
}
