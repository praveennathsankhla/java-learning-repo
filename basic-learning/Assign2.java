//Used static 
class Assign2 {
            int accountNo;
            double balance;
           final static double rate=0.05;
           public void setData(int n,double bal){
            accountNo=n;
            balance=bal;
           }
          public void queterRateCal(){
            double intrest=balance*rate*0.25;
            balance+=intrest;
           }
          public void show(){
                System.out.println("Account number is "+accountNo);
                System.out.println("Rate is "+rate);
                System.out.println("Balance is "+balance);

           }
}
 class user4{
    public static void main(String[] args){
       Assign2 acc1=new Assign2();
       System.out.println("Customer 1 detail is there .....");
       acc1.setData(201,1000);
       acc1.queterRateCal();
       acc1.show();

    }

}