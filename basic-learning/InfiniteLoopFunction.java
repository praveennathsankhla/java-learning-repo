package DSA;

public class InfiniteLoopFunction {
    public void infiniteLoop(){
        do { 
            System.out.println("Infinite loop is runing");
           
        } while (true);
    }   
     public static void main(String args[]){
        InfiniteLoopFunction o1=new InfiniteLoopFunction();
        o1.infiniteLoop();
    }
    
}
