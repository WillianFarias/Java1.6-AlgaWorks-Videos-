//No caso de interfaces usa-se a palavra implements
//Pode-se implementar mais de uma interface
public class NotaFiscal implements Imprimivel {
  
  @Override
  public void imprimir(){
    System.out.println("Imprimindo cara");
  }

  public void soNotaFiscal() {
    System.out.println("Só nota fiscal");
  }

}