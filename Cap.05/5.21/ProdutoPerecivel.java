public class ProdutoPerecivel extends Produto{

  String descricao;
  String dataValidade; //Até aprendermos a classe date
 
  public void imprimirDescricao(){
    System.out.println("Descrição: " + descricao, "Vencendo em " + dataValidades);
  }
}