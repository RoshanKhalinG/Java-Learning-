// The BufferedWriter class of the java.io package can be used with other writers to write
// data (in characters) more efficiently.
// ➢ It extends the abstract class writer.
// ➢ The BufferedWriter maintains an internal buffer of 8192 characters.
// ➢ During the write operation, the characters are written to the internal buffer instead of
// the disk. Once the buffer is filled or the writer is closed, the whole characters in the
// buffer are written to the disk.
// ➢ Hence, the number of communication to the disk is reduced. This is why writing
// characters is faster using BufferedWriter.

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// class MyBufferedWriter {
//  public static void main(String[] args) throws IOException
//  {
//  BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt" ));
//  //FileWriter fw = new FileWriter("D:\\file\\nishan.txt");
//  //BufferedWriter bw = new BufferedWriter(fw);
//  bw.write("I am working at citizen college, \n");
//  bw.write("I am working at Milton college. \n");
//  bw.write("I am working at Nist college");
//  System.out.println("Data is successfully written in the file. ");
//  bw.close();
//  }
// }


import java.io.*;
public class Bufferwriter {

    public static void main(String[] args) {
        try{
             FileWriter fw = new FileWriter("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");
             BufferedWriter bw = new BufferedWriter(fw);

        try{
            bw.write("I am working at citizen college, \n");
            bw.write("I am working at Milton college. \n");
            bw.write("I am working at Nist college");

        }
            finally{
                bw.close();
            }
            System.out.println("Data is successfully written in the file. ");
        }
       catch(Exception e){
                System.out.println(e);
            }
    }
}