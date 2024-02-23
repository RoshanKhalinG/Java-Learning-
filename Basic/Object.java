package Basic;
public class Object {
    String name;
    public void show(){
        System.out.println(name);
    }
}
class demo{
    public static void main(String[] args) {
        Object obj = new Object();
        obj.name = "Hello Universe";
        obj.show();
    }
}
