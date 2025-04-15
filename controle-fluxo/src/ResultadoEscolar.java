public class ResultadoEscolar {
    public static void main(String[] args){
        // int nota = 6;
        // if(nota >= 7){
        //     System.out.println("Aprovado");
        // } else if(nota >= 5 && nota < 7){
        //     System.out.println("Recuperação");
        // } else{
        //     System.out.println("Reprovado");
        // }

        //Mesmo código, mas utilizando a condição ternária.

        // o ? indica que a condição é verdadeira
        // o : indica que a condição é falsa.
        // Então, se a variável nota for maior ou igual a 7, o aluno será aprovado.
        // int nota = 7;
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        // System.out.println(resultado);

        //Trechos

        // if True 
        // nota >= 7 ? "Aprovado"
        // else if
        //nota >= 5 && nota < 7 ? "Recuperação"
        //else
        //: "Reprovado";

        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
