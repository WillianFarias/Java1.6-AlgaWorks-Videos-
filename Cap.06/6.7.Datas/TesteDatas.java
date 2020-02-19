import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {
  public static void main(String[] args) {
    
    Date hoje = new Date();
    System.out.println(hoje);

    DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println(formatador.format(hoje));

    String dateNiver = "20/01/2001";
    DateFormat formatador2 = new SimpleDateFormat("dd/MM/yyyy");
    try {
      Date niver = formatador2.parse(dateNiver);  
      System.out.println(formatador.format(niver));
    } catch (Exception e) {
      System.out.println("Formato de data inválido");
    }
    

  }
}