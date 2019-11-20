package br.com.petshop;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		
		System.out.print("Nome: ");
		cachorro.setNome(entrada.nextLine());
		
		System.out.print("Raça: ");
		cachorro.setRaca(entrada.nextLine());
		
		System.out.print("Sexo: ");
		cachorro.setSexo(entrada.next().charAt(0));
		
		System.out.print("Idade: ");
		cachorro.setIdade(entrada.nextInt());
		
		System.out.println("***Dog***\nNome: " + cachorro.getNome() + "\nRaça: " + cachorro.getRaca() + "\nSexo: " + cachorro.getSexo() + "\nIdade: " + cachorro.getIdade());
		
		
		
		//System.out.println("nome: " + cachorro.getNome());
		
		

	}

}
