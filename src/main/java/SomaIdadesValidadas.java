import javax.swing.*;

public class SomaIdadesValidadas {

    public static void main(String[] args) {
        int soma = 0;
        String quantidade = JOptionPane.showInputDialog("Digite a quantidade de idades que voce quer somar ");
        boolean eUmInteiro = quantidade.matches("-?\\d+");
        int valor = 0;
        if (eUmInteiro == true) {
            valor = Integer.parseInt(quantidade);
        } else {
            System.out.println("dado imvalido");
        }
        for (int i = 0; i < valor; i++) {
            String idade = JOptionPane.showInputDialog("Digite a idade ");
            boolean idadeInteiro = idade.matches("-?\\d+");
            if (idadeInteiro == true) {
                int valor1 = Integer.parseInt(idade);
                System.out.println("idade digitada " + idade);
                soma = soma + valor1;
            } else {
                System.out.println("dado imvalido");
            }
        }
        System.out.println("total das idades " + soma);
    }
}
