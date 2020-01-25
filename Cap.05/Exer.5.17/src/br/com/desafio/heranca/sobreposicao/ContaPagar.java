package br.com.desafio.heranca.sobreposicao;

public class ContaPagar extends Conta {

	public ContaPagar() {

	}

	public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
		this();
		
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.fornecedor = fornecedor;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		System.out.println("Descrição: " + getDescricao());
	}
}
