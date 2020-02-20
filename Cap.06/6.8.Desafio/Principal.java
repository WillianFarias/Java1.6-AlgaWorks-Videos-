import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Principal {
  public static void main(String[] args) {
    
    String data = "01/01/2010";
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a data do último período menstrual: ");
    data = entrada.next();

    DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    try {

      Date dataConvertidaDate = formatador.parse(data);
      CalculadoraGravidez calculadoraGravidez = new CalculadoraGravidez(dataConvertidaDate);
      
      System.out.println("Data estimada concepção: " + formatador.format(calculadoraGravidez.calcularDataEstimadaConcepcao())); 
      System.out.println("Data estimada parto: " + formatador.format(calculadoraGravidez.calcularDataEstimadaParto())); 
    } catch (Exception e) {
      System.out.println("Formato de data inválido");
    }
    
  }
}