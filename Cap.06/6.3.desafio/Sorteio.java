//É precisso usar a palavra static quando se deseja usar o médodo 
//sem ser necessário usar a palavra Math
import static java.lang.Math.random;
import static java.lang.Math.ceil;

public class Sorteio {

  //private int quantidade = 0;

  public void jogo (int numero) {

    if (numero > 0){

      int vet [] = new int[5];

      for (int i = 0; i < numero; i ++){
        for(int j = 0; j < 6; j ++){

          double valor = random() * 60;
          int x =  (int) ceil(valor);

          vet[j] = x;

        }
        //System.out.println(vet[i]);
      }

      //System.out.println(x);

    } else {
      System.out.println("Valor inválido");
    }

  }

  //Métodos Get e Set
  /*
  public int getQuantidade(){
    return this.quantidade;
  }

  public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
    */
  }