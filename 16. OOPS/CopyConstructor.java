public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ayush";
        s1.roll = 123;
        s1.password = "abcd";

        Student s2 = new Student(s1);
        s2.password = "xyz";

    }
}

class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name = name;
        this.roll = roll;
    }

    Student(){
        System.out.println("Constructor");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
