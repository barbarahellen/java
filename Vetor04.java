import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};

        for(int valor : vetor){
            System.out.print(valor + " ");
        }
        System.out.println(" ");

        Arrays.sort(vetor); // ordena o vetor

        int posicao = Arrays.binarySearch(vetor, 8);  // Busca binária (nome do vetor, valor procurado)
        System.out.println("encontrei o valor na posicao " + posicao);
    }
}
