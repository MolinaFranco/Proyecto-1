/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author franco
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Internet_clase {

    public static String getIP() throws SocketException {
        String output = null;
        if (isWireless()) {
            output = execute("ifconfig $(ifconfig|grep -Eo '^w[^ ]+')|grep -Eo 'Direc. inet[^ ]+'|cut -d: -f2");
        } else {
            output = execute("ifconfig $(ifconfig|grep -Eo '^e[^ ]+')|grep -Eo 'Direc. inet[^ ]+'|cut -d: -f2");
        }

        return output;
    }

    private static String execute(String input) {
        String[] cmd = {"/bin/bash", "-c", input};
        String output = null;

        try {
            Process exec = Runtime.getRuntime().exec(cmd);
            BufferedReader r = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            output = r.readLine();

        } catch (Exception e) {
        }
        return output;
    }

    public static String getSSID() {
        String output = execute("iwgetid -r");
        return output;
    }

    public static boolean isWireless() {

        try {
            String output = execute("iwgetid");
            if (output.contains("ESSID:")) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public static String getMasc() {
        String output = null;
        if (isWireless()) {
            output = execute("ifconfig $(ifconfig|grep -Eo '^w[^ ]+')|grep -Eo 'Másc[^ ]+'|cut -d: -f2");
        } else {
            output = execute("ifconfig $(ifconfig|grep -Eo '^e[^ ]+')|grep -Eo 'Másc[^ ]+'|cut -d: -f2");
        }

        return output;
    }

    public static String getDifus() {
        String output = null;
        if (isWireless()) {
            output = execute("ifconfig $(ifconfig|grep -Eo '^w[^ ]+')|grep -Eo 'Difus[^ ]+'|cut -d: -f2");
        } else {
            output = execute("ifconfig $(ifconfig|grep -Eo '^e[^ ]+')|grep -Eo 'Difus[^ ]+'|cut -d: -f2");
        }
        return output;
    }

    public static String[] getDNS() {
        String output = execute("echo $(nmcli dev show | grep DNS | tr -s ' ' |cut -d\" \" -f2)");
        //  192.168.60.1 192.168.0.1 192.168.0.6
        String[] array = output.split(" ");
        return array;
    }

}
