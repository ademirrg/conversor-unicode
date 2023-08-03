import javax.swing.*;

public class Conversor {
    public static void main(String[] args) {
        char c;
        String[] campo;
        String caracteres = "";
        String str = JOptionPane.showInputDialog(null, "Digite o nome para converter em UNICODE:","Conversor UNICODE",JOptionPane.QUESTION_MESSAGE);

        if(str == null) {
            System.exit(0);
        }
        else if(str.length()==0) {
            JOptionPane.showMessageDialog(null, "O campo não pode estar em branco!", "ERRO", JOptionPane.ERROR_MESSAGE);
            main(new String[]{});
        }
        else if(str.length()>25) {
            JOptionPane.showMessageDialog(null, "O campo pode receber apenas 25 caracteres!", "ERRO", JOptionPane.ERROR_MESSAGE);
            main(new String[]{});
        }

        campo = str.split("");
        int soma = 0;

        for (int i=0;i<str.length();i++) {
            c = campo[i].charAt(0);
            caracteres = caracteres + "O caractere: "+ c + " representa: " + (int)c + "\n";
            soma = soma + (int)c;
        }
        JOptionPane.showMessageDialog(null, caracteres + "\n" + "A soma UNICODE é = " + soma, "Conversor UNICODE", JOptionPane.INFORMATION_MESSAGE);
        main(new String[] {});
    }
}
