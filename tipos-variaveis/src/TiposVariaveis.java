public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        int numero = 5;
        numero = 10;

        System.out.println(numero);

        // Declarando uma constante.
        //Padrão Java de nome de constante é tudo em maiúsculo e com o prefixo "final".
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 12;
        System.out.println(VALOR_DE_PI);

    }
}