import javax.swing.*;

public class Validacao {

    public static void main(String[] args) {
        String minha = JOptionPane.showInputDialog("Digite um dado inteiro ");
        boolean eUmInteiro = minha.matches("-?\\d+");
        if	(eUmInteiro	== true)	{
            System.out.println(" dado valido " + minha);
        }	else	{
            System.out.println("dado imvalido");
        }
    }
}
