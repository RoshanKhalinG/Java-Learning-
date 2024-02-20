import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.*;

public class socServer {
    public static void main(String[] args) throws Exception {
        System.out.println("Server is started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("Server is waiting for the client request");
        Socket s = ss.accept();

        System.out.println("Client connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String course = br.readLine();

        System.out.println("Client data: " + course); // Corrected variable name

        // Prepare response
        String courses = "BBA, BCA, BBA-TT"; // Corrected variable name and added spaces
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(courses); // Corrected variable name
        out.flush();

        System.out.println("Data sent from server to client");

        // Close resources
        out.close();
        os.close();
        br.close();
        s.close();
        ss.close();
    }
}

