package br.com.desafio.heranca.sobreposicao;

public class RelatorioContas {
	
	public void exibirListagem(Conta[] contas) {
		
		for(Conta conta: contas) {
			System.out.println("Descricão: " + conta.getDescricao() 
			+ "\nValor: " + conta.getValor() + "\n" );
		}
	}

}
