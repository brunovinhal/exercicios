import javax.swing.*;

public class InserirSenha {

    public static void main(String[] args) {
        int senha = 1234;
        String senhaInfo = JOptionPane.showInputDialog("Digite a Senha");
        int senhaPessoal = Integer.parseInt(senhaInfo);
        if (senhaPessoal == senha) {
            System.out.println("ACESSO PERMITIDO ");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

}
