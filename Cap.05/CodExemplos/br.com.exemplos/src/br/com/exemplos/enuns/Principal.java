package br.com.exemplos.enuns;

public class Principal {

	public static void main(String[] args) {
		
		//Não é necessário instanciar um objeto do tipo Naipe
		Carta ouroCarta = new Carta(9, Naipe.OURO);
		
		ouroCarta.imprimirCarta();
		
		//Cada enum com um método proprío
		OperacaoAritmetica op = OperacaoAritmetica.ADICAO;
		
		int soma = op.operacao(3, 9);
		
		//System.out.println("" + soma);
		
		//É possível percorrer todo enum e realizar suas operaçoes com o for avançado
		for(OperacaoAritmetica ap : OperacaoAritmetica.values()) {
			System.out.println( ap + " " + " -> " + ap.operacao(3, 5));
		}

	}
}
