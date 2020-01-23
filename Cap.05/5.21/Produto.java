//Não se pode criar objetos apartir de classes abstracts, estas classes servem
//basicamente para serem usadas como classes pai quando se trata de herança
public abstract class Produto {

  String descricao;

  //Classes abstratadas com metodo abstrato, esses metodos devem implementados
  //Por qlquer classe dure
  public abstract void imprimirDescricao();
}