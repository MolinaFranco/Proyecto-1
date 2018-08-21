package componentes;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class GPU {

    public static void main(String[] args) {
        /* Se necesita instalar glxinfo, sudo apt install mesa-utils */
        System.out.println("Resolucion..........: " + execute("echo "
                + "$(xdpyinfo | grep dimensions) | cut -d \":\" -f2"));
        
        System.out.println("Modelo..............: " + execute("echo "
                + "$(glxinfo |grep \"Device:\" | cut -d \":\" -f2) | cut -d \"(\" -f 1,2"));
        
        System.out.println("Fabricante..........: " + execute("echo "
                + "$(glxinfo |grep \"Vendor:\" | cut -d \":\" -f2) | cut -d \"(\" -f1"));
        
        System.out.println("Memoria de Video....: " + execute("echo "
                + "$(glxinfo |grep \"Video memory:\" | cut -d \":\" -f2)"));
        
        System.out.println("Vercion.............: " + execute("echo "
                + "$(glxinfo |grep \"Version\" | cut -d \":\" -f2)"));
        
    }    
    public static String execute(String input) {
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
}
    


