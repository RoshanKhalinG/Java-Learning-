// Read text from a character input stream, buffering character so as to provide for the
// efficient reading of characters, array and lines.
// • The buffer size may be specified or the default size may be used.
// • The default is large enough for most purpose. In general, each read request made of a
// Reader causes a corresponding read request to be made of the underlying character or
// byte stream. It is therefore advisable to wrap a BufferedReader around any Reader.
// • Programs that use DataInputStreams for textual input can be localized by replacing each
// DataInputStream with an appropriate BufferedReader.


// import java.io.*;
// public class Bufferdreader {
//     public static void main(String[] args) throws Exception{
//         FileReader fr = new FileReader("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");
//         BufferedReader br = new BufferedReader(fr);

//         String data = "";
//         while ( (data=br.readLine())!=null) {
//             System.out.println(data);
//         }

//     }
// }


import java.io.*;
public class Bufferdreader {
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("C:\\Users\\Acer\\Desktop\\Citizen\\JAVA CLASS\\File Handeling\\fileOutput.txt");
            BufferedReader br = new BufferedReader(fr); 
            try{
               String data = "";
               while ( (data=br.readLine())!=null) 
               {
            System.out.println(data);
               }
            }
            finally{
                  fr.close();
        }
        System.out.println("Data is successfully written in the File");
        }
        catch (Exception e) {
              System.out.println(e);
        }
    }
    
}
