package com.albertolewis;

import java.io.IOException;
import java.net.InetAddress;

public class NetworkScanner {

    public boolean checkConnectivity(String ipAddress) throws IOException {

        InetAddress inetAddress = InetAddress.getByName(ipAddress);

        return inetAddress.isReachable(3000);
    }


}
