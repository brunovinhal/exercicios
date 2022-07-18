import javax.swing.*;

public class SomaIdades {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            String idade = JOptionPane
                    .showInputDialog("Digite sua idade ");
            int valor = Integer.parseInt(idade);
            System.out.println("idade digitada " + idade);
            soma = soma + valor;
        }
        System.out.println("total das idades " + soma);
    }
}
