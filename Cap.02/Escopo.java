import java.util.Scanner;

public class Escopo {
    public static void main(String[] args){

        System.out.print("Idade: ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
        String nomePai = "";

        boolean podeDirigir = idade >= 18;

        if (!podeDirigir){
            System.out.print("Nome do pai: ");

            nomePai = entrada.next();
        }

        System.out.println("Você pode dirigir?");

        if(podeDirigir){
            System.out.println("Sim, claro!");
        } else {
            System.out.println("Não, se fizer isso o senhor " + nomePai + " vai preso!");
        }
    }
}