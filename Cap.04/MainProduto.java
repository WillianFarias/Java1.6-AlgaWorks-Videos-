import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        //Produto produto = new Produto();
        Estoque estoque = new Estoque();

        System.out.print("Quantidade total de produtos: ");
        int quantidadeTotal = entrada.nextInt();

        estoque.produtos = new Produto[quantidadeTotal];

        for(int i = 0; i < estoque.produtos.length; i++){

            System.out.println(estoque.produtos[i]);

            System.out.print("Descrição do produto: ");
            estoque.produtos[i].setDescricao(entradaTexto.nextLine());

            System.out.print("Quantidade de produtos: ");
            estoque.produtos[i].setQuantidade(entrada.nextInt());

        }

        
        //estoque.listarProdutos();
        
    }
}