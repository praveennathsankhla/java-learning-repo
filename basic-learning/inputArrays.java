package DSA;
import java.util.Scanner;
class inputArrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : " );
        int size=sc.nextInt();
         int[] array=new int[size];
         for(int i=0;i<size;i++){
            System.out.println("Enter the "+i+" element : ");
                  array[i]=sc.nextInt();
                    
         }
          System.out.print("Here is your array element : ");
         for(int j=0;j<size;j++){
            System.out.print(array[j]+"  ");
         }
       
    }
}
