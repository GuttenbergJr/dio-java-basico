public class Usuario {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();


        System.out.println("A TV está ligada ? " +smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume da TV: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status: A TV está ligada ? " +smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status: A TV está ligada ? " +smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume da TV: " + smartTv.volume);


        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " +smartTv.canal);

        smartTv.trocarCanal(10);
        System.out.println("Canal Atual: " +smartTv.canal);
    }
}
