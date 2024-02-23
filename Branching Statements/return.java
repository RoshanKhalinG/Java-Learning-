// 3. Return
// The return statement is also a branching statement, which allows us to explicitly return value
// from a method. The return statement exits us from the calling method and passes the control
// flow to where the calling method is invoked. Just like the break statement, the return
// statement also has two forms, i.e., one that passes some value with control flow and one that
// doesn't.
// Example
class A
{
 int a , b , sum;
 public int add()
 {
 a = 10;
 b = 15;
 sum = a + b;
 return sum;
 }
}
class B {
    public static void main(String[] args) {
        A obj = new A();
        int res = obj.add();
        System.out.println("Sum of two numbers = " + res);
    }
}
