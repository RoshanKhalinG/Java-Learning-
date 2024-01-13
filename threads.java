
//Thread creation by extending the Thread class
// We create a class that extends the java.lang.Thread class. This class overrides the run()
// method available in the Thread class. A thread begins its life inside run() method. We create
// an object of our new class and call start() method to start the execution of a thread. Start()
// invokes the run() method on the Thread object.
// Example

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("NIST");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("college");
        }
    }
}

public class threads {
    public static void main(String args[]) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.start();
        ob2.start();
    }
}
