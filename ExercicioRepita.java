import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int n;
        int s = 0;

       do{
             n = Integer.parseInt(JOptionPane.showInputDialog(null, "informe um numero (valor 0 interrompe): "));
             s += n;
       } while (n != 0);
       
       JOptionPane.showMessageDialog(null, "<html>Resultado final <br>------" + "<br>somatório vale: "+ s);
    }
}
