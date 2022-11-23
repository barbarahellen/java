import java.util.Scanner;

public class TiposPrimitivos {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        System.out.print("digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s eh %.1f \n", nome, nota);
        teclado.close();
    }
}
