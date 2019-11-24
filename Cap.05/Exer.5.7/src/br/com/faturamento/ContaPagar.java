package br.com.faturamento;

public class ContaPagar {

	private String descricao = "";
	private double valor = 0.0;
	private String dataVencimento = "12/12/12";
	private Fornecedor fornecedor = new Fornecedor();

	// Construtores
	ContaPagar() {

	}

	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {

		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}

	// Métodos
	void pagar() {
		System.out.println("*****Informações pagamento*****\nDescrição: " + this.descricao + "\nValor: " + this.valor
				+ "\nData vencimento: " + this.dataVencimento + "\nFornecedor: " + fornecedor.getNome() + "\n");

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
