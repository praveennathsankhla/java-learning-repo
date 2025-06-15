

public class Pen {
    String color;
    String type;
   int quentity;

    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.quentity);
    }
}
class user{
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="Red";
        pen1.type="ball";
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="gel";
        pen2.quentity=3;
            pen1.printInfo();
            pen2.printInfo();
        }
    }
