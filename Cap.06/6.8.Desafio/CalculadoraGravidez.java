import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
  
  private Date dataUltimoPeriodoMenstrual;

  public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
    this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
  }

  private Calendar converterDateParaCalendar(Date data) {
    Calendar calendar = new GregorianCalendar();
    calendar.setTime(data);
    return calendar;
  }

  //A data estimada da concepção é igual a data do último período menstrual mais 2 semanas
  public Date calcularDataEstimadaConcepcao() {
    
    Calendar data = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
    data.add(Calendar.WEEK_OF_YEAR, 2);
    Date dataEstimada = data.getTime();

    return dataEstimada;
    
  }

  public Date calcularDataEstimadaParto() {

    Calendar data = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
    data.add(Calendar.WEEK_OF_YEAR, 40);
    Date dataEstimada = data.getTime();

    return dataEstimada;
    
  }
}