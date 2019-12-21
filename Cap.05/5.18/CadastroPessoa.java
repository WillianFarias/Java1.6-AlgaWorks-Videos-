public class CadastroPessoa{

    public void cadastrar(Pessoa pessoa){
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }
    
    private void armazenar(String nome, int idade){
        System.out.println("Salvando " + nome + "de idade " + idade);
    }
}