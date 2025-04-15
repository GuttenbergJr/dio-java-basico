public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = {"Guttenberg","Jonas","Felipe","Viadilson"};

        //Resumindo
        // para cada aluno na tabela de alunos, faça o seguinte......
        for(String aluno: alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
