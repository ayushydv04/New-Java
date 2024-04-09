public class TypesOfConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int roll;

    // This is Non-Parameterized constructor
    Student(){
        System.out.println("Non-Parametarized Constuctor is called");
    }

    // Parameterized constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
