import java.nio.file.FileSystems;

public class InformeSistema {
    public static void main (String [] args) {
        // Devuelve el tiempo de ejecucion al programa Java actual
        // Devuelve el numero de procesadores disponible en la JVM
        int procesadores = Runtime.getRuntime().availableProcessors();
        System.out.println("La JVM tiene disponible " + procesadores + " procesadores.");
        System.out.println("");

        //Cuantos bytes hay en un Mebibyte
        long bytesEnMiB = 1024 * 1024;
        //Obtiene la cantidad maxima de memoria que la JVM usará
        long memoriaMax = Runtime.getRuntime().maxMemory() / bytesEnMiB;
        //Memoria total Java actualmente asignada
        long memoriaTotal = Runtime.getRuntime().totalMemory() / bytesEnMiB;
        //Memoria libre dentro del contenedor
        long memoriaLibre = Runtime.getRuntime().freeMemory() / bytesEnMiB;
        //Memoria siendo utilizada
        long memoriaEnUso = memoriaTotal - memoriaLibre;
        //Porcentaje del contenedor de memoria actual está ocupado
        double porcentajeUso = ((double) memoriaEnUso / memoriaTotal) * 100;

        System.out.println("--- MEMORIA · ANTES ---");
        System.out.println("Memoria Total Asignada: " + memoriaTotal + " MiB.");
        System.out.println("Memoria Libre: " + memoriaLibre + " MiB." );
        System.out.println("En uso: " + memoriaEnUso + porcentajeUso + " MiB.");
        System.out.println("Máxima (-Xmx): " + memoriaMax + " MiB");
        System.out.println("");

        //Reservado 64 MiB, la JVM reserva ese e                                spacio en la memoria RAM para guardar datos
        long[] reservado = new long[8 * 1024 * 1024];
        long memoriaMax2 = Runtime.getRuntime().maxMemory() / bytesEnMiB;
        long memoriaTotal2 = Runtime.getRuntime().totalMemory() / bytesEnMiB;
        long memoriaLibre2 = Runtime.getRuntime().freeMemory() / bytesEnMiB;
        long memoriaEnUso2 = memoriaTotal2 - memoriaLibre2;
        long incremento = memoriaEnUso2 - memoriaEnUso;

        System.out.println("--- MEMORIA · DESPUÉS RESEVAR 64 MIB ---");
        System.out.println("Memoria Total Asignada: " + memoriaTotal2 + " MiB.");
        System.out.println("Memoria Libre: " + memoriaLibre2 + " MiB." );
        System.out.println("En uso: " + memoriaEnUso2 + porcentajeUso + " MiB.");
        System.out.println("Máxima (-Xmx): " + memoriaMax2 + " MiB.");
        System.out.println("Incremento en uso: " + incremento + " MiB.");
        System.out.println(reservado[0]);
        System.out.println("");


        System.out.println("--- SISTEMA ---");

        //Obtener Sistema Operativo
        String obtenerSO = System.getProperty("os.name");
        System.out.println("os.name: " + obtenerSO);

        //Obtener separador de rutas
        String separador = System.getProperty("file.separator");
        System.out.println("file.separator: \"" + separador + "\"");

        //Obtener ruta usuario
        String directorioUsuario = System.getProperty("user.home");
        System.out.println("Ruta construida con las propiedades:  " + directorioUsuario );
        System.out.println("");

        System.out.println("--- PROPIEDADES QUE EMPIEZAN POR os., user., java.version ---");
        String javaVersion = System.getProperty("java.version");
        System.out.println("java.version = " + javaVersion);

        String javaVersionDate = System.getProperty("java.version.date");
        System.out.println("java.version.date = " + javaVersionDate);

        String archJVM  = System.getProperty("os.arch");
        System.out.println("os.arch = " + archJVM);

        String osName  = System.getProperty("os.name");
        System.out.println("os.name = " + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os.version = " + osVersion);

        String userCountry = System.getProperty("user.country");
        System.out.println("user.country = " + userCountry);

        String userDir = System.getProperty("user.dir");
        System.out.println("user.dir = " + userDir);

        String userHome = System.getProperty("user.home");
        System.out.println("user.home = " + userHome);

        String userLanguage = System.getProperty("user.language");
        System.out.println("user.language = " + userLanguage);

        String userName = System.getProperty("user.name");
        System.out.println("user.name = " + userName);
        System.out.println("");

        System.out.println("--- PROCESO EN ESPERA ---");
        System.out.println("Buscame desde otra terminal con:");
        System.out.println("ps -ef | grep InformeSistema");
        System.out.println("");
        System.out.println("Pulsa INTRO para terminar...");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        scanner.nextLine();

        System.out.println("Fin del programa.");

    }
}
