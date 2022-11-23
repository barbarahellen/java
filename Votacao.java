import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
     
        Scanner t = new Scanner(System.in);

        System.out.print("em que ano voce nasceu? ");
        int nascimento = t.nextInt();

        int idade = 2022 - nascimento;
        System.out.println("sua idade é: " + idade);

        if(idade < 16){
            System.out.println("não vota!");
        } else if(((idade >= 16) && (idade < 18)) || (idade >= 70)){
            System.out.println("voto opcional");
        }else if((idade >= 18) && (idade <= 70)){
            System.out.println("Voto obrigatório");
        } 
    }
}
