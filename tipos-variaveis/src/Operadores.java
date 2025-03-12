public class Operadores {
    public static void main(String[] args) throws Exception {

        // String nomeCompleto = "Guttenberg" + "Junior"; // Concatenação de Strings
        // System.out.println(nomeCompleto);

        // // qual o resultado das expressoes abaixo?
        // String concatenacao = "?";

        // concatenacao = 1 + 1 + 1 + "1";
        // System.out.println(concatenacao);
        
        // concatenacao = 1 + "1" + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = 1 + "1" + 1 + "1";
        // System.out.println(concatenacao);

        // concatenacao = "1" + 1 + 1 + 1;
        // System.out.println(concatenacao);

        // concatenacao = "1" + (1 + 1 + 1);
        // System.out.println(concatenacao);

        int valor = 5;
        valor = - valor;
        System.out.println(valor);
        
        //forma de transformar um número negativo em positivo.
        valor = valor * -1;
        System.out.println(valor);

        //Repetição
        int numero = 5;
        numero++;
        System.out.println(numero);

        //boolean

        boolean variavel = true;
        // "!" é o operador de negação. então, se a variável for true, ele vai imprimir false.
        variavel = !variavel;
        System.out.println(variavel);
    }
}