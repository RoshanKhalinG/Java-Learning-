// import java.io.*;
// public class FileOutput
// {
//  public static void main(String args[])
//  {
//  try
//  {
//  FileOutputStream out = new FileOutputStream( "C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileoutput.txt" );
//  try
//  {
//  String data = "Hello There!";
//  byte[] byteArray = data.getBytes();
//  out.write(byteArray);
//  }
//  finally
//  {
//  out.close();
//  }
//  System.out.println("Data is successfully written in the file. ");
//  }
//  catch(Exception e)
//  {
//  System.out.println(e);
//  }
//  }
// }


import java.io.*;
public class FileOutput {

    public static void main(String[] args) {
        try{
          FileOutputStream out = new FileOutputStream("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileoutput.txt" );
          try{
            String data = "Hi there!";
            byte[] byteArray=data.getBytes();
            out.write(byteArray);
          }   
          finally{
            out.close();
          }
          System.out.println("Data is successfully store");
        }
       catch(Exception e){
        System.out.println(e);
       }

    }
}

