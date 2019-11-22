public class Televisor {
        
    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if ( this.canal.equals(novoCanal) ){
            System.out.println("Novo canal é o mesmo canal atual");
        } else {
            this.canal = novoCanal;
            System.out.println("Canal alterado para " + novoCanal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (this.volume.equals(novoVolume)) {
            System.out.println("Novo volume é o volume é o atual");
        } else {
            this.volume = novoVolume;
            System.out.println("Canal alterado para " + novoVolume);
        }
    }
}