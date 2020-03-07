import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    
    double valor = 0.0;
    Scanner entrada = new Scanner(System.in);
    String valorFormatado = "";

    //Formatador de valor monetario
    DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

    System.out.println("Informe um valor: ");
    valor = entrada.nextDouble();

    BigDecimal bigDecimal = new BigDecimal(valor);
    BigDecimal porcentagem = bigDecimal.multiply(new BigDecimal(0.1));
    bigDecimal = porcentagem.add(bigDecimal);

    bigDecimal.doubleValue();

    try {
      valorFormatado = formatador.format(bigDecimal);
    } catch (Exception e) {
      System.out.println("Valor inválido");
    }
    
    System.out.println(valorFormatado);
  }
}