import java.util.Scanner;

public class Imc {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        char sexo;
        double peso;
        double altura;
        double imc;

        System.out.print("Sexo: ");
        //Receber um char a partir do Scanner
        sexo = entradaTexto.next().charAt(0);

        System.out.print("Peso: ");
        peso = entrada.nextDouble();

        System.out.print("Altura: ");
        altura = entrada.nextDouble();

        imc =  peso / (altura * altura);

        //System.out.print("asd: " + sexo);

        if(sexo == 'm' || sexo == 'M'){
            if(imc < 20.7){
                System.out.println("Abaixo do peso!");
            } else if (imc >= 20.8 && imc <= 26.4){
                System.out.println("No peso ideal!");
            } else if (imc >= 26.5 && imc <= 27.8) {
                System.out.println("Um pouco acima do peso!");
            } else if (imc >= 27.9 && imc <= 31.1) {
                System.out.println("Acima do peso!");
            } else if (imc > 31.1) {
                System.out.println("Obeso!");
            }
        } else if (sexo == 'f' || sexo == 'F'){
            if(imc < 19.1) {
                System.out.println("Abaixo do peso!");
            } else if (imc >= 19.1 && imc <= 25.8) {
                System.out.println("No peso ideal!");
            } else if (imc >= 25.9 && imc <= 27.3) {
                System.out.println("Um pouco acima do peso!");
            } else if (imc >= 27.4 && imc <= 32.3) {
                System.out.println("Acima do peso!");
            } else if (imc <= 32.3) {
                System.out.println("Obeso!");
            }
        }
    }
}