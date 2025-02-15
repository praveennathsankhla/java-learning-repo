public class Ractangle {

int length;
int breadth;
 Ractangle(){
    System.out.println("Ractangle");
    length=breadth=0;
}
 Ractangle(int side){
    length=breadth=side;
    System.out.println("Two parameter invoke");
}
 Ractangle(int l,int b){
    System.out.println("Tree parameter invoke");
    length=l;
    breadth=b;
}
int area() {
    return length*breadth;
}
}


class user7{
    public static void main(String[] args){
            Ractangle R1=new Ractangle();
            Ractangle R2=new Ractangle(5);
            Ractangle R3=new Ractangle(5,10);

            System.out.println(R1.area());
            System.out.println(R2.area());
            System.out.println(R3.area());


    }
}