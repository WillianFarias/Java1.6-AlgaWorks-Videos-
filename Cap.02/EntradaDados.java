import java.util.Scanner;

public class EntradaDados {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Qual seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Olá " + nome);
    }
}