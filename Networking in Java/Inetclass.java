
// Internet Address class
import java.net.*;
public class Inetclass {
    public static void main(String[] args) {
        try{
            InetAddress IP = InetAddress.getByName("citizencollege.edu.np");
            System.out.println("Host Address : "+IP.getHostAddress());
            System.out.println("Host Name :" +IP.getHostName());
        }
        catch(Exception e){
            System.out.println("Unknown Host or Address :"+e.getMessage());
        }
    }
}
