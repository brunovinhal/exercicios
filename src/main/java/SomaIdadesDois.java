import javax.swing.*;

public class SomaIdadesDois {

    public static void main(String[] args) {
        int soma = 0;
        String quantidade = JOptionPane.showInputDialog("Digite sua quantidade de idades que voce quer somar ");
        int valor = Integer.parseInt(quantidade);
        for (int i = 0; i < valor; i++) {
            String idade = JOptionPane.showInputDialog("Digite a idade ");
            int valor1 = Integer.parseInt(idade);
            System.out.println("idade digitada " + valor1);
            soma = soma + valor1;
        }
        System.out.println("total das idades " + soma);
    }
}
