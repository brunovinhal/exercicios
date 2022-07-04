import javax.swing.*;

public class tabuada {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("informe um numero para taboada");
        int taboada = Integer.parseInt(valor);
        System.out.println("Taboada do: " + taboada  );
        for (int x = 1; x <= 10; x++) {
            System.out.print(x + "x" + taboada + "=");
            System.out.println(x * taboada);

        }
    }
}
