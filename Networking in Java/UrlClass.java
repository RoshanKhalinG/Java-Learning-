import java.io.*;
import java.net.*;

/**
 * UrlClass
 */
public class UrlClass {
        public static void main(String[] args) {
            try{
                URL url = new URL("https://192.168.1.5:/index.html");
                System.out.println("URL is "+url.toString());
                System.out.println("Protocal is "+url.getProtocol());
                System.out.println("Authority is "+url.getAuthority());
                System.out.println("Port is "+url.getPort());
                System.out.println("FileName is "+url.getFile());
                System.out.println("Path is "+url.getPath());
                System.out.println("Host is "+url.getHost());
            }
            catch(MalformedURLException e){
                e.printStackTrace();
            }
        }
    
}