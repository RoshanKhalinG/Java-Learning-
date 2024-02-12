import java.io.PrintWriter;
public class Printwriter
{
 public static void main(String[] args)
 {
 try
 {
 PrintWriter pw = new PrintWriter("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");
 try
 {
 char c = 'N';
 pw.println(c);
 pw.println("hi we are a student of citizen college");
 pw.print(10.2f );
 pw.print( true);
 }
 finally
 {
 pw.close();
 }
 System.out.println("Data is successfully written in the file.");
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 }
}