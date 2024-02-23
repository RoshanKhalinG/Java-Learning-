import java.io.*;
import java.net.*;

public class URLconnection {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://citizencollege.edu.np/");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            int i;
            while ((i=inputStream.read()) != -1) {
                System.out.println((char)i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
