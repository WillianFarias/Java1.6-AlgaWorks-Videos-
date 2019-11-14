/**
Se o veículo for um carro de passeio e a velocidade do veículo for 10% maior que a velocidade permitida na via, o veículo deve ser multado.
Se o veículo for um caminhão e a velocidade do veículo for 5% maior que a velocidade permitida na via, o veículo deve ser multado.

Receber as informações de velocidade máxima permitida e a velocidade do veículo
 */

import java.util.Scanner;

public class MultaVeiculo{
    public static void main(String[] args){

        int velocidadeMaxima = 0;
        int velocidadeVeiculo = 0;
        String tipo = "";
        Scanner valor = new Scanner(System.in);
        Scanner valorTexto = new Scanner(System.in);

        System.out.print("Tipo do veículo (caminhão ou passeio): ");
        tipo = valorTexto.nextLine();

        System.out.print("Velocidade máxima permitida: ");
        velocidadeMaxima = valor.nextInt();

        System.out.print("Velocidade do veículo: ");
        velocidadeVeiculo = valor.nextInt();

        //Não pode ser Swtich pq o mesmo só trabalha com inteiros, ou oq pode ser convertido pra inteiro

        if(tipo.equals("caminhão")){
            if(velocidadeVeiculo > (velocidadeMaxima + (velocidadeMaxima*0.05))){
                System.out.println("Veículo multado!");
            } else {
                System.out.println("Veiculo não multado!");
            }
        } else if (tipo.equals("passeio")){
            if(velocidadeVeiculo > (velocidadeMaxima + (velocidadeMaxima*0.1))){
                System.out.println("Veículo multado!");
            } else {
                System.out.println("Veiculo não multado!");
            }
        } else {
            System.out.println("Tipo inválido!");
        }

    }
}