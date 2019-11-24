package br.com.exemplos.enuns;

public class Carta {

	private int numero;
	//Não é necessário instanciar um objeto
	private Naipe naipe;

	public Carta(int numero, Naipe naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public void imprimirCarta() {
		System.out.println("Sou " + this.numero + " de naipe " 
	+ this.naipe + "e tenho cor:" + Naipe.COPAS);
	}
}
