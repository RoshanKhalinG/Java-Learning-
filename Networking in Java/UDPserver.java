// In Java, DatagramPacket is a class used to represent a packet of data to be sent or received over a network using UDP (User Datagram Protocol). UDP is a connectionless protocol where data is sent as individual packets known as datagrams, without establishing a continuous connection between the sender and receiver.

// Here are some key points about DatagramPacket:

// Data Container: It encapsulates the data to be sent or received. This data is represented as a byte array.

// Address and Port Information: It contains information about the destination address and port when sending data, and source address and port when receiving data.

// Constructor Overloads: DatagramPacket provides several constructor overloads to initialize instances for sending or receiving data.

// Sending Data: When sending data, you create a DatagramPacket instance with the data to be sent, the length of the data, the destination address, and the destination port.

// Receiving Data: When receiving data, you create a DatagramPacket instance to hold the received data, specify the buffer to store the data, and wait for incoming datagrams.

// Methods: It provides methods to retrieve the data, sender's address, and port number after receiving data.

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPserver {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(9999);
        byte[] b1 = new byte[1024];

        
        DatagramPacket dp = new DatagramPacket(b1,b1.length);
        ds.receive(dp);

        String str = new String(dp.getData(),0,dp.getLength());
        int num = Integer.parseInt(str);
        int result = num*num;

        byte[] b2= (result + "").getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(b2,b2.length,  dp.getAddress(), dp.getPort());
        ds.send(dp1);
        ds.close();
    }
    
}
