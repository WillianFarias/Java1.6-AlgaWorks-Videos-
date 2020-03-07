public class Aluno {

  private String nome;
  private int idade;

  //Construtor
  public Aluno (String nome) {
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

}