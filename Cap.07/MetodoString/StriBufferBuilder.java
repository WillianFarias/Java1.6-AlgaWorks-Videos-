public class StriBufferBuilder {
  public static void main(String[] args) {

    //É mutavel, portanto boa para quando se precisa concatenar strings, pois nao
    //cria novas strings a todo momentos
    //tradesafe 
    StringBuffer sb = new StringBuffer(); //thread-safe - use no contexto de concorrência

    //StringBuider sb = new StringBuffer(); não-thread-safe - mais rápido

    sb.append("Isso é um teste");
    sb.append(" Continuo testando");
    sb.append(" :)");

    System.out.println(sb);

    sb.insert(15, "!");

    System.out.println(sb.toString());
    
  }
}