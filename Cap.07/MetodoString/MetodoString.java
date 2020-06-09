public class MetodoString {
  public static void main(String[] args) {
    
    String nome = "Pedro";
    //String sao imutaveis
    System.out.println(nome.toUpperCase());
    System.out.println(nome);

    nome = nome.toUpperCase();
    System.out.println(nome);

    String s1 = "Willian";
    String s2 = "WillIAN";

    System.out.println("s1 == s2: " + (s1 == s2));

    String s3 = new String("Willian");
    //Neste caso esta sendo comparado o endereço e nao o conteúdo
    System.out.println("s1 == s3: " + (s3 == s1));

    //O conteudo de uma String deve ser comparada por equals
    System.out.println("s1.equals(s3): " + (s1.equals(s3)));
    //Iguinora letras maisculas ou minuculas
    System.out.println("s1.equals(s3): " + (s1.equalsIgnoreCase(s2)));

    //imprimir um caracter especifico de uma string
    for(int i = 0; i < s1.length(); i ++){
      System.out.print(" " + s1.charAt(i));
    }
    
    //Metodo que retorna o tamanho da String
    System.out.println("\nTamanho da String: " + nome.length());

    //Compara o conteudo das Strings
    System.out.println("s1.equals(s2): "+ (s1.equals(s2)));

    //Compara o conteudo das Strings ignorando maiusculas e minusculas
    System.out.println("s1.equalsIgnoreCase(s2): "+ (s1.equalsIgnoreCase(s2)));

    char[] array = {'O', 'L', 'A'};

    //Pelo fato de uma string ser uma cadeia de caracteres é possível concatenalas
    //desta forma
    String s = new String(array);
    System.out.println(s);

    String x = "Desenvolvimento Java";

    //Exibe conteúdo de acordo com o intervalo definido
    System.out.println(x.substring(16));
    System.out.println(x.substring(7, 12));

    //Remove espaços
    String espaco = "           Tesssste          ";
    System.out.println(">" + espaco + "<");
    System.out.println(">" + espaco.trim() + "<");

    String ander = "Cursos_online_de_desenvolvimento_de_software";

    //Meu array vai conter a frase sem os _
    String[] aray = ander.split("_");

    for(String xi : aray){
      System.out.println(xi);
    }

    String java = "Java";
    //Primeira posicao que este caracter aperece na string
    int indice = java.indexOf('a');

    System.out.println(indice);
    
    //Ultima posicao que este caracter aperece na string
    indice = java.lastIndexOf('a');
    System.out.println(indice);

    //Substitui através de expressao regular
    System.out.println(java.replaceAll("Java", "Python"));
  }
}