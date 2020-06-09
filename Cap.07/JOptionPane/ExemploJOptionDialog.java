import javax.swing.JOptionPane;

public class ExemploJOptionDialog {
  public static void main(String[] args) {

    Object[] opcoes = {"Sim", "Não", "Sim, com e-mail"};
    
    int opcao = JOptionPane.showOptionDialog(null, "Você gostaria de finalizar o cadastro?",
    "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
    null, opcoes, opcoes[2]);

    System.out.println("Opção selecionada: " + opcao);

    //InputDialog
    Object[] possibilidades = {"Masculino", "Feminino"};
    
    String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "AlgaWorks", JOptionPane.PLAIN_MESSAGE,
    null ,possibilidades, possibilidades[0]);

    System.out.println("Sexo selecionado: " + sexo);

    String nome = (String) JOptionPane.showInputDialog(null, "Selecione o sexo", "AlgaWorks", JOptionPane.PLAIN_MESSAGE,
    null ,null, null);

    System.out.println("Sexo selecionado: " + nome);
  }
}