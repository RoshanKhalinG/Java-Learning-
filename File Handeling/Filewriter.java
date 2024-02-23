// FileWriter is useful to create a file writing character into it.
// • This class inherits from the OutputStream class.
// • The constructors of this class assume that the default character encoding and the default
// byte – buffer size are acceptable. To specify these values yourself, construct an
// OutputStreamWriter on a FileOutputStream.
// • FileWriter is meant for writing streams of characters. For Writing streams of raw bytes,
// consider using a FileOutputStream.
// • FileWriter creates the output files if it is not present already.

// import java.io.*;
// public class Filewriter{
//       public static void main(String[] args) {
//         try{
//           FileWriter f = new FileWriter("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");
//           try{
//             f.write("Eliza is working at the ABC Hospital");
//           }
//             finally{
//                   f.close();
//         }
//         System.out.println("Data is successfully written in the File");
        
//         }
// catch (Exception e) {
//               System.out.println(e);
//         }
      
        
//       }

// }


import java.io.*;
public class Filewriter {

  public static void main(String[] args) throws Exception {
    FileWriter fr = new FileWriter("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");

    fr.write("Hey ");
    fr.close();
  }
}