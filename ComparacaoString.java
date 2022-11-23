public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "barbara";
        String nome2 = new String("barbara");

        //verificar se nome1 é igual ao que está dentro de nome2
        String resultado = (nome1.equals(nome2)) ? "igual" : "diferente";

        System.out.println(resultado);
        
    }
}
