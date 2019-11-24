public class Contador {
    
    //Por ser static este se torna um atributo da classe, ou seja não é necessário um 
    //objeto para ter acesso a este atributo. Ele pode ser acessador por Contador.count
    //Todos os objetos criados a partir da classe contador comportilham este mesmo atributo
    public static int COUNT = 0;

    //final é um modificador que define que o valor da variável nao pode ser alterado
    public static final int constante = 3;

    void imcrementarCount(){
        COUNT++;
    }

    public static imprimirContador(){
        System.out.println(COUNT);
    }
}