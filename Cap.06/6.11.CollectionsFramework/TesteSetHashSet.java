import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
  public static void main(String[] args) {
   
    Aluno a1 = new Aluno("Willian");
    Aluno a2 = new Aluno("Sousa");
    Aluno a3 = new Aluno("Farias");
    Aluno a4 = new Aluno("Samanta");

    //Nao possui ordem
    Set <Aluno> alunos = new HashSet<Aluno>();

    alunos.add(a1);
    alunos.add(a2);
    alunos.add(a3);
    alunos.add(a4);
    //Nao aceita objetos duplicados
    alunos.add(a4);

    imprimirAlunos(alunos);
  }

  public static void imprimirAlunos(Set<Aluno> alunos){
    //Só consigo iterar pelo forheach pois o mesmo nao possui ordem
    for (Aluno a : alunos){
      System.out.println(a.getNome());
    }
  }
}