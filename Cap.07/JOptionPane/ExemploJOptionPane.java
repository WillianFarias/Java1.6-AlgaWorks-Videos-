import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ExemploJOptionPane {
  public static void main(final String[] args) throws Exception {
    //Define qual o estilo sera aplicado no box que sera exibido, é necessário
    //adicionar o throws 
    //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

    //defeault
    JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");

    //atencao
    JOptionPane.showMessageDialog(null, "Atenção - e-mail não informado.", "Atenção", JOptionPane.WARNING_MESSAGE);

    //erro
    JOptionPane.showMessageDialog(null, "Favor informar o CPF", "Erro", JOptionPane.ERROR_MESSAGE);

    //sem icone
    JOptionPane.showMessageDialog(null, "obrigado", "Obrigado", JOptionPane.PLAIN_MESSAGE);

    URL url = ExemploJOptionPane.class.getResource("insta.png");
    Icon icone = new ImageIcon(url);

    JOptionPane.showMessageDialog(null, "Bem vindo ao Insta", "Insta", JOptionPane.INFORMATION_MESSAGE, icone);

  }
}