import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        
        double v[] = {3.5, 2.75, 9, -4.5};

        // coloca os elementos em ordem 
        Arrays.sort(v); 

        // Para cada elemento de v, coloque eles dentro de valor
        for(double valor: v){
            System.out.print(valor + " ");
        }
    }
}
