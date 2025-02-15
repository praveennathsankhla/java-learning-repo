package DSA;
import java.util.*;


public class GetBit {
                
                    void checkBit(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the binary number : ");
    int n=sc.nextInt();
    System.out.print("Enter the position which you want to Get : ");
    int pos=sc.nextInt();
     int bitmask=1<<pos;
     if((bitmask&n)==0){
        System.out.println("bit is zero .");
     }
     else System.out.println("bit is one .");
    }
    public static void main(String[] args){
        GetBit o1=new GetBit();
        o1.checkBit();
    }

    
}
