class SaldoInsuficienteException extends Exception {
  
  //Regras de negocio extende-se Exception são excessoes verificadas *obg
  //a tratar com try_catch e obrigado a colocar o throws
  //RuntimeException estão ligadas a erro de programacao, valores ilegais
  public SaldoInsuficienteException(String mensagem){
    super(mensagem);
  }
}