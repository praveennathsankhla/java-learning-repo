package DSA.Sorting;
    import java.util.*;
    public class InsertionSort{
    
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
            // Insertion sort array
            for(int i=0;i<arr.length-1;i++){
                int current=arr[i];
                int j=i-1;
                while(j>=0&&current<arr[j]){
                    arr[j+1]=arr[j];
                    j--;
                }
                
                arr[j+1]=current;
               
                
            }
            System.out.println("Here is your Sorted array : ");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
          
        
          }
          public static void main(String[] args) {
             InsertionSort o1=new InsertionSort();
             o1.AccendingSort();
          }
        
    }
    
    
    

