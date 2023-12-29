public class StaticVariable {
    String name;
    int roll;
    static String faculty;

    public void show() {
        System.out.println("Name: " + name + ", Roll NO: " + roll + ", Faculty: " + faculty);
    }
}

class Demo {
    public static void main(String[] args) {
        StaticVariable ob1 = new StaticVariable();
        ob1.name = "MD";
        ob1.roll = 20;
        StaticVariable.faculty = "BCA"; // Access static variable using the class name

        StaticVariable ob2 = new StaticVariable();
        ob2.name = "Neetu";
        ob2.roll = 16;
        StaticVariable.faculty = "BBA"; // Access static variable using the class name

        StaticVariable ob3 = new StaticVariable();
        ob3.name = "Bipash";
        ob3.roll = 25;
        StaticVariable.faculty = "BBA-TT"; // Access static variable using the class name

        ob1.show();
        ob2.show();
        ob3.show();
    }
}
