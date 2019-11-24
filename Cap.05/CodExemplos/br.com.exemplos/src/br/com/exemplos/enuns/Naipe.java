package br.com.exemplos.enuns;

public enum Naipe {

	// enums é uma especie de conjunto de CONSTANTES
	OURO("Vermelho"),
	PAUS("Preto"),
	ESPADAS("Preto"),
	COPAS("Vermelho");

	//Construto do tipo Enum
	Naipe(String cor) {
		this.cor = cor;
	}

	//É necessário o construtor, se não dara erro!
	private String cor;
	
	public String getCor() {
		return this.cor;
	}

}
