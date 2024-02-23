// TCP/IP (Transmission Control Protocol/Internet Protocol) based server and client refer to a networking model used for communication over the Internet or any other network. TCP/IP is the most widely used networking protocol suite, providing reliable and connection-oriented communication between devices. Here's a brief explanation of TCP/IP based server and client:

// ### TCP/IP Server:
// A TCP/IP server is a program or device that provides services or resources to other devices (clients) over a network using the TCP/IP protocol suite. It listens for incoming connections from clients, accepts those connections, and processes requests from them. TCP/IP servers typically run continuously, waiting for client requests and responding to them accordingly.

// #### Key characteristics:
// - Listens for incoming connections on a specific port.
// - Accepts connections from multiple clients concurrently.
// - Handles client requests and provides services or resources.
// - Implements the server-side of the TCP/IP protocol stack, including TCP (Transmission Control Protocol) and IP (Internet Protocol).

// ### TCP/IP Client:
// A TCP/IP client is a program or device that initiates a connection to a server over a network using the TCP/IP protocol suite. It communicates with the server by sending requests and receiving responses. TCP/IP clients are typically applications or devices that require services or resources provided by servers.

// #### Key characteristics:
// - Initiates connections to a specific server and port.
// - Sends requests to the server for services or resources.
// - Waits for and receives responses from the server.
// - Implements the client-side of the TCP/IP protocol stack, including TCP (Transmission Control Protocol) and IP (Internet Protocol).

// ### Example:
// Imagine a web browser (client) connecting to a web server (server) to request a web page. The browser establishes a TCP connection to the server's port 80 (HTTP), sends an HTTP request for the desired web page, and waits for the server's response. The server processes the request, retrieves the requested web page, and sends it back to the client over the established TCP connection.

// In summary, TCP/IP based server and client facilitate communication between devices over a network using the TCP/IP protocol suite. The server provides services or resources, while the client initiates connections and requests these services or resources from the server.



// Implementing TCP / IP based Client
import java.io.*;
import java.net.*;
public class SocClient {
    public static void main(String[] args) throws Exception{
         String ip="localhost";
        int port = 9999;

        Socket s = new Socket(ip, port);

        String str = "What re the courses offered by the citizen college";

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        os.write(str +"\n");
        os.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String course = br.readLine();
        System.out.println("C: Data from server "+course);

    }
}
