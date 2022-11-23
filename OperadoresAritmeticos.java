public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /* 
        // média
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;

        System.out.println("a media eh igual a: " + media);
        */

        /* 
        // Incrementação
        int numero = 5;
        numero++;
        System.out.println(numero);
        */

        /*
        // saída vai ser 10 pois incrementou depois:
        int numero = 5;
        int valor = 5 + numero++;
        System.out.println(valor); */

        /* 
        // saída vai ser 11 pois incrementou antes:
        int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);
        */

        /*
        // operador de atribuição
        int x = 4;
        x += 2;
        System.out.println(x);
        */

        /*
        // raíz quadrada 
        float resultado = (float)Math.sqrt(25);
        System.out.println(resultado);
        */

        /* 
        float valor = 8.3f;
        int arredondamento = (int)Math.floor(valor);
        System.out.println(arredondamento);
        */

        // gerar números aleatórios
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        int numero = (int)(5 + aleatorio * (10-5));
        System.out.println(numero);
    }
}
