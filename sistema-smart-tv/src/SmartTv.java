public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 35;


    public void aumentarVolume(){
        // volume = volume + 1;
        volume++;
    }

    public void diminuirVolume(){
        volume = volume -1;
        volume--;
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    // Método que foi exportado.
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
