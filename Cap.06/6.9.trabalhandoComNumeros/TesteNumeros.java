import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TesteNumeros {
  public static void main(String[] args) {
    
    DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
    double valorProduto = 1.59;

    System.out.println(valorProduto);
    System.out.println(formatador.format(valorProduto));

    String entrada = "R$ 50,34";
    
    //formatador.parse(entrada) recebe uma string e devolve um number, por isso
    //convertemos com doubleValue()
    try {
      double numero = formatador.parse(entrada).doubleValue();
      System.out.println("Número para operações: " + numero);
      System.out.println("Número conforme entrada: " + formatador.format(numero));
    } catch (Exception e) {
      System.out.println("Entrada inválida");
    }

    //Classe utilizada para tratar valores monetarios, pela possibilidade de
    //tratar numeros muito grandes

    //O d no final é necessário para definir que este valor é um double
    BigDecimal bg = new BigDecimal(5465165465165165156d);
    bg = bg.divide(BigDecimal.TEN);

  }
}
