public class School {

    String name;
    String medium;
    int students;

    // Method overloading for getInfo
    public void getInfo(String schoolName) {
        System.out.println(schoolName);
    }

    public void getInfo(String schoolName, String languageMedium) {
        System.out.println(schoolName);
        System.out.println(languageMedium);
    }

    public void getInfo(String schoolName, String languageMedium, int totalStudents) {
        System.out.println(schoolName);
        System.out.println(languageMedium);
        System.out.println(totalStudents);
    }

    // Constructor with different parameter names
    School(String schoolName, String languageMedium, int totalStudents) {
        name = schoolName;          // Assign parameter to instance variable
        medium = languageMedium;
        students = totalStudents;
    }
}

class User1 {
    public static void main(String[] args) {
        // Creating an object of the School class
        School school1 = new School("DPS", "Hindi", 300);
        School school2=new School("GSSSD","Hindi",1000);

        // Calling the getInfo method
        school1.getInfo(school1.name, school1.medium, school1.students);
        school2.getInfo(school1.name,school1.medium);
    }
}
