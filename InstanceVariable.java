//A variable which is inside the class but outside of all the method
//Syntax:
//Class A
//   {
//     int a; // Instance Variable
//     public static void main(String args[])
//   }

public class InstanceVariable {
    String name;
    int roll;
    static String faculty;

    public void show() {
        System.out.println("Name: " + name + " Roll NO: " + roll + "Faculty: " + faculty);
    }
}

class Demo {
    public static void main(String[] args) {
        InstanceVariable ob1 = new InstanceVariable();
        ob1.name = "Roshan";
        ob1.roll = 20;
        ob1.faculty = "BCA";

        InstanceVariable ob2 = new InstanceVariable();
        ob2.name = "Pravin";
        ob2.roll = 16;
        ob2.faculty = "BBA";

        InstanceVariable ob3 = new InstanceVariable();
        ob3.name = "Yogesh";
        ob3.roll = 25;
        ob3.faculty = "BBA-TT";

        // Corrected placement of the statements
        ob1.faculty = "BBA";//The program focuses on static variable And print BBA in the place of faculty

        ob1.show();
        ob2.show();
        ob3.show();
    }
}



// public class InstanceVariable {
//     String name;
//     int roll;
//     static String faculty; 

//     public void show(){
//         System.out.println("Name :"+name+ ",Roll NO :"+roll +",Faculty :"+faculty);
//     }
// }

// class demoo{
//     public static void main(String args[]) {
//         InstanceVariable ob1 = new InstanceVariable();
//         ob1.name="Roshan";
//         ob1.roll=20;
//         ob1.faculty="BCA";

//         InstanceVariable ob2 = new InstanceVariable();
//         ob2.name="Pravin";
//         ob2.roll=16;
//         ob2.faculty="BBA";

//         InstanceVariable ob3 = new InstanceVariable();
//         ob3.name="Yogesh";
//         ob3.roll=25;
//         ob3.faculty="BBA-TT";
    
//     ob1.faculty="BCA";

//     ob1.show();
//     ob2.show();
//     ob3.show();
// }
// }
