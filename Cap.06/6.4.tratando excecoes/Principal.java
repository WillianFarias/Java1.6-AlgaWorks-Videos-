class Principal {
  public static void main(String[] args) {
    
    ContaCorrente cc = new ContaCorrente(100);

    try {
      cc.depositar(-1);
    } catch (IllegalArgumentException e) {
      //TODO: handle exception
      System.out.println("Você executou uma operação ilegal: " + e.getMessage());
    }

    //Excessoes tratadas
  }
}
