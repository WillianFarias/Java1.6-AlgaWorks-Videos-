public class Produto {
            
    private String descricao;
    private int quantidade;

    void descrever() {
        System.out.println(this.descricao + " - " + this.quantidade + " - itens");
    }

    void setDescricao(String descricao){
        this.descricao = descricao;
    }

    String getDescricao(){
        return this.descricao;
    }

    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    int getQuantidade(){
        return this.quantidade;
    }

}