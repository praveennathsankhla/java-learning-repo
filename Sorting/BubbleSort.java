package DSA.Sorting;
import java.util.*;
public class BubbleSort {

    //Creating fuction of sort array integer into accending order using buble short
      public void AccendingSort(){

         
        Scanner sc=new Scanner(System.in);
        //Input size of array

        System.out.print("Enter the size of  array : ");
        int sizeOfArray=sc.nextInt();
        int arr[]=new int[sizeOfArray];
        

        //input the element of array
        for(int i=0;i<sizeOfArray;i++){
             int countElement=i+1;
             System.out.print("Enter the "+countElement+" element of array: ");
             arr[i]=sc.nextInt();
        }

        //Printing original array
        
        System.out.println("Here is your Original array  : ");
        for(int i=0;i<sizeOfArray;i++){
                System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //buble sort array
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){

                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Here is your Sorted array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      
    
      }
      public static void main(String[] args) {
         BubbleSort o1=new BubbleSort();
         o1.AccendingSort();
      }
    
}
