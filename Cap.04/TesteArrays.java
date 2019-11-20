public class TesteArrays {
    public static void main(String[] args) {
        int[] notas = new int[4];

        notas[0] = 10;
        notas[1] = 5;
        notas[2] = 4;
        notas[3] = 1;

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        Carro[] carros = new Carro();
        carros[0] = new Carro();

        carros[0].setModelo("Saveiro");

        System.out.println("Modelo: " + carros[0].getModelo);
    }
}