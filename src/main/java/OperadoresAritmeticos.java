public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int variableX = 50, variableY = 10;
        int resultado;

        resultado = variableX + variableY;
        System.out.println(resultado);
        
        resultado = variableX - variableY;
        System.out.println(resultado);

        resultado = variableX * variableY;
        System.out.println(resultado);

        resultado = variableX / variableY;
        System.out.println(resultado);

        // ++ incrementa en uno
        // -- decrece en uno

        variableX++;
        System.out.println(variableX);

        variableX +=100; // variableX = variableX + 100;
        System.out.println(variableX);

        variableX -=100; // variableX = variableX + 100;
        System.out.println(variableX);

        variableX *=3; // variableX = variableX + 100;
        System.out.println(variableX);

        variableX /=3; // variableX = variableX + 100;
        System.out.println(variableX);


    }

}
