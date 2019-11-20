package br.com.petshop;

public class Caminhada {
	
	public void andar(Pessoa pessoa) {
		System.out.println("" + pessoa.getNome() + " está caminhando com seu cachorrinho(a) " + pessoa.getCachorro().getNome() + ".");
	}

}
