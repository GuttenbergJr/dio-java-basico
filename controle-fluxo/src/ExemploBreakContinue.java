public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        for(int numero = 0; numero <= 5; numero++){
            if(numero == 2){
                //Ele vai simplismente mudar o fluxo quando a variável número for igual a 2 (ignorando o restante do código.)
                continue;
            }

            System.out.println(numero);
        }

    }   
}
