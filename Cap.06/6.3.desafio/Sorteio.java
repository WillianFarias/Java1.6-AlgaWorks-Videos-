//É precisso usar a palavra static quando se deseja usar o médodo 
//sem ser necessário usar a palavra Math
import static java.lang.Math.random;
import static java.lang.Math.ceil;

public class Sorteio {

  private int vet [] = new int [6];

  public void jogo (int numero) {

    if (numero > 0){

      int x = 0;

      do {

        for(int i = 0; i < vet.length; i++){//linha

          double valor = random() * 60;
          int y =  (int) ceil(valor);

          if(!this.jaSaiu(y) && y != 0){
            vet[i] = y;
          } else {
            i--;
          }

        }

        for(int numeroSorteado : vet){
          System.out.print(numeroSorteado + " ");
        }

        System.out.println("");

        x ++;

      }while(x < numero);

      } else {
        System.out.println("Valor inválido");
      }
    } 

    private boolean jaSaiu(int numero){
      boolean resultado = false;

      for(int i = 0; i < this.vet.length; i++){
        if(this.vet[i] == numero){
          resultado = true;
          break;
        }
      }
      return resultado;
    }

  }