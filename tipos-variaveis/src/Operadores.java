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

        // int valor = 5;
        // valor = - valor;
        // System.out.println(valor);
        
        // //forma de transformar um número negativo em positivo.
        // valor = valor * -1;
        // System.out.println(valor);

        // //Repetição
        // int numero = 5;
        // numero++;
        // System.out.println(numero);

        // //boolean

        // boolean variavel = true;
        // // "!" é o operador de negação. então, se a variável for true, ele vai imprimir false.
        // variavel = !variavel;
        // System.out.println(variavel);

        //Operação pardão
        // int a,b;

        // a = 10;
        // b = 5;
        // c
        // if(a==b){
        //     resultado = "Verdaedeiro";
        // } else{
        //     resultado = "Falso";
        // }

        // System.out.println(resultado);

         // Operador ternário
        //  int c,d;
        //     c = 5;
        //     d = 5;
        //     //Se c for igual a d, então o resultado é verdadeiro, se não, é falso.
        //    boolean resultado = c == d ? true : false;
        //     System.out.println(resultado);

        // String nome1 = "Guttenberg"; 
        // String nome2 = new String("Guttenberg"); //Cria uma nova referência na memória.

        // //Equals compara o conteúdo da variável, e não a referência.
        // //recomendado para comparar Strings/objetos.
        // System.out.println(nome1.equals(nome2));


        // int numero1 = 1;
        // int numero2 = 2;
        
        // if (numero1 < numero2){ //True
        //     System.out.println("A Condição é verdadeira");
        // } else { //False
        //     System.out.println("A Condição é falsa");
        // }

        // boolean simNao = numero1 == numero2;
        // System.out.println("Numero 1 é igual ao número 2? " + simNao);

        // simNao = numero1 != numero2;
        // System.out.println("Numero 1 é diferente do número 2? " + simNao);

        // simNao = numero1 > numero2;
        // System.out.println("Numero 1 é maior que o número 2? " + simNao);
        
        //Operadores lógicos.
        boolean condicao1 = true;
        boolean condicao2 = true;

        //Também funciona.
        // if (condicao1 && (8 > 5))
        if(condicao1 && condicao2){
            System.out.println("Ambas as condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
        }

    }

}