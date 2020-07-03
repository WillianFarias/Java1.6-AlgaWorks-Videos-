import java.util.ArrayList;
import java.util.List;

public class FaturaStreamDAO {

  public List<FaturaStream> buscarFaturasVencidas() {
    //viria do banco
    List<FaturaStream> faturas = new ArrayList<>();
    faturas.add(new FaturaStream("willian.gmail.com", 400));
    faturas.add(new FaturaStream("maria.gmail.com", 80));
    faturas.add(new FaturaStream("samanta.gmail.com", 100));
    
    return faturas;
  }

}