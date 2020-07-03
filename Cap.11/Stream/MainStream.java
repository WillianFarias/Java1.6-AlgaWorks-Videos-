import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainStream {
  public static void main(String[] args) {
    List<FaturaStream> faturaStreams = new FaturaStreamDAO().buscarFaturasVencidas();
    List<FaturaStream> faturas = new ArrayList<>();
    System.out.println(faturas.size());
    /*
     * for (FaturaStream fatura : faturaStreams) { if (fatura.getValor() > 250.0) {
     * System.out.println("Fatura acima de 250 " + fatura.getEmail()); } }
     */

    /* 
    faturaStreams.stream()
      .filter(f -> f.getValor() > 200)
      .forEach(f -> System.out.println(f));*/

    faturaStreams.stream()
      .filter(FaturaStream::estaEmRisco)
      .forEach(System.out::println);

  }
}