package br.com.petshop;

public class Passeio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Willian");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Matiude");
		
		pessoa.setCachorro(cachorro);
		
		Caminhada caminhada = new Caminhada();
		caminhada.andar(pessoa);

	}

}
