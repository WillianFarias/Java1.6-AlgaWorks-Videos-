public class CadastroPessoa{

    public void cadastrar(Pessoa pessoa){
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }

    public void cadastrar(String nome, int idade){
        armazenar(nome, idade);
    }
    
    private void armazenar(String nome, int idade){
        System.out.println("Salvando " + nome + " de " + idade + " anos de idade");
    }
}