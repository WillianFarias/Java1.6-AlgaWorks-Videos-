//No caso de interfaces usa-se a palavra implements
public class NotaFiscal implements Imprimivel {
  
  @Override
  public void imprimir(){
    System.out.println("Imprimindo cara");
  }

  public void soNotaFiscal() {
    System.out.println("Só nota fiscal");
  }
  
}