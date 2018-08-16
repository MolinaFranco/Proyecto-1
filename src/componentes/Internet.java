package componentes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Internet {

    public static void main(String[] args) throws Exception{
        
        System.out.print("\nInternet:");
        if (isWireless()) {
            System.out.println("(Estas conectado a una red WiFi)");
            System.out.println("\tSSID..................: " + getSSID());
        }else{
            System.out.println("(Estas conectado a una red cableada)");
        }

        System.out.println("\tIP....................: " + getIP());
        System.out.println("\tMascara de subred.....: " + getMascaraSubred());
        System.out.println("\tDireccion de difucion.: ");
        System.out.println("\tDNS primario..........: ");
        System.out.println("\tDNS sxecundario.......: ");
    }
    
//    ifconfig $(ifconfig|grep -Eo '^e[^ ]+')|grep -Eo 'Másc[^ ]+'|cut -d: -f2
//    ifconfig $(ifconfig|grep -Eo '^w[^ ]+')|grep -Eo 'Másc[^ ]+'|cut -d: -f2
//    
    
    
    private static String getMascaraSubred(){
        String output = null;
        if(isWireless()){
            
            try {
            Process exec = Runtime.getRuntime().exec("ifconfig $(ifconfig|grep -Eo '^w[^ ]+')|grep -Eo 'Másc[^ ]+'|cut -d: -f2");
            BufferedReader r = new BufferedReader(new InputStreamReader(exec.getInputStream()));

            output = r.readLine();       
            return output;
            } catch (Exception e) {
        }
        }else{
            
        }
        
        return output;
    }
    public static String getIP() throws SocketException{
        Enumeration e = NetworkInterface.getNetworkInterfaces();
        NetworkInterface n = (NetworkInterface) e.nextElement();
        Enumeration ee = n.getInetAddresses();
        ee.nextElement();
        InetAddress i = (InetAddress) ee.nextElement();
        return i.getHostAddress();
    }
    
    public static boolean isWireless() {

        try {
            Process exec = Runtime.getRuntime().exec("iwgetid");
            BufferedReader r = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            String output;
            output = r.readLine();
            if (output.contains("ESSID:")) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    private static String getSSID() {
        ////wlp18s0   ESSID:"Colgate De Esta"
        String output = null;
        try {
            Process exec = Runtime.getRuntime().exec("iwgetid -r");
            BufferedReader r = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            output = r.readLine();

        } catch (Exception e) {
        }

        return output;
    }
}
