public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        //Não muda
        televisor.mudarVolume(20);
        televisor.mudarCanal(130);

        //Muda!
        televisor.mudarCanal(300);
        televisor.mudarVolume(10);
    }
}