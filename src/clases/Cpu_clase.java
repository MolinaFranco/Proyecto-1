/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 *
 * @author franco
 */
public class Cpu_clase {

    private static final Sigar sigar = new Sigar();
    private static String marca;
    private static String modelos;
    private static int cores;
    private static double usada;

    public Cpu_clase() throws SigarException {
        CpuPerc cpuperc = sigar.getCpuPerc();
        org.hyperic.sigar.CpuInfo[] infos = sigar.getCpuInfoList();
        org.hyperic.sigar.CpuInfo info = infos[0];

        
        marca = (info.getVendor());
        modelos = (info.getModel());
        cores = (Runtime.getRuntime().availableProcessors());
        usada = (cpuperc.getCombined() * 100 );
    }

    public static void main(String[] args) throws SigarException {

    }

    public static Sigar getSigar() {
        return sigar;
    }

    public static String getMarca() {
        return marca;

    }

    public static String getModelos() {
        return modelos;
    }

    public static int getCores() {
        return cores;
    }

    public static double getUsada() {
        return usada;
    }

}
