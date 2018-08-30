/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 *
 * @author franco
 */
public class Gpu_clase {

    private static final Sigar sigar = new Sigar();
    private static String modelo;
    private static String fabricante;
    private static String vercion;
    private static String memoria;

    public Gpu_clase() {
        modelo = (execute("echo "
                + "$(glxinfo |grep \"Device:\" | cut -d \":\" -f2) | cut -d \"(\" -f 1,2"));

        fabricante = (execute("echo "
                + "$(glxinfo |grep \"Vendor:\" | cut -d \":\" -f2) | cut -d \"(\" -f1"));

        memoria = (execute("echo "
                + "$(glxinfo |grep \"Video memory:\" | cut -d \":\" -f2)"));

        vercion = (execute("echo "
                + "$(glxinfo |grep \"Version\" | cut -d \":\" -f2)"));
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Gpu_clase.modelo = modelo;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Gpu_clase.fabricante = fabricante;
    }

    public static String getVercion() {
        return vercion;
    }

    public static void setVercion(String vercion) {
        Gpu_clase.vercion = vercion;
    }

    public static String getMemoria() {
        return memoria;
    }

    public static void setMemoria(String memoria) {
        Gpu_clase.memoria = memoria;
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
