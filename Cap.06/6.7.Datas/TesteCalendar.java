import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {
  public static void main(String[] args) {
    Calendar c = new GregorianCalendar();

    c.set(Calendar.DAY_OF_MONTH, 30);
    c.set(Calendar.MONTH, 10);
    c.set(Calendar.YEAR, 2010);
    c.set(Calendar.HOUR_OF_DAY, 10);
    c.set(Calendar.MINUTE, 30);
    c.set(Calendar.SECOND, 0);

    //Formatando o formato da data
    DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    System.out.println(formatador.format(c.getTime()));

    //Adicionando um dia e entao o mes vira
    c.add(Calendar.DAY_OF_MONTH, 1);
    System.out.println(formatador.format(c.getTime()));

    //Somando dois meses
    c.add(Calendar.MONTH, 2);
    System.out.println(formatador.format(c.getTime()));

    c.add(Calendar.MONTH, -2);
    System.out.println(formatador.format(c.getTime()));

    //Roll altera somente o parametro passado, mesmo que o mes fosse virar
    c.roll(Calendar.DAY_OF_MONTH, 2);
    System.out.println(formatador.format(c.getTime()));
  }
}