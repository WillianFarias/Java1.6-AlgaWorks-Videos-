public class Wrapper {
    public static void main(String[] args) {
        int x = 10;
        Integer i = new Integer();
        byte b = i.byteValue();

        //byte      - Byte
        //short     - Short
        //int       - Integer
        //long      - Long
        //float     - Float
        //double    - Double
        //char      - Character

        /*
        Wrapper: tem como principal função envolver coisas
        adicionando funcionalidades à elas. 
        A partir do Java 5 o wrapper é feito de forma automatica.

        Comparação entre valores de wrappers é feito pelo método equals
        */

        Integer i1 = 10;
        Integer i2 = 90;
        //Comparando valores contidos em wrapper
        i1.equals(i2);
    }
}