//importacao estatica
import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.Math.round;
import static java.lang.Math.ceil;

public class TesteMath {
  public static void main(String[] args) {
    
    //Classe math possui metódos e variáveis
    int raio = 4;

    //double comprimento = 2 * raio * math.PI;
    //Por eu ter usado importacao estatica acima não preciso 
    //usar a palavra math ao importar a variável math 
    double comprimento = 2 * raio * PI;
    System.out.println(comprimento);

    double valor = random() * 60;
    int x =  (int) ceil(valor);

    System.out.println(x);

    //métodos da classe MATH
    /*
      *Math.max(x, y); retorna o maior valor
      *Math.min(x, y); retorna o menor valor
      *Math.pow(x, y); retorna potência
      *Math.sqrt(y); raiz quadrada
      *Math.floor(x); truncamento pra baixo
      *Math.ceil(x); truncamento pra cima
      *Math.round(x); arredondamento
      *Math.random(x); retorna número aleatório

    */
  }
}