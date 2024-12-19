public class MetodosParaFormatoDeCadenas {
    public static void main(String[] args) {
        // String = Clase
        String mensaje = "    Hola, soy un String    ";

        System.out.println(mensaje.toUpperCase()); // Mayúsculas
        System.out.println(mensaje.toUpperCase().trim()); // Mayúsculas y sin espacios

        System.out.println(mensaje.toLowerCase()); // Minusculas
        System.out.println(mensaje.toLowerCase().trim()); // Minusculas y sin espacios
        System.out.println();
        System.out.println(mensaje);
        System.out.println(mensaje.trim()); // Elimina los espacios al inicio y al final

        System.out.println("Este mensaje es el original: " + mensaje); // No modifica el contenido de la variable
                                                                       // original

    }

}
