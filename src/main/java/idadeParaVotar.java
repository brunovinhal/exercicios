import javax.swing.*;

public class idadeParaVotar {

    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite ano de nascimento ");
        int idade = 2022 - Integer.parseInt(valor);
        System.out.println("idade atual: " + idade);
        if (idade >= 16) {
            System.out.println("pode votar ");
        } else {
            System.out.println("Nao podéra votar ");
        }
    }
}

