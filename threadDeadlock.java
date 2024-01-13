// Thread Deadlock
// Deadlock is a situation of complete lock, when no thread can complete its execution because
// lack of resources. In the below picture, thread is holding a resource R1, and need another
// resource R2 to finish execution, but R2 is locked by thread 2, which needs R3, which in turn is
// locked by thread 3. hence none of them can finish and are stuck in a deadlock.’

// Example
class DeadlockExample
{
 public static void main(String[] args)
 {

 final String r1 = "BCA";
 final String r2 = "java";
 Thread t1 = new Thread()
 {
 public void run()
 {
 synchronized(r1)
 {
 System.out.println("Thread 1: Locked r1");
 try
 {
 Thread.sleep(100);
 } catch(Exception e) {}
 synchronized(r2)
 {
 System.out.println("Thread 1: Locked r2");
 }
 }
 }
};
 Thread t2 = new Thread()
 {
 public void run()
 {
 synchronized(r1)
 {
 System.out.println("Thread 2: Locked r1");
 try
 {
 Thread.sleep(100);
 } catch(Exception e) {}
 synchronized(r2)
 {
 System.out.println("Thread 2: Locked r2");
 }
 }
 }
 };
 t1.start();
 t2.start();
 }
}
