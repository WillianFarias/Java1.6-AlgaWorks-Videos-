import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

    EnviadorEmail enviadorEmail = new EnviadorEmail();

    /*
     * for (Fatura fatura : faturasVencidas) {
     * enviadorEmail.enviar(fatura.getEmailDevedor(), fatura.resumo()); }
     */

    // Utilizando lambda
    /*faturasVencidas.forEach(fatura -> enviadorEmail.enviar
    (fatura.getEmailDevedor(), fatura.resumo()));*/

    //referencia de metodo quando quero chamar apenas um metodo de um obj
    faturasVencidas.forEach(Fatura::empremirResumo);
  }
}