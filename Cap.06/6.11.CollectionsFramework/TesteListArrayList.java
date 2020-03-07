import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {
  public static void main(String[] args) {
    
    Aluno a1 = new Aluno("Willian");
    Aluno a2 = new Aluno("Sousa");
    Aluno a3 = new Aluno("Farias");
    Aluno a4 = new Aluno("Samanta");

    /*
    Desta forma está lista recebe qualquer coisa, uma string, um inteiro, um ob
    jeto ...
    List alunos = new ArrayList();*/

    List<Aluno> alunos = new ArrayList<Aluno>();

    alunos.add(a1);
    alunos.add(a2);
    alunos.add(a3);
    alunos.add(a4);

    /* O <> simboliza um generic, que no caso define a lista como uma lista de
    Aluno, portanto esta lista aceitara apenas Aluno nela
    List<Aluno> x = new ArrayList<Aluno>();
    */
  }
}