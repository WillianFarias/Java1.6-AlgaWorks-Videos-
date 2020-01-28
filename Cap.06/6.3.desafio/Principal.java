import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    Sorteio sorteio = new Sorteio();
    
    System.out.print("Informe a quantidade de jogos a serem feitos: ");
    int valor = entrada.nextInt();

    sorteio.jogo(valor);

  }
}