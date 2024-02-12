import java.io.IOException;
import java.io.RandomAccessFile;
public class Random
{
 public static void main(String[] args) throws IOException
 {
 RandomAccessFile raf = new
RandomAccessFile("D:\\file\\eliza.txt", "r");
 //moving file pointer
 raf.seek(6);

 byte[] data = new byte[16];

 //storing file data
 raf.read(data);
 //printing file data
 System.out.println(new String(data));
 }
}