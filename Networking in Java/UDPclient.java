// Datagram(Datagram Packet, Datagram Server and Datagram client)
// Datagram packet class represents a datagram packet. They are used to
// implement a connectionless packet delivery service. Each message is route from
// one machine to another based on solely on information contained within the
// packet. Multiple packet sent from one machine to another might route
// differently and might arrival in any order and the packet delivery is not granted.
// Datagrams are bundle of information passed between machines once the
// datagram have been released to its intended target, there is no assurance that
// it will arrive or even that someone will be there to catch it. Likewise, when the
// datagram is received there is no assurance that it has not been damage in
// transmit or that whoever sent it still there to receive a response.
// Java implements a datagram on top of the UDP protocol by using two classes as;
// the Datagram packet object is the data container and the datagram socket is the
// mechanism used to send and receive datagram packet.

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPclient {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        int i=8;
        byte[] b = (i + "").getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b,b.length, ia,9999);
        ds.send(dp);

        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);

        String str = new String(dp1.getData(),0,dp1.getLength());
        System.out.println("Result is : " +str);
        ds.close();
    }
    
}
