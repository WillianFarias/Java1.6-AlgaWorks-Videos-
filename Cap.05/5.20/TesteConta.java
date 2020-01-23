public class TesteConta {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);

        //Utilizando método static, este metodo nao precisa de um de um objeto
        //estanciado para ser executado
        TesteConta.imprimirSaldo(conta);
        System.out.println("\n");

        //---------------------------------------------------------------------
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3000);
        imprimirSaldo(contaCorrente);
    }

    //Um exemplo de polimorfismo, pois é possível que conta seja uma conta, conta
    //corrente ou contaPoupanca, polimorfismo está ligada a herança
    public static void imprimirSaldo(Conta conta){
        System.out.println("Saldo da conta R$ " + conta.getSaldo());

        if(conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da cc é R$ " + cc.getLimite());
        }
    }
}