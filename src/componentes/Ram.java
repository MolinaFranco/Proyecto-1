package componentes;

import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

public class Ram {

    private static final Sigar sigar = new Sigar();

    public static void main(String[] args) throws SigarException {

        Mem ram = null;

        try {
            ram = sigar.getMem();
        } catch (SigarException se) {
        }

        System.out.println("Memoria:");
        System.out.println("\tTotal..............: " + ram.getTotal() / 1024 / 1024 + " MB");
        System.out.println("\tLibre..............: " + ram.getActualFree() / 1024 / 1024 + " MB");
        System.out.println("\tUsada..............: " + ram.getActualUsed() / 1024 / 1024 + " MB");
        System.out.println("\tUsada (%)..........: " + ram.getUsedPercent() + " %");
    }
}
