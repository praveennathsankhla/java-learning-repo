class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        }
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }
    }
class oops{
    public static void main(String[] args) {
        Student s1=new Student("Praveen",18);
        Student s2=new Student("Sawai",21);
        s1.getInfo();
        s2.getInfo();
    }
}