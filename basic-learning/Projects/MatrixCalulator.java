package Projects;
import java.net.SocketPermission;
import java.util.Scanner;
public class MatrixCalulator {
    public static  void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //Fist screen

    System.out.print("Type the number which you want calculate:- \n 1.Addition of two arrays \n 2. Subtraction of two arrays \n 3.Multipliction of two arrays \n 4.Inverse of an array \n 5.Determinant \n 6.Transpose \n 7.Dot Product \n 8.Scalar Multiplication \n Enter number : ");
    int opration=sc.nextInt();
    

    //Addition programm
    if(opration==1){
        System.out.println("Note:- Both matrix must have same rows and colums.");
        //First size array input
        System.out.print("Enter number of first matrix rows : " );
            int firstMatrixRows=sc.nextInt();
        System.out.print("Enter the number of fist matrix colums : ");
         //first array's element input
            int firstMatrixColums=sc.nextInt();
            double firstMatrix[][]=new double[firstMatrixRows][firstMatrixColums];
         for(int i=0;i<firstMatrixRows;i++){
            for(int j=0;j<firstMatrixColums;j++){
                int rowsCount=i+1;
                int columsCount=j+1;
                System.out.print("Enter the ("+(rowsCount)+","+(columsCount)+") element of FIRST Matrix : ");
                firstMatrix[i][j]=sc.nextDouble();
            }
            System.out.println();
        }
            //printfirst array's matrix
            System.out.println("Here is your first Matrix :-");
            for(int m=0;m<firstMatrixRows;m++){
                    for(int n=0;n<firstMatrixColums;n++){
                        System.out.print(firstMatrix[m][n]+"  ");
                    }
                    System.out.println();
            }

        //  //Second size array input
        //  System.out.print("Enter number of SECOND matrix rows : " );
        //      int secondMatrixRows=sc.nextInt();
        //  System.out.print("Enter number of SECOND matrix colums: ");
        // int secondMatrixColums=sc.nextInt();
          //Second array's element input
             
             double secondMatrix[][]=new double[firstMatrixRows][firstMatrixColums];
          for(int i=0;i<firstMatrixRows;i++){
             for(int j=0;j<firstMatrixColums;j++){
                int rowsCount=i+1;
                int columsCount=j+1;
                System.out.print("Enter the ("+(rowsCount)+","+(columsCount)+") element of SECOND Matrix : ");
                 secondMatrix[i][j]=sc.nextDouble();
             }
             System.out.println();
         }
             //print FIRST AND SECOND  array's matrix
             System.out.println("Here is your SECOND Matrix :-");
             for(int m=0;m<firstMatrixRows;m++){
                     for(int n=0;n<firstMatrixColums;n++){
                         System.out.print(secondMatrix[m][n]+"  ");
                     }
                     System.out.println();
             }

             //Addition code for FIRST AND SECOND ARRAY
             System.out.println(" HERE IS THE ADDITION OF FIRST AND SECOND ARRAY :- \n FIST MATRIX + SECOND MATRIX=");
              for(int i=0;i<firstMatrixRows;i++){
                    for(int j=0;j<firstMatrixColums;j++){
                         double sum=firstMatrix[i][j]+secondMatrix[i][j];
                         System.out.print(sum+"  ");
                    }
                    System.out.println();
              }
            }
            
        //Subtraction of the matrix
            else if(opration==2){
       
        System.out.println("Note :- Note:- Both matrix must have same rows and colums.");
                 //input the size of first matrix
                System.out.print("Enter the number of raws in matrix : ");
                int rawsOfMatrix=sc.nextInt();
                System.out.print("Enter the number of colums in matrix : ");
                int columsOfMatrix=sc.nextInt();
                double firstMatrix[][]=new double[rawsOfMatrix][columsOfMatrix];
                   
                //Elements input first matrix
                for(int i=0;i<rawsOfMatrix;i++){
                    for(int j=0;j<columsOfMatrix;j++){
                        int rowsCount=i+1;
                      int columsCount=j+1;
                        System.out.print("Enter ("+(rowsCount)+","+(columsCount)+") element of the FIRST matrix : ");
                        firstMatrix[i][j]=sc.nextDouble();
                    }
                    System.out.println();
                }
                //print FIRST matrix
                System.out.println("Here is your first matrix : ");
                for(int i=0;i<rawsOfMatrix;i++){
                    for(int j=0;j<columsOfMatrix;j++){
                        System.out.print(firstMatrix[i][j]+" ");
                    }
                    System.out.println();
            }

              //Elements input second matrix
              double secondMatrix[][]=new double[rawsOfMatrix][columsOfMatrix];
              for(int i=0;i<rawsOfMatrix;i++){
                for(int j=0;j<columsOfMatrix;j++){
                    int rowsCount=i+1;
                  int columsCount=j+1;
                    System.out.print("Enter ("+(rowsCount)+","+(columsCount)+") element of the second matrix : ");
                    secondMatrix[i][j]=sc.nextDouble();
                }
                System.out.println();
            }
            //print FIRST matrix
            System.out.println("Here is your second matrix : ");
            for(int i=0;i<rawsOfMatrix;i++){
                for(int j=0;j<columsOfMatrix;j++){
                    System.out.print(secondMatrix[i][j]+" ");
                }
                System.out.println();
        }
             //Subtraction code for FIRST AND SECOND ARRAY
             System.out.println("Here is SUBTRACTED matrix of first and second matrix : ");
             for(int i=0;i<rawsOfMatrix;i++){
                for(int j=0;j<columsOfMatrix;j++){
                        double sub=firstMatrix[i][j]-secondMatrix[i][j];
                        System.out.print(sub+"  ");
                }
                System.out.println();
             }
        }
        else if(opration==3){
            System.out.println("Note:- Number of colums of first matrix must be equal to number of rows of second matrix.");
            //First matrix input
            System.out.print("Enter the number of rows of first matrix : ");
            int firstMatrixRows=sc.nextInt();
            System.out.print("Enter the number of colums of first matrix : ");
            int firstMatrixColums=sc.nextInt();
            double firstMatrix[][]=new double[firstMatrixRows][firstMatrixColums];
            for(int i=0;i<firstMatrixRows;i++){
                for(int j=0;j<firstMatrixColums;j++){
                    int rowsCount=i+1;
                    int columsCount=j+1;
                    System.out.print("Enter the ("+(rowsCount)+","+(columsCount)+") element of FIRST Matrix : ");
                    firstMatrix[i][j]=sc.nextDouble();
                }
                System.out.println();
            }
            //printfirst array's matrix
            System.out.println("Here is your first Matrix :-");
            for(int m=0;m<firstMatrixRows;m++){
                    for(int n=0;n<firstMatrixColums;n++){
                        System.out.print(firstMatrix[m][n]+"  ");
                    }
                    System.out.println();
            }

            //Second matrix input
            System.out.print("Enter the number of rows of second matrix : ");
            int secondMatrixRows=sc.nextInt();
            System.out.print("Enter the number of colums of second matrix : ");
            int secondMatrixColums=sc.nextInt();
            double secondMatrix[][]=new double[secondMatrixRows][secondMatrixColums];
            for(int i=0;i<secondMatrixRows;i++){
                for(int j=0;j<secondMatrixColums;j++){
                    int rowsCount=i+1;
                    int columsCount=j+1;
                    System.out.print("Enter the ("+(rowsCount)+","+(columsCount)+") element of SECOND Matrix : ");
                    secondMatrix[i][j]=sc.nextDouble();
                }
                System.out.println();
            }
            //printfirst array's matrix
            System.out.println("Here is your second Matrix :-");
            for(int m=0;m<secondMatrixRows;m++){
                    for(int n=0;n<secondMatrixColums;n++){
                        System.out.print(secondMatrix[m][n]+"  ");
                    }
                    System.out.println();
            }
            //Multiplication code for FIRST AND SECOND  
            if(secondMatrixRows==firstMatrixColums){


               
                double[][] result = new double[firstMatrixRows][secondMatrixColums];

            for (int i = 0; i < firstMatrixRows; i++) {
                for (int j = 0; j < secondMatrixColums; j++) {
                    double sum = 0;
                    for (int k = 0; k < firstMatrixColums; k++) {
                        sum += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                    result[i][j] = sum;
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible As your given raws colums .");
        }
        }

        //Code for TRANSPOSE calculation of matrix

        else if(opration==6){

            //Input a 2d array
            System.out.print("Enter the number of rows of matrix : ");
            int matrixRaws=sc.nextInt();
            System.out.print("Enter the number of colums of matrix : ");
            int matrixColums=sc.nextInt();
            double matrix[][]=new double[matrixRaws][matrixColums];
            for(int i=0;i<matrixRaws;i++){
                for(int j=0;j<matrixColums;j++){
                    int rowsCount=i+1;
                    int columsCount=j+1;
                    System.out.print("Enter the ("+(rowsCount)+","+(columsCount)+") element of SECOND Matrix : ");
                    matrix[i][j]=sc.nextDouble();
                }    }
            System.out.println("Here is your  Matrix :-");
            for(int m=0;m<matrixRaws;m++){
                    for(int n=0;n<matrixColums;n++){
                        System.out.print(matrix[m][n]+"  ");
                    }
                    System.out.println();
        }
            //Calculate TRANSPOSE
            System.out.println("Here is TRANSPOSE Of your matrix " );
            for(int k=0;k<matrixColums;k++){
                    for(int m=matrixRaws-1;m>=0;m--){
                           
                            System.out.print(matrix[m][k]+" ");

                    }
                    System.out.println();
            }


        }
    }}

