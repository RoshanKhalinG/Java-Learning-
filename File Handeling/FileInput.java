// This stream is used for reading data from the files. Object can be created using the keyword
// new and there are several types of constructors available. Following constructor takes a file
// name as a string to create an input stream object to read the file.
// FileInputStream in = new FileInputStream("D:\\file\\Nishanta.txt");
// Following constructor takes a file object to create an input stream object to read the file.
// File f = new File("D:\\file\\Nishanta.txt");
// FileInputStream fin = new FileInputStream(f);

//import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInput
{
 public static void main(String args[])
 {
 try
 {
FileInputStream in = new FileInputStream("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");
 try
 {
 int i;
 while((i = in.read()) != -1)
 {
 System.out.print((char)i);
 }
 }
 finally
 {
 in.close();
 System.out.println("file closed");
 }
 }
 catch(IOException e)
 {
 System.out.println("Exception Handeled");
 }
 }
}