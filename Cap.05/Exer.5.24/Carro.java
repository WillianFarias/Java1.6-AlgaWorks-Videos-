public class Carro implements Seguravel{
  
  private double valorMercado;
  private int anoFabricacao;

  //Construtor
  public Carro(double valorMercado, int anoFabricacao){
    this.valorMercado = valorMercado;
    this.anoFabricacao = anoFabricacao;
  }

  //Metodo que retorna ano e valor do carro
  public String obterDescricao(){

    return "Carro de ano " + this.anoFabricacao + 
    " com valor de mercado " + this.valorMercado;
  
  }

  @Override
  public double calcularValorApolice() {
    
    double valorApolice = this.valorMercado * 0.04;
    if(this.anoFabricacao < 2000){
      valorApolice = valorApolice * 0.90;
    }
    
    return valorApolice;
  }
}