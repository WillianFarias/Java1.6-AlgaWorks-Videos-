public class TesteCadastro{
    
    public static void main(String[] args) {
        
        CadastroPessoa cadastro;
        Pessoa pessoa = new Pessoa("José", 32);

        //pessoa.setIdade(25);
        //pessoa.setNome("Willian");

        CadastroPessoa.cadastrar(pessoa);
    }
}