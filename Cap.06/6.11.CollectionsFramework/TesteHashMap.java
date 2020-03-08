import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
  public static void main(String[] args) {
    
    Aluno a1 = new Aluno("Willian");
    Aluno a2 = new Aluno("Sousa");
    Aluno a3 = new Aluno("Farias");
    Aluno a4 = new Aluno("Samanta");

    Map<String, Aluno> alunos = new HashMap<String, Aluno>();

    alunos.put("1", a1);
    alunos.put("2", a2);
    alunos.put("3", a3);
    alunos.put("4", a4);
    //ele aceita repeticoes dos valores, mas as chaves tem que ser unicas
    alunos.put("5", a4);

    imprimirAlunos(alunos);

  }

  private static void imprimirAlunos (Map<String, Aluno> alunos){
    for (Aluno a : alunos.values()) {
      System.out.println(a.getNome());
    }
  }

}