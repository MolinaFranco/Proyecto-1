package dev.ebner;

import java.io.File;
import java.net.UnknownHostException;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class Prueba {
    
    private static final Sigar sigar = new Sigar();
    
    
    public static void main(String[] args) throws UnknownHostException, SigarException {
        
        File file = new File("/");
        long totalSpace = file.getTotalSpace();     // Total disk space in bytes.
        long usableSpace = file.getUsableSpace();   // Free disk space in bytes.
        long freeSpace = file.getFreeSpace();       // Free disk space in bytes.

        int kb = 1024;
        int mb = 1024 / 1024;
        int gb = 1024 / 1024 / 1024;
        int tb = 1024 / 1024 / 1024 / 1024;
        
        Mem ram = null;
        CpuPerc cpuperc = null;
        org.hyperic.sigar.CpuInfo[] infos = sigar.getCpuInfoList();
        org.hyperic.sigar.CpuInfo info = infos[0];     
        
        try {
            ram = sigar.getMem();
            cpuperc = sigar.getCpuPerc();
        } catch (SigarException se) {
        }




    // Internet:


    
    // Sistema Operativo:
        System.out.println("\nSistema Operativo:");
        System.out.println("\tNombre del usuario.: " + System.getProperty("user.name"));
        System.out.println("\tSistema Operativo..: " + System.getProperty("os.name"));
        System.out.println("\tUptime.............: " + "");
        
        
    // CPU:  
        System.out.println("\nCPU:");
        System.out.println("\tMarca..............: " + info.getVendor());
        System.out.println("\tModelo.............: " + info.getModel());
        System.out.println("\tCores...,..........: " + Runtime.getRuntime().availableProcessors());
        System.out.println("\tUsada (%)..........: " + cpuperc.getCombined()*100 + " %");
        


    // Memoria:
        System.out.println("\nMemoria:");
        System.out.println("\tTotal..............: " + ram.getTotal() / 1024 / 1024 + " MB");
        System.out.println("\tLibre..............: " + ram.getActualFree() / 1024 / 1024 + " MB");
        System.out.println("\tUsada..............: " + ram.getActualUsed() / 1024 / 1024 + " MB");
        System.out.println("\tUsada (%)..........: " + ram.getUsedPercent() + " %");
        
    // Disk:
        System.out.println("\nDisco:");
        System.out.println("\tTotal..............: " + totalSpace / 1024 / 1024 / 1024 + " GB");
        System.out.println("\tLibre..............: " + freeSpace / 1024 / 1024 / 1024 + " GB");
        float porcentaje = 100-((freeSpace*100) / totalSpace);
        System.out.println("\tUsado .............: " +  porcentaje + " %");
        
        System.out.println("\n\n\n");
    



    }
    
}
