package br.com.desafio.heranca.sobreposicao;

public class ContaReceber extends Conta {

	private Cliente cliente;

	public ContaReceber() {

	}

	public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {

	}

	public void receber() {

	}

	public void cancelar() {
		if (getSituacaoConta().ordinal() == 0 && getValor() < 50000d) {
			setSituacaoConta(SituacaoConta.CANCELADA);
			System.out.println("A conta foi cancelada");
		} else {
			System.out.println("Conta CANCELADA ou PAGA");
		}
	}

	// GETTERS AND SETTERS
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
