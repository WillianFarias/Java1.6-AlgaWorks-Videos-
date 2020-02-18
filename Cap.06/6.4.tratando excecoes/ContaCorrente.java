class ContaCorrente {

  private double saldo;

  //Contrutor
  public ContaCorrente(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double deposito) {
    if (deposito <= 0){
      //lançando uma excessao
      throw new IllegalArgumentException("Valor não pode ser menor ou igual a 0");
    }
    this.saldo += deposito;
  }

  //Por ter um throws sou obrigado a tratar a excecao lancada
  public void sacar(double quantidade) throws SaldoInsuficienteException {
    double saldoTemp = saldo - quantidade;
    if (saldoTemp < 0) {
      throw new SaldoInsuficienteException("Você não possui saldo suficiente");
    }
    this.saldo -= quantidade;
  }

  //Métodos Get
  public double getSaldo(){
    return this.saldo;
  }
}