interface College {
    String c_name = "Citizen";

    void showInfo();
}

class Student {
    String s_name;
    String faculty;

    Student(String a, String b) {
        this.s_name = a;
        this.faculty = b;
    }
}

class StudentDetails extends Student implements College {
    public StudentDetails(String a, String b) {
        super(a, b); // Corrected 'super' keyword
    }

    public void showInfo() {
        System.out.println("Student Name: " + s_name);
        System.out.println("College Name: " + c_name);
    }
}

public class Interface {
    public static void main(String[] args) {
        StudentDetails p1 = new StudentDetails("Roshan", "BCA");
        p1.showInfo();
    }
}
