/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;

/**
 *
 * @author franco
 */
public class Ram_clase {

    private static final Sigar sigar = new Sigar();
    private static String total;
    private static String libre;
    private static String usada;
    private static double porcentaje_usado;

    public Ram_clase() {

        Mem ram = null;

        try {
            ram = sigar.getMem();
        } catch (SigarException se) {
        }

        total = (ram.getTotal() / 1024 / 1024 + " MB");
        libre = (ram.getActualFree() / 1024 / 1024 + " MB");
        usada = (ram.getActualUsed() / 1024 / 1024 + " MB");
        porcentaje_usado = (ram.getUsedPercent());
    }

    public static void main(String[] args) throws SigarException {

    }

    public static String getTotal() {
        return total;
    }

    public static void setTotal(String total) {
        Ram_clase.total = total;
    }

    public static String getLibre() {
        return libre;
    }

    public static void setLibre(String libre) {
        Ram_clase.libre = libre;
    }

    public static String getUsada() {
        return usada;
    }

    public static void setUsada(String usada) {
        Ram_clase.usada = usada;
    }

    public static double getPorcentaje_usado() {
        return porcentaje_usado;
    }

    public static void setPorcentaje_usado(double porcentaje_usado) {
        Ram_clase.porcentaje_usado = porcentaje_usado;
    }

}
