public class Principal {
  public static void main(String[] args) {
    
    //Imprimivel é uma nota fiscal, portanto posso instanciar o
    //objeto desta forma, no entando so teremos acesso aos metodos
    //de Imprimivel
    Imprimivel nota = new NotaFiscal();

    nota.imprimir();
    /*
    Nao compila pois é um metodo de NotaFiscal e nao de Imprimivel
    nota.soNotaFiscal();
    */

    //Para que seja possível executar esse metódo apartir de um objeto
    //do tipo imprimivel é preciso fazer um CASTING 
    //UM OBJETO COM DUAS VARIAVEIS APONTANDO PRA ELE
    NotaFiscal n = (NotaFiscal) nota;
    n.soNotaFiscal();
  }
}