public class InformeSistema {
    public static void main (String [] args) {
        // Devuelve el tiempo de ejecucion al programa Java actual
        // Devuelve el numero de procesadores disponible en la JVM
        int procesadores = Runtime.getRuntime().availableProcessors();
        System.out.println("La JVM tiene disponible " + procesadores + " procesadores.");

        long memoriaMax = Runtime.getRuntime().maxMemory();
        long memoriaLibre = Runtime.getRuntime().freeMemory();
        long memoriaTotal = Runtime.getRuntime().totalMemory();

        System.out.println(memoriaMax);
        System.out.println(memoriaLibre);
        System.out.println(memoriaTotal);

    }

}
