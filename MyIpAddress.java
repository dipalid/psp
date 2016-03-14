

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIpAddress {

    public static void main(String a[]){
    
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
            System.out.println(ipAddr.getHostName());
	    System.out.println("This is modified code");
            System.getProperty("os.name");
            System.out.println("This is modified code");

        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
