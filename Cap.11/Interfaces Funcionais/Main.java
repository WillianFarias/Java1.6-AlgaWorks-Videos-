public class Main {
  
  public static void main(String[] args) {
    
    //Impressora i = new ImpressoraHP();
    Impressora i = (c) -> {
      System.out.println("Testando antes de imprimir" + c);
    };

    Compra compra = new Compra("Sabonete", 2.50);
    i.imprimir(compra);
  }
}