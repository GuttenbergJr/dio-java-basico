public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        // Os argumentos são passados na execução do programa ou no arquivo de configuração launch.json, dentro da pasta .vscode
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}