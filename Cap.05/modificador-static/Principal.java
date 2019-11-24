public class Principal {
    
    public static void main(String[] args) {
        Contador.COUNT = 5;

        //int valorCount  = Contador.COUNT;

        System.out.println("Count: " + Contador.COUNT);

        Contador contador = new Contador();

        contador.imcrementarCount();

        System.out.println(Contador.COUNT);
    }
}