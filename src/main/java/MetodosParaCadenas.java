public class MetodosParaCadenas {
    // String = Clase
    public static void main(String[] args) {
        
            String mensaje = "Hola, soy un String";

            int cantidad = mensaje.length(); // Longitud de la cadena
            
            boolean contiene = mensaje.contains(("Hola")); // Evalua si contiene los caracteres 
           //boolean contiene = mensaje.contains(("hola"));
            
           boolean comienzaCon = mensaje.startsWith("Hola");
           boolean terminaCon = mensaje.endsWith("String");
           //boolean terminaCon = mensaje.endsWith("g");

           String nuevoString = mensaje.concat(", estamos en el curso de Java.");
               
            System.out.println(cantidad);
            System.out.println(contiene);
            System.out.println(comienzaCon);
            System.out.println(terminaCon);
            System.out.println(nuevoString);
            
    }

}
