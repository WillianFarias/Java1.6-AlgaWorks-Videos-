import java.text.DecimalFormat;

public class TesteNumeros {
  public static void main(String[] args) {
    
    DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
    double valorProduto = 1.59;

    System.out.println(valorProduto);
    System.out.println(formatador.format(valorProduto));

  }
}
