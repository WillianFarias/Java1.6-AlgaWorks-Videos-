public class MaquinaCafe {

    int acucarDisponivel;

    void fazerCafe() {
        /*if(acucarDisponivel < 10){
            System.out.println("Não há açuca suficiente para fazer seu café");
        } else {
            acucarDisponivel -= 10;
            System.out.println("Fazendo cafezinho com 10 gramas de açucar");
        }*/
        fazerCafe(10);
    }

    //Sobrecarga de método
    void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar){
            System.out.println("Quantidade disponivel inferior a necessária");
        } else {

            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " em gramas");
        }
    }

}