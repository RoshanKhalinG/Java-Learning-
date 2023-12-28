// A variable which is declared inside the body of the method or method parameter
// Syntax:
//        void fun()
//        {
//         int x; //which is local variable
//        }



public class LocalVariable 
{
   public void age(){
    int age = 0;
    age = age+7;

    System.out.println("The age is : "+age);
   }    
}
class demo{
    public static void main(String args[])
{
    LocalVariable ob = new LocalVariable();
    ob.age();
}

}
