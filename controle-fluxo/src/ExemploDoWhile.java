import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando....");
        do{
            System.out.println("Telefone tocando");
        }
        while( tocando());

            System.out.println("Alo!!");
        
    }

    private static boolean tocando(){
        //Criei um boolean que tem um valor aleatório entre 1 e 3, se o valor for igual a 1, significa que ele atendeu.
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return ! atendeu;
    }
}
