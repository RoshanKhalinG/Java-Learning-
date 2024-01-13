// Thread creation by implementing the Runnable Interface
// The easiest way to create a thread is to create a class that implements the Runnable interface.
// To implement Runnable interface, a class need only implement a single method called run().
// Example
class A implements Runnable
{
 public void run()
 {
 for(int i=1; i<=10; i++)
 {
 System.out.println("NIST");
 }
 }
}
class B implements Runnable
{
 public void run()
 {
 for(int i=1; i<=10; i++)
 {
 System.out.println("college");
 }
 }
}
public class thread
{
 public static void main(String args[])
 {
 Runnable ob1 = new A();
 Runnable ob2 = new B();
 Thread t1 = new Thread(ob1);
 Thread t2 = new Thread(ob2);
 t1.start();
 t2.start();
 }
}
