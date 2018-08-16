package componentes;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class CPU {

    private static final Sigar sigar = new Sigar();

    public static void main(String[] args) throws SigarException {

        CpuPerc cpuperc = sigar.getCpuPerc();
        org.hyperic.sigar.CpuInfo[] infos = sigar.getCpuInfoList();
        org.hyperic.sigar.CpuInfo info = infos[0];

        System.out.println("CPU:");
        System.out.println("\tMarca.......: " + info.getVendor());
        System.out.println("\tModelo......: " + info.getModel());
        System.out.println("\tCores.......: " + Runtime.getRuntime().availableProcessors());
        System.out.println("\tUsada (%)...: " + cpuperc.getCombined() * 100 + " %");

    }
}
