import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.print("quantas pernas? ");

        int perna = tec.nextInt();
        String tipo;
        System.out.print("isso é um(a): ");

        switch (perna){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "tripé";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 8:
                tipo = "aranha";
                break;
            default:
                tipo = "et";
                break; //break não é necessario
        }
        System.out.print(tipo);
    }
}
