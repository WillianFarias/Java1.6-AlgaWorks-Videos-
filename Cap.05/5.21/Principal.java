public class Principal {
  
  public static void main(String[] args) {
      Produto p = new ProdutoPerecivel();

      p.descricao = "Caixa de Leite";

      ProdutoPerecivel pp = (ProdutoPerecivel) p;
      pp.dataValidade = "10/03/2020";
    
      @Override
      public void imprimirDescricao() {
      
      }
}