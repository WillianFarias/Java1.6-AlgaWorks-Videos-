package br.com.desafio.heranca.sobreposicao;

//Classes abstratas não necessariamente tem apenas metodos abstratos, pois todos metodos que são declarados
//como abstratos devem ser implementados nas classes que herdam as classes abstratas
public abstract class Conta {

	protected String descricao = "";
	protected double valor = 0.0;
	protected String dataVencimento = "12/12/12";
	protected Fornecedor fornecedor = new Fornecedor();
	private SituacaoConta situacaoConta;

	// Construtor padrao
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

	// Metodo responsavel por exibir detalhes das contas
	public abstract void exibirDetalhes();

	// GETTER AND SET

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
