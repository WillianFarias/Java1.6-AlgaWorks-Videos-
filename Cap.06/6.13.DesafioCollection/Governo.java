import java.util.List ;
import java.util.ArrayList ;
import java.util.Map ;
import java.util.HashMap ;
import java.math.BigDecimal ;

  public class Governo {

  // armazena uma lista de políticos por estado da federação
  private Map<String, List<Politico>> partidosPoliticos;

  public Governo() {
    this.partidosPoliticos = new HashMap<String, List<Politico>>();
  }

  public void adicionarPolitico(String partidoPolitico, Politico politico) {
  // recupera a lista de políticos para um partido

    List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
    //o método get verifica se existe valores para a chave informada, caso nao
    //exista ele retorna nulo

    // se não existir uma lista de políticos para o partido informado,
    // devemos instanciar uma nova lista (pois é a primeira inclusão neste partido)
    if (politicos == null ) {
      politicos = new ArrayList<Politico>();
    }

    // adiciona o político recebido como parâmetro à lista de políticos
    politicos.add(politico);

    // adiciona a lista de políticos ao mapa de partidos usando
    // como chave o nome do partido
    this.partidosPoliticos.put(partidoPolitico, politicos);
  } 

  public BigDecimal calcularGastosComSalario(String partidoPolitico) {
  // implementar busca de políticos para o partido informado
  // e cálculo dos salários

    //System.out.println(partidosPoliticos.containsKey(partidoPolitico)); 

    //System.out.println(partidosPoliticos.get(partidoPolitico).getCargo());

    /*
    List <Politico> politicos = partidosPoliticos.get(partidoPolitico);
    politicos = new ArrayList<Politico>();
    politicos.getCago();*/

    //System.out.println(partidosPoliticos.get(partidoPolitico));

    //System.out.println(partidosPoliticos.values());
    BigDecimal valorGasto = new BigDecimal(0);
    BigDecimal valor = new BigDecimal(0);

    List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
    //politicos.forEach(politico -> politico.getCargo().getSalario().doubleValue());
    for(Politico politico : politicos) {

      valor = (politico.getCargo().getSalario());
      valorGasto = valorGasto.add(valor);
      //valorGasto.add
    }

    return valorGasto;
    
  }

  public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
  // implementar busca dos políticos para o partido e cargo informados
  // e cálculo dos salários

    BigDecimal bigdecimal = new BigDecimal(0);
    return bigdecimal;
  }
}