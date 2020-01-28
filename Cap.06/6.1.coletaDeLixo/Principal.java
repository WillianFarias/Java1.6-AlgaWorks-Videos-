public class Principal {
  public static void main(String[] args) {
    
    Carro carro = new Carro();
    carro.setMontadora("Fiat");

    //Limpando referência do objeto da memória 
    carro = null;
  }
}