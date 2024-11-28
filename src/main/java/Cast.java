public class Cast {
    public static void main(String[] args) {

        int variableX = 50, variableY = 10;
        float variableZ = 5.5f;
        int resultado;
        float resultado2;

        //resultado = variableX + variableZ; Error
        resultado = variableX + (int)variableZ;
        System.out.println(resultado);

        System.out.println(variableZ);
        System.out.println((int)variableZ);

        resultado2 = (float)variableX + variableZ;
        System.out.println(resultado2);
        
    }

}
