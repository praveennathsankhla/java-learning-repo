public class Circle {
    int x,y,radius;

    Circle(){
        radius=1;
    }
    Circle( int x1,int y1){
       this();
        x=x1;
        y=y1;
        
    }
    Circle(int x1,int y1,int r){
        this(x1,y1);
        radius=r;
    }
    void area(){
        System.out.println("The area of circle is "+(Math.PI*radius*radius));
    }
}
class user7{
    public static void main(String[] args) {
        Circle o1=new Circle();
       Circle o2=new Circle(5,6);
       Circle o3=new Circle(5,6,7);
       o1.area();
       o2.area();
       o3.area();
    }
    

}
