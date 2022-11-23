import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numero;
        int soma = 0;
        String resposta;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.print("digite um numero: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.println("quer continuar? [S/N]");
            resposta = teclado.next();
        } while (resposta.equals("S"));
        System.out.println(("a soma de todos os valores eh: "+soma));
    }
}
    
