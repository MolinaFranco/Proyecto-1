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
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Uptime;

public class Sistema_clase {

    private static final Sigar sigar = new Sigar();
    private static String sist_op;
    private static String arqui_so;
    private static String versio_os;
    private static String ruta_home;
    private static String nombre_usu;
    private static String uptime_1;

    public static Sigar getSigar() {
        return sigar;
    }

    public static String getSist_op() {
        sist_op = (System.getProperty("os.name"));
        return sist_op;
    }

    public static String getArqui_so() {
        arqui_so = (System.getProperty("os.arch"));
        return arqui_so;
    }

    public static String getVersio_os() {
        versio_os = (System.getProperty("os.version"));
        return versio_os;
    }

    public static String getRuta_home() {
        ruta_home = (System.getProperty("user.home"));
        return ruta_home;
    }

    public static String getNombre_usu() {
        nombre_usu = (System.getProperty("user.name"));
        return nombre_usu;
    }

    public static String getUptime_1() {
        Uptime uptime = null;
        String strUptime = "";

        try {
            uptime = sigar.getUptime();
            strUptime = String.valueOf(uptime);
        } catch (Exception e) {

        }
        uptime_1 = ((formatoUptime(strUptime) / 60) + " minutos");
        return uptime_1;
    }

    public static int formatoUptime(String uptime) {

        String salida = "";
        String indicePermitido = "OK";
        int salida_int = 0;

        for (int i = 8; i < uptime.length(); i++) {
            char c = uptime.charAt(i);

            String letra = Character.toString(c);

            if ("OK".equals(indicePermitido)) {
                if (!".".equals(letra)) {
                    salida = salida + letra;

                } else {
                    indicePermitido = letra;
                }
            }
        }
        salida_int = Integer.parseInt(salida);
        return salida_int;
    }

}
