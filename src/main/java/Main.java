import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite valor");
        int valorInteiro = Integer.parseInt(valor);
        System.out.println(valorInteiro);
    }
}
