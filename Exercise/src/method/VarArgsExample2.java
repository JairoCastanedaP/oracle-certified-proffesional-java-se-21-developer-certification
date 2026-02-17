package method;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VarArgsExample2 {

    public static void main(String[] args) {

        log("INFO", "Aplicación iniciada");
        log("ERROR","Archivo no encontrado","Ruta: /home/data/file.txt","Código: 404");
        log("DEBUG"); // también válido (0 mensajes)
    }

    public static void log(String level, String... mensajes) {

        // Formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaActual = sdf.format(new Date());

        // Si no llegan mensajes
        if (mensajes.length == 0) {
            System.out.println(fechaActual + " [" + level + "] - (sin mensaje)");
            return;
        }

        // Si llegan uno o varios mensajes
        for (String mensaje : mensajes) {
            System.out.println(fechaActual + " [" + level + "] - " + mensaje);
        }
    }
}
