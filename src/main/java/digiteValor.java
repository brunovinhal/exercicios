import javax.swing.*;

public class digiteValor {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite valor");
        int valorInteiro = Integer.parseInt(valor);
        System.out.println(valorInteiro);
    }
}
