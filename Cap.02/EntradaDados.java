import java.util.Scanner;

public class EntradaDados {
    public static void main(String [] args){
        
        Scanner entradaString = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);
        Scanner entradaDouble = new Scanner(System.in);
        
        String nome;
        int idade;
        double peso;

        System.out.print("Qual seu nome: ");
        nome = entradaString.nextLine();

        System.out.print("Qual sua idade: ");
        idade = entradaInt.nextInt();

        System.out.print("Qual seu peso: ");
        peso = entradaDouble.nextDouble();

        System.out.println("Olá " + nome +" você tem " + idade + " anos" + " seu peso é " + peso);
    }
}