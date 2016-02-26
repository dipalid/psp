

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIpAddress {

    public static void main(String a[]){
    
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
            System.out.println(ipAddr.getHostName());
              if(OS == null) { OS = System.getProperty("os.name"); }
              return OS;
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
