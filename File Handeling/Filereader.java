// FileReader is useful to read data in the form of characters from a ‘text’ file.
// • This class inherited from the InputStreamReader class.
// • The constructors of this class assume that the default character encoding and the default
// byte – buffer size are appropriate. To specify these values yourself, construct an
// InputStreamReader on a FileInputStream.
// • FileReader is meant for reading streams of characters. For reading streams of raw bytes,
// consider using a FileInputStream.
// Example
import java.io.FileReader;
import java.io.IOException;
public class Filereader
{
 public Filereader(String string) {
 }
 public static void main(String args[])
 {
 try
 {
 FileReader r = new FileReader("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileoutput.txt" );
 try
 {
 int i;
 while((i = r.read()) != -1)
 {
 System.out.print((char)i);
 }
 }
 finally
 {
 r.close();
 System.out.println("file closed");
 }
 }
 catch(IOException e)
 {
 System.out.println("Exception Handeled");
 }
 }
}