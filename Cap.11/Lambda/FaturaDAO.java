import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

  public List<Fatura> buscarFaturasVencidas() {
    //viria do banco
    List<Fatura> faturas = new ArrayList<>();
    faturas.add(new Fatura("willian.gmail.com", 400));
    faturas.add(new Fatura("maria.gmail.com", 80));
    faturas.add(new Fatura("samanta.gmail.com", 100));
    
    return faturas;
  }

}