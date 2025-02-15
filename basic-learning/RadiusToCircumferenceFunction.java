//Write a function that takes in the radius as input and returns the circumference of a circle.

package DSA;
import java.util.Scanner;
public class RadiusToCircumferenceFunction{
    public double CircumferenceCalculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of CIRCLE in METERS : ");
        double radius=sc.nextFloat();
        double Circlumference;
        double pi=3.14159;
        Circlumference=(2*radius)*pi;
          System.out.println("If  radius is "+radius+" Circumference is  "+Circlumference);
        return Circlumference;
    }
    public static void main(String []arg){
        RadiusToCircumferenceFunction o1=new RadiusToCircumferenceFunction();
        o1.CircumferenceCalculate();
    }

}