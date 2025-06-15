
//static field 
public class Assign3 {
    int length;
    int breadth;
    static int rectCount=0;
    void getData(int l,int b){
        length=l;
        breadth=b;
        rectCount++;
    }
    int area(){
        int rectArea;
        rectArea=length*breadth;
        return rectArea;
    }
}
class SataticFieldDemo{
    public static void main(String[] args){
            Assign3 RectFirst=new Assign3();
            RectFirst.getData(5,6);
           
            System.out.println("First Rectangle area is "+ RectFirst.area());
            Assign3 RectSecond=new Assign3();
            RectSecond.getData(10,20);
            System.out.println("Rectangle Second area is "+RectSecond.area());
            //Static field apllying
            System.out.println("Total number of Ractangle is "+Assign3.rectCount);
    }
}
