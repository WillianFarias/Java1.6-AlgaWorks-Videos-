import java.util.Scanner;

public class DescobreBissexto {
    public static void main(String [] args){
        
        Scanner entradaInt = new Scanner(System.in);
        int ano;

        System.out.print("Informar ano: ");
        ano = entradaInt.nextInt();

        if(ano % 400 == 0){
            if(ano % 4 == 0 && ano % 100 != 0){
                System.out.println("Ano bissexto!");
            }
        } else {
            System.out.println("Não bissexto!");
        }
    }
}