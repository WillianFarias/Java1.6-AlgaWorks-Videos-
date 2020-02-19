public class TesteString {
  public static void main(String[] args) {
    
    String s = "Olá";//Cria string "Olá"
    s += " Pessoal!";//Cria string "Olá Pessoal!" gera desperdicio
    //de recurso

    StringBuilder sb = new StringBuilder("Olá");//Cria a sb
    sb.append(" Pesso@l!");//Reaproveita a StringBuilder
    
    String resultado = sb.toString();
    System.out.println(s);
    System.out.println(sb);
    System.out.println(resultado);

    System.out.println(s.equals(resultado)); 

    if(s == resultado){
      System.out.println("Ok");
    }

    //StringBuilder é mais performatico que StringBuffer
    //No entanto nao é recomendada usar em ambientes com 
    //multi threads
    
  }
}