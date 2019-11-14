import java.util.Scanner;

public class Ternario {
    public static void main(String[] args){

        int idade = 0;
        Scanner valor = new Scanner(System.in);

        System.out.print("Qual sua idade: ");
        idade = valor.nextInt();

        //Operador ternario
        String condicao = (idade >= 18) ? "Adulto" : "Adolescente/Criança";

        System.out.println(condicao);

    }
}