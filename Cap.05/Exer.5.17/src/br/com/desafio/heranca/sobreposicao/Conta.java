package br.com.desafio.heranca.sobreposicao;

public abstract class Conta {

	private String descricao = "";
	private double valor = 0.0;
	private String dataVencimento = "12/12/12";
	private Fornecedor fornecedor = new Fornecedor();
	private SituacaoConta situacaoConta;

	// Construtores
	Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	Conta(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
		// Invocando construtor padrão
		this();

		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}

	// Métodos
	void pagar() {
		if (this.situacaoConta.ordinal() == 0) {
			System.out.println("*****Informações pagamento*****\nDescrição: " + this.descricao + "\nValor: "
					+ this.valor + "\nData vencimento: " + this.dataVencimento + "\nFornecedor: " + fornecedor.getNome()
					+ "\n");
			this.situacaoConta = SituacaoConta.PAGA;
		} else {
			System.out.println("Conta CANCELADA ou PAGA");
		}

	}

	public void cancelar() {
		if (this.situacaoConta.ordinal() == 0) {
			this.situacaoConta = SituacaoConta.CANCELADA;
		} else {
			System.out.println("Conta CANCELADA ou PAGA");
		}
	}
	
	//GETTER AND SET

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

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;
	}

	public void setSituacaoConta(SituacaoConta situacaoConta) {
		this.situacaoConta = situacaoConta;
	}

}
