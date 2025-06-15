



public class Person {
    private String name;
    private int age;

        public Person(String PersonName,int PersonAge){
                name=PersonName;
               age= PersonAge;
        }
       public String getName(){
            return name;
        }
       public int getAge(){
            return age;
        }
       public void setName(String PersonName){
               name=PersonName;
       }
       public void setAge(int PersonAge){
      age=PersonAge;
       }

}
class user6{
    public static void main(String[] args) {
        Person P1=new Person("Lalit",23);
        Person P2=new Person("MAhendra",21);
       
        System.out.println(" Person age is "+ P1.getAge()+ " And Name is "+P1.getName()); 
          
        System.out.println(" Person age is "+ P2.getAge()+ " And Name is "+P2.getName());
        
        System.out.println("There is new data ......");
        P1.setAge(30);
        P1.setName("Lauti");
       System.out.println( "First age is "+P1.getAge()+" And the name is "+P1.getName());
        P2.setAge(44);
        P2.setName("Praveen");
        System.out.println("First person is "+P2.getAge()+" Year old And his Name is "+P2.getName());
        
        
            
    }
}
