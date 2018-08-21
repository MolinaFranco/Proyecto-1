package componentes;

import java.io.File;

public class Almacenamiento {

    public static void main(String[] args) {

        File file = null;
        try {
            file = new File("/");
            long totalSpace = file.getTotalSpace();     // Total disk space in bytes.
            long freeSpace = file.getFreeSpace();       // Free disk space in bytes.
            long usableSpace = file.getUsableSpace();   // Free disk space in bytes.

            System.out.println("Disco:");
            System.out.println("\tTotal..............: " + totalSpace / 1024 / 1024 + " MB");
            System.out.println("\tLibre..............: " + usableSpace / 1024 / 1024 + " MB");
            System.out.println("\tUsado..............: " + 
                    ((totalSpace - usableSpace) / 1024 / 1024) + " MB");
            float porcentaje = 100 - ((freeSpace * 100) / totalSpace);
            System.out.println("\tUsado .............: " + porcentaje + " %");

        } catch (Exception e) {
            System.out.println("Error: directorio no encontrado.");
        }

    }
}
