import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);

        System.out.print("em que ano voce nasceu? ");
        int nascimento = t.nextInt();

        int idade = 2022 - nascimento;
        System.out.println("sua idade é: " + idade);

        if(idade>= 18){
            System.out.println("você é maior de idade");
        } else{
            System.out.println("você é menor de idade");
        }
    }
}
