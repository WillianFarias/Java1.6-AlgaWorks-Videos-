import java.util.Scanner;

public class ClassificaProduto {
    public static void main(String[] args){

        int codigo = 0;
        int gaveta  = 0;
        String lado = "";
        Scanner entrada = new Scanner(System.in);

        /*
        System.out.print("Informe o código: ");
        codigo = entrada.nextInt();

        

        while(codigo != 0){
            //System.out.println("Código: " + codigo);
            for(int i = 8; i >= 1; i--){
                if(codigo % 2 == 0){
                    lado = "Direito";
                } else {
                    lado = "Esquerdo";
                }

                if(codigo % i == 0){
                    gaveta  = i;
                    break;
                }
            }

            System.out.println("Lado: " + lado + " gaveta: " + gaveta);

            System.out.print("Informe o código: ");
            codigo = entrada.nextInt();
        }*/

        do {
            System.out.print("Informe o código: ");
            codigo = entrada.nextInt();
            
            if(codigo != 0){    
                for(int i = 8; i >= 1; i--){
                    if(codigo % 2 == 0){
                        lado = "Direito";
                    } else {
                        lado = "Esquerdo";
                    }

                    if(codigo % i == 0){
                        gaveta  = i;
                        break;
                    }
                }

                System.out.println("Código: " + codigo + "\nLado: " + lado + "\nGaveta: " + gaveta);
            } else {
                //break;
            }
        } while(codigo != 0);

    }
}