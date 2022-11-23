public class OperadoresLogicos {
    public static void main(String[] args) {
       
        int x = 4;
        int y = 7;
        int z = 12;
        boolean resultado;

        resultado = (x < y && y < z) ? true : false;
        //resultado = (x == y || y == z) ? true : false;
        
        System.out.println(resultado);

    }
}
