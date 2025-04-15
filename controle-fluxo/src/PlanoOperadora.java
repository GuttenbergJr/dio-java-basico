public class PlanoOperadora {
    public static void main(String[] args) {
        
        //Caso onde o Switch case seria melhor aproveitado
        // Declaração dos cases feito de ordem decrescente, do mais Top para o mais Basico, para utilização da cascata que o Switch case faz.

        String plano = "T"; //M / T

        switch(plano){
            case "T":{
                System.out.println("5 Gb Youtube");
            }
            case "M":{
                System.out.println("Whats e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
