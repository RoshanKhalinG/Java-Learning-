// Branching Statements
// Branching statements are the statements used to jump the flow of execution from one part
// of a program to another. The branching statements are mostly used inside the control
// statements. Java has mainly three branching statements, i.e., continue, break, and return.
// The branching statements allow us to exit from a control statement when a certain condition
// meet.
// 1. Break Statements
// The break keyword is used to stop the entire loop. The break keyword must be used inside
// any loop or a switch statement. The break keyword will stop the execution of the innermost
// loop and start executing the next line of code after the block.
// Example

class Test5
{
 public static void main(String args[])
 {
 int [] numbers = {10, 20, 30, 40, 50};
 for(int x : numbers )
 {
 if( x == 30 )
 {
 break;
 }
 System.out.println( x );
 }
 System.out.println("Bye");
 }
}
