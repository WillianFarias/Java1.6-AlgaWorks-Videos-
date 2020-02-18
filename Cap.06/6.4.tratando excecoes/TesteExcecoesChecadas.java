public class TesteExcecoesChecadas {
  public static void main(String[] args) {

    ContaCorrente cc = new ContaCorrente(10);

    try {
      cc.sacar(60);
      System.out.println("Saldo: " + cc.getSaldo());  
      
    //Poderia usar um Exception que trataria qlquer Exception
    } catch (SaldoInsuficienteException e) {
      System.out.println(e.getMessage()); 
    }

    try {
      cc.sacar(5); 
    } catch (Exception e) {
      //TODO: handle exception
    } finally {
      System.out.println("Sempre serei executado! OBG!");
    }
    
  }
}