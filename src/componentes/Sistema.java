package componentes;

import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Uptime;

public class Sistema {

    private static final Sigar sigar = new Sigar();

    public static void main(String[] args) throws SigarException {

        Uptime uptime = null;
        String strUptime = "";

        try {
            uptime = sigar.getUptime();
            strUptime = String.valueOf(uptime);
        } catch (Exception e) {

        }

        System.out.println("Sistema Operativo:");
        System.out.println("\tSistema Operativo....: " + System.getProperty("os.name"));
        System.out.println("\tArquitectura del SO..: " + System.getProperty("os.arch"));
        System.out.println("\tVersion del SO.......: " + System.getProperty("os.version"));
        System.out.println("\tRuta del Home........: " + System.getProperty("user.home"));
        System.out.println("\tNombre del usuario...: " + System.getProperty("user.name"));
        System.out.println("\tUptime...............: " + (formatoUptime(strUptime) / 60) 
                + " minutos");

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
