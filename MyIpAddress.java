

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIpAddress {

    public static void main(String a[]){
    
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
	    System.out.println("New changes");

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
